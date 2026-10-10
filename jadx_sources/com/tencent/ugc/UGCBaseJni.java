package com.tencent.ugc;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class UGCBaseJni {
    private static native String nativeCallExperimentalAPI(String str);

    public static String callExperimentalAPI(String str) {
        return nativeCallExperimentalAPI(str);
    }
}
