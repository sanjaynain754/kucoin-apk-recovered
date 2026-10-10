package com.google.zxing.common;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes56.dex */
public abstract class GridSampler {
    private static GridSampler gridSampler = new DefaultGridSampler();

    public abstract BitMatrix sampleGrid(BitMatrix bitMatrix, int i11, int i12, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26, float f27) throws NotFoundException;

    public abstract BitMatrix sampleGrid(BitMatrix bitMatrix, int i11, int i12, PerspectiveTransform perspectiveTransform) throws NotFoundException;

    public static GridSampler getInstance() {
        return gridSampler;
    }

    public static void setGridSampler(GridSampler gridSampler2) {
        gridSampler = gridSampler2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:55:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007d A[SYNTHETIC] */
    public static void checkAndNudgePoints(BitMatrix bitMatrix, float[] fArr) throws NotFoundException {
        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        boolean z11 = true;
        for (int i11 = 0; i11 < fArr.length && z11; i11 += 2) {
            int i12 = (int) fArr[i11];
            int i13 = i11 + 1;
            int i14 = (int) fArr[i13];
            if (i12 >= -1 && i12 <= width && i14 >= -1 && i14 <= height) {
                if (i12 == -1) {
                    fArr[i11] = 0.0f;
                } else {
                    if (i12 == width) {
                        fArr[i11] = width - 1;
                    } else {
                        z11 = false;
                    }
                    if (i14 == -1) {
                        fArr[i13] = 0.0f;
                    } else {
                        if (i14 == height) {
                            fArr[i13] = height - 1;
                        }
                    }
                    z11 = true;
                }
                z11 = true;
                if (i14 == -1) {
                    fArr[i13] = 0.0f;
                } else {
                    if (i14 == height) {
                        fArr[i13] = height - 1;
                    }
                }
                z11 = true;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        boolean z12 = true;
        for (int length = fArr.length - 2; length >= 0 && z12; length -= 2) {
            int i15 = (int) fArr[length];
            int i16 = length + 1;
            int i17 = (int) fArr[i16];
            if (i15 >= -1 && i15 <= width && i17 >= -1 && i17 <= height) {
                if (i15 == -1) {
                    fArr[length] = 0.0f;
                } else {
                    if (i15 == width) {
                        fArr[length] = width - 1;
                    } else {
                        z12 = false;
                    }
                    if (i17 == -1) {
                        fArr[i16] = 0.0f;
                    } else {
                        if (i17 == height) {
                            fArr[i16] = height - 1;
                        }
                    }
                    z12 = true;
                }
                z12 = true;
                if (i17 == -1) {
                    fArr[i16] = 0.0f;
                } else {
                    if (i17 == height) {
                        fArr[i16] = height - 1;
                    }
                }
                z12 = true;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }
}
