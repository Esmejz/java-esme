package com.gs.class003;

/**
 * @version: V1.0
 * @author: jiamanzhu
 * @fileName: Package.java
 * @className: Package
 * @date: 03/03/2021
 */

public class JavaPackage implements IPackage {

    private String pname;

    public JavaPackage(String pname) {
        this.pname = pname;
    }

    @Override
    public void printInfo() {
        System.out.println("The package name is: " + this.pname);
    }
}
