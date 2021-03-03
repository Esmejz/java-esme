package com.gs.computer;

/**
 * 移动设备操作接口 - 定义所有移动设备的通用行为
 * @author dabaicai
 */
public interface IMobileStorage {

    /**
     * 读取数据
     * @return: 返回读取的数据
     */
    String read();

    /**
     * 写入数据
     * @param data - 需要写入的数据
     */
    void write(String data);

}
