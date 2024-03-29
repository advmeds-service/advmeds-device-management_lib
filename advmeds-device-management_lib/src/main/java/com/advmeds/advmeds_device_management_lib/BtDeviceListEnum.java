package com.advmeds.advmeds_device_management_lib;

import android.content.Context;
import android.graphics.drawable.Drawable;

import static com.advmeds.advmeds_device_management_lib.BleVariables.*;

import androidx.annotation.Keep;


@Keep
public enum BtDeviceListEnum {
    // Search Name，連接方式-標題，連接方式-說明，圖片
    D40_TD3261(BLE_D40B_TD3261B, BLE_D40B_TD3261B_SEARCH, BLE_D40B_TD3261B_CONNECT,BLE_D40B_TD3261B_UPLOAD,
            R.string.more_ble_txt_d40_and_td3261_title,
            R.string.more_ble_txt_d40_and_td3261_pressure, R.string.operation_info_taidoc_global,
            R.drawable.img_d_40_b_td_3261_b),
    P30_TD3129(BLE_P30B_TD3129B, BLE_P30B_TD3129B_SEARCH, BLE_P30B_TD3129B_CONNECT,BLE_P30B_TD3129B_UPLOAD,
            R.string.more_ble_txt_p30_and_td3129_title,
            R.string.more_ble_txt_p30_and_td3129
            , R.string.operation_info_taidoc_global, R.drawable.img_p_30_b_td_3129_b),
    P80_TD3140(BLE_P80_TD3140, BLE_P80_TD3140_SEARCH, BLE_P80_TD3140_CONNECT,BLE_P80_TD3140_UPLOAD,
            R.string.more_ble_txt_p80_and_td3140_title,
            R.string.more_ble_txt_p80_and_td3140, R.string.operation_info_taidoc_global,
            R.drawable.img_fora_p_80_tai_doc_td_3140),
    TD3128(BLE_TD3128, BLE_TD3128_SEARCH, BLE_TD3128_CONNECT,BLE_TD3128_UPLOAD, R.string.more_ble_txt_td3128_title,
            R.string.more_ble_txt_td3128, R.string.operation_info_taidoc_global,
            R.drawable.img_tai_doc_td_3128),

    TD2555(BLE_TD2555, BLE_TD2555_SEARCH, BLE_TD2555_CONNECT,BLE_TD2555_UPLOAD, R.string.more_ble_txt_td2555_title,
            R.string.more_ble_txt_td2555, R.string.operation_info_taidoc_global,
            R.drawable.img_tai_doc_td_2555),
    W600_TD2560(BLE_W600_TD2560, BLE_W600_TD2560_SEARCH, BLE_W600_TD2560_CONNECT,BLE_W600_TD2560_UPLOAD, R.string.more_ble_txt_w600_and_td2560_title,
            R.string.more_ble_txt_w600_and_td2560, R.string.operation_info_taidoc_global,
            R.drawable.img_tai_doc_td_2560),
    BF4030(BLE_BF4030, BLE_BF4030_SEARCH, BLE_BF4030_CONNECT, BLE_BF4030_UPLOAD, R.string.more_ble_txt_bf4030_title,
            R.string.more_ble_txt_bf4030, R.string.operation_info_bf4030,
            R.drawable.img_bf_4030),
    IR40_TD1241(BLE_IR40_TD1241, BLE_IR40_TD1241_SEARCH, BLE_IR40_TD1241_CONNECT,BLE_IR40_TD1241_UPLOAD,
            R.string.more_ble_txt_ir40_and_td1241_title,
            R.string.more_ble_txt_ir40_and_td1241, R.string.operation_info_taidoc_global,
            R.drawable.img_fora_ir_40_tai_doc_td_1241),
    TD1261(BLE_TD1261, BLE_TD1261_SEARCH, BLE_TD1261_CONNECT, BLE_TD1261_UPLOAD, R.string.more_ble_txt_td1261_title,
            R.string.more_ble_txt_td1261, R.string.operation_info_taidoc_global,
            R.drawable.img_tai_doc_td_1261),
    TD1035(BLE_TD1035, BLE_TD1035_SEARCH, BLE_TD1035_CONNECT,BLE_TD1035_UPLOAD, R.string.more_ble_txt_td1035_title,
            R.string.more_ble_txt_td1035, R.string.operation_info_taidoc_global,
            R.drawable.img_tai_doc_td_1035),
    IR42_TD1242(BLE_IR42B_TD1242, BLE_IR42B_TD1242_SEARCH, BLE_IR42B_TD1242_CONNECT,BLE_IR42B_TD1242_UPLOAD,
            R.string.more_ble_txt_ir42_and_td1242_title,
            R.string.more_ble_txt_ir42_and_td1242, R.string.operation_info_taidoc_global,
            R.drawable.img_ir_42_b_td_1242),

