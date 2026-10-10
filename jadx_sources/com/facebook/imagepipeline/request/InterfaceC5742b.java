package com.facebook.imagepipeline.request;

import android.graphics.Bitmap;
import p006a4.AbstractC0110a;
import p526p5.AbstractC43387c;
import p547q3.InterfaceC43595a;

/* JADX INFO: renamed from: com.facebook.imagepipeline.request.b */
/* JADX INFO: compiled from: Postprocessor.java */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC5742b {
    String getName();

    InterfaceC43595a getPostprocessorCacheKey();

    AbstractC0110a<Bitmap> process(Bitmap bitmap, AbstractC43387c abstractC43387c);
}
