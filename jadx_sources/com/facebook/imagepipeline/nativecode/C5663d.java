package com.facebook.imagepipeline.nativecode;

import com.facebook.soloader.nativeloader.NativeLoader;

/* JADX INFO: renamed from: com.facebook.imagepipeline.nativecode.d */
/* JADX INFO: compiled from: NativeJpegTranscoderSoLoader.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5663d {

    /* JADX INFO: renamed from: a */
    public static boolean f9182a;

    /* JADX INFO: renamed from: a */
    public static synchronized void m9515a() {
        if (!f9182a) {
            NativeLoader.loadLibrary("native-imagetranscoder");
            f9182a = true;
        }
    }
}
