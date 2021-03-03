package com.gs.class3;

import com.gs.class003.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.logging.Logger;


public class Test003 {
    /**
     * @methodsName: testStudents
     * @description:
     * Student为泛型
     * 实现一个参数为学生列表的静态方法，计算3位学生的学分总和，并通过测试类调用该静态方法输出学分总和结果。
     */
    @Test
    public void testStudents() {

        Student[] students = new Student[]{
                new CsStudent("Bob", "male", 18),
                new MathStudent("Ruby", "female", 19),
                new FinanceStudent("Tom", "male", 17)
        };
/*        double sum = 0;
        for(Student obj : students){
            sum += obj.getScore();
        }
        System.out.println("计算3位学生的学分总和: " + sum);*/
        Student.calFromList(Arrays.asList(students));

    }


    /**
     * @methodsName: testReadFiles
     * @description:
     * 1. 读取特定~目录下(需包含每层子目录)的所有文件，将其中的.txt文件完整路径列表打印出来(前提是你已经会使用文件IO了)
     * /user/xxxx/a.txt
     * /user/xxxx/tmp/b.txt
     */
    @Test
    public void testReadFiles() {
        ReadFiles r1 = new ReadFiles();
        System.out.println(r1.getFiles("src/test/test0x02"));
        ///Users/jiamanzhu/JavaJiang/java-Jiang-project/src/test/test0x02
    }

    /**
     * @methodsName: testReadJar
     * @description:
     * 读取本地配置过后的MAVEN仓库下(需包含每层子目录)的所有jar依赖包，将每一个jar包按如下格式打印出来：
     * ```
     * [eg: junit-4.13.1.jar]
     * 包名：junit
     * 版本号：4.13.1
     * 后缀：.jar
     * 完整路径：xxxxxx/junit-4.13.1.jar
     * ```
     */
    @Test
    public void testReadJar() {
        ReadJar r1 = new ReadJar();
        System.out.println(r1.getFiles("/Users/jiamanzhu/.m2/repository/"));
    }
}
