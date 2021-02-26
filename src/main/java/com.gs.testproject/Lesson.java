package com.gs.testproject;

/**
 * @author jiamanzhu
 */
public interface Lesson {

    default void content() {
        System.out.println("This is our Lesson content!");
    }
}
