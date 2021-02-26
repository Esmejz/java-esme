package com.gs.testproject;

/*
老师实现上课接口，打印内容为准备教案
 */
public class Teacher extends Person implements Lesson{

    public Teacher(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public String toString() {
        return "Teacher {" +
                "name='" + super.name + '\'' +
                ", gender='" + super.gender + '\'' +
                ", age=" + super.age +
                '}';
    }

    @Override
    public void content() {
        System.out.println(super.name + "准备教案！");
    }
}
