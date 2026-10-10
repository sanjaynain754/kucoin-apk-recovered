package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes56.dex */
public final class WhiteRectangleDetector {
    private static final int CORR = 1;
    private static final int INIT_SIZE = 10;
    private final int downInit;
    private final int height;
    private final BitMatrix image;
    private final int leftInit;
    private final int rightInit;
    private final int upInit;
    private final int width;

    public WhiteRectangleDetector(BitMatrix bitMatrix) throws NotFoundException {
        this(bitMatrix, 10, bitMatrix.getWidth() / 2, bitMatrix.getHeight() / 2);
    }

    private boolean containsBlackPoint(int i11, int i12, int i13, boolean z11) {
        if (z11) {
            while (i11 <= i12) {
                if (this.image.get(i11, i13)) {
                    return true;
                }
                i11++;
            }
            return false;
        }
        while (i11 <= i12) {
            if (this.image.get(i13, i11)) {
                return true;
            }
            i11++;
        }
        return false;
    }

    public WhiteRectangleDetector(BitMatrix bitMatrix, int i11, int i12, int i13) throws NotFoundException {
        this.image = bitMatrix;
        int height = bitMatrix.getHeight();
        this.height = height;
        int width = bitMatrix.getWidth();
        this.width = width;
        int i14 = i11 / 2;
        int i15 = i12 - i14;
        this.leftInit = i15;
        int i16 = i12 + i14;
        this.rightInit = i16;
        int i17 = i13 - i14;
        this.upInit = i17;
        int i18 = i13 + i14;
        this.downInit = i18;
        if (i17 < 0 || i15 < 0 || i18 >= height || i16 >= width) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public ResultPoint[] detect() throws NotFoundException {
        int i11 = this.leftInit;
        int i12 = this.rightInit;
        int i13 = this.upInit;
        int i14 = this.downInit;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = true;
        while (z17) {
            boolean z18 = false;
            boolean zContainsBlackPoint = true;
            while (true) {
                if ((!zContainsBlackPoint && z12) || i12 >= this.width) {
                    break;
                }
                zContainsBlackPoint = containsBlackPoint(i13, i14, i12, false);
                if (zContainsBlackPoint) {
                    i12++;
                    z12 = true;
                    z18 = true;
                } else if (!z12) {
                    i12++;
                }
            }
            if (i12 < this.width) {
                boolean zContainsBlackPoint2 = true;
                while (true) {
                    if ((!zContainsBlackPoint2 && z13) || i14 >= this.height) {
                        break;
                    }
                    zContainsBlackPoint2 = containsBlackPoint(i11, i12, i14, true);
                    if (zContainsBlackPoint2) {
                        i14++;
                        z13 = true;
                        z18 = true;
                    } else if (!z13) {
                        i14++;
                    }
                }
                if (i14 < this.height) {
                    boolean zContainsBlackPoint3 = true;
                    while (true) {
                        if ((!zContainsBlackPoint3 && z14) || i11 < 0) {
                            break;
                        }
                        zContainsBlackPoint3 = containsBlackPoint(i13, i14, i11, false);
                        if (zContainsBlackPoint3) {
                            i11--;
                            z14 = true;
                            z18 = true;
                        } else if (!z14) {
                            i11--;
                        }
                    }
                    if (i11 >= 0) {
                        z17 = z18;
                        boolean zContainsBlackPoint4 = true;
                        while (true) {
                            if ((!zContainsBlackPoint4 && z16) || i13 < 0) {
                                break;
                            }
                            zContainsBlackPoint4 = containsBlackPoint(i11, i12, i13, true);
                            if (zContainsBlackPoint4) {
                                i13--;
                                z17 = true;
                                z16 = true;
                            } else if (!z16) {
                                i13--;
                            }
                        }
                        if (i13 >= 0) {
                            if (z17) {
                                z15 = true;
                            }
                        }
                    }
                }
            }
            z11 = true;
            break;
        }
        if (z11 || !z15) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i15 = i12 - i11;
        ResultPoint blackPointOnSegment = null;
        ResultPoint blackPointOnSegment2 = null;
        for (int i16 = 1; blackPointOnSegment2 == null && i16 < i15; i16++) {
            blackPointOnSegment2 = getBlackPointOnSegment(i11, i14 - i16, i11 + i16, i14);
        }
        if (blackPointOnSegment2 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint blackPointOnSegment3 = null;
        for (int i17 = 1; blackPointOnSegment3 == null && i17 < i15; i17++) {
            blackPointOnSegment3 = getBlackPointOnSegment(i11, i13 + i17, i11 + i17, i13);
        }
        if (blackPointOnSegment3 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint blackPointOnSegment4 = null;
        for (int i18 = 1; blackPointOnSegment4 == null && i18 < i15; i18++) {
            blackPointOnSegment4 = getBlackPointOnSegment(i12, i13 + i18, i12 - i18, i13);
        }
        if (blackPointOnSegment4 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        for (int i19 = 1; blackPointOnSegment == null && i19 < i15; i19++) {
            blackPointOnSegment = getBlackPointOnSegment(i12, i14 - i19, i12 - i19, i14);
        }
        if (blackPointOnSegment != null) {
            return centerEdges(blackPointOnSegment, blackPointOnSegment2, blackPointOnSegment4, blackPointOnSegment3);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private ResultPoint[] centerEdges(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        float x11 = resultPoint.getX();
        float y11 = resultPoint.getY();
        float x12 = resultPoint2.getX();
        float y12 = resultPoint2.getY();
        float x13 = resultPoint3.getX();
        float y13 = resultPoint3.getY();
        float x14 = resultPoint4.getX();
        float y14 = resultPoint4.getY();
        if (x11 < this.width / 2.0f) {
            return new ResultPoint[]{new ResultPoint(x14 - 1.0f, y14 + 1.0f), new ResultPoint(x12 + 1.0f, y12 + 1.0f), new ResultPoint(x13 - 1.0f, y13 - 1.0f), new ResultPoint(x11 + 1.0f, y11 - 1.0f)};
        }
        return new ResultPoint[]{new ResultPoint(x14 + 1.0f, y14 + 1.0f), new ResultPoint(x12 + 1.0f, y12 - 1.0f), new ResultPoint(x13 - 1.0f, y13 + 1.0f), new ResultPoint(x11 - 1.0f, y11 - 1.0f)};
    }

    private ResultPoint getBlackPointOnSegment(float f11, float f12, float f13, float f14) {
        int iRound = MathUtils.round(MathUtils.distance(f11, f12, f13, f14));
        float f15 = iRound;
        float f16 = (f13 - f11) / f15;
        float f17 = (f14 - f12) / f15;
        for (int i11 = 0; i11 < iRound; i11++) {
            float f18 = i11;
            int iRound2 = MathUtils.round((f18 * f16) + f11);
            int iRound3 = MathUtils.round((f18 * f17) + f12);
            if (this.image.get(iRound2, iRound3)) {
                return new ResultPoint(iRound2, iRound3);
            }
        }
        return null;
    }
}
