package com.gs.computer;

/**
 * Mp3播放器实现类
 * @author dabaicai
 */
public class Mp3Player implements IMobileStorage, Player {

    private String data = "";

    private String getData() {
        return data;
    }

    private void setData(String data) {
        this.data = data;
    }

    @Override
    public String read() {
        System.out.println("Reading from MP3Player……");
        System.out.println("Read finished!");
        return this.getData();
    }

    @Override
    public void write(String data) {
        System.out.printf("Writing to MP3Player……the data is: %s%n", data);
        this.setData(data);
        System.out.println("Write finished!");
    }

    /**
     * 独有的方法
     */
    @Override
    public void playMusic() {
        System.out.println("Music is playing……");
    }
}
