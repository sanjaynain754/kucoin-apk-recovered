package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.PerspectiveTransform;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.qrcode.decoder.Version;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public class Detector {
    private final BitMatrix image;
    private ResultPointCallback resultPointCallback;

    public DetectorResult detect() throws NotFoundException, FormatException {
        return detect(null);
    }

    public final AlignmentPattern findAlignmentInRegion(float f11, int i11, int i12, float f12) throws NotFoundException {
        int i13 = (int) (f12 * f11);
        int iMax = Math.max(0, i11 - i13);
        int iMin = Math.min(this.image.getWidth() - 1, i11 + i13) - iMax;
        float f13 = 3.0f * f11;
        if (iMin < f13) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iMax2 = Math.max(0, i12 - i13);
        int iMin2 = Math.min(this.image.getHeight() - 1, i12 + i13) - iMax2;
        if (iMin2 >= f13) {
            return new AlignmentPatternFinder(this.image, iMax, iMax2, iMin, iMin2, f11, this.resultPointCallback).find();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static PerspectiveTransform createTransform(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i11) {
        float x11;
        float y11;
        float f11;
        float f12 = i11 - 3.5f;
        if (resultPoint4 != null) {
            x11 = resultPoint4.getX();
            y11 = resultPoint4.getY();
            f11 = f12 - 3.0f;
        } else {
            x11 = (resultPoint2.getX() - resultPoint.getX()) + resultPoint3.getX();
            y11 = (resultPoint2.getY() - resultPoint.getY()) + resultPoint3.getY();
            f11 = f12;
        }
        return PerspectiveTransform.quadrilateralToQuadrilateral(3.5f, 3.5f, f12, 3.5f, f11, f11, 3.5f, f12, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), x11, y11, resultPoint3.getX(), resultPoint3.getY());
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[RETURN] */
    private float sizeOfBlackWhiteBlackRun(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21 = 1;
        boolean z11 = Math.abs(i14 - i12) > Math.abs(i13 - i11);
        if (z11) {
            i16 = i11;
            i15 = i12;
            i18 = i13;
            i17 = i14;
        } else {
            i15 = i11;
            i16 = i12;
            i17 = i13;
            i18 = i14;
        }
        int iAbs = Math.abs(i17 - i15);
        int iAbs2 = Math.abs(i18 - i16);
        int i22 = 2;
        int i23 = (-iAbs) / 2;
        int i24 = i15 < i17 ? 1 : -1;
        int i25 = i16 < i18 ? 1 : -1;
        int i26 = i17 + i24;
        int i27 = i15;
        int i28 = i16;
        int i29 = 0;
        while (i27 != i26) {
            boolean z12 = z11;
            if ((i29 == i21 ? i21 : 0) == this.image.get(z11 ? i28 : i27, z11 ? i27 : i28)) {
                if (i29 == 2) {
                    return MathUtils.distance(i27, i28, i15, i16);
                }
                i29++;
            }
            i23 += iAbs2;
            if (i23 > 0) {
                if (i28 == i18) {
                    i19 = 2;
                    if (i29 == i19) {
                        return MathUtils.distance(i26, i18, i15, i16);
                    }
                    return Float.NaN;
                }
                i28 += i25;
                i23 -= iAbs;
            }
            i27 += i24;
            iAbs = iAbs;
            z11 = z12;
            i21 = 1;
            i22 = 2;
        }
        i19 = i22;
        if (i29 == i19) {
            return MathUtils.distance(i26, i18, i15, i16);
        }
        return Float.NaN;
    }

    public final DetectorResult detect(Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        this.resultPointCallback = resultPointCallback;
        return processFinderPatternInfo(new FinderPatternFinder(this.image, resultPointCallback).find(map));
    }

    public final BitMatrix getImage() {
        return this.image;
    }

    public final ResultPointCallback getResultPointCallback() {
        return this.resultPointCallback;
    }

    public Detector(BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    private float calculateModuleSizeOneWay(ResultPoint resultPoint, ResultPoint resultPoint2) {
        float fSizeOfBlackWhiteBlackRunBothWays = sizeOfBlackWhiteBlackRunBothWays((int) resultPoint.getX(), (int) resultPoint.getY(), (int) resultPoint2.getX(), (int) resultPoint2.getY());
        float fSizeOfBlackWhiteBlackRunBothWays2 = sizeOfBlackWhiteBlackRunBothWays((int) resultPoint2.getX(), (int) resultPoint2.getY(), (int) resultPoint.getX(), (int) resultPoint.getY());
        if (Float.isNaN(fSizeOfBlackWhiteBlackRunBothWays)) {
            return fSizeOfBlackWhiteBlackRunBothWays2 / 7.0f;
        }
        if (Float.isNaN(fSizeOfBlackWhiteBlackRunBothWays2)) {
            return fSizeOfBlackWhiteBlackRunBothWays / 7.0f;
        }
        return (fSizeOfBlackWhiteBlackRunBothWays + fSizeOfBlackWhiteBlackRunBothWays2) / 14.0f;
    }

    private static int computeDimension(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, float f11) throws NotFoundException {
        int iRound = (MathUtils.round(ResultPoint.distance(resultPoint, resultPoint2) / f11) + MathUtils.round(ResultPoint.distance(resultPoint, resultPoint3) / f11)) / 2;
        int i11 = iRound + 7;
        int i12 = i11 & 3;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    return i11;
                }
                throw NotFoundException.getNotFoundInstance();
            }
            return iRound + 6;
        }
        return iRound + 8;
    }

    private static BitMatrix sampleGrid(BitMatrix bitMatrix, PerspectiveTransform perspectiveTransform, int i11) throws NotFoundException {
        return GridSampler.getInstance().sampleGrid(bitMatrix, i11, i11, perspectiveTransform);
    }

    private float sizeOfBlackWhiteBlackRunBothWays(int i11, int i12, int i13, int i14) {
        float width;
        float height;
        float fSizeOfBlackWhiteBlackRun = sizeOfBlackWhiteBlackRun(i11, i12, i13, i14);
        int width2 = i11 - (i13 - i11);
        int height2 = 0;
        if (width2 < 0) {
            width = i11 / (i11 - width2);
            width2 = 0;
        } else if (width2 >= this.image.getWidth()) {
            width = ((this.image.getWidth() - 1) - i11) / (width2 - i11);
            width2 = this.image.getWidth() - 1;
        } else {
            width = 1.0f;
        }
        float f11 = i12;
        int i15 = (int) (f11 - ((i14 - i12) * width));
        if (i15 < 0) {
            height = f11 / (i12 - i15);
        } else if (i15 >= this.image.getHeight()) {
            height = ((this.image.getHeight() - 1) - i12) / (i15 - i12);
            height2 = this.image.getHeight() - 1;
        } else {
            height2 = i15;
            height = 1.0f;
        }
        return (fSizeOfBlackWhiteBlackRun + sizeOfBlackWhiteBlackRun(i11, i12, (int) (i11 + ((width2 - i11) * height)), height2)) - 1.0f;
    }

    public final float calculateModuleSize(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        return (calculateModuleSizeOneWay(resultPoint, resultPoint2) + calculateModuleSizeOneWay(resultPoint, resultPoint3)) / 2.0f;
    }

    public final DetectorResult processFinderPatternInfo(FinderPatternInfo finderPatternInfo) throws NotFoundException, FormatException {
        AlignmentPattern alignmentPatternFindAlignmentInRegion;
        ResultPoint[] resultPointArr;
        FinderPattern topLeft = finderPatternInfo.getTopLeft();
        FinderPattern topRight = finderPatternInfo.getTopRight();
        FinderPattern bottomLeft = finderPatternInfo.getBottomLeft();
        float fCalculateModuleSize = calculateModuleSize(topLeft, topRight, bottomLeft);
        if (fCalculateModuleSize >= 1.0f) {
            int iComputeDimension = computeDimension(topLeft, topRight, bottomLeft, fCalculateModuleSize);
            Version provisionalVersionForDimension = Version.getProvisionalVersionForDimension(iComputeDimension);
            int dimensionForVersion = provisionalVersionForDimension.getDimensionForVersion() - 7;
            if (provisionalVersionForDimension.getAlignmentPatternCenters().length > 0) {
                float x11 = (topRight.getX() - topLeft.getX()) + bottomLeft.getX();
                float y11 = (topRight.getY() - topLeft.getY()) + bottomLeft.getY();
                float f11 = 1.0f - (3.0f / dimensionForVersion);
                int x12 = (int) (topLeft.getX() + ((x11 - topLeft.getX()) * f11));
                int y12 = (int) (topLeft.getY() + (f11 * (y11 - topLeft.getY())));
                int i11 = 4;
                while (true) {
                    if (i11 <= 16) {
                        try {
                            alignmentPatternFindAlignmentInRegion = findAlignmentInRegion(fCalculateModuleSize, x12, y12, i11);
                            break;
                        } catch (NotFoundException unused) {
                            i11 <<= 1;
                        }
                    } else {
                        alignmentPatternFindAlignmentInRegion = null;
                        break;
                    }
                }
            } else {
                alignmentPatternFindAlignmentInRegion = null;
                break;
            }
            BitMatrix bitMatrixSampleGrid = sampleGrid(this.image, createTransform(topLeft, topRight, bottomLeft, alignmentPatternFindAlignmentInRegion, iComputeDimension), iComputeDimension);
            if (alignmentPatternFindAlignmentInRegion == null) {
                resultPointArr = new ResultPoint[]{bottomLeft, topLeft, topRight};
            } else {
                resultPointArr = new ResultPoint[]{bottomLeft, topLeft, topRight, alignmentPatternFindAlignmentInRegion};
            }
            return new DetectorResult(bitMatrixSampleGrid, resultPointArr);
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
