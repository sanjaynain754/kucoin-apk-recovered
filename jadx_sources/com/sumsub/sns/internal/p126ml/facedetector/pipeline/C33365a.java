package com.sumsub.sns.internal.p126ml.facedetector.pipeline;

import android.graphics.Bitmap;
import com.sumsub.sns.internal.p126ml.core.buffer.C33323a;
import com.sumsub.sns.internal.p126ml.core.pipeline.core.AbstractC33340a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.facedetector.pipeline.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33365a extends AbstractC33340a {
    @Override // com.sumsub.sns.internal.p126ml.core.pipeline.core.AbstractC33340a
    /* JADX INFO: renamed from: b */
    public final Object mo71642b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i11 = width * height;
        int[] iArr = new int[i11];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        float[] fArr = new float[i11 * 3];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = iArr[i13];
            fArr[i12] = (((i14 >> 16) & 255) - 127.5f) / 127.5f;
            int i15 = i12 + 2;
            fArr[i12 + 1] = (((i14 >> 8) & 255) - 127.5f) / 127.5f;
            i12 += 3;
            fArr[i15] = ((i14 & 255) - 127.5f) / 127.5f;
        }
        return new C33323a(fArr, new int[]{height, width, 3});
    }
}
