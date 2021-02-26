package com.gs.testproject;

public class CsStudent extends Student implements Lesson, CalculateScore{
    public CsStudent(String name, String gender, int age, double classTime, double coefficient) {
        super(name, gender, age, classTime, coefficient);
    }

//    计算机系学生：(课时)*学分系数(常数0.9)
    public final double coefficient = 0.9;
    @Override
    public double calScore(double classTime, double coefficient){
        double score = classTime  * this.coefficient;
        return score;
    }
}
