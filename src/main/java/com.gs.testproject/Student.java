package com.gs.testproject;

/*
1. Student实现上课接口，打印内容为准备笔记

2. 学生类有课时(double)、学分系数(double)两个属性

3. 学生A是数学系的，一共选修了40课时；学生B计算机系学生，一共选修了30课时；学生C金融系，选修了60课时。

4. 在Student类中实现一个参数为学生列表的静态方法，计算3位学生的学分总和，并通过测试类调用该静态方法输出学分总和结果。
 */

public class Student extends Person  implements Lesson{

    public double classTime;
    public double coefficient;


    public Student(String name, String gender, int age, double classTime, double coefficient) {
        super(name, gender, age);
        this.classTime = classTime;
        this.coefficient = coefficient;
    }

    public double getClassTime() {
        return classTime;
    }

    public void setClassTime(double classTime) {
        this.classTime = classTime;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + super.name + '\'' +
                ", gender='" + super.gender + '\'' +
                ", age=" + super.age +
                '}';
    }

    @Override
    public void content() {
        System.out.println(super.name + "准备笔记！");
    }
}
