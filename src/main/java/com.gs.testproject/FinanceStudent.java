package com.gs.testproject;

public class FinanceStudent extends Student implements Lesson, CalculateScore{
    public FinanceStudent(String name, String gender, int age, double classTime, double coefficient) {
        super(name, gender, age, classTime, coefficient);
    }

//    金融系学生：(课时 + 20)*学分系数(常数0.6)
    public final double coefficient = 0.6;
    @Override
    public double calScore(double classTime, double coefficient){
        double score = (classTime + 20) * this.coefficient;
        return score;
    }
}
