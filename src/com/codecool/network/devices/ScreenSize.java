package com.codecool.network.devices;

public enum ScreenSize {

    EDTV(5), HD(10), FULLHD(15), UHD(20);

    private final int powerLoss;

    ScreenSize(int powerLoss) {
        this.powerLoss = powerLoss;
    }

    public int getPowerLoss() {
        return powerLoss;
    }
}