    O2_TD8255(BLE_O2_TD8255, BLE_O2_TD8255_SEARCH, BLE_O2_TD8255_CONNECT,BLE_O2_TD8255_UPLOAD, R.string.more_ble_txt_td8255_title,
            R.string.more_ble_txt_td8255, R.string.operation_info_taidoc_global,
            R.drawable.img_fora_o_2_tai_doc_td_8255),
    TD8201(BLE_TD8201, BLE_TD8201_SEARCH, BLE_TD8201_CONNECT, BLE_TD8201_UPLOAD, R.string.more_ble_txt_td8201_title,
            R.string.more_ble_txt_td8201, R.string.operation_info_taidoc_global,
            R.drawable.img_tai_doc_td_8201),

    TD4257(BLE_TD4257, BLE_TD4257_SEARCH, BLE_TD4257_CONNECT,BLE_TD4257_UPLOAD, R.string.more_ble_txt_td4257_title,
            R.string.more_ble_txt_td4257, R.string.operation_info_taidoc_global,
            R.drawable.img_tai_doc_td_4257),
    GD40_TD4272(BLE_GD40B_TD4272B, BLE_GD40B_TD4272B_SEARCH, BLE_GD40B_TD4272B_CONNECT,BLE_GD40B_TD4272B_UPLOAD,
            R.string.more_ble_txt_gd40_and_td4272_title,
            R.string.more_ble_txt_gd40_and_td4272, R.string.operation_info_taidoc_global,
            R.drawable.img_fora_gd_40_b_tai_doc_td_4272_b),
    D40_TD3261_SUGAR(BLE_D40B_TD3261B, BLE_D40B_TD3261B_SEARCH, BLE_D40B_TD3261B_CONNECT,BLE_D40B_TD3261B_UPLOAD,
            R.string.more_ble_txt_d40_and_td3261_title,
            R.string.more_ble_txt_d40_and_td3261_sugar, R.string.operation_info_taidoc_global, R.drawable.img_d_40_b_td_3261_b),
    TD4216_SUGAR(BLE_TD4216, BLE_TD4216_SEARCH, BLE_TD4216_CONNECT,BLE_TD4216_UPLOAD, R.string.more_ble_txt_td4216_title,
            R.string.more_ble_txt_td4216_sugar, R.string.operation_info_taidoc_global, R.drawable.img_tai_doc_td_4216),
    TD4206_SUGAR(BLE_TD4206, BLE_TD4206_SEARCH, BLE_TD4206_CONNECT,  BLE_TD4206_UPLOAD, R.string.more_ble_txt_td4206_title,
            R.string.more_ble_txt_td4206_sugar, R.string.operation_info_taidoc_meter, R.drawable.img_tai_doc_td_4206),

    DSP_COMBO(BLE_DSP_COMBO_SENSOR, BLE_DSP_COMBO_SENSOR_SEARCH, BLE_DSP_COMBO_SENSOR_CONNECT,BLE_DSP_COMBO_SENSOR_UPLOAD,
            R.string.more_ble_txt_dsp_combo_title,
            R.string.more_ble_txt_dsp_combo, R.string.operation_info_dspcombo, R.drawable.img_dsp_combo_sensor),
    MD6_TD4172_SUGAR(BLE_FORA_MD6, BLE_FORA_MD6_SEARCH, BLE_FORA_MD6_CONNECT,  BLE_FORA_MD6_UPLOAD, R.string.more_ble_txt_md6_and_td4172_title,
            R.string.more_ble_txt_md6_and_td4172_sugar, R.string.operation_info_taidoc_global, R.drawable.img_fora_md6),

    TD4141(BLE_TD4141, BLE_TD4141_SEARCH, BLE_TD4141_CONNECT, BLE_TD4141_UPLOAD, R.string.more_ble_txt_td4141_title,
            R.string.more_ble_txt_td4141, R.string.operation_info_taidoc_meter, R.drawable.img_tai_doc_td_4141),
    TD4206_URIC_ACID(BLE_TD4206, BLE_TD4206_SEARCH, BLE_TD4206_CONNECT,BLE_TD4206_UPLOAD, R.string.more_ble_txt_td4206_title,
            R.string.more_ble_txt_td4206_uric_acid, R.string.operation_info_taidoc_meter, R.drawable.img_tai_doc_td_4206),
    TD4216_URIC_ACID(BLE_TD4216, BLE_TD4216_SEARCH, BLE_TD4216_CONNECT, BLE_TD4216_UPLOAD, R.string.more_ble_txt_td4216_title,
            R.string.more_ble_txt_td4216_uric_acid, R.string.operation_info_taidoc_meter, R.drawable.img_tai_doc_td_4216),
    MD6_TD4172_URIC_ACID(BLE_FORA_MD6, BLE_FORA_MD6_SEARCH, BLE_FORA_MD6_CONNECT,BLE_FORA_MD6_UPLOAD,R.string.more_ble_txt_md6_and_td4172_title,
            R.string.more_ble_txt_md6_and_td4172_uric_acid, R.string.operation_info_taidoc_global, R.drawable.img_fora_md6),

