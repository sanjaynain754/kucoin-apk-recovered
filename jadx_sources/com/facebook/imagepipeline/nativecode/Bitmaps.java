package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p712w3.C45708h;
import p712w3.InterfaceC45704d;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC45704d
public class Bitmaps {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f9171a = 0;

    @InterfaceC45704d
    private static native void nativeCopyBitmap(Bitmap bitmap, int i11, Bitmap bitmap2, int i12, int i13);

    static {
        C5660a.m9512a();
    }

    @InterfaceC45704d
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (bitmap2.getConfig() == bitmap.getConfig()) {
            z11 = true;
        } else {
            z11 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z11));
        C45708h.m100891b(Boolean.valueOf(bitmap.isMutable()));
        if (bitmap.getWidth() == bitmap2.getWidth()) {
            z12 = true;
        } else {
            z12 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z12));
        if (bitmap.getHeight() == bitmap2.getHeight()) {
            z13 = true;
        }
        C45708h.m100891b(Boolean.valueOf(z13));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }
}
