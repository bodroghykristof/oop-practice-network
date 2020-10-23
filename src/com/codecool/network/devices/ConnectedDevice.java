package com.codecool.network.devices;

import java.util.Set;

public class ConnectedDevice extends Device {

    public static final int BATTERY_LOSS_PER_AGE_UNIT = 7;
    public static final int BATTERY_GAIN_PER_DEVICE = 20;
    private Set<ConnectedDevice> connectedDevices;

    public ConnectedDevice(int age, int batteryLife) {
        super(age, batteryLife);
    }

    public void setConnectedDevices(Set<ConnectedDevice> connectedDevices) {
        this.connectedDevices = connectedDevices;
    }

    @Override
    public int calculateRemainingPower() {
        return Math.max(0, batteryLife - BATTERY_LOSS_PER_AGE_UNIT * age + BATTERY_GAIN_PER_DEVICE * (connectedDevices.size() - 1));
    }
}
