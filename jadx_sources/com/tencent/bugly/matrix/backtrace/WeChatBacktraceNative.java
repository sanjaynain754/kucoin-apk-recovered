package com.tencent.bugly.matrix.backtrace;

import androidx.annotation.Keep;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Keep
public class WeChatBacktraceNative {
    @Keep
    public static native String[] consumeRequestedQut();

    @Keep
    public static native void enableLogger(boolean z11);

    @Keep
    public static native void immediateGeneration(boolean z11);

    @Keep
    public static native void notifyWarmedUp(String str, int i11);

    @Keep
    public static native void setBacktraceMode(int i11);

    @Keep
    public static native void setPackageName(String str);

    @Keep
    public static native void setQuickenAlwaysOn(boolean z11);

    @Keep
    public static native void setSavingPath(String str);

    @Keep
    public static native void setWarmedUp(boolean z11);

    @Keep
    public static native int[] statistic(String str);

    @Keep
    public static native boolean testLoadQut(String str, int i11);

    @Keep
    public static native boolean warmUp(String str, int i11, boolean z11);

    @Keep
    public static void requestQutGenerate() {
    }
}
