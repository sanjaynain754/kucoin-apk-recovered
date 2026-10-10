package com.sumsub.sns.internal.core.common;

import android.graphics.Bitmap;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28488r {
    /* JADX INFO: renamed from: a */
    public static Bitmap m69383a(Bitmap bitmap) {
        int i11;
        int i12;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i13 = width * height;
        int[] iArr = new int[i13];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i14 = width - 1;
        int i15 = height - 1;
        int[] iArr2 = new int[i13];
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[RangesKt.coerceAtLeast(width, height)];
        int[] iArr6 = new int[112896];
        for (int i16 = 0; i16 < 112896; i16++) {
            iArr6[i16] = i16 / 441;
        }
        char c11 = ')';
        int[][] iArr7 = new int[41][];
        for (int i17 = 0; i17 < 41; i17++) {
            iArr7[i17] = new int[3];
        }
        int i18 = 0;
        int i19 = 0;
        int i21 = 0;
        while (true) {
            char c12 = c11;
            if (i18 >= height) {
                break;
            }
            int i22 = -20;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i31 = 0;
            int i32 = 0;
            for (int i33 = 20; i22 <= i33; i33 = 20) {
                int[] iArr8 = iArr;
                int i34 = iArr8[RangesKt.coerceAtMost(i14, RangesKt.coerceAtLeast(i22, 0)) + i19];
                int[] iArr9 = iArr7[i22 + 20];
                iArr9[0] = (i34 & 16711680) >> 16;
                iArr9[1] = (i34 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr9[2] = i34 & 255;
                int iAbs = 21 - Math.abs(i22);
                int i35 = iArr9[0];
                i23 = (i35 * iAbs) + i23;
                int i36 = iArr9[1];
                i24 = (i36 * iAbs) + i24;
                int i37 = iArr9[2];
                i25 = (iAbs * i37) + i25;
                if (i22 > 0) {
                    i32 += i35;
                    i31 += i36;
                    i29 += i37;
                } else {
                    i28 += i35;
                    i27 += i36;
                    i26 += i37;
                }
                i22++;
                iArr = iArr8;
            }
            int[] iArr10 = iArr;
            int i38 = 0;
            int i39 = 20;
            while (i38 < width) {
                iArr2[i19] = iArr6[i23];
                iArr3[i19] = iArr6[i24];
                iArr4[i19] = iArr6[i25];
                int i41 = i23 - i28;
                int i42 = i24 - i27;
                int i43 = i25 - i26;
                int[] iArr11 = iArr7[(i39 + 21) % 41];
                int i44 = i28 - iArr11[0];
                int i45 = i27 - iArr11[1];
                int i46 = i26 - iArr11[2];
                if (i18 == 0) {
                    i12 = i38;
                    iArr5[i12] = RangesKt.coerceAtMost(i12 + 21, i14);
                } else {
                    i12 = i38;
                }
                int i47 = iArr10[iArr5[i12] + i21];
                int i48 = (i47 & 16711680) >> 16;
                iArr11[0] = i48;
                int i49 = (i47 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr11[1] = i49;
                int i51 = i47 & 255;
                iArr11[2] = i51;
                int i52 = i32 + i48;
                int i53 = i31 + i49;
                int i54 = i29 + i51;
                i23 = i41 + i52;
                i24 = i42 + i53;
                i25 = i43 + i54;
                i39 = (i39 + 1) % 41;
                int[] iArr12 = iArr7[i39 % 41];
                int i55 = iArr12[0];
                i28 = i44 + i55;
                int i56 = iArr12[1];
                i27 = i45 + i56;
                int i57 = iArr12[2];
                i26 = i46 + i57;
                i32 = i52 - i55;
                i31 = i53 - i56;
                i29 = i54 - i57;
                i19++;
                i38 = i12 + 1;
            }
            i21 += width;
            i18++;
            c11 = c12;
            iArr = iArr10;
        }
        int[] iArr13 = iArr;
        int i58 = 0;
        while (i58 < width) {
            int i59 = width * (-20);
            int i61 = width;
            int i62 = 0;
            int i63 = 0;
            int i64 = 0;
            int i65 = 0;
            int i66 = 0;
            int i67 = 0;
            int i68 = 0;
            int i69 = 0;
            int i71 = 0;
            for (int i72 = -20; i72 <= 20; i72++) {
                int iCoerceAtLeast = RangesKt.coerceAtLeast(0, i59) + i58;
                int[] iArr14 = iArr7[i72 + 20];
                iArr14[0] = iArr2[iCoerceAtLeast];
                iArr14[1] = iArr3[iCoerceAtLeast];
                iArr14[2] = iArr4[iCoerceAtLeast];
                int iAbs2 = 21 - Math.abs(i72);
                i71 = (iArr2[iCoerceAtLeast] * iAbs2) + i71;
                i62 = (iArr3[iCoerceAtLeast] * iAbs2) + i62;
                i63 = (iArr4[iCoerceAtLeast] * iAbs2) + i63;
                if (i72 > 0) {
                    i69 += iArr14[0];
                    i68 += iArr14[1];
                    i67 += iArr14[2];
                } else {
                    i66 += iArr14[0];
                    i65 += iArr14[1];
                    i64 += iArr14[2];
                }
                if (i72 < i15) {
                    i59 += i61;
                }
            }
            int i73 = i71;
            int i74 = 0;
            int i75 = 20;
            int i76 = i58;
            while (i74 < height) {
                iArr13[i76] = (iArr13[i76] & ViewCompat.MEASURED_STATE_MASK) | (iArr6[i73] << 16) | (iArr6[i62] << 8) | iArr6[i63];
                int i77 = i73 - i66;
                int i78 = i62 - i65;
                int i79 = i63 - i64;
                int[] iArr15 = iArr7[(i75 + 21) % 41];
                int i81 = i66 - iArr15[0];
                int i82 = i65 - iArr15[1];
                int i83 = i64 - iArr15[2];
                if (i58 == 0) {
                    i11 = i74;
                    iArr5[i11] = RangesKt.coerceAtMost(i11 + 21, i15) * i61;
                } else {
                    i11 = i74;
                }
                int i84 = iArr5[i11] + i58;
                int i85 = iArr2[i84];
                iArr15[0] = i85;
                int i86 = iArr3[i84];
                iArr15[1] = i86;
                int i87 = iArr4[i84];
                iArr15[2] = i87;
                int i88 = i69 + i85;
                int i89 = i68 + i86;
                int i91 = i67 + i87;
                i73 = i77 + i88;
                i62 = i78 + i89;
                i63 = i79 + i91;
                i75 = (i75 + 1) % 41;
                int[] iArr16 = iArr7[i75];
                int i92 = iArr16[0];
                i66 = i81 + i92;
                int i93 = iArr16[1];
                i65 = i82 + i93;
                int i94 = iArr16[2];
                i64 = i83 + i94;
                i69 = i88 - i92;
                i68 = i89 - i93;
                i67 = i91 - i94;
                i76 += i61;
                i74 = i11 + 1;
            }
            i58++;
            width = i61;
        }
        bitmap.setPixels(iArr13, 0, width, 0, 0, width, height);
        return bitmap;
    }
}
