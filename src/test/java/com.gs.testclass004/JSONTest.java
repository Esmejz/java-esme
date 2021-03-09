package com.gs.testclass004;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gs.class004.CsStudent;
import com.gs.class004.FinanceStudent;
import com.gs.class004.MathStudent;
import org.junit.Test;

public class JSONTest {

    /** *
     * @methodsName: jsonTestCsStudent
     * @description:
     * 1. 构造一个CsStudent对象，将其转化为json串并打印出来
     * 2. 新建一个字符串(new String)，将其设置为必要的内容，使得其可以被反序列化成金融系学生对象，通过get方法打印其中的一个属性出来
     * 3. 给金融系学生对象新增一个开学日期的属性，并尝试使用@JsonFormat进行格式化操作
     * @return: void
     * @throws: JsonProcessingException
     */
    @Test
    public void jsonTest() throws JsonProcessingException {

        /**
         * 1. 构造一个CsStudent对象，将其转化为json串并打印出来
         */
        //创建一个对象
        CsStudent cs1 = new CsStudent("小宝", 23, "male", 40.0);
        //创建JSON处理工具对象
        ObjectMapper objectMapper = new ObjectMapper();
        //将对象转化为json串
        String sj = objectMapper.writeValueAsString(cs1);
        System.out.println("CsStudent对象转化为JSON的输出为：" + sj);

        /**
         * 反序列化： 将json串转化为对象
         * 2. 新建一个字符串(new String)，将其设置为必要的内容，使得其可以被反序列化成金融系学生对象，通过get方法打印其中的一个属性出来
         */
        String js = "{\"name\":\"小明\",\"age\":23,\"sex\":\"male\",\"classTime\":40.0,\"coefficient\":0.9}";
        FinanceStudent finfromjson = objectMapper.readValue(js, FinanceStudent.class);
        System.out.println(finfromjson.getName());

        /**
         * 3. 给数学系学生对象新增一个开学日期的属性，并尝试使用@JsonFormat进行格式化操作
         */
        //需要在mathstudent类中加一个一个新的构造器？
        MathStudent ms1 = new MathStudent("小红", 25, "female", 40.0, 0.9);
        //创建JSON处理工具对象
        ObjectMapper objectMapper2 = new ObjectMapper();
        //将对象转化为json串
        String msj = objectMapper2.writeValueAsString(ms1);
        System.out.println("MathStudent对象转化为JSON的输出为：" + msj);

    }
}
