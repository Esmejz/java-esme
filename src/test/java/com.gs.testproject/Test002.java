package com.gs.testproject;

import org.junit.Test;

public class Test002 {
    /**
     * 1. 读取特定~目录下(需包含每层子目录)的所有文件，将其中的.txt文件完整路径列表打印出来(前提是你已经会使用文件IO了)
     * /user/xxxx/a.txt
     * /user/xxxx/tmp/b.txt
     */
    @Test
    public void testString1(){
        ReadFiles r1 = new ReadFiles();
        System.out.println(r1.getFiles("src/test/test0x02"));
///Users/jiamanzhu/JavaJiang/java-Jiang-project/src/test/test0x02
    }

    /**
     *  2. 读取本地配置过后的MAVEN仓库下(需包含每层子目录)的所有jar依赖包，将每一个jar包按如下格式打印出来：
    ```
[eg: junit-4.13.1.jar]
包名：junit
版本号：4.13.1
后缀：.jar
完整路径：xxxxxx/junit-4.13.1.jar
```
     */
    @Test
    public void testString2() {
        ReadJar r1 = new ReadJar();
        System.out.println(r1.getFiles("/Users/jiamanzhu/.m2/repository/"));
    }


    @Test
    public void testClass(){
        Student sA = new Student("Bob", "male", 18, 40, 1.75);
        Student sB = new Student("Ruby", "female", 19, 30, 2);
        Student sC = new Student("Tom", "male", 17, 60, 1.75);

        Teacher t1 = new Teacher("Lisa", "female", 30);
        Teacher t2 = new Teacher("Rogers", "male", 31);

        System.out.println(sA.toString());
        sA.content();
        t1.content();

        sB.setClassTime(100);

    }
}
