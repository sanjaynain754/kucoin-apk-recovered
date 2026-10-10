package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public class FinderPatternFinder {
    private static final int CENTER_QUORUM = 2;
    protected static final int MAX_MODULES = 97;
    protected static final int MIN_SKIP = 3;
    private final int[] crossCheckStateCount;
    private boolean hasSkipped;
    private final BitMatrix image;
    private final List<FinderPattern> possibleCenters;
    private final ResultPointCallback resultPointCallback;

    public static final class CenterComparator implements Serializable, Comparator<FinderPattern> {
        private final float average;

        private CenterComparator(float f11) {
            this.average = f11;
        }

        @Override // java.util.Comparator
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            int iCompare = Integer.compare(finderPattern2.getCount(), finderPattern.getCount());
            return iCompare == 0 ? Float.compare(Math.abs(finderPattern.getEstimatedModuleSize() - this.average), Math.abs(finderPattern2.getEstimatedModuleSize() - this.average)) : iCompare;
        }
    }

    public static final class FurthestFromAverageComparator implements Serializable, Comparator<FinderPattern> {
        private final float average;

        private FurthestFromAverageComparator(float f11) {
            this.average = f11;
        }

        @Override // java.util.Comparator
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            return Float.compare(Math.abs(finderPattern2.getEstimatedModuleSize() - this.average), Math.abs(finderPattern.getEstimatedModuleSize() - this.average));
        }
    }

    public FinderPatternFinder(BitMatrix bitMatrix) {
        this(bitMatrix, null);
    }

    private static float centerFromEnd(int[] iArr, int i11) {
        return ((i11 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean foundPatternCross(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 5; i12++) {
            int i13 = iArr[i12];
            if (i13 == 0) {
                return false;
            }
            i11 += i13;
        }
        if (i11 < 7) {
            return false;
        }
        float f11 = i11 / 7.0f;
        float f12 = f11 / 2.0f;
        return Math.abs(f11 - ((float) iArr[0])) < f12 && Math.abs(f11 - ((float) iArr[1])) < f12 && Math.abs((f11 * 3.0f) - ((float) iArr[2])) < 3.0f * f12 && Math.abs(f11 - ((float) iArr[3])) < f12 && Math.abs(f11 - ((float) iArr[4])) < f12;
    }

    public static boolean foundPatternDiagonal(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 5; i12++) {
            int i13 = iArr[i12];
            if (i13 == 0) {
                return false;
            }
            i11 += i13;
        }
        if (i11 < 7) {
            return false;
        }
        float f11 = i11 / 7.0f;
        float f12 = f11 / 1.333f;
        return Math.abs(f11 - ((float) iArr[0])) < f12 && Math.abs(f11 - ((float) iArr[1])) < f12 && Math.abs((f11 * 3.0f) - ((float) iArr[2])) < 3.0f * f12 && Math.abs(f11 - ((float) iArr[3])) < f12 && Math.abs(f11 - ((float) iArr[4])) < f12;
    }

    public final void clearCounts(int[] iArr) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr[i11] = 0;
        }
    }

    public final FinderPatternInfo find(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z11 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int i11 = (height * 3) / 388;
        if (i11 < 3 || z11) {
            i11 = 3;
        }
        int[] iArr = new int[5];
        int i12 = i11 - 1;
        boolean zHaveMultiplyConfirmedCenters = false;
        while (i12 < height && !zHaveMultiplyConfirmedCenters) {
            clearCounts(iArr);
            int i13 = 0;
            int i14 = 0;
            while (i13 < width) {
                if (this.image.get(i13, i12)) {
                    if ((i14 & 1) == 1) {
                        i14++;
                    }
                    iArr[i14] = iArr[i14] + 1;
                } else if ((i14 & 1) != 0) {
                    iArr[i14] = iArr[i14] + 1;
                } else if (i14 != 4) {
                    i14++;
                    iArr[i14] = iArr[i14] + 1;
                } else if (foundPatternCross(iArr) && handlePossibleCenter(iArr, i12, i13)) {
                    if (this.hasSkipped) {
                        zHaveMultiplyConfirmedCenters = haveMultiplyConfirmedCenters();
                    } else {
                        int iFindRowSkip = findRowSkip();
                        int i15 = iArr[2];
                        if (iFindRowSkip > i15) {
                            i12 += (iFindRowSkip - i15) - 2;
                            i13 = width - 1;
                        }
                    }
                    clearCounts(iArr);
                    i11 = 2;
                    i14 = 0;
                } else {
                    shiftCounts2(iArr);
                    i14 = 3;
                }
                i13++;
            }
            if (foundPatternCross(iArr) && handlePossibleCenter(iArr, i12, width)) {
                i11 = iArr[0];
                if (this.hasSkipped) {
                    zHaveMultiplyConfirmedCenters = haveMultiplyConfirmedCenters();
                }
            }
            i12 += i11;
        }
        FinderPattern[] finderPatternArrSelectBestPatterns = selectBestPatterns();
        ResultPoint.orderBestPatterns(finderPatternArrSelectBestPatterns);
        return new FinderPatternInfo(finderPatternArrSelectBestPatterns);
    }

    @Deprecated
    public final boolean handlePossibleCenter(int[] iArr, int i11, int i12, boolean z11) {
        return handlePossibleCenter(iArr, i11, i12);
    }

    public final void shiftCounts2(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    public FinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
        this.image = bitMatrix;
        this.possibleCenters = new ArrayList();
        this.crossCheckStateCount = new int[5];
        this.resultPointCallback = resultPointCallback;
    }

    private float crossCheckHorizontal(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        BitMatrix bitMatrix = this.image;
        int width = bitMatrix.getWidth();
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i18 = i11;
        while (i18 >= 0 && bitMatrix.get(i18, i12)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i18--;
        }
        if (i18 < 0) {
            return Float.NaN;
        }
        while (i18 >= 0 && !bitMatrix.get(i18, i12)) {
            int i19 = crossCheckStateCount[1];
            if (i19 > i13) {
                break;
            }
            crossCheckStateCount[1] = i19 + 1;
            i18--;
        }
        if (i18 >= 0 && crossCheckStateCount[1] <= i13) {
            while (i18 >= 0 && bitMatrix.get(i18, i12) && (i17 = crossCheckStateCount[0]) <= i13) {
                crossCheckStateCount[0] = i17 + 1;
                i18--;
            }
            if (crossCheckStateCount[0] > i13) {
                return Float.NaN;
            }
            int i21 = i11 + 1;
            while (i21 < width && bitMatrix.get(i21, i12)) {
                crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
                i21++;
            }
            if (i21 == width) {
                return Float.NaN;
            }
            while (i21 < width && !bitMatrix.get(i21, i12) && (i16 = crossCheckStateCount[3]) < i13) {
                crossCheckStateCount[3] = i16 + 1;
                i21++;
            }
            if (i21 != width && crossCheckStateCount[3] < i13) {
                while (i21 < width && bitMatrix.get(i21, i12) && (i15 = crossCheckStateCount[4]) < i13) {
                    crossCheckStateCount[4] = i15 + 1;
                    i21++;
                }
                int i22 = crossCheckStateCount[4];
                if (i22 < i13 && Math.abs(((((crossCheckStateCount[0] + crossCheckStateCount[1]) + crossCheckStateCount[2]) + crossCheckStateCount[3]) + i22) - i14) * 5 < i14 && foundPatternCross(crossCheckStateCount)) {
                    return centerFromEnd(crossCheckStateCount, i21);
                }
            }
        }
        return Float.NaN;
    }

    private float crossCheckVertical(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        BitMatrix bitMatrix = this.image;
        int height = bitMatrix.getHeight();
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i18 = i11;
        while (i18 >= 0 && bitMatrix.get(i12, i18)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i18--;
        }
        if (i18 < 0) {
            return Float.NaN;
        }
        while (i18 >= 0 && !bitMatrix.get(i12, i18)) {
            int i19 = crossCheckStateCount[1];
            if (i19 > i13) {
                break;
            }
            crossCheckStateCount[1] = i19 + 1;
            i18--;
        }
        if (i18 >= 0 && crossCheckStateCount[1] <= i13) {
            while (i18 >= 0 && bitMatrix.get(i12, i18) && (i17 = crossCheckStateCount[0]) <= i13) {
                crossCheckStateCount[0] = i17 + 1;
                i18--;
            }
            if (crossCheckStateCount[0] > i13) {
                return Float.NaN;
            }
            int i21 = i11 + 1;
            while (i21 < height && bitMatrix.get(i12, i21)) {
                crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
                i21++;
            }
            if (i21 == height) {
                return Float.NaN;
            }
            while (i21 < height && !bitMatrix.get(i12, i21) && (i16 = crossCheckStateCount[3]) < i13) {
                crossCheckStateCount[3] = i16 + 1;
                i21++;
            }
            if (i21 != height && crossCheckStateCount[3] < i13) {
                while (i21 < height && bitMatrix.get(i12, i21) && (i15 = crossCheckStateCount[4]) < i13) {
                    crossCheckStateCount[4] = i15 + 1;
                    i21++;
                }
                int i22 = crossCheckStateCount[4];
                if (i22 < i13 && Math.abs(((((crossCheckStateCount[0] + crossCheckStateCount[1]) + crossCheckStateCount[2]) + crossCheckStateCount[3]) + i22) - i14) * 5 < i14 * 2 && foundPatternCross(crossCheckStateCount)) {
                    return centerFromEnd(crossCheckStateCount, i21);
                }
            }
        }
        return Float.NaN;
    }

    private int findRowSkip() {
        if (this.possibleCenters.size() <= 1) {
            return 0;
        }
        FinderPattern finderPattern = null;
        for (FinderPattern finderPattern2 : this.possibleCenters) {
            if (finderPattern2.getCount() >= 2) {
                if (finderPattern != null) {
                    this.hasSkipped = true;
                    return ((int) (Math.abs(finderPattern.getX() - finderPattern2.getX()) - Math.abs(finderPattern.getY() - finderPattern2.getY()))) / 2;
                }
                finderPattern = finderPattern2;
            }
        }
        return 0;
    }

    private int[] getCrossCheckStateCount() {
        clearCounts(this.crossCheckStateCount);
        return this.crossCheckStateCount;
    }

    private boolean haveMultiplyConfirmedCenters() {
        int size = this.possibleCenters.size();
        float fAbs = 0.0f;
        int i11 = 0;
        float estimatedModuleSize = 0.0f;
        for (FinderPattern finderPattern : this.possibleCenters) {
            if (finderPattern.getCount() >= 2) {
                i11++;
                estimatedModuleSize += finderPattern.getEstimatedModuleSize();
            }
        }
        if (i11 < 3) {
            return false;
        }
        float f11 = estimatedModuleSize / size;
        Iterator<FinderPattern> it = this.possibleCenters.iterator();
        while (it.hasNext()) {
            fAbs += Math.abs(it.next().getEstimatedModuleSize() - f11);
        }
        return fAbs <= estimatedModuleSize * 0.05f;
    }

    private FinderPattern[] selectBestPatterns() throws NotFoundException {
        int size = this.possibleCenters.size();
        if (size < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        float estimatedModuleSize = 0.0f;
        if (size > 3) {
            Iterator<FinderPattern> it = this.possibleCenters.iterator();
            float f11 = 0.0f;
            float f12 = 0.0f;
            while (it.hasNext()) {
                float estimatedModuleSize2 = it.next().getEstimatedModuleSize();
                f11 += estimatedModuleSize2;
                f12 += estimatedModuleSize2 * estimatedModuleSize2;
            }
            float f13 = size;
            float f14 = f11 / f13;
            float fSqrt = (float) Math.sqrt((f12 / f13) - (f14 * f14));
            Collections.sort(this.possibleCenters, new FurthestFromAverageComparator(f14));
            float fMax = Math.max(0.2f * f14, fSqrt);
            int i11 = 0;
            while (i11 < this.possibleCenters.size() && this.possibleCenters.size() > 3) {
                if (Math.abs(this.possibleCenters.get(i11).getEstimatedModuleSize() - f14) > fMax) {
                    this.possibleCenters.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        if (this.possibleCenters.size() > 3) {
            Iterator<FinderPattern> it2 = this.possibleCenters.iterator();
            while (it2.hasNext()) {
                estimatedModuleSize += it2.next().getEstimatedModuleSize();
            }
            Collections.sort(this.possibleCenters, new CenterComparator(estimatedModuleSize / this.possibleCenters.size()));
            List<FinderPattern> list = this.possibleCenters;
            list.subList(3, list.size()).clear();
        }
        return new FinderPattern[]{this.possibleCenters.get(0), this.possibleCenters.get(1), this.possibleCenters.get(2)};
    }

    public final BitMatrix getImage() {
        return this.image;
    }

    public final List<FinderPattern> getPossibleCenters() {
        return this.possibleCenters;
    }

    public final boolean handlePossibleCenter(int[] iArr, int i11, int i12) {
        int i13 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iCenterFromEnd = (int) centerFromEnd(iArr, i12);
        float fCrossCheckVertical = crossCheckVertical(i11, iCenterFromEnd, iArr[2], i13);
        if (!Float.isNaN(fCrossCheckVertical)) {
            int i14 = (int) fCrossCheckVertical;
            float fCrossCheckHorizontal = crossCheckHorizontal(iCenterFromEnd, i14, iArr[2], i13);
            if (!Float.isNaN(fCrossCheckHorizontal) && crossCheckDiagonal(i14, (int) fCrossCheckHorizontal)) {
                float f11 = i13 / 7.0f;
                for (int i15 = 0; i15 < this.possibleCenters.size(); i15++) {
                    FinderPattern finderPattern = this.possibleCenters.get(i15);
                    if (finderPattern.aboutEquals(f11, fCrossCheckVertical, fCrossCheckHorizontal)) {
                        this.possibleCenters.set(i15, finderPattern.combineEstimate(fCrossCheckVertical, fCrossCheckHorizontal, f11));
                        return true;
                    }
                }
                FinderPattern finderPattern2 = new FinderPattern(fCrossCheckHorizontal, fCrossCheckVertical, f11);
                this.possibleCenters.add(finderPattern2);
                ResultPointCallback resultPointCallback = this.resultPointCallback;
                if (resultPointCallback != null) {
                    resultPointCallback.foundPossibleResultPoint(finderPattern2);
                }
                return true;
            }
        }
        return false;
    }

    private boolean crossCheckDiagonal(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i16 = 0;
        while (i11 >= i16 && i12 >= i16 && this.image.get(i12 - i16, i11 - i16)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i16++;
        }
        if (crossCheckStateCount[2] == 0) {
            return false;
        }
        while (i11 >= i16 && i12 >= i16 && !this.image.get(i12 - i16, i11 - i16)) {
            crossCheckStateCount[1] = crossCheckStateCount[1] + 1;
            i16++;
        }
        if (crossCheckStateCount[1] == 0) {
            return false;
        }
        while (i11 >= i16 && i12 >= i16 && this.image.get(i12 - i16, i11 - i16)) {
            crossCheckStateCount[0] = crossCheckStateCount[0] + 1;
            i16++;
        }
        if (crossCheckStateCount[0] == 0) {
            return false;
        }
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int i17 = 1;
        while (true) {
            int i18 = i11 + i17;
            if (i18 >= height || (i15 = i12 + i17) >= width || !this.image.get(i15, i18)) {
                break;
            }
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i17++;
        }
        while (true) {
            int i19 = i11 + i17;
            if (i19 >= height || (i14 = i12 + i17) >= width || this.image.get(i14, i19)) {
                break;
            }
            crossCheckStateCount[3] = crossCheckStateCount[3] + 1;
            i17++;
        }
        if (crossCheckStateCount[3] == 0) {
            return false;
        }
        while (true) {
            int i21 = i11 + i17;
            if (i21 >= height || (i13 = i12 + i17) >= width || !this.image.get(i13, i21)) {
                break;
            }
            crossCheckStateCount[4] = crossCheckStateCount[4] + 1;
            i17++;
        }
        if (crossCheckStateCount[4] == 0) {
            return false;
        }
        return foundPatternDiagonal(crossCheckStateCount);
    }
}
