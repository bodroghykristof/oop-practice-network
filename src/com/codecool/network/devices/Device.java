package com.codecool.network.devices;

public abstract class Device {

    protected int age;
    protected int batteryLife;

    public Device(int age, int batteryLife) {
        this.age = age;
        this.batteryLife = batteryLife;
    }

    public int calculateRemainingPower() {
        return 0;
    }
}
