package com.gs.class004;

import org.apache.log4j.Logger;

import java.util.List;

/**
 * 学生类
 * @author dabaicai
 */
public class Student extends Person implements IClass {

    private static final Logger log = Logger.getLogger(Student.class);

    /**
     * 课时
     */
    private Double classTime;

    /**
     * 学分系数
     */
    private Double coefficient;

    public Double getClassTime() {
        return classTime;
    }

    public void setClassTime(Double classTime) {
        this.classTime = classTime;
    }

    public Double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }

    /**
     * 默认构造函数
     */
    public Student() {

    }

    /**
     * 带参数的构造函数(不设置学分)
     * @param name - 姓名
     * @param age - 年龄
     * @param sex - 性别
     */
    public Student(String name, Integer age, String sex) {
        super(name, age, sex);
    }

    /**
     * 带参数的构造函数
     * @param name - 姓名
     * @param age - 年龄
     * @param sex - 性别
     * @param classTime - 课时
     * @param coefficient - 学分系数
     */
    public Student(String name, Integer age, String sex, Double classTime, Double coefficient) {
        super(name, age, sex);
        this.classTime = classTime;
        this.coefficient = coefficient;
    }

    /**
     * 学生实现上课接口
     */
    @Override
    public void goToClass() {
        System.out.println(String.format("学生：%s 准备笔记", this.getName()));
    }

    /**
     * 计算学生学分综合的静态接口
     * @param studentList - 学生列表
     * @return 学分总和
     */
    public static double calTotalCredits(List<ICredits> studentList) {
        log.info("开始计算学分...");
        double totalCredits = 0;
        for (ICredits iCredits : studentList) {
            totalCredits += iCredits.calCredits();
        }
        log.info(String.format("学分计算完毕，总分为：%s", totalCredits));
        return totalCredits;
    }

}
