package com.tencent.bugly.matrix.xlog;

import androidx.annotation.Keep;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class XLogNative {
    @Keep
    private static native void setXLoggerNative(String str);

    /* JADX INFO: renamed from: a */
    public static void m72236a(String str) {
        setXLoggerNative(str);
    }
}
