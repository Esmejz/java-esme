package com.gs.class003;

import java.util.List;

/**
 * @version: V1.0
 * @author: jiamanzhu
 * @fileName: Student.java
 * @className: Student
 * @description: 1. Student实现上课接口，打印内容为准备笔记
 * 2. 学生类有课时(double)、学分系数(double)两个属性
 * 3. 学生A是数学系的，一共选修了40课时；学生B计算机系学生，一共选修了30课时；学生C金融系，选修了60课时。
 * 4. 在Student类中实现一个参数为学生列表的静态方法，计算3位学生的学分总和，并通过测试类调用该静态方法输出学分总和结果。
 * @date: 03/03/2021
 */

public class Student<T> extends Person implements Lesson {

    private double classTime;
    private double coefficient;

    /**
     * @ConstructorName: Student
     * @param: [name, gender, age, classTime, coefficient]
     */
    public Student(String name, String gender, int age) {
        super(name, gender, age);
    }


    /**
     * @methodsName: content
     * @description: 1.打印内容为准备笔记
     * @return: void
     */
    @Override
    public void content() {
        System.out.println(super.name + "准备笔记！");
    }

    public double getScore() {
        return 0;
    }

    public static void calFromList(List<Student> stuList) {
        double sum = 0;
        for (Student obj : stuList) {
            sum += obj.getScore();
        }
        System.out.println("计算3位学生的学分总和: " + sum);
    }
}
