package com.gs.class003;

/**
 * @version: V1.0
 * @author: jiamanzhu
 * @fileName: CsStudent.java
 * @className: CsStudent
 * @description: 继承自学生且实现计算学分的接口，其计算学分的方法分为：计算机系学生：(课时)*学分系数(常数0.9)
 * @date: 03/03/2021
 */

public class CsStudent extends Student implements Lesson, CalculateScore {
    public CsStudent(String name, String gender, int age) {
        super(name, gender, age);
    }

    public final double coefficient = 0.9;
    public final double classTime = 30;

    @Override
    public double calScore(double classTime, double coefficient) {
        double score = classTime * coefficient;
        System.out.println("计算机学生的分数为： " + score);
        return score;
    }

    private double score = calScore(classTime, coefficient);


    @Override
    public String toString() {
        return "CsStudent{" +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", coefficient=" + coefficient +
                ", classTime=" + classTime +
                ", score = " + score +
                '}';
    }

    /**
     * @methodsName: getScore
     * @description: 使得外部可以获得score分数
     * @return: double
     */
    @Override
    public double getScore() {
        return score;
    }
}
