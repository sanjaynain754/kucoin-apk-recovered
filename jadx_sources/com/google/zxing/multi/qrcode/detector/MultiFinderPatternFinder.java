package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.detector.FinderPattern;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import com.google.zxing.qrcode.detector.FinderPatternInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
final class MultiFinderPatternFinder extends FinderPatternFinder {
    private static final float DIFF_MODSIZE_CUTOFF = 0.5f;
    private static final float DIFF_MODSIZE_CUTOFF_PERCENT = 0.05f;
    private static final FinderPatternInfo[] EMPTY_RESULT_ARRAY = new FinderPatternInfo[0];
    private static final float MAX_MODULE_COUNT_PER_EDGE = 180.0f;
    private static final float MIN_MODULE_COUNT_PER_EDGE = 9.0f;

    public static final class ModuleSizeComparator implements Serializable, Comparator<FinderPattern> {
        private ModuleSizeComparator() {
        }

        @Override // java.util.Comparator
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            double estimatedModuleSize = finderPattern2.getEstimatedModuleSize() - finderPattern.getEstimatedModuleSize();
            if (estimatedModuleSize < 0.0d) {
                return -1;
            }
            return estimatedModuleSize > 0.0d ? 1 : 0;
        }
    }

    public MultiFinderPatternFinder(BitMatrix bitMatrix) {
        super(bitMatrix);
    }

    public FinderPatternInfo[] findMulti(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z11 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        BitMatrix image = getImage();
        int height = image.getHeight();
        int width = image.getWidth();
        int i11 = (height * 3) / 388;
        if (i11 < 3 || z11) {
            i11 = 3;
        }
        int[] iArr = new int[5];
        for (int i12 = i11 - 1; i12 < height; i12 += i11) {
            clearCounts(iArr);
            int i13 = 0;
            for (int i14 = 0; i14 < width; i14++) {
                if (image.get(i14, i12)) {
                    if ((i13 & 1) == 1) {
                        i13++;
                    }
                    iArr[i13] = iArr[i13] + 1;
                } else if ((i13 & 1) != 0) {
                    iArr[i13] = iArr[i13] + 1;
                } else if (i13 != 4) {
                    i13++;
                    iArr[i13] = iArr[i13] + 1;
                } else if (FinderPatternFinder.foundPatternCross(iArr) && handlePossibleCenter(iArr, i12, i14)) {
                    clearCounts(iArr);
                    i13 = 0;
                } else {
                    shiftCounts2(iArr);
                    i13 = 3;
                }
            }
            if (FinderPatternFinder.foundPatternCross(iArr)) {
                handlePossibleCenter(iArr, i12, width);
            }
        }
        FinderPattern[][] finderPatternArrSelectMutipleBestPatterns = selectMutipleBestPatterns();
        ArrayList arrayList = new ArrayList();
        for (FinderPattern[] finderPatternArr : finderPatternArrSelectMutipleBestPatterns) {
            ResultPoint.orderBestPatterns(finderPatternArr);
            arrayList.add(new FinderPatternInfo(finderPatternArr));
        }
        return arrayList.isEmpty() ? EMPTY_RESULT_ARRAY : (FinderPatternInfo[]) arrayList.toArray(new FinderPatternInfo[arrayList.size()]);
    }

    public MultiFinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
        super(bitMatrix, resultPointCallback);
    }

    private FinderPattern[][] selectMutipleBestPatterns() throws NotFoundException {
        List<FinderPattern> possibleCenters = getPossibleCenters();
        int size = possibleCenters.size();
        if (size >= 3) {
            if (size == 3) {
                return new FinderPattern[][]{new FinderPattern[]{possibleCenters.get(0), possibleCenters.get(1), possibleCenters.get(2)}};
            }
            Collections.sort(possibleCenters, new ModuleSizeComparator());
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < size - 2; i11++) {
                FinderPattern finderPattern = possibleCenters.get(i11);
                if (finderPattern != null) {
                    for (int i12 = i11 + 1; i12 < size - 1; i12++) {
                        FinderPattern finderPattern2 = possibleCenters.get(i12);
                        if (finderPattern2 != null) {
                            float estimatedModuleSize = (finderPattern.getEstimatedModuleSize() - finderPattern2.getEstimatedModuleSize()) / Math.min(finderPattern.getEstimatedModuleSize(), finderPattern2.getEstimatedModuleSize());
                            if (Math.abs(finderPattern.getEstimatedModuleSize() - finderPattern2.getEstimatedModuleSize()) > 0.5f && estimatedModuleSize >= DIFF_MODSIZE_CUTOFF_PERCENT) {
                                break;
                            }
                            for (int i13 = i12 + 1; i13 < size; i13++) {
                                FinderPattern finderPattern3 = possibleCenters.get(i13);
                                if (finderPattern3 != null) {
                                    float estimatedModuleSize2 = (finderPattern2.getEstimatedModuleSize() - finderPattern3.getEstimatedModuleSize()) / Math.min(finderPattern2.getEstimatedModuleSize(), finderPattern3.getEstimatedModuleSize());
                                    if (Math.abs(finderPattern2.getEstimatedModuleSize() - finderPattern3.getEstimatedModuleSize()) > 0.5f && estimatedModuleSize2 >= DIFF_MODSIZE_CUTOFF_PERCENT) {
                                        break;
                                    }
                                    FinderPattern[] finderPatternArr = {finderPattern, finderPattern2, finderPattern3};
                                    ResultPoint.orderBestPatterns(finderPatternArr);
                                    FinderPatternInfo finderPatternInfo = new FinderPatternInfo(finderPatternArr);
                                    float fDistance = ResultPoint.distance(finderPatternInfo.getTopLeft(), finderPatternInfo.getBottomLeft());
                                    float fDistance2 = ResultPoint.distance(finderPatternInfo.getTopRight(), finderPatternInfo.getBottomLeft());
                                    float fDistance3 = ResultPoint.distance(finderPatternInfo.getTopLeft(), finderPatternInfo.getTopRight());
                                    float estimatedModuleSize3 = (fDistance + fDistance3) / (finderPattern.getEstimatedModuleSize() * 2.0f);
                                    if (estimatedModuleSize3 <= 180.0f && estimatedModuleSize3 >= MIN_MODULE_COUNT_PER_EDGE && Math.abs((fDistance - fDistance3) / Math.min(fDistance, fDistance3)) < 0.1f) {
                                        float fSqrt = (float) Math.sqrt((fDistance * fDistance) + (fDistance3 * fDistance3));
                                        if (Math.abs((fDistance2 - fSqrt) / Math.min(fDistance2, fSqrt)) < 0.1f) {
                                            arrayList.add(finderPatternArr);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return (FinderPattern[][]) arrayList.toArray(new FinderPattern[arrayList.size()][]);
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
