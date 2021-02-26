package com.gs.testproject;
/**
 *  2. 读取本地配置过后的MAVEN仓库下(需包含每层子目录)的所有jar依赖包，将每一个jar包按如下格式打印出来：
 ```
 [eg: junit-4.13.1.jar]
 包名：junit
 版本号：4.13.1
 后缀：.jar
 完整路径：xxxxxx/junit-4.13.1.jar
 ```
 */
import java.io.File;
import java.util.ArrayList;

public class ReadJar {

    // File对象 可以是文件或者目录
    public boolean getFiles(String path) {
        File file = new File(path);
        File[] array = file.listFiles();
        for (int i = 0; i < array.length; i++) {
            if (array[i].isFile() && array[i].getName().contains(".jar") && !array[i].getName().contains(".sha1")) {
                String[] tempfiles = array[i].getPath().split("/");
                System.out.println("包名：" + tempfiles[6] + "\n" +
                                    "版本号：" + tempfiles[7] + "\n" +
                                    "后缀：" + ".jar");
                System.out.println("完整路径：" + array[i].getPath());


            } else if (array[i].isDirectory()) {
                getFiles(array[i].getPath());
            }
        }
        return false;
    }
}
