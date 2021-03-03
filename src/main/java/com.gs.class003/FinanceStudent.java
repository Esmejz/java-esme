package com.gs.class003;

/**
 * @version: V1.0
 * @author: jiamanzhu
 * @fileName: FinanceStudent.java
 * @className: FinanceStudent
 * @description: 继承自学生且实现计算学分的接口，其计算学分的方法分为：金融系学生：(课时 + 20)*学分系数(常数0.6)
 * @date: 03/03/2021
 */

public class FinanceStudent extends Student implements Lesson, CalculateScore {
    public FinanceStudent(String name, String gender, int age) {
        super(name, gender, age);
    }

    private final double coefficient = 0.6;
    private final double classTime = 60;

    @Override
    public double calScore(double classTime, double coefficient) {
        double score = (classTime + 20) * coefficient;
        System.out.println("金融学生的分数为： " + score);
        return score;
    }

    private double score = calScore(classTime, coefficient);

    @Override
    public String toString() {
        return "FinanceStudent{" +
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
