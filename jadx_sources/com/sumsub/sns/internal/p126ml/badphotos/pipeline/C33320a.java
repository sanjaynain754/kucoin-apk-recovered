package com.sumsub.sns.internal.p126ml.badphotos.pipeline;

import com.sumsub.sns.internal.p126ml.core.buffer.C33323a;
import com.sumsub.sns.internal.p126ml.core.pipeline.C33338a;
import com.sumsub.sns.internal.p126ml.core.pipeline.core.AbstractC33340a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.badphotos.pipeline.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33320a extends AbstractC33340a {
    @Override // com.sumsub.sns.internal.p126ml.core.pipeline.core.AbstractC33340a
    /* JADX INFO: renamed from: b */
    public final Object mo71642b(Object obj) {
        C33338a c33338a = (C33338a) obj;
        int i11 = c33338a.f67969a;
        int i12 = c33338a.f67970b;
        int[] iArr = c33338a.f67971c;
        float[] fArr = new float[i11 * i12 * 3];
        int length = iArr.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            fArr[i15] = ((iArr[i14] >> 16) & 255) / 255.0f;
            i14++;
            i15++;
        }
        int length2 = iArr.length;
        int i16 = 0;
        while (i16 < length2) {
            fArr[i15] = ((iArr[i16] >> 8) & 255) / 255.0f;
            i16++;
            i15++;
        }
        int length3 = iArr.length;
        while (i13 < length3) {
            fArr[i15] = (iArr[i13] & 255) / 255.0f;
            i13++;
            i15++;
        }
        return new C33323a(fArr, new int[]{1, 3, i12, i11});
    }
}
