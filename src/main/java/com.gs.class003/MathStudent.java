package com.gs.class003;

/** *
 * @version: V1.0
 * @author: jiamanzhu
 * @fileName: MathStudent.java
 * @className: MathStudent
 * @description: 继承自学生且实现计算学分的接口，其计算学分的方法分为：数学系学生：(课时 + 10)*学分系数(常数0.8)
 * @date: 03/03/2021
 */

public class MathStudent extends Student implements Lesson, CalculateScore{
    public MathStudent(String name, String gender, int age) {
        super(name, gender, age);
    }

    private final double coefficient = 0.8;
    private final double classTime = 40;

    @Override
    public double calScore(double classTime, double coefficient){
        double score = (classTime + 10) * coefficient;
        System.out.println("数学学生的分数为： " + score);
        return score;
    }

    private double score = calScore(classTime, coefficient);

    @Override
    public String toString() {
        return "MathStudent{" +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", coefficient=" + coefficient +
                ", classTime=" + classTime +
                ", score = " + score +
                '}';
    }

    /** *
     * @methodsName: getScore
     * @description: 使得外部可以获得score分数
     * @return: double
     */
    @Override
    public double getScore() {
        return score;
    }
}
