package com.codecool.network;

import com.codecool.network.devices.ConnectedDevice;
import com.codecool.network.devices.Device;
import com.codecool.network.devices.NormalDevice;
import com.codecool.network.devices.SmartDevice;

import java.util.HashSet;
import java.util.Set;

public class Network {

    private final Set<Device> devices = new HashSet<>();
    private final Set<ConnectedDevice> connectedDevices = new HashSet<>();
    private final Set<NormalDevice> normalDevices = new HashSet<>();

    public boolean addDevice(Device device) {
        boolean insertionSucceeded = devices.add(device);
        if (insertionSucceeded) {
            if (device instanceof ConnectedDevice) {
                connectedDevices.add((ConnectedDevice) device);
                ((ConnectedDevice) device).setConnectedDevices(connectedDevices);
            }
            else if (device instanceof NormalDevice) normalDevices.add((NormalDevice) device);
            else ((SmartDevice) device).setNormalDevices(normalDevices);
        }
        return insertionSucceeded;
    }

    public boolean removeDevice(Device device) {
        boolean deletionSucceeded = devices.remove(device);
        if (deletionSucceeded) {
            if (device instanceof ConnectedDevice) {
                connectedDevices.remove(device);
                ((ConnectedDevice) device).setConnectedDevices(null);
            }
            else if (device instanceof NormalDevice) normalDevices.remove(device);
            else ((SmartDevice) device).setNormalDevices(null);
        }
        return deletionSucceeded;
    }
}
