package com.codecool.network.devices;

public class NormalDevice extends Device {

    public static final int BATTERY_LOSS_PER_AGE_UNIT = 3;
    private final ScreenSize screenSize;
    private final int manufactureYear;

    public NormalDevice(int age, int batteryLife, ScreenSize screenSize, int manufactureYear) {
        super(age, batteryLife);
        this.screenSize = screenSize;
        this.manufactureYear = manufactureYear;
    }

    @Override
    public int calculateRemainingPower() {
        return (manufactureYear >= 2000 ? batteryLife * 2 : batteryLife / 2) - BATTERY_LOSS_PER_AGE_UNIT *  age;
    }
}
