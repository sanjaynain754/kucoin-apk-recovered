package com.sumsub.sns.internal.p126ml.core.pipeline;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.sumsub.sns.internal.p126ml.core.pipeline.core.AbstractC33340a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.core.pipeline.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33339b extends AbstractC33340a {

    /* JADX INFO: renamed from: a */
    public final int f67972a;

    /* JADX INFO: renamed from: b */
    public final int f67973b;

    @Override // com.sumsub.sns.internal.p126ml.core.pipeline.core.AbstractC33340a
    /* JADX INFO: renamed from: b */
    public final Object mo71642b(Object obj) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Bitmap bitmap = (Bitmap) obj;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i17 = this.f67972a;
        int i18 = 0;
        if (i17 > width) {
            i14 = (i17 - width) / 2;
            i13 = i14 + width;
            i12 = width;
            i11 = 0;
        } else {
            i11 = (width - i17) / 2;
            i12 = i11 + i17;
            i13 = i17;
            i14 = 0;
        }
        int i19 = this.f67973b;
        if (i19 > height) {
            i16 = (i19 - height) / 2;
            i15 = i16 + height;
        } else {
            int i21 = (height - i19) / 2;
            i18 = i21;
            height = i21 + i19;
            i15 = i19;
            i16 = 0;
        }
        Rect rect = new Rect(i11, i18, i12, height);
        Rect rect2 = new Rect(i14, i16, i13, i15);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f67972a, this.f67973b, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, rect, rect2, (Paint) null);
        return bitmapCreateBitmap;
    }

    public C33339b(int i11, int i12) {
        this.f67972a = i11;
        this.f67973b = i12;
    }
}
