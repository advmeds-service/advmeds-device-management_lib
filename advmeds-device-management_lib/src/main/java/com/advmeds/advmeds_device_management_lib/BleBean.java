package com.advmeds.advmeds_device_management_lib;

import android.bluetooth.BluetoothDevice;

import androidx.annotation.Keep;

import java.io.Serializable;

/**
 * @author Open-PC
 */
@Keep
public class BleBean implements Serializable {
    private String bleName = "", bleMacAddress = "";
    private String bleSearchName = "";
    private String bleConnectName = "";
    private Integer bleState;
    private String SN;
    private BluetoothDevice bluetoothDevice;

    public String getBleName() {
        return bleName;
    }

    public void setBleName(String bleName) {
        this.bleName = bleName;
    }

    public String getBleSearchName() {
        return bleSearchName;
    }

    public void setBleSearchName(String bleSearchName) {
        this.bleSearchName = bleSearchName;
    }

    public String getBleConnectName() {
        return bleConnectName;
    }

    public void setBleConnectName(String bleConnectName) {
        this.bleConnectName = bleConnectName;
    }

    public String getBleMacAddress() {
        return bleMacAddress;
    }

    public void setBleMacAddress(String bleMacAddress) {
        this.bleMacAddress = bleMacAddress;
    }

    public Integer getBleState() {
        return bleState;
    }

    public void setBleState(int bleState) {
        this.bleState = bleState;
    }

    public void setBleState(Integer bleState) {
        this.bleState = bleState;
    }

    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }

    public BluetoothDevice getBluetoothDevice() {
        return bluetoothDevice;
    }

    public void setBluetoothDevice(BluetoothDevice bluetoothDevice) {
        this.bluetoothDevice = bluetoothDevice;
    }
}
