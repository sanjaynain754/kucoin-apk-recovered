package com.tencent.trtc.txcopyrightedmedia;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.SoLoader;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::extensions")
public class YsdLibLoader {
    public static boolean loadLibrary() {
        return SoLoader.loadLibrary("txktvscore");
    }

    public static String getLibraryPath() {
        return SoLoader.getLibraryPath();
    }
}
