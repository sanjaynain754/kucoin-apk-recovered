package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.soloader.nativeloader.NativeLoader;

/* JADX INFO: loaded from: classes45.dex */
@DoNotStrip
public class ThreadScopeSupport {
    private static native void runStdFunctionImpl(long j11);

    static {
        NativeLoader.loadLibrary("fbjni");
    }

    @DoNotStrip
    private static void runStdFunction(long j11) {
        runStdFunctionImpl(j11);
    }
}
