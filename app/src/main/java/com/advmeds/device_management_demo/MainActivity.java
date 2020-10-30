package com.advmeds.device_management_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.advmeds.advmeds_device_management_lib.BtDeviceCategoryEnum;
import com.advmeds.advmeds_device_management_lib.BtDeviceListEnum;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (BtDeviceCategoryEnum btDeviceCategoryEnum : BtDeviceCategoryEnum.get_mPHR_Enum()) {
            for (BtDeviceListEnum btDeviceListEnum : btDeviceCategoryEnum.getDeviceListArray()) {
                Log.e(btDeviceCategoryEnum.getCategoryName(getApplicationContext()), btDeviceListEnum.getDeviceName());
            }
        }
    }
}
