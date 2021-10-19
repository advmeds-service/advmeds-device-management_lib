package com.advmeds.advmeds_device_management_lib;

import android.content.Context;
import android.graphics.drawable.Drawable;

import androidx.annotation.Keep;

/**
 * @author : SmallOpen
 * date   : 2021/10/19下午 04:52
 * version: 1.0
 */
@Keep
public enum BtDeviceNoteEnum {
    //使用引導
    MD6_TD4172_Step1(R.string.txt_note_md6_step1,R.drawable.ic_img_md6_step1),
    MD6_TD4172_Step2(R.string.txt_note_md6_step2,R.drawable.ic_img_md6_step2),
    MD6_TD4172_Step3(R.string.txt_note_md6_step3,R.drawable.ic_img_md6_step3),
    MD6_TD4172_Step4(R.string.txt_note_md6_step4,R.drawable.ic_img_md6_step4),
    MD6_TD4172_Step5(R.string.txt_note_md6_step5,R.drawable.ic_img_md6_step5);


    int noteTxtId;
    int pictureId;

    BtDeviceNoteEnum(int noteTxtId, int pictureId) {
        this.noteTxtId = noteTxtId;
        this.pictureId = pictureId;
    }

    public String getNoteTxtStr(Context context) {
        return context.getString(noteTxtId);
    }

    public Drawable getPictureResource(Context context) {
        return context.getDrawable(pictureId);
    }

}
