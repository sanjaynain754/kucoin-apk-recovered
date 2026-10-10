package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p712w3.C45708h;
import p712w3.InterfaceC45704d;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC45704d
public class NativeRoundingFilter {
    @InterfaceC45704d
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i11, int i12, int i13, int i14);

    @InterfaceC45704d
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z11);

    @InterfaceC45704d
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z11);

    @InterfaceC45704d
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i11, int i12, boolean z11);

    static {
        C5661b.m9513a();
    }

    @InterfaceC45704d
    public static void toCircle(Bitmap bitmap, boolean z11) {
        C45708h.m100896g(bitmap);
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFilter(bitmap, z11);
        }
    }

    @InterfaceC45704d
    public static void toCircleFast(Bitmap bitmap, boolean z11) {
        C45708h.m100896g(bitmap);
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFastFilter(bitmap, z11);
        }
    }
}