    TD4206_KETONE(BLE_TD4206, BLE_TD4206_SEARCH, BLE_TD4206_CONNECT, BLE_TD4206_UPLOAD, R.string.more_ble_txt_td4206_title,
            R.string.more_ble_txt_td4206_ketone, R.string.operation_info_taidoc_global, R.drawable.img_tai_doc_td_4206),
    TD4216_KETONE(BLE_TD4216, BLE_TD4216_SEARCH, BLE_TD4216_CONNECT, BLE_TD4216_UPLOAD, R.string.more_ble_txt_td4216_title,
            R.string.more_ble_txt_td4216_ketone, R.string.operation_info_taidoc_global, R.drawable.img_tai_doc_td_4216),
    MD6_TD4172_KETONE(BLE_FORA_MD6, BLE_FORA_MD6_SEARCH, BLE_FORA_MD6_CONNECT,BLE_FORA_MD6_UPLOAD, R.string.more_ble_txt_md6_and_td4172_title,
            R.string.more_ble_txt_md6_and_td4172_ketone, R.string.operation_info_taidoc_global, R.drawable.img_fora_md6),

    Imedi_Plus_DS101(BLE_IMEDI_PLUS_DS101, BLE_IMEDI_PLUS_DS101_SEARCH, BLE_IMEDI_PLUS_DS101_CONNECT,BLE_IMEDI_PLUS_DS101_UPLOAD,
            R.string.more_ble_txt_imedi_plus_ds_101_title,
            R.string.more_ble_txt_imedi_plus_ds_101, R.string.operation_info_ds_101, R.drawable.img_imedi_ds_101),
    ACR3901U_S1(BLE_ACR3901U_S1, BLE_ACR3901U_S1_SEARCH, BLE_ACR3901U_S1_CONNECT,BLE_ACR3901U_S1_UPLOAD,
            R.string.more_ble_txt_acr_3901u_s1_title, R.string.operation_card_reader_info,
            R.string.more_ble_txt_acr_3901u_s1, R.drawable.img_acr_3901_u_s_1),

    TD4216_CHOLESTEROL(BLE_TD4216, BLE_TD4216_SEARCH, BLE_TD4216_CONNECT,BLE_TD4216_UPLOAD, R.string.more_ble_txt_td4216_title,
            R.string.more_ble_txt_td4216_cholesterol, R.string.operation_info_taidoc_global,R.drawable.img_tai_doc_td_4216),
    MD6_TD4172_CHOLESTEROL(BLE_FORA_MD6, BLE_FORA_MD6_SEARCH, BLE_FORA_MD6_CONNECT,BLE_FORA_MD6_UPLOAD, R.string.more_ble_txt_md6_and_td4172_title,
            R.string.more_ble_txt_md6_and_td4172_cholesterol, R.string.operation_info_taidoc_global, R.drawable.img_fora_md6),

    W600_TD2560_FAT(BLE_W600_TD2560, BLE_W600_TD2560_SEARCH, BLE_W600_TD2560_CONNECT,BLE_W600_TD2560_UPLOAD, R.string.more_ble_txt_w600_and_td2560_title,
            R.string.more_ble_txt_w600_and_td2560_fat, R.string.operation_info_taidoc_global,
            R.drawable.img_tai_doc_td_2560),
    ;


    String deviceName;

    String[] searchName;

    String connectName;

    String uploadName;

    int title;

    int description;

    int operationInfo;

    int pictureId;

    boolean isFastDevice = false;


    BtDeviceListEnum(String deviceName, String[] searchName, String connectName, String uploadName, int title, int description,
                     int operationInfo, int pictureId) {
        this.deviceName = deviceName;

        this.searchName = searchName;

        this.connectName = connectName;

        this.uploadName = uploadName;

        this.title = title;

        this.description = description;

        this.operationInfo = operationInfo;

        this.pictureId = pictureId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getConnectName() {
        return connectName;
    }

    public String[] getSearchName() {
        return searchName;
    }

    public String getUploadName() {
        return uploadName;
    }

    public String getTitleResource(Context context) {
        return context.getString(title);
    }

    public String getDescriptionResource(Context context) {
        return context.getString(description);
    }

    public String getOperationInfoResource(Context context) {
        return context.getString(operationInfo);
    }


    public Drawable getPictureResource(Context context) {
        return context.getDrawable(pictureId);
    }

    public int getPictureId() {
        return pictureId;
    }
}
