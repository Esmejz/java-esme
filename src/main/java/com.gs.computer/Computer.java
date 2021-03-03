package com.gs.computer;

/**
 * PC实现类
 *
 * @author dabaicai
 */
public class Computer {
    private IMobileStorage usbDrive;

    public IMobileStorage getUsbDrive() {
        return usbDrive;
    }

    public void setUsbDrive(IMobileStorage usbDrive) {
        this.usbDrive = usbDrive;
    }

    public Computer() {
    }

    public Computer(IMobileStorage usbDrive) {
        this.usbDrive = usbDrive;
    }

    public String readData() {
        return this.usbDrive.read();
    }

    public void writeData(String data) {
        this.usbDrive.write(data);
    }
}
