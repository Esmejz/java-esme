package com.gs.testproject;

public class Helloworld {
    public static void main(String[] args) {

        Student sA = new Student("Bob", "male", 18, 40, 1.75);
        Student sB = new Student("Ruby", "female", 19, 30, 2);
        Student sC = new Student("Tom", "male", 17, 60, 1.75);

        Teacher t1 = new Teacher("Lisa", "female", 30);
        Teacher t2 = new Teacher("Rogers", "male", 31);

        System.out.println(sA.toString());
        sA.content();
        t1.content();

        sB.setClassTime(100);


    }
}
