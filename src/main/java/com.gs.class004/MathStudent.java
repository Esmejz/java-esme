package com.gs.class004;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 数学系学生实现类
 * @author dabaicai
 */
public class MathStudent extends Student implements ICredits {

    /**
     * 数学系学生的学分系数(所有金融系学生的系数都一样，所以这里使用static)
     * 如果固定，可以加final关键字
     * 如果系数是浮动的，可以去掉final关键字，并提供静态方法供修改
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;


    public MathStudent(String 小红, int i, String female, double v, double v1) {
    }

    public Date getDate() {
        return new Date();
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private static Double STUDENT_COEFFICIENT_MATH = 0.8;

    public MathStudent(String 小宝, int age, String male, double classTime, Date date) {
    }

    public static Double getStudentCoefficientMath() {
        return STUDENT_COEFFICIENT_MATH;
    }

    public static void setStudentCoefficientMath(Double studentCoefficientMath) {
        STUDENT_COEFFICIENT_MATH = studentCoefficientMath;
    }

    /**
     * 默认构造方法
     */
    public MathStudent() {

    }

    /**
     * 带参数的构造方法
     * @param name - 姓名
     * @param age - 年龄
     * @param sex - 性别
     * @param classTime - 学分
     */
    public MathStudent(String name, Integer age, String sex, Double classTime, Date date) {
        super(name, age, sex);
        // 每个学生的课时有可能不同
        super.setClassTime(classTime);
        super.setCoefficient(MathStudent.STUDENT_COEFFICIENT_MATH);
    }

    /**
     * 接口方法的具体实现：根据课时和学分系数两个属性计算学分
     * @return 学分
     */
    @Override
    public double calCredits() {
        return (this.getClassTime() + 10) * this.getCoefficient();
    }
}
