package com.gs.class003;

import java.io.File;

/**
 * @version: V1.0
 * @author: jiamanzhu
 * @fileName: ReadFiles.java
 * @className: ReadFiles
 * @description: 实现读取特定~目录下(需包含每层子目录)的所有文件方法，将其中的.txt文件完整路径列表打印出来。
 * /user/xxxx/a.txt
 * /user/xxxx/tmp/b.txt
 * @date: 03/03/2021
 */

public class ReadFiles {
    /**
     * @methodsName: getFiles
     * @description: 读取特定~目录下(需包含每层子目录)的所有文件
     * @param: [path]
     * @return: boolean
     * @throws:
     */
    public boolean getFiles(String path) {
        // File对象 可以是文件或者目录
        File file = new File(path);
        File[] array = file.listFiles();
        for (int i = 0; i < array.length; i++) {
            if (array[i].isFile() && array[i].getName().endsWith(".txt")) {
                System.out.println(array[i].getPath());
            } else if (array[i].isDirectory()) {
                getFiles(array[i].getPath());
            }
        }
        return false;
    }
}
