package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p712w3.C45708h;
import p712w3.InterfaceC45704d;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC45704d
public class NativeBlurFilter {
    @InterfaceC45704d
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i11, int i12);

    static {
        C5661b.m9513a();
    }

    /* JADX INFO: renamed from: a */
    public static void m9506a(Bitmap bitmap, int i11, int i12) {
        boolean z11;
        C45708h.m100896g(bitmap);
        boolean z12 = false;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z11));
        if (i12 > 0) {
            z12 = true;
        }
        C45708h.m100891b(Boolean.valueOf(z12));
        nativeIterativeBoxBlur(bitmap, i11, i12);
    }
}
