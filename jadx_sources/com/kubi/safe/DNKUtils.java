package com.kubi.safe;

/* JADX INFO: loaded from: classes12.dex */
class DNKUtils {
    public static native int openAt(String str);

    static {
        System.loadLibrary("safe-lib");
    }
}
