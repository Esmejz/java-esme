package com.gs.testproject;

public class MathStudent extends Student implements Lesson, CalculateScore{
    public MathStudent(String name, String gender, int age, double classTime, double coefficient) {
        super(name, gender, age, classTime, coefficient);
    }

    //数学系学生：(课时 + 10)*学分系数(常数0.8)
    public final double coefficient = 0.8;
    @Override
    public double calScore(double classTime, double coefficient){
        double score = (classTime + 10) * this.coefficient;
        return score;
    }
}
