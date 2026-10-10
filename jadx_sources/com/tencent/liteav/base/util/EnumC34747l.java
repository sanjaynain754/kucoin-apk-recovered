package com.tencent.liteav.base.util;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.l */
/* JADX INFO: loaded from: classes59.dex */
public enum EnumC34747l {
    NORMAL(0),
    ROTATION_90(90),
    ROTATION_180(180),
    ROTATION_270(270);


    /* JADX INFO: renamed from: e */
    private static final EnumC34747l[] f73545e = values();
    public final int mValue;

    /* JADX INFO: renamed from: a */
    public static EnumC34747l m76131a(int i11) {
        for (EnumC34747l enumC34747l : f73545e) {
            if (enumC34747l.mValue == i11) {
                return enumC34747l;
            }
        }
        return NORMAL;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m76132b(int i11) {
        return i11 == 0 || i11 == 90 || i11 == 180 || i11 == 270;
    }

    EnumC34747l(int i11) {
        this.mValue = i11;
    }

    /* JADX INFO: renamed from: a */
    public static int m76130a(EnumC34747l enumC34747l) {
        if (enumC34747l != null) {
            return enumC34747l.mValue;
        }
        return NORMAL.mValue;
    }
}
