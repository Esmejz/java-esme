package com.gs.class004;

/**
 * 教师类
 * @author dabaicai
 */
public class Teacher extends Person implements IClass {

    /**
     * 默认构造函数
     */
    public Teacher() {

    }

    /**
     * 带参数构造函数
     * @param name - 姓名
     * @param age - 年龄
     * @param sex - 性别
     */
    public Teacher(String name, Integer age, String sex) {
        super(name, age, sex);
    }

    /**
     * 教师实现上课接口
     */
    @Override
    public void goToClass() {
        System.out.println(String.format("老师：%s 准备教案", this.getName()));
    }
}
