package com.gs.testproject;

/*
定义一个接口计算学分


我们学校的绩点计算公式：
课程学分绩点=课程绩点X课程权重系数X课程学分
Subject grade point = Subject  * Subject value coefficient * Subject credit point
平均学分绩点=课程学分绩点总和 / 课程学分总和
GPA = Total subject grade points  / Total subject credit points

 */

/**
 * @author jiamanzhu
 */
public interface CalculateScore{

    default double calScore(double classTime, double coefficient){
        double score = classTime * coefficient;
        return score;
    }
}
