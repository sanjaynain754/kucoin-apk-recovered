package com.google.zxing.datamatrix.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public final class Detector {
    private final BitMatrix image;
    private final WhiteRectangleDetector rectangleDetector;

    public static final class ResultPointsAndTransitions {
        private final ResultPoint from;

        /* JADX INFO: renamed from: to */
        private final ResultPoint f12789to;
        private final int transitions;

        private ResultPointsAndTransitions(ResultPoint resultPoint, ResultPoint resultPoint2, int i11) {
            this.from = resultPoint;
            this.f12789to = resultPoint2;
            this.transitions = i11;
        }

        public ResultPoint getFrom() {
            return this.from;
        }

        public ResultPoint getTo() {
            return this.f12789to;
        }

        public int getTransitions() {
            return this.transitions;
        }

        public String toString() {
            return this.from + "/" + this.f12789to + '/' + this.transitions;
        }
    }

    public static final class ResultPointsAndTransitionsComparator implements Serializable, Comparator<ResultPointsAndTransitions> {
        private ResultPointsAndTransitionsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(ResultPointsAndTransitions resultPointsAndTransitions, ResultPointsAndTransitions resultPointsAndTransitions2) {
            return resultPointsAndTransitions.getTransitions() - resultPointsAndTransitions2.getTransitions();
        }
    }

    private ResultPointsAndTransitions transitionsBetween(ResultPoint resultPoint, ResultPoint resultPoint2) {
        int x11 = (int) resultPoint.getX();
        int y11 = (int) resultPoint.getY();
        int x12 = (int) resultPoint2.getX();
        int y12 = (int) resultPoint2.getY();
        int i11 = 0;
        boolean z11 = Math.abs(y12 - y11) > Math.abs(x12 - x11);
        if (z11) {
            y11 = x11;
            x11 = y11;
            y12 = x12;
            x12 = y12;
        }
        int iAbs = Math.abs(x12 - x11);
        int iAbs2 = Math.abs(y12 - y11);
        int i12 = (-iAbs) / 2;
        int i13 = y11 < y12 ? 1 : -1;
        int i14 = x11 >= x12 ? -1 : 1;
        boolean z12 = this.image.get(z11 ? y11 : x11, z11 ? x11 : y11);
        while (x11 != x12) {
            boolean z13 = this.image.get(z11 ? y11 : x11, z11 ? x11 : y11);
            if (z13 != z12) {
                i11++;
                z12 = z13;
            }
            i12 += iAbs2;
            if (i12 > 0) {
                if (y11 == y12) {
                    break;
                }
                y11 += i13;
                i12 -= iAbs;
            }
            x11 += i14;
        }
        return new ResultPointsAndTransitions(resultPoint, resultPoint2, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DetectorResult detect() throws NotFoundException {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        BitMatrix bitMatrixSampleGrid;
        ResultPoint[] resultPointArrDetect = this.rectangleDetector.detect();
        ResultPoint resultPoint3 = resultPointArrDetect[0];
        ResultPoint resultPoint4 = resultPointArrDetect[1];
        ResultPoint resultPoint5 = resultPointArrDetect[2];
        ResultPoint resultPoint6 = resultPointArrDetect[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(transitionsBetween(resultPoint3, resultPoint4));
        arrayList.add(transitionsBetween(resultPoint3, resultPoint5));
        arrayList.add(transitionsBetween(resultPoint4, resultPoint6));
        arrayList.add(transitionsBetween(resultPoint5, resultPoint6));
        ResultPoint resultPoint7 = null;
        Collections.sort(arrayList, new ResultPointsAndTransitionsComparator());
        ResultPointsAndTransitions resultPointsAndTransitions = (ResultPointsAndTransitions) arrayList.get(0);
        ResultPointsAndTransitions resultPointsAndTransitions2 = (ResultPointsAndTransitions) arrayList.get(1);
        HashMap map = new HashMap();
        increment(map, resultPointsAndTransitions.getFrom());
        increment(map, resultPointsAndTransitions.getTo());
        increment(map, resultPointsAndTransitions2.getFrom());
        increment(map, resultPointsAndTransitions2.getTo());
        ResultPoint resultPoint8 = null;
        ResultPoint resultPoint9 = null;
        for (Map.Entry entry : map.entrySet()) {
            ResultPoint resultPoint10 = (ResultPoint) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                resultPoint8 = resultPoint10;
            } else if (resultPoint7 == null) {
                resultPoint7 = resultPoint10;
            } else {
                resultPoint9 = resultPoint10;
            }
        }
        if (resultPoint7 == null || resultPoint8 == null || resultPoint9 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint[] resultPointArr = {resultPoint7, resultPoint8, resultPoint9};
        ResultPoint.orderBestPatterns(resultPointArr);
        ResultPoint resultPoint11 = resultPointArr[0];
        ResultPoint resultPoint12 = resultPointArr[1];
        ResultPoint resultPoint13 = resultPointArr[2];
        if (!map.containsKey(resultPoint3)) {
            resultPoint4 = resultPoint3;
        } else if (map.containsKey(resultPoint4)) {
            resultPoint4 = !map.containsKey(resultPoint5) ? resultPoint5 : resultPoint6;
        }
        int transitions = transitionsBetween(resultPoint13, resultPoint4).getTransitions();
        int transitions2 = transitionsBetween(resultPoint11, resultPoint4).getTransitions();
        if ((transitions & 1) == 1) {
            transitions++;
        }
        int i11 = transitions + 2;
        if ((transitions2 & 1) == 1) {
            transitions2++;
        }
        int i12 = transitions2 + 2;
        if (i11 * 4 >= i12 * 7 || i12 * 4 >= i11 * 7) {
            resultPoint = resultPoint13;
            ResultPoint resultPointCorrectTopRightRectangular = correctTopRightRectangular(resultPoint12, resultPoint11, resultPoint, resultPoint4, i11, i12);
            resultPoint11 = resultPoint11;
            if (resultPointCorrectTopRightRectangular != null) {
                resultPoint4 = resultPointCorrectTopRightRectangular;
            }
            int transitions3 = transitionsBetween(resultPoint, resultPoint4).getTransitions();
            int transitions4 = transitionsBetween(resultPoint11, resultPoint4).getTransitions();
            if ((transitions3 & 1) == 1) {
                transitions3++;
            }
            int i13 = transitions3;
            if ((transitions4 & 1) == 1) {
                transitions4++;
            }
            resultPoint2 = resultPoint12;
            bitMatrixSampleGrid = sampleGrid(this.image, resultPoint, resultPoint2, resultPoint11, resultPoint4, i13, transitions4);
        } else {
            resultPoint = resultPoint13;
            ResultPoint resultPointCorrectTopRight = correctTopRight(resultPoint12, resultPoint11, resultPoint, resultPoint4, Math.min(i12, i11));
            if (resultPointCorrectTopRight != null) {
                resultPoint4 = resultPointCorrectTopRight;
            }
            int iMax = Math.max(transitionsBetween(resultPoint, resultPoint4).getTransitions(), transitionsBetween(resultPoint11, resultPoint4).getTransitions());
            int i14 = iMax + 1;
            if ((i14 & 1) == 1) {
                i14 = iMax + 2;
            }
            int i15 = i14;
            resultPoint2 = resultPoint12;
            bitMatrixSampleGrid = sampleGrid(this.image, resultPoint, resultPoint2, resultPoint11, resultPoint4, i15, i15);
        }
        return new DetectorResult(bitMatrixSampleGrid, new ResultPoint[]{resultPoint, resultPoint2, resultPoint11, resultPoint4});
    }

    public Detector(BitMatrix bitMatrix) throws NotFoundException {
        this.image = bitMatrix;
        this.rectangleDetector = new WhiteRectangleDetector(bitMatrix);
    }

    private ResultPoint correctTopRight(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i11) {
        float f11 = i11;
        float fDistance = distance(resultPoint, resultPoint2) / f11;
        float fDistance2 = distance(resultPoint3, resultPoint4);
        ResultPoint resultPoint5 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint3.getX()) / fDistance2) * fDistance), resultPoint4.getY() + (fDistance * ((resultPoint4.getY() - resultPoint3.getY()) / fDistance2)));
        float fDistance3 = distance(resultPoint, resultPoint3) / f11;
        float fDistance4 = distance(resultPoint2, resultPoint4);
        ResultPoint resultPoint6 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint2.getX()) / fDistance4) * fDistance3), resultPoint4.getY() + (fDistance3 * ((resultPoint4.getY() - resultPoint2.getY()) / fDistance4)));
        if (!isValid(resultPoint5)) {
            if (!isValid(resultPoint6)) {
                return null;
            }
        } else if (!isValid(resultPoint6) || Math.abs(transitionsBetween(resultPoint3, resultPoint5).getTransitions() - transitionsBetween(resultPoint2, resultPoint5).getTransitions()) <= Math.abs(transitionsBetween(resultPoint3, resultPoint6).getTransitions() - transitionsBetween(resultPoint2, resultPoint6).getTransitions())) {
            return resultPoint5;
        }
        return resultPoint6;
    }

    private ResultPoint correctTopRightRectangular(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i11, int i12) {
        float fDistance = distance(resultPoint, resultPoint2) / i11;
        float fDistance2 = distance(resultPoint3, resultPoint4);
        ResultPoint resultPoint5 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint3.getX()) / fDistance2) * fDistance), resultPoint4.getY() + (fDistance * ((resultPoint4.getY() - resultPoint3.getY()) / fDistance2)));
        float fDistance3 = distance(resultPoint, resultPoint3) / i12;
        float fDistance4 = distance(resultPoint2, resultPoint4);
        ResultPoint resultPoint6 = new ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint2.getX()) / fDistance4) * fDistance3), resultPoint4.getY() + (fDistance3 * ((resultPoint4.getY() - resultPoint2.getY()) / fDistance4)));
        if (!isValid(resultPoint5)) {
            if (!isValid(resultPoint6)) {
                return null;
            }
        } else if (!isValid(resultPoint6) || Math.abs(i11 - transitionsBetween(resultPoint3, resultPoint5).getTransitions()) + Math.abs(i12 - transitionsBetween(resultPoint2, resultPoint5).getTransitions()) <= Math.abs(i11 - transitionsBetween(resultPoint3, resultPoint6).getTransitions()) + Math.abs(i12 - transitionsBetween(resultPoint2, resultPoint6).getTransitions())) {
            return resultPoint5;
        }
        return resultPoint6;
    }

    private static int distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.round(ResultPoint.distance(resultPoint, resultPoint2));
    }

    private static void increment(Map<ResultPoint, Integer> map, ResultPoint resultPoint) {
        Integer num = map.get(resultPoint);
        int iIntValue = 1;
        if (num != null) {
            iIntValue = 1 + num.intValue();
        }
        map.put(resultPoint, Integer.valueOf(iIntValue));
    }

    private boolean isValid(ResultPoint resultPoint) {
        if (resultPoint.getX() >= 0.0f && resultPoint.getX() < this.image.getWidth() && resultPoint.getY() > 0.0f && resultPoint.getY() < this.image.getHeight()) {
            return true;
        }
        return false;
    }

    private static BitMatrix sampleGrid(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i11, int i12) throws NotFoundException {
        float f11 = i11 - 0.5f;
        float f12 = i12 - 0.5f;
        return GridSampler.getInstance().sampleGrid(bitMatrix, i11, i12, 0.5f, 0.5f, f11, 0.5f, f11, f12, 0.5f, f12, resultPoint.getX(), resultPoint.getY(), resultPoint4.getX(), resultPoint4.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint2.getX(), resultPoint2.getY());
    }
}
