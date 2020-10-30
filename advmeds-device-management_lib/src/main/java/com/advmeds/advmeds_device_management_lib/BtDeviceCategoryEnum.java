package com.advmeds.advmeds_device_management_lib;

import android.content.Context;

import java.util.ArrayList;
import java.util.Collections;

import static com.advmeds.advmeds_device_management_lib.BtDeviceListEnum.*;

public enum BtDeviceCategoryEnum {
    PRESSURE(R.string.more_ble_connect_pressure, D40_TD3261, P30_TD3129, P80_TD3140, TD3128),
    WEIGHT(R.string.more_ble_connect_weight, TD2555),
    TEMPERATURE(R.string.more_ble_connect_temperature, BF4030, IR40_TD1241, TD1261, TD1035, IR42_TD1242),
    OXYGEN(R.string.more_ble_connect_blood_o2, O2_TD8255, TD8201),
    GLUCOSE(R.string.more_ble_connect_blood_sugar, TD4257, GD40_TD4272, D40_TD3261_SUGAR, TD4216_SUGAR,
            DSP_COMBO),
    URIC_ACID(R.string.text_uric_acid, TD4141, TD4206_URIC_ACID, TD4216_URIC_ACID),
    KETONE(R.string.text_ketone, TD4206_KETONE),
    CHOLESTEROL(R.string.text_cholesterol);

    BtDeviceListEnum[] deviceList;

    int cateGoryName;

    BtDeviceCategoryEnum(int stringId, BtDeviceListEnum... deviceList) {
        cateGoryName = stringId;
        this.deviceList = deviceList;
    }

    public static ArrayList<BtDeviceCategoryEnum> get_mPHR_Enum() {
        ArrayList<BtDeviceCategoryEnum> arrayList = new ArrayList<>();

        Collections.addAll(arrayList, BtDeviceCategoryEnum.PRESSURE);
        Collections.addAll(arrayList, BtDeviceCategoryEnum.WEIGHT);
        Collections.addAll(arrayList, BtDeviceCategoryEnum.TEMPERATURE);
        Collections.addAll(arrayList, BtDeviceCategoryEnum.OXYGEN);
        Collections.addAll(arrayList, BtDeviceCategoryEnum.GLUCOSE);
        Collections.addAll(arrayList, BtDeviceCategoryEnum.URIC_ACID);
        Collections.addAll(arrayList, BtDeviceCategoryEnum.KETONE);
//        Collections.addAll(arrayList, BtDeviceCategoryEnum.CHOLESTEROL);

        return arrayList;
    }


    public String getCategoryName(Context context) {
        return context.getString(cateGoryName);
    }

    public ArrayList<BtDeviceListEnum> getDeviceListArray() {
        ArrayList<BtDeviceListEnum> arrayList = new ArrayList<>();

        Collections.addAll(arrayList, deviceList);

        return arrayList;
    }

    public static BtDeviceCategoryEnum getSelectCategoryEnum(String selectName) {
        for (BtDeviceCategoryEnum btDeviceCategoryEnum : BtDeviceCategoryEnum.values()) {
            if (btDeviceCategoryEnum.name().equals(selectName)) {
                return btDeviceCategoryEnum;
            }
        }
        return null;
    }

}
