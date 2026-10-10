package com.tencent.liteav.base;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("base::android")
public abstract class PathService {
    public static final int DIR_MODULE = 3;

    private static native void nativeOverride(int i11, String str);

    private PathService() {
    }

    public static void override(int i11, String str) {
        nativeOverride(i11, str);
    }
}
