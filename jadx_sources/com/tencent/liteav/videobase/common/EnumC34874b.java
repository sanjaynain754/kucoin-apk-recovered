package com.tencent.liteav.videobase.common;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.common.b */
/* JADX INFO: loaded from: classes59.dex */
public enum EnumC34874b {
    UNKNOWN(-1),
    HDR10(0),
    HLG(1),
    UNSUPPORTED(2);

    final int mValue;

    /* JADX INFO: renamed from: a */
    public static EnumC34874b m76493a(int i11) {
        if (i11 == 0) {
            return HDR10;
        }
        if (i11 != 1) {
            return i11 != 2 ? UNKNOWN : UNSUPPORTED;
        }
        return HLG;
    }

    EnumC34874b(int i11) {
        this.mValue = i11;
    }
}
