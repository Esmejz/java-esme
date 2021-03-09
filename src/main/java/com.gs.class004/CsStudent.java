package com.gs.class004;

/**
 * 计算机系学生实现类
 * @author dabaicai
 */
public class CsStudent extends Student implements ICredits {

    /**
     * 计算机系学生的学分系数(所有计算机系学生的系数都一样，所以这里使用static)
     * 如果固定，可以加final关键字
     * 如果系数是浮动的，可以去掉final关键字，并提供静态方法供修改
     */
    private static Double STUDENT_COEFFICIENT_CS = 0.9;

    public static Double getStudentCoefficientCs() {
        return STUDENT_COEFFICIENT_CS;
    }

    public static void setStudentCoefficientCs(Double studentCoefficientCs) {
        STUDENT_COEFFICIENT_CS = studentCoefficientCs;
    }

    /**
     * 默认构造函数
     */
    public CsStudent() {

    }

    /**
     * 带参数的构造方法
     * @param name - 姓名
     * @param age - 年龄
     * @param sex - 性别
     * @param classTime - 学分
     */
    public CsStudent(String name, Integer age, String sex, Double classTime) {
        super(name, age, sex);
        // 每个学生的课时有可能不同
        super.setClassTime(classTime);
        super.setCoefficient(CsStudent.STUDENT_COEFFICIENT_CS);
    }

    /**
     * 接口方法的具体实现：根据课时和学分系数两个属性计算学分
     * @return 学分
     */
    @Override
    public double calCredits() {
        return this.getClassTime() * this.getCoefficient();
    }

}
