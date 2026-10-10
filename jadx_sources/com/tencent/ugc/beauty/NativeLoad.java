package com.tencent.ugc.beauty;

import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes2.dex */
public class NativeLoad {
    public static final int PROGRAM_BEAUTY = 1;
    public static final int PROGRAM_BEAUTY2 = 5;
    public static final int PROGRAM_BEAUTY2_SAMSUNG_S4 = 15;
    public static final int PROGRAM_BEAUTY3_FILTER = 14;
    public static final int PROGRAM_BEAUTYBLEND = 12;
    public static final int PROGRAM_FACE_VAR = 2;
    public static final int PROGRAM_SMOOTHHORIZONTAL = 13;
    private static final String TAG = "NativeLoad";

    public static native int nativeLoadGLProgram(int i11);

    public static native void onLoadBeauty();

    static {
        onLoadBeauty();
        LiteavLog.m76087i(TAG, "loaded liteav library");
    }
}
