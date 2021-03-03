package com.gs.class003;

/**
 * @version: V1.0
 * @author: jiamanzhu
 * @fileName: Teacher.java
 * @className: Teacher
 * @description: 老师实现上课接口，打印内容为准备教案
 * @date: 03/03/2021
 */

public class Teacher extends Person implements Lesson {

    /**
     * @ConstructorName: Teacher
     * @param: [name, gender, age]
     */
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

    /**
     * @methodsName: content
     * @description: 打印内容为准备教案
     * @return: void
     */
    @Override
    public void content() {
        System.out.println(super.name + "准备教案！");
    }
}
