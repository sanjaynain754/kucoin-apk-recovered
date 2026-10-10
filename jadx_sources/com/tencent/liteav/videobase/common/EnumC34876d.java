package com.tencent.liteav.videobase.common;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.common.d */
/* JADX INFO: loaded from: classes59.dex */
public enum EnumC34876d {
    UNKNOWN(0),
    BASELINE(1),
    MAIN(2),
    HIGH(3),
    BASELINE_RPS(11),
    MAIN_RPS(12),
    HIGH_RPS(13);


    /* JADX INFO: renamed from: h */
    private static final EnumC34876d[] f74216h = values();
    public final int mValue;

    /* JADX INFO: renamed from: a */
    public static EnumC34876d m76496a(int i11) {
        for (EnumC34876d enumC34876d : f74216h) {
            if (enumC34876d.mValue == i11) {
                return enumC34876d;
            }
        }
        return UNKNOWN;
    }

    EnumC34876d(int i11) {
        this.mValue = i11;
    }
}
