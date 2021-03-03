package com.gs.computer;


/**
 * 闪存盘/U盘实现类
 * @author dabaicai
 */
public class FlashDisk implements IMobileStorage {

    private String data = "";

    private String getData() {
        return data;
    }

    /**
     * 内部实现
     * @param data
     */
    private void setData(String data) {
        this.data = data;
    }

    /**
     * 通过接口对外暴露服务
     * @return
     */
    @Override
    public String read() {
        System.out.println("Reading from FlashDisk……");
        System.out.println("Read finished!");
        return this.getData();
    }

    @Override
    public void write(String data) {
        System.out.printf("Writing to FlashDisk……the data is: %s%n", data);
        this.setData(data);
        System.out.println("Write finished!");
    }
}
