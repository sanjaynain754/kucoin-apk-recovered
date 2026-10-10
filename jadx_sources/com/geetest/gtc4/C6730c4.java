package com.geetest.gtc4;

import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.geetest.gtc4.c4 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6730c4 {

    /* JADX INFO: renamed from: a */
    public final byte[] f11330a = {BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions};

    /* JADX INFO: renamed from: b */
    public final byte[] f11331b = new byte[128];

    public C6730c4() {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr = this.f11331b;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = -1;
            i12++;
        }
        while (true) {
            byte[] bArr2 = this.f11330a;
            if (i11 < bArr2.length) {
                this.f11331b[bArr2[i11]] = (byte) i11;
                i11++;
            } else {
                byte[] bArr3 = this.f11331b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
        }
    }
}
