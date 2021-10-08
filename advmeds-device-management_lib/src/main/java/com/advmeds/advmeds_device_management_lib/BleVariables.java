package com.advmeds.advmeds_device_management_lib;

class BleVariables {
    //BLE 狀態
    static final int BLE_DEVICE_CHOSEN = 43060;

    static final int BLE_DEVICE_SELECT = 43061;

//   無後綴    藍牙設備外部顯示名字
//    _SEARCH 藍牙搜尋名字(集合式)
//   _CONNECT 藍牙連線後，傳輸邏輯名字

    //20201023 型號修正
    //血壓機
    static final String BLE_D40B_TD3261B = "D40B / TD-3261B";

    static final String[] BLE_D40B_TD3261B_SEARCH = {"FORA D40", "TAIDOC TD3261"};

    static final String BLE_D40B_TD3261B_CONNECT = "FORA D40";

    static final String BLE_P30B_TD3129B = "P30B / TD-3129B";

    static final String[] BLE_P30B_TD3129B_SEARCH = {"FORA P30", "FORA P30 PLUS", "TAIDOC TD3129"};

    static final String BLE_P30B_TD3129B_CONNECT = "FORA P30 PLUS";

    static final String BLE_P80_TD3140 = "P80 / TD-3140";

    static final String[] BLE_P80_TD3140_SEARCH = {"FORA P80", "TAIDOC TD3140"};

    static final String BLE_P80_TD3140_CONNECT = "TAIDOC TD3140";

    static final String BLE_TD3128 = "TaiDoc TD-3128";

    static final String[] BLE_TD3128_SEARCH = {"TAIDOC TD3128"};

    static final String BLE_TD3128_CONNECT = "TAIDOC TD3128";

    static final String BLE_TD2555 = "TaiDoc TD-2555";

    static final String[] BLE_TD2555_SEARCH = {"TAIDOC TD2555"};

    static final String BLE_TD2555_CONNECT = "TAIDOC TD2555";

    public static final String BLE_W600_TD2560 = "FORA W600 / TD-2560";

    public static final String[] BLE_W600_TD2560_SEARCH = {"FORA W600","TAIDOC TD2560"};

    public static final String BLE_W600_TD2560_CONNECT = "FORA W600";

    static final String BLE_BF4030 = "BF4030";

    static final String[] BLE_BF4030_SEARCH = {"BF4030"};

    static final String BLE_BF4030_CONNECT = "BF4030";

    static final String BLE_IR40_TD1241 = "IR40 / TD-1241";

    static final String[] BLE_IR40_TD1241_SEARCH = {"FORA IR40", "TAIDOC TD1241"};

    static final String BLE_IR40_TD1241_CONNECT = "FORA IR40";

    static final String BLE_TD1261 = "TaiDoc TD-1261";

    static final String[] BLE_TD1261_SEARCH = {"TAIDOC TD1261"};

    static final String BLE_TD1261_CONNECT = "TAIDOC TD1261";

    static final String BLE_TD1035 = "TaiDoc TD-1035";

    static final String[] BLE_TD1035_SEARCH = {"TAIDOC TD1035"};

    static final String BLE_TD1035_CONNECT = "TAIDOC TD1035";

    static final String BLE_IR42B_TD1242 = "IR42B / TD-1242";

    static final String[] BLE_IR42B_TD1242_SEARCH = {"FORA IR42", "TAIDOC TD1242"};

    static final String BLE_IR42B_TD1242_CONNECT = "FORA IR42";

    static final String BLE_O2_TD8255 = "O2 / TD-8255";

    static final String[] BLE_O2_TD8255_SEARCH = {"FORA O2", "TAIDOC TD8255"};

    static final String BLE_O2_TD8255_CONNECT = "TAIDOC TD8255";

    static final String BLE_TD8201 = "TaiDoc TD-8201";

    static final String[] BLE_TD8201_SEARCH = {"TAIDOC TD8201"};

    static final String BLE_TD8201_CONNECT = "TAIDOC TD8201";

    static final String BLE_TD4257 = "TaiDoc TD-4257";

    static final String[] BLE_TD4257_SEARCH = {"TAIDOC TD4257"};

    static final String BLE_TD4257_CONNECT = "TAIDOC TD4257";

    static final String BLE_GD40B_TD4272B = "FORA GD40B / TD-4272B";

    static final String[] BLE_GD40B_TD4272B_SEARCH = {"FORA GD40", "TAIDOC TD4272"};

    static final String BLE_GD40B_TD4272B_CONNECT = "FORA GD40";

    static final String BLE_TD4216 = "TaiDoc TD-4216";

    static final String[] BLE_TD4216_SEARCH = {"TAIDOC TD4216","TAIDOC TD4216 A7B8"};

    static final String BLE_TD4216_CONNECT = "TAIDOC TD4216";

    static final String BLE_DSP_COMBO_SENSOR = "DSP Combo Sensor";

    static final String[] BLE_DSP_COMBO_SENSOR_SEARCH = {"BDE_WEIXIN_TTM"};

    static final String BLE_DSP_COMBO_SENSOR_CONNECT = "DSP Combo";

    static final String BLE_TD4141 = "TaiDoc TD-4141";

    static final String[] BLE_TD4141_SEARCH = {"TAIDOC METER"};

    static final String BLE_TD4141_CONNECT = "TAIDOC TD4141";

    static final String BLE_TD4206 = "TaiDoc TD-4206";

    static final String[] BLE_TD4206_SEARCH = {"TAIDOC METER"};

    static final String BLE_TD4206_CONNECT = "TAIDOC TD4206";

    static final String BLE_FORA_MD6 = "FORA MD6 / TD-4172";

    static final String[] BLE_FORA_MD6_SEARCH = {"FORA MD6","TAIDOC TD4172"};

    static final String BLE_FORA_MD6_CONNECT = "FORA MD6";


    static final String BLE_IMEDI_PLUS_DS101 = "Imedi Plus DS101";

    static final String[] BLE_IMEDI_PLUS_DS101_SEARCH = {"DS101"};

    //    聽診器有獨立的判斷，因此理論上不需要這個東西
    static final String BLE_IMEDI_PLUS_DS101_CONNECT = "TAIDOC TD4206";

    static final String BLE_ACR3901U_S1 = "ACR3901U-S1";

    static final String[] BLE_ACR3901U_S1_SEARCH = {"ACR3901U-S1"};

    //    讀卡機有獨立的判斷，因此理論上不需要這個東西
    static final String BLE_ACR3901U_S1_CONNECT = "ACR3901U-S1";


}
