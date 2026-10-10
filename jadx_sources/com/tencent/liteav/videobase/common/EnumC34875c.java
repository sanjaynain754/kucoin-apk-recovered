package com.tencent.liteav.videobase.common;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.common.c */
/* JADX INFO: loaded from: classes59.dex */
public enum EnumC34875c {
    UNKNOWN(65535),
    IDR(0),
    P(1),
    B(6),
    P_MULTI_REF(7),
    I(8),
    SEI(17),
    SPS(18),
    PPS(19),
    VPS(20);


    /* JADX INFO: renamed from: k */
    private static final EnumC34875c[] f74207k = values();
    public final int mValue;

    /* JADX INFO: renamed from: a */
    public final boolean m76495a() {
        return this == IDR;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC34875c m76494a(int i11) {
        for (EnumC34875c enumC34875c : f74207k) {
            if (enumC34875c.mValue == i11) {
                return enumC34875c;
            }
        }
        return UNKNOWN;
    }

    EnumC34875c(int i11) {
        this.mValue = i11;
    }
}
