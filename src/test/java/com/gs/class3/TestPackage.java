package com.gs.class3;

import com.gs.class003.*;
import com.gs.class003.Package;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @version: V1.0
 * @author: jiamanzhu
 * @fileName: TestPackage.java
 * @className: TestPackage
 * @description: 1. 创建一个Package对象，先扫描并将结果添加到List<Package>中，
 * 然后循环遍历该List，通过调用每个对象的printInfo方法（接口）来打印输出
 * 2. 并添加Log4j日志输出
 * @date: 03/03/2021
 */

public class TestPackage {
    private static Logger logger = Logger.getLogger(String.valueOf(TestPackage.class));

    public static void main(String[] args) {

        List<Package> ps = new ArrayList();
        Package p1 = new Package(001, "package");
        Package p2 = new Package(002, "package");
        ps.add(p1);
        ps.add(p2);
        for (Package p : ps) {
            p.printInfo();
        }
        // 记录debug级别的信息
        logger.warning("This is warning message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.config("This is config message.");
//        logger.debug("This is debug message.");
    }
}
