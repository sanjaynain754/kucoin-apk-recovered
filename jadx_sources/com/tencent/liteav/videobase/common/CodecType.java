package com.tencent.liteav.videobase.common;

/* JADX INFO: loaded from: classes59.dex */
public enum CodecType {
    UNKNOWN(-1),
    H264(0),
    H265(1),
    VP8(2),
    KAV1(3);


    /* JADX INFO: renamed from: f */
    private static final CodecType[] f74189f = values();
    public final int mValue;

    /* JADX INFO: renamed from: a */
    public static CodecType m76491a(int i11) {
        for (CodecType codecType : f74189f) {
            if (i11 == codecType.mValue) {
                return codecType;
            }
        }
        return H264;
    }

    CodecType(int i11) {
        this.mValue = i11;
    }
}
