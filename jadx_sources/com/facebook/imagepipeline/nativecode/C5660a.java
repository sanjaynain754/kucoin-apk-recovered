package com.facebook.imagepipeline.nativecode;

import com.facebook.soloader.nativeloader.NativeLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.imagepipeline.nativecode.a */
/* JADX INFO: compiled from: ImagePipelineNativeLoader.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5660a {

    /* JADX INFO: renamed from: a */
    public static final List<String> f9180a = Collections.unmodifiableList(new ArrayList());

    /* JADX INFO: renamed from: a */
    public static void m9512a() {
        NativeLoader.loadLibrary("imagepipeline");
    }
}
