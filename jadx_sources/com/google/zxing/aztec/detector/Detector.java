package com.google.zxing.aztec.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.tencent.rtmp.TXLiveConstants;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes56.dex */
public final class Detector {
    private static final int[] EXPECTED_CORNER_BITS = {3808, 476, TXLiveConstants.PLAY_WARNING_VIDEO_DISCONTINUITY, 1799};
    private boolean compact;
    private final BitMatrix image;
    private int nbCenterLayers;
    private int nbDataBlocks;
    private int nbLayers;
    private int shift;

    public static final class Point {

        /* JADX INFO: renamed from: x */
        private final int f12786x;

        /* JADX INFO: renamed from: y */
        private final int f12787y;

        public int getX() {
            return this.f12786x;
        }

        public int getY() {
            return this.f12787y;
        }

        public ResultPoint toResultPoint() {
            return new ResultPoint(getX(), getY());
        }

        public String toString() {
            return "<" + this.f12786x + ' ' + this.f12787y + Typography.greater;
        }

        public Point(int i11, int i12) {
            this.f12786x = i11;
            this.f12787y = i12;
        }
    }

    private static float distance(Point point, Point point2) {
        return MathUtils.distance(point.getX(), point.getY(), point2.getX(), point2.getY());
    }

    private static ResultPoint[] expandSquare(ResultPoint[] resultPointArr, int i11, int i12) {
        float f11 = i12 / (i11 * 2.0f);
        float x11 = resultPointArr[0].getX() - resultPointArr[2].getX();
        float y11 = resultPointArr[0].getY() - resultPointArr[2].getY();
        float x12 = (resultPointArr[0].getX() + resultPointArr[2].getX()) / 2.0f;
        float y12 = (resultPointArr[0].getY() + resultPointArr[2].getY()) / 2.0f;
        float f12 = x11 * f11;
        float f13 = y11 * f11;
        ResultPoint resultPoint = new ResultPoint(x12 + f12, y12 + f13);
        ResultPoint resultPoint2 = new ResultPoint(x12 - f12, y12 - f13);
        float x13 = resultPointArr[1].getX() - resultPointArr[3].getX();
        float y13 = resultPointArr[1].getY() - resultPointArr[3].getY();
        float x14 = (resultPointArr[1].getX() + resultPointArr[3].getX()) / 2.0f;
        float y14 = (resultPointArr[1].getY() + resultPointArr[3].getY()) / 2.0f;
        float f14 = x13 * f11;
        float f15 = f11 * y13;
        return new ResultPoint[]{resultPoint, new ResultPoint(x14 + f14, y14 + f15), resultPoint2, new ResultPoint(x14 - f14, y14 - f15)};
    }

