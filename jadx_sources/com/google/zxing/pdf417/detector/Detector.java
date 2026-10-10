package com.google.zxing.pdf417.detector;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public final class Detector {
    private static final int BARCODE_MIN_HEIGHT = 10;
    private static final float MAX_AVG_VARIANCE = 0.42f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.8f;
    private static final int MAX_PATTERN_DRIFT = 5;
    private static final int MAX_PIXEL_DRIFT = 3;
    private static final int ROW_STEP = 5;
    private static final int SKIPPED_ROW_COUNT_MAX = 25;
    private static final int[] INDEXES_START_PATTERN = {0, 4, 1, 5};
    private static final int[] INDEXES_STOP_PATTERN = {6, 2, 7, 3};
    private static final int[] START_PATTERN = {8, 1, 1, 1, 1, 1, 1, 3};
    private static final int[] STOP_PATTERN = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private static void copyToResult(ResultPoint[] resultPointArr, ResultPoint[] resultPointArr2, int[] iArr) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            resultPointArr[iArr[i11]] = resultPointArr2[i11];
        }
    }

    public static PDF417DetectorResult detect(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, boolean z11) throws NotFoundException {
        BitMatrix blackMatrix = binaryBitmap.getBlackMatrix();
        List<ResultPoint[]> listDetect = detect(z11, blackMatrix);
        if (listDetect.isEmpty()) {
            blackMatrix = blackMatrix.m103790clone();
            blackMatrix.rotate180();
            listDetect = detect(z11, blackMatrix);
        }
        return new PDF417DetectorResult(blackMatrix, listDetect);
    }

    private static int[] findGuardPattern(BitMatrix bitMatrix, int i11, int i12, int i13, boolean z11, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i14 = 0;
        while (bitMatrix.get(i11, i12) && i11 > 0) {
            int i15 = i14 + 1;
            if (i14 >= 3) {
                break;
            }
            i11--;
            i14 = i15;
        }
        int length = iArr.length;
        boolean z12 = z11;
        int i16 = 0;
        int i17 = i11;
        while (i11 < i13) {
            if (bitMatrix.get(i11, i12) != z12) {
                iArr2[i16] = iArr2[i16] + 1;
            } else {
                if (i16 != length - 1) {
                    i16++;
                } else {
                    if (patternMatchVariance(iArr2, iArr, 0.8f) < MAX_AVG_VARIANCE) {
                        return new int[]{i17, i11};
                    }
                    i17 += iArr2[0] + iArr2[1];
                    int i18 = i16 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i18);
                    iArr2[i18] = 0;
                    iArr2[i16] = 0;
                    i16--;
                }
                iArr2[i16] = 1;
                z12 = !z12;
            }
            i11++;
        }
        if (i16 != length - 1 || patternMatchVariance(iArr2, iArr, 0.8f) >= MAX_AVG_VARIANCE) {
            return null;
        }
        return new int[]{i17, i11 - 1};
    }

    private static float patternMatchVariance(int[] iArr, int[] iArr2, float f11) {
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            i11 += iArr[i13];
            i12 += iArr2[i13];
        }
        if (i11 < i12) {
            return Float.POSITIVE_INFINITY;
        }
        float f12 = i11;
        float f13 = f12 / i12;
        float f14 = f11 * f13;
        float f15 = 0.0f;
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = iArr[i14];
            float f16 = iArr2[i14] * f13;
            float f17 = i15;
            float f18 = f17 > f16 ? f17 - f16 : f16 - f17;
            if (f18 > f14) {
                return Float.POSITIVE_INFINITY;
            }
            f15 += f18;
        }
        return f15 / f12;
    }

    private static ResultPoint[] findRowsWithPattern(BitMatrix bitMatrix, int i11, int i12, int i13, int i14, int[] iArr) {
        int i15;
        boolean z11;
        int[] iArr2;
        ResultPoint[] resultPointArr = new ResultPoint[4];
        int[] iArr3 = iArr;
        int[] iArr4 = new int[iArr3.length];
        int i16 = i13;
        while (true) {
            if (i16 >= i11) {
                i15 = i16;
                z11 = false;
                break;
            }
            int[] iArrFindGuardPattern = findGuardPattern(bitMatrix, i14, i16, i12, false, iArr3, iArr4);
            if (iArrFindGuardPattern != null) {
                do {
                    i15 = i16;
                    iArr2 = iArrFindGuardPattern;
                    if (i15 <= 0) {
                        break;
                    }
                    i16 = i15 - 1;
                    iArrFindGuardPattern = findGuardPattern(bitMatrix, i14, i16, i12, false, iArr, iArr4);
                } while (iArrFindGuardPattern != null);
                float f11 = i15;
                resultPointArr[0] = new ResultPoint(iArr2[0], f11);
                resultPointArr[1] = new ResultPoint(iArr2[1], f11);
                z11 = true;
                break;
            }
            i16 += 5;
            iArr3 = iArr;
        }
        int i17 = i15 + 1;
        if (z11) {
            int[] iArr5 = {(int) resultPointArr[0].getX(), (int) resultPointArr[1].getX()};
            int i18 = i17;
            int i19 = 0;
            while (i18 < i11) {
                int[] iArrFindGuardPattern2 = findGuardPattern(bitMatrix, iArr5[0], i18, i12, false, iArr, iArr4);
                if (iArrFindGuardPattern2 != null && Math.abs(iArr5[0] - iArrFindGuardPattern2[0]) < 5 && Math.abs(iArr5[1] - iArrFindGuardPattern2[1]) < 5) {
                    iArr5 = iArrFindGuardPattern2;
                    i19 = 0;
                } else {
                    if (i19 > 25) {
                        break;
                    }
                    i19++;
                }
                i18++;
            }
            i17 = i18 - (i19 + 1);
            float f12 = i17;
            resultPointArr[2] = new ResultPoint(iArr5[0], f12);
            resultPointArr[3] = new ResultPoint(iArr5[1], f12);
        }
        if (i17 - i15 < 10) {
            Arrays.fill(resultPointArr, (Object) null);
        }
        return resultPointArr;
    }

    private Detector() {
    }

    private static ResultPoint[] findVertices(BitMatrix bitMatrix, int i11, int i12) {
        int height = bitMatrix.getHeight();
        int width = bitMatrix.getWidth();
        ResultPoint[] resultPointArr = new ResultPoint[8];
        int y11 = i11;
        int i13 = i12;
        copyToResult(resultPointArr, findRowsWithPattern(bitMatrix, height, width, y11, i13, START_PATTERN), INDEXES_START_PATTERN);
        ResultPoint resultPoint = resultPointArr[4];
        if (resultPoint != null) {
            int x11 = (int) resultPoint.getX();
            y11 = (int) resultPointArr[4].getY();
            i13 = x11;
        }
        copyToResult(resultPointArr, findRowsWithPattern(bitMatrix, height, width, y11, i13, STOP_PATTERN), INDEXES_STOP_PATTERN);
        return resultPointArr;
    }

    private static List<ResultPoint[]> detect(boolean z11, BitMatrix bitMatrix) {
        int x11;
        float y11;
        ArrayList<ResultPoint[]> arrayList = new ArrayList();
        int iMax = 0;
        int i11 = 0;
        loop0: while (true) {
            int i12 = i11;
            while (iMax < bitMatrix.getHeight()) {
                ResultPoint[] resultPointArrFindVertices = findVertices(bitMatrix, iMax, i11);
                if (resultPointArrFindVertices[0] == null && resultPointArrFindVertices[3] == null) {
                    if (i12 == 0) {
                        break;
                    }
                    for (ResultPoint[] resultPointArr : arrayList) {
                        ResultPoint resultPoint = resultPointArr[1];
                        if (resultPoint != null) {
                            iMax = (int) Math.max(iMax, resultPoint.getY());
                        }
                        ResultPoint resultPoint2 = resultPointArr[3];
                        if (resultPoint2 != null) {
                            iMax = Math.max(iMax, (int) resultPoint2.getY());
                        }
                    }
                    iMax += 5;
                    i11 = 0;
                } else {
                    arrayList.add(resultPointArrFindVertices);
                    if (!z11) {
                        break loop0;
                    }
                    ResultPoint resultPoint3 = resultPointArrFindVertices[2];
                    if (resultPoint3 != null) {
                        x11 = (int) resultPoint3.getX();
                        y11 = resultPointArrFindVertices[2].getY();
                    } else {
                        x11 = (int) resultPointArrFindVertices[4].getX();
                        y11 = resultPointArrFindVertices[4].getY();
                    }
                    iMax = (int) y11;
                    i11 = x11;
                    i12 = 1;
                }
            }
            break loop0;
        }
        return arrayList;
    }
}
