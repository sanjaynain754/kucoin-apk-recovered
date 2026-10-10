package com.datavisorobfus;

import com.datavisor.vangogh.bridge.crypto;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.datavisorobfus.m */
/* JADX INFO: loaded from: classes34.dex */
public class C5430m {

    /* JADX INFO: renamed from: com.datavisorobfus.m$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f7316a = 0;

        /* JADX INFO: renamed from: b */
        public byte[] f7317b = null;
    }

    /* JADX INFO: renamed from: a */
    public static a m7220a(String str, int i11) {
        byte[] bArrEncryptForPatchConfig;
        try {
            if (C5457z0.m7480a(str)) {
                return null;
            }
            a aVar = new a();
            if (i11 == 0) {
                bArrEncryptForPatchConfig = crypto.encryptV(str.getBytes());
            } else if (i11 == 1) {
                bArrEncryptForPatchConfig = crypto.encryptVV(str, 0);
            } else if (i11 == 2) {
                bArrEncryptForPatchConfig = crypto.encryptZDVV(str);
            } else if (i11 == 3) {
                bArrEncryptForPatchConfig = crypto.encryptForLongToken(str);
            } else {
                bArrEncryptForPatchConfig = i11 == 4 ? crypto.encryptForPatchConfig(str) : null;
            }
            if (bArrEncryptForPatchConfig == null) {
                aVar.f7316a = 1;
                return aVar;
            }
            byte[] bArrSign = crypto.sign(bArrEncryptForPatchConfig);
            if (bArrSign == null) {
                aVar.f7316a = 2;
                return aVar;
            }
            byte[] bArr = new byte[bArrEncryptForPatchConfig.length + bArrSign.length];
            System.arraycopy(bArrEncryptForPatchConfig, 0, bArr, 0, bArrEncryptForPatchConfig.length);
            System.arraycopy(bArrSign, 0, bArr, bArrEncryptForPatchConfig.length, bArrSign.length);
            aVar.f7316a = 0;
            aVar.f7317b = bArr;
            return aVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m7221a(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    byte[] bArr2 = {14, -10, -45, -62, BuiltinOptions.SelectV2Options, -84, -107, -111, BuiltinOptions.UnsortedSegmentSumOptions, -28, BuiltinOptions.SparseToDenseOptions, -32, 10, BuiltinOptions.FakeQuantOptions, 6, BuiltinOptions.RangeOptions, BuiltinOptions.IfOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.RankOptions, BuiltinOptions.HashtableFindOptions, -22, -12, BuiltinOptions.ATan2Options, BuiltinOptions.BatchMatMulOptions, 8, -82, -56, -25, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ShapeOptions, -43, -115, -87, BuiltinOptions.AbsOptions, -89, -60, 61, BuiltinOptions.RightShiftOptions, BuiltinOptions.WhileOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BucketizeOptions, 25, 12, -51, -20, 19, -105, BuiltinOptions.NonMaxSuppressionV4Options};
                    byte[] bArr3 = {BuiltinOptions.WhereOptions, BuiltinOptions.ArgMaxOptions, -33, -31, -8, -104, 17, BuiltinOptions.Rfft2dOptions, -39, -114, -108, BuiltinOptions.ScatterNdOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ReverseSequenceOptions, -71, -122};
                    byte[] bArrM7135a = C5414f.m7135a(bArr);
                    if (bArrM7135a == null) {
                        return null;
                    }
                    int length = bArrM7135a.length;
                    byte[] bArr4 = new byte[length];
                    for (int i11 = 0; i11 < bArrM7135a.length; i11++) {
                        bArr4[i11] = (byte) (~((byte) (bArrM7135a[i11] ^ bArr2[i11 % 48])));
                    }
                    byte[] bArr5 = new byte[length + 16];
                    System.arraycopy(bArr4, 0, bArr5, 0, length);
                    System.arraycopy(bArr3, 0, bArr5, length, 16);
                    byte[] bArrM7404a = C5446u.m7404a(bArr5);
                    if (bArrM7404a == null) {
                        return null;
                    }
                    byte[] bArr6 = new byte[bArrM7404a.length + length];
                    System.arraycopy(bArr4, 0, bArr6, 0, length);
                    System.arraycopy(bArrM7404a, 0, bArr6, length, bArrM7404a.length);
                    return bArr6;
                }
            } catch (Throwable th2) {
                C5415f0.m7139a(th2);
            }
        }
        return null;
    }
}
