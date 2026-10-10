package com.tencent.ugc;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class UGCInitializer {
    private static int sRefCount;

    private static native void nativeInitialize();

    private static native void nativeUninitialize();

    public static synchronized void initialize() {
        try {
            if (sRefCount == 0) {
                nativeInitialize();
            }
            sRefCount++;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void uninitialize() {
        try {
            if (sRefCount == 1) {
                nativeUninitialize();
            }
            int i11 = sRefCount;
            if (i11 > 0) {
                sRefCount = i11 - 1;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
