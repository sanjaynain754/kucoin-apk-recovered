package com.tencent.imsdk.p128v2;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMTTSVoiceFormat {
    private String voiceID = "";
    private float speed = 1.0f;

    public float getSpeed() {
        return this.speed;
    }

    public String getVoiceID() {
        return this.voiceID;
    }

    public void setSpeed(float f11) {
        this.speed = f11;
    }

    public void setVoiceID(String str) {
        if (str == null) {
            str = "";
        }
        this.voiceID = str;
    }
}
