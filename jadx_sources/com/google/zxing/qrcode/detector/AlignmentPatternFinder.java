package com.google.zxing.qrcode.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
final class AlignmentPatternFinder {
    private final int height;
    private final BitMatrix image;
    private final float moduleSize;
    private final ResultPointCallback resultPointCallback;
    private final int startX;
    private final int startY;
    private final int width;
    private final List<AlignmentPattern> possibleCenters = new ArrayList(5);
    private final int[] crossCheckStateCount = new int[3];

    private static float centerFromEnd(int[] iArr, int i11) {
        return (i11 - iArr[2]) - (iArr[1] / 2.0f);
    }

    private AlignmentPattern handlePossibleCenter(int[] iArr, int i11, int i12) {
        int i13 = iArr[0] + iArr[1] + iArr[2];
        float fCenterFromEnd = centerFromEnd(iArr, i12);
        float fCrossCheckVertical = crossCheckVertical(i11, (int) fCenterFromEnd, iArr[1] * 2, i13);
        if (Float.isNaN(fCrossCheckVertical)) {
            return null;
        }
        float f11 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (AlignmentPattern alignmentPattern : this.possibleCenters) {
            if (alignmentPattern.aboutEquals(f11, fCrossCheckVertical, fCenterFromEnd)) {
                return alignmentPattern.combineEstimate(fCrossCheckVertical, fCenterFromEnd, f11);
            }
        }
        AlignmentPattern alignmentPattern2 = new AlignmentPattern(fCenterFromEnd, fCrossCheckVertical, f11);
        this.possibleCenters.add(alignmentPattern2);
        ResultPointCallback resultPointCallback = this.resultPointCallback;
        if (resultPointCallback == null) {
            return null;
        }
        resultPointCallback.foundPossibleResultPoint(alignmentPattern2);
        return null;
    }

    private float crossCheckVertical(int i11, int i12, int i13, int i14) {
        BitMatrix bitMatrix = this.image;
        int height = bitMatrix.getHeight();
        int[] iArr = this.crossCheckStateCount;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i15 = i11;
        while (i15 >= 0 && bitMatrix.get(i12, i15)) {
            int i16 = iArr[1];
            if (i16 > i13) {
                break;
            }
            iArr[1] = i16 + 1;
            i15--;
        }
        if (i15 >= 0 && iArr[1] <= i13) {
            while (i15 >= 0 && !bitMatrix.get(i12, i15)) {
                int i17 = iArr[0];
                if (i17 > i13) {
                    break;
                }
                iArr[0] = i17 + 1;
                i15--;
            }
            if (iArr[0] > i13) {
                return Float.NaN;
            }
            int i18 = i11 + 1;
            while (i18 < height && bitMatrix.get(i12, i18)) {
                int i19 = iArr[1];
                if (i19 > i13) {
                    break;
                }
                iArr[1] = i19 + 1;
                i18++;
            }
            if (i18 != height && iArr[1] <= i13) {
                while (i18 < height && !bitMatrix.get(i12, i18)) {
                    int i21 = iArr[2];
                    if (i21 > i13) {
                        break;
                    }
                    iArr[2] = i21 + 1;
                    i18++;
                }
                int i22 = iArr[2];
                if (i22 <= i13 && Math.abs(((iArr[0] + iArr[1]) + i22) - i14) * 5 < i14 * 2 && foundPatternCross(iArr)) {
                    return centerFromEnd(iArr, i18);
                }
            }
        }
        return Float.NaN;
    }

    private boolean foundPatternCross(int[] iArr) {
        float f11 = this.moduleSize;
        float f12 = f11 / 2.0f;
        for (int i11 = 0; i11 < 3; i11++) {
            if (Math.abs(f11 - iArr[i11]) >= f12) {
                return false;
            }
        }
        return true;
    }

    public AlignmentPattern find() throws NotFoundException {
        AlignmentPattern alignmentPatternHandlePossibleCenter;
        AlignmentPattern alignmentPatternHandlePossibleCenter2;
        int i11 = this.startX;
        int i12 = this.height;
        int i13 = this.width + i11;
        int i14 = this.startY + (i12 / 2);
        int[] iArr = new int[3];
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = ((i15 & 1) == 0 ? (i15 + 1) / 2 : -((i15 + 1) / 2)) + i14;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i17 = i11;
            while (i17 < i13 && !this.image.get(i17, i16)) {
                i17++;
            }
            int i18 = 0;
            while (i17 < i13) {
                if (!this.image.get(i17, i16)) {
                    if (i18 == 1) {
                        i18++;
                    }
                    iArr[i18] = iArr[i18] + 1;
                } else if (i18 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i18 != 2) {
                    i18++;
                    iArr[i18] = iArr[i18] + 1;
                } else {
                    if (foundPatternCross(iArr) && (alignmentPatternHandlePossibleCenter2 = handlePossibleCenter(iArr, i16, i17)) != null) {
                        return alignmentPatternHandlePossibleCenter2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i18 = 1;
                }
                i17++;
            }
            if (foundPatternCross(iArr) && (alignmentPatternHandlePossibleCenter = handlePossibleCenter(iArr, i16, i13)) != null) {
                return alignmentPatternHandlePossibleCenter;
            }
        }
        if (this.possibleCenters.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return this.possibleCenters.get(0);
    }

    public AlignmentPatternFinder(BitMatrix bitMatrix, int i11, int i12, int i13, int i14, float f11, ResultPointCallback resultPointCallback) {
        this.image = bitMatrix;
        this.startX = i11;
        this.startY = i12;
        this.width = i13;
        this.height = i14;
        this.moduleSize = f11;
        this.resultPointCallback = resultPointCallback;
    }
}
