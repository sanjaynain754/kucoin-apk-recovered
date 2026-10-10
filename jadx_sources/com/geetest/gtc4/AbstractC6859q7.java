package com.geetest.gtc4;

import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.geetest.gtc4.q7 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6859q7 {

    /* JADX INFO: renamed from: a */
    public static final short[] f11475a = new short[128];

    /* JADX INFO: renamed from: b */
    public static final byte[] f11476b;

    static {
        byte[] bArr = new byte[112];
        f11476b = bArr;
        byte[] bArr2 = new byte[128];
        m12700a(bArr2, 0, 15, (byte) 1);
        m12700a(bArr2, 16, 31, (byte) 2);
        m12700a(bArr2, 32, 63, (byte) 3);
        m12700a(bArr2, 64, 65, (byte) 0);
        m12700a(bArr2, 66, 95, (byte) 4);
        m12700a(bArr2, 96, 96, (byte) 5);
        m12700a(bArr2, 97, 108, (byte) 6);
        m12700a(bArr2, 109, 109, (byte) 7);
        m12700a(bArr2, 110, 111, (byte) 6);
        m12700a(bArr2, 112, 112, (byte) 8);
        m12700a(bArr2, 113, 115, (byte) 9);
        m12700a(bArr2, 116, 116, (byte) 10);
        m12700a(bArr2, 117, 127, (byte) 0);
        m12700a(bArr, 0, 111, (byte) -2);
        m12700a(bArr, 8, 11, (byte) -1);
        m12700a(bArr, 24, 27, (byte) 0);
        m12700a(bArr, 40, 43, (byte) 16);
        m12700a(bArr, 58, 59, (byte) 0);
        m12700a(bArr, 72, 73, (byte) 0);
        m12700a(bArr, 89, 91, (byte) 16);
        m12700a(bArr, 104, 104, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, BuiltinOptions.SliceOptions, 16, 64, BuiltinOptions.UniqueOptions, 32, BuiltinOptions.NonMaxSuppressionV5Options};
        for (int i11 = 0; i11 < 128; i11++) {
            byte b11 = bArr2[i11];
            f11475a[i11] = (short) (bArr4[b11] | ((bArr3[b11] & i11) << 8));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12700a(byte[] bArr, int i11, int i12, byte b11) {
        while (i11 <= i12) {
            bArr[i11] = b11;
            i11++;
        }
    }
}