    private void extractParameters(ResultPoint[] resultPointArr) throws NotFoundException {
        long j11;
        long j12;
        if (!isValid(resultPointArr[0]) || !isValid(resultPointArr[1]) || !isValid(resultPointArr[2]) || !isValid(resultPointArr[3])) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i11 = this.nbCenterLayers * 2;
        int[] iArr = {sampleLine(resultPointArr[0], resultPointArr[1], i11), sampleLine(resultPointArr[1], resultPointArr[2], i11), sampleLine(resultPointArr[2], resultPointArr[3], i11), sampleLine(resultPointArr[3], resultPointArr[0], i11)};
        this.shift = getRotation(iArr, i11);
        long j13 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = iArr[(this.shift + i12) % 4];
            if (this.compact) {
                j11 = j13 << 7;
                j12 = (i13 >> 1) & 127;
            } else {
                j11 = j13 << 10;
                j12 = ((i13 >> 2) & 992) + ((i13 >> 1) & 31);
            }
            j13 = j11 + j12;
        }
        int correctedParameterData = getCorrectedParameterData(j13, this.compact);
        if (this.compact) {
            this.nbLayers = (correctedParameterData >> 6) + 1;
            this.nbDataBlocks = (correctedParameterData & 63) + 1;
        } else {
            this.nbLayers = (correctedParameterData >> 11) + 1;
            this.nbDataBlocks = (correctedParameterData & 2047) + 1;
        }
    }

    private ResultPoint[] getBullsEyeCorners(Point point) throws NotFoundException {
        this.nbCenterLayers = 1;
        Point point2 = point;
        Point point3 = point2;
        Point point4 = point3;
        boolean z11 = true;
        while (this.nbCenterLayers < 9) {
            Point firstDifferent = getFirstDifferent(point, z11, 1, -1);
            Point firstDifferent2 = getFirstDifferent(point2, z11, 1, 1);
            Point firstDifferent3 = getFirstDifferent(point3, z11, -1, 1);
            Point firstDifferent4 = getFirstDifferent(point4, z11, -1, -1);
            if (this.nbCenterLayers > 2) {
                double dDistance = (distance(firstDifferent4, firstDifferent) * this.nbCenterLayers) / (distance(point4, point) * (this.nbCenterLayers + 2));
                if (dDistance < 0.75d || dDistance > 1.25d || !isWhiteOrBlackRectangle(firstDifferent, firstDifferent2, firstDifferent3, firstDifferent4)) {
                    break;
                }
            }
            z11 = !z11;
            this.nbCenterLayers++;
            point4 = firstDifferent4;
            point = firstDifferent;
            point2 = firstDifferent2;
            point3 = firstDifferent3;
        }
        int i11 = this.nbCenterLayers;
        if (i11 != 5 && i11 != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        this.compact = i11 == 5;
        ResultPoint[] resultPointArr = {new ResultPoint(point.getX() + 0.5f, point.getY() - 0.5f), new ResultPoint(point2.getX() + 0.5f, point2.getY() + 0.5f), new ResultPoint(point3.getX() - 0.5f, point3.getY() + 0.5f), new ResultPoint(point4.getX() - 0.5f, point4.getY() - 0.5f)};
        int i12 = this.nbCenterLayers;
        return expandSquare(resultPointArr, (i12 * 2) - 3, i12 * 2);
    }

    private static int getCorrectedParameterData(long j11, boolean z11) throws NotFoundException {
        int i11;
        int i12;
        if (z11) {
            i11 = 7;
            i12 = 2;
        } else {
            i11 = 10;
            i12 = 4;
        }
        int i13 = i11 - i12;
        int[] iArr = new int[i11];
        for (int i14 = i11 - 1; i14 >= 0; i14--) {
            iArr[i14] = ((int) j11) & 15;
            j11 >>= 4;
        }
        try {
            new ReedSolomonDecoder(GenericGF.AZTEC_PARAM).decode(iArr, i13);
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                i15 = (i15 << 4) + iArr[i16];
            }
            return i15;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    private Point getMatrixCenter() {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        ResultPoint resultPoint4;
        ResultPoint resultPoint5;
        ResultPoint resultPoint6;
        ResultPoint resultPoint7;
        ResultPoint resultPoint8;
        try {
            ResultPoint[] resultPointArrDetect = new WhiteRectangleDetector(this.image).detect();
            resultPoint3 = resultPointArrDetect[0];
            resultPoint4 = resultPointArrDetect[1];
            resultPoint2 = resultPointArrDetect[2];
            resultPoint = resultPointArrDetect[3];
        } catch (NotFoundException unused) {
            int width = this.image.getWidth() / 2;
            int height = this.image.getHeight() / 2;
            int i11 = width + 7;
            int i12 = height - 7;
            ResultPoint resultPoint9 = getFirstDifferent(new Point(i11, i12), false, 1, -1).toResultPoint();
            int i13 = height + 7;
            ResultPoint resultPoint10 = getFirstDifferent(new Point(i11, i13), false, 1, 1).toResultPoint();
            int i14 = width - 7;
            ResultPoint resultPoint11 = getFirstDifferent(new Point(i14, i13), false, -1, 1).toResultPoint();
            resultPoint = getFirstDifferent(new Point(i14, i12), false, -1, -1).toResultPoint();
            resultPoint2 = resultPoint11;
            resultPoint3 = resultPoint9;
            resultPoint4 = resultPoint10;
        }
        int iRound = MathUtils.round((((resultPoint3.getX() + resultPoint.getX()) + resultPoint4.getX()) + resultPoint2.getX()) / 4.0f);
        int iRound2 = MathUtils.round((((resultPoint3.getY() + resultPoint.getY()) + resultPoint4.getY()) + resultPoint2.getY()) / 4.0f);
        try {
            ResultPoint[] resultPointArrDetect2 = new WhiteRectangleDetector(this.image, 15, iRound, iRound2).detect();
            resultPoint5 = resultPointArrDetect2[0];
            resultPoint6 = resultPointArrDetect2[1];
            resultPoint7 = resultPointArrDetect2[2];
            resultPoint8 = resultPointArrDetect2[3];
        } catch (NotFoundException unused2) {
            int i15 = iRound + 7;
            int i16 = iRound2 - 7;
            resultPoint5 = getFirstDifferent(new Point(i15, i16), false, 1, -1).toResultPoint();
            int i17 = iRound2 + 7;
            resultPoint6 = getFirstDifferent(new Point(i15, i17), false, 1, 1).toResultPoint();
            int i18 = iRound - 7;
            resultPoint7 = getFirstDifferent(new Point(i18, i17), false, -1, 1).toResultPoint();
            resultPoint8 = getFirstDifferent(new Point(i18, i16), false, -1, -1).toResultPoint();
        }
        return new Point(MathUtils.round((((resultPoint5.getX() + resultPoint8.getX()) + resultPoint6.getX()) + resultPoint7.getX()) / 4.0f), MathUtils.round((((resultPoint5.getY() + resultPoint8.getY()) + resultPoint6.getY()) + resultPoint7.getY()) / 4.0f));
    }

    private static int getRotation(int[] iArr, int i11) throws NotFoundException {
        int i12 = 0;
        for (int i13 : iArr) {
            i12 = (i12 << 3) + ((i13 >> (i11 - 2)) << 1) + (i13 & 1);
        }
        int i14 = ((i12 & 1) << 11) + (i12 >> 1);
        for (int i15 = 0; i15 < 4; i15++) {
            if (Integer.bitCount(EXPECTED_CORNER_BITS[i15] ^ i14) <= 2) {
                return i15;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private boolean isValid(int i11, int i12) {
        return i11 >= 0 && i11 < this.image.getWidth() && i12 > 0 && i12 < this.image.getHeight();
    }

    public AztecDetectorResult detect() throws NotFoundException {
        return detect(false);
    }

    private static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    private int getDimension() {
        if (this.compact) {
            return (this.nbLayers * 4) + 11;
        }
        int i11 = this.nbLayers;
        return i11 <= 4 ? (i11 * 4) + 15 : (i11 * 4) + ((((i11 - 4) / 8) + 1) * 2) + 15;
    }

    private ResultPoint[] getMatrixCornerPoints(ResultPoint[] resultPointArr) {
        return expandSquare(resultPointArr, this.nbCenterLayers * 2, getDimension());
    }

    private boolean isValid(ResultPoint resultPoint) {
        return isValid(MathUtils.round(resultPoint.getX()), MathUtils.round(resultPoint.getY()));
    }

    private boolean isWhiteOrBlackRectangle(Point point, Point point2, Point point3, Point point4) {
        Point point5 = new Point(point.getX() - 3, point.getY() + 3);
        Point point6 = new Point(point2.getX() - 3, point2.getY() - 3);
        Point point7 = new Point(point3.getX() + 3, point3.getY() - 3);
        Point point8 = new Point(point4.getX() + 3, point4.getY() + 3);
        int color = getColor(point8, point5);
        return color != 0 && getColor(point5, point6) == color && getColor(point6, point7) == color && getColor(point7, point8) == color;
    }

    public AztecDetectorResult detect(boolean z11) throws NotFoundException {
        ResultPoint[] bullsEyeCorners = getBullsEyeCorners(getMatrixCenter());
        if (z11) {
            ResultPoint resultPoint = bullsEyeCorners[0];
            bullsEyeCorners[0] = bullsEyeCorners[2];
            bullsEyeCorners[2] = resultPoint;
        }
        extractParameters(bullsEyeCorners);
        BitMatrix bitMatrix = this.image;
        int i11 = this.shift;
        return new AztecDetectorResult(sampleGrid(bitMatrix, bullsEyeCorners[i11 % 4], bullsEyeCorners[(i11 + 1) % 4], bullsEyeCorners[(i11 + 2) % 4], bullsEyeCorners[(i11 + 3) % 4]), getMatrixCornerPoints(bullsEyeCorners), this.compact, this.nbDataBlocks, this.nbLayers);
    }

    public Detector(BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    private int getColor(Point point, Point point2) {
        float fDistance = distance(point, point2);
        float x11 = (point2.getX() - point.getX()) / fDistance;
        float y11 = (point2.getY() - point.getY()) / fDistance;
        float x12 = point.getX();
        float y12 = point.getY();
        boolean z11 = this.image.get(point.getX(), point.getY());
        int iCeil = (int) Math.ceil(fDistance);
        boolean z12 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < iCeil; i12++) {
            x12 += x11;
            y12 += y11;
            if (this.image.get(MathUtils.round(x12), MathUtils.round(y12)) != z11) {
                i11++;
            }
        }
        float f11 = i11 / fDistance;
        if (f11 > 0.1f && f11 < 0.9f) {
            return 0;
        }
        if (f11 <= 0.1f) {
            z12 = true;
        }
        if (z12 == z11) {
            return 1;
        }
        return -1;
    }

    private Point getFirstDifferent(Point point, boolean z11, int i11, int i12) {
        int x11 = point.getX() + i11;
        int y11 = point.getY();
        while (true) {
            y11 += i12;
            if (!isValid(x11, y11) || this.image.get(x11, y11) != z11) {
                break;
            }
            x11 += i11;
        }
        int i13 = x11 - i11;
        int i14 = y11 - i12;
        while (isValid(i13, i14) && this.image.get(i13, i14) == z11) {
            i13 += i11;
        }
        int i15 = i13 - i11;
        while (isValid(i15, i14) && this.image.get(i15, i14) == z11) {
            i14 += i12;
        }
        return new Point(i15, i14 - i12);
    }

    private BitMatrix sampleGrid(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) throws NotFoundException {
        GridSampler gridSampler = GridSampler.getInstance();
        int dimension = getDimension();
        float f11 = dimension / 2.0f;
        int i11 = this.nbCenterLayers;
        float f12 = f11 - i11;
        float f13 = f11 + i11;
        return gridSampler.sampleGrid(bitMatrix, dimension, dimension, f12, f12, f13, f12, f13, f13, f12, f13, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint4.getX(), resultPoint4.getY());
    }

    private int sampleLine(ResultPoint resultPoint, ResultPoint resultPoint2, int i11) {
        float fDistance = distance(resultPoint, resultPoint2);
        float f11 = fDistance / i11;
        float x11 = resultPoint.getX();
        float y11 = resultPoint.getY();
        float x12 = ((resultPoint2.getX() - resultPoint.getX()) * f11) / fDistance;
        float y12 = (f11 * (resultPoint2.getY() - resultPoint.getY())) / fDistance;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            float f12 = i13;
            if (this.image.get(MathUtils.round((f12 * x12) + x11), MathUtils.round((f12 * y12) + y11))) {
                i12 |= 1 << ((i11 - i13) - 1);
            }
        }
        return i12;
    }
}
