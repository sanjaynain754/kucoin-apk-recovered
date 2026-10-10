package com.sumsub.sns.internal.core.common;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28433a {

    /* JADX INFO: renamed from: a */
    public final Bitmap.Config f57945a;

    /* JADX INFO: renamed from: b */
    public Bitmap f57946b;

    /* JADX INFO: renamed from: a */
    public final synchronized Bitmap m69317a(int i11, int i12) {
        Bitmap bitmapCreateBitmap;
        try {
            bitmapCreateBitmap = this.f57946b;
            if (bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled() || bitmapCreateBitmap.getWidth() != i11 || bitmapCreateBitmap.getHeight() != i12) {
                if (bitmapCreateBitmap != null) {
                    bitmapCreateBitmap.recycle();
                }
                bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, this.f57945a);
            }
            this.f57946b = bitmapCreateBitmap;
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmapCreateBitmap;
    }

    public C28433a(Bitmap.Config config) {
        this.f57945a = config;
    }
}
