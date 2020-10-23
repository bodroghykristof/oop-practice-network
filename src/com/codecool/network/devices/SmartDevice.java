package com.codecool.network.devices;

import java.util.Set;
import java.util.UUID;

public class SmartDevice extends Device {

    private static final int BATTERY_LOSS_PER_AGE_UNIT = 15;
    private final ScreenSize screenSize;
    private final UUID name;
    private Set<NormalDevice> normalDevices;

    public SmartDevice(int age, int batteryLife, ScreenSize screenSize) {
        super(age, batteryLife);
        this.screenSize = screenSize;
        this.name = UUID.randomUUID();
    }

    public void setNormalDevices(Set<NormalDevice> normalDevices) {
        this.normalDevices = normalDevices;
    }

    @Override
    public int calculateRemainingPower() {
        return Math.max(0, batteryLife - BATTERY_LOSS_PER_AGE_UNIT * age - screenSize.getPowerLoss());
    }
}
