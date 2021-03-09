package com.gs.class004;

/**
 * Person类 - 基类
 * @author dabaicai
 */
public abstract class Person {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 默认构造函数
     */
    public Person() {

    }

    /**
     * 带参数的构造函数
     * @param name - 姓名
     * @param age - 年龄
     * @param sex - 性别
     */
    public Person(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

}
