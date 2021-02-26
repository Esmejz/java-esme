package com.gs.testproject;

import java.io.File;

public class ReadFiles {

    public boolean getFiles(String path) {

        // File对象 可以是文件或者目录
        File file = new File(path);
        File[] array = file.listFiles();
        for (int i = 0; i < array.length; i++) {
            //if (array[i].isFile(){
            if (array[i].isFile() && array[i].getName().contains(".txt")) {
                System.out.println(array[i].getPath());
            } else if (array[i].isDirectory()) {
                getFiles(array[i].getPath());
//                System.out.println("-----" + array[i].getPath());
            }
        }
        return false;
    }
}
