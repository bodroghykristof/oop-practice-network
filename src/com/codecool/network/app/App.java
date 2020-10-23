package com.codecool.network.app;

import com.codecool.network.Network;
import com.codecool.network.devices.*;

public class App {

    public static void main(String[] args) {
        Network network = new Network();

        Device myPhoneOne = new ConnectedDevice(4, 100);
        Device myPhoneTwo = new ConnectedDevice(4, 100);
        Device myPhoneThree = new ConnectedDevice(4, 100);
        network.addDevice(myPhoneOne);
        network.addDevice(myPhoneTwo);
        network.addDevice(myPhoneThree);

        Device smart = new SmartDevice(5, 80, ScreenSize.FULLHD);
        Device normal = new NormalDevice(3, 80, ScreenSize.HD, 2001);

        System.out.println(myPhoneOne.calculateRemainingPower());
        System.out.println(smart.calculateRemainingPower());
        System.out.println(normal.calculateRemainingPower());
    }

}
