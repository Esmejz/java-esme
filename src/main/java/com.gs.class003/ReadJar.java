package com.gs.class003;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @version: V1.0
 * @author: jiamanzhu
 * @fileName: ReadJar.java
 * @className: ReadJar
 * @description: 读取本地配置过后的MAVEN仓库下(需包含每层子目录)的所有jar依赖包，将每一个jar包按如下格式打印出来：
 * ```
 * [eg: junit-4.13.1.jar]
 * 包名：junit
 * 版本号：4.13.1
 * 后缀：.jar
 * 完整路径：xxxxxx/junit-4.13.1.jar
 * ```
 * @date: 03/03/2021
 */

public class ReadJar {

    /**
     * 调用类-->得到List<Package>
     */
    public List<JavaPackage> ps = new ArrayList();

    /**
     * @param path
     * @return false
     */
    public boolean getFiles(String path) {
        // File对象 可以是文件或者目录
        File file = new File(path);
        File[] array = file.listFiles();
        for (int i = 0; i < array.length; i++) {
            if (array[i].isFile() && array[i].getName().endsWith(".jar")) {
                String[] tempfiles = array[i].getPath().split("/");
                /*
                System.out.println("包名：" + tempfiles[6] + "\n" +
                        "版本号：" + tempfiles[7] + "\n" +
                        "后缀：" + ".jar");
                System.out.println("完整路径：" + array[i].getPath());
//                String[] temp = lastsplit.split(".");
                 */

                String lastsplit = tempfiles[tempfiles.length - 1];

                /**
                 * 扫描包-->创建类
                 */
                ps.add(new JavaPackage(lastsplit));
                /**
                 * 循环List-->打印结果-->调用接口printInfo方法
                 */
                for (JavaPackage p : ps) {
                    p.printInfo();
                }
//                System.out.println(tempfiles[0]);
//                System.out.println(temp[1]);
//                System.out.println(temp[2]);

            } else if (array[i].isDirectory()) {
                getFiles(array[i].getPath());
            }
        }
        return false;
    }
}
