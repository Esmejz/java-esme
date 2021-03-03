package com.gs.computer;

/**
 * 移动硬盘实现类
 *
 * @author dabaicai
 */
public class MobileHardDisk implements IMobileStorage {

    private String data = "";

    private String getData() {
        return data;
    }

    private void setData(String data) {
        this.data = data;
    }

    @Override
    public String read() {
        System.out.println("Reading from MobileHardDisk……");
        System.out.println("Read finished!");
        return this.getData();
    }

    @Override
    public void write(String data) {
        System.out.printf("Writing to MobileHardDisk……the data is: %s%n", data);
        this.setData(data);
        System.out.println("Write finished!");
    }

}
