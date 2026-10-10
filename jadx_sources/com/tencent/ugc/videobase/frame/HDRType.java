package com.tencent.ugc.videobase.frame;

/* JADX INFO: loaded from: classes2.dex */
public enum HDRType {
    NONE(-1),
    HDR10(0),
    HLG(1),
    UNSUPPORTED(2);

    final int mValue;

    public static HDRType valueOf(int i11) {
        for (HDRType hDRType : values()) {
            if (hDRType.mValue == i11) {
                return hDRType;
            }
        }
        return NONE;
    }

    public final int getValue() {
        return this.mValue;
    }

    HDRType(int i11) {
        this.mValue = i11;
    }
}
