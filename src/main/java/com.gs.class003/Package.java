package com.gs.class003;

/**
 * @version: V1.0
 * @author: jiamanzhu
 * @fileName: Package.java
 * @className: Package
 * @date: 03/03/2021
 */

public class Package implements IPackage {

    private int pnumber;
    private String pname;

    public Package(int pnumber, String pname) {
        this.pnumber = pnumber;
        this.pname = pname;
    }

    @Override
    public void printInfo() {
        System.out.println("The package name is: " + this.pname + ", the package number is: " + this.pnumber);
    }
}
