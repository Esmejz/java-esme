package com.gs.class003;

/**
 * @version: V1.0
 * @author: jiamanzhu
 * @fileName: Person.java
 * @className: Person
 * @description: 定义一个Person Class的虚类，有属性姓名，性别，年龄
 * @date: 03/03/2021
 */

public abstract class Person {

    protected String name;
    protected String gender;
    protected int age;
    /**
     * @ConstructorName: Person
     * @param: [name, gender, age]
     */
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
