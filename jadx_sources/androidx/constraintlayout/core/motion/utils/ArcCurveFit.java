package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: loaded from: classes23.dex */
public class ArcCurveFit extends CurveFit {
    public static final int ARC_ABOVE = 5;
    public static final int ARC_BELOW = 4;
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int DOWN_ARC = 4;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    private static final int UP_ARC = 5;
    Arc[] mArcs;
    private boolean mExtrapolate = true;
    private final double[] mTime;

    public static class Arc {
        private static final double EPSILON = 0.001d;
        private static final String TAG = "Arc";
        private static double[] sOurPercent = new double[91];
        double mArcDistance;
        double mArcVelocity;
        double mEllipseA;
        double mEllipseB;
        double mEllipseCenterX;
        double mEllipseCenterY;
        boolean mLinear;
        double[] mLut;
        double mOneOverDeltaTime;
        double mTime1;
        double mTime2;
        double mTmpCosAngle;
        double mTmpSinAngle;
        boolean mVertical;
        double mX1;
        double mX2;
        double mY1;
        double mY2;

        public Arc(int i11, double d11, double d12, double d13, double d14, double d15, double d16) {
            this.mLinear = false;
            double d17 = d15 - d13;
            double d18 = d16 - d14;
            if (i11 == 1) {
                this.mVertical = true;
            } else if (i11 == 4) {
                this.mVertical = d18 > 0.0d;
            } else if (i11 != 5) {
                this.mVertical = false;
            } else {
                this.mVertical = d18 < 0.0d;
            }
            this.mTime1 = d11;
            this.mTime2 = d12;
            this.mOneOverDeltaTime = 1.0d / (d12 - d11);
            if (3 == i11) {
                this.mLinear = true;
            }
            if (!this.mLinear && Math.abs(d17) >= EPSILON && Math.abs(d18) >= EPSILON) {
                this.mLut = new double[101];
                boolean z11 = this.mVertical;
                this.mEllipseA = d17 * ((double) (z11 ? -1 : 1));
                this.mEllipseB = d18 * ((double) (z11 ? 1 : -1));
                this.mEllipseCenterX = z11 ? d15 : d13;
                this.mEllipseCenterY = z11 ? d14 : d16;
                buildTable(d13, d14, d15, d16);
                this.mArcVelocity = this.mArcDistance * this.mOneOverDeltaTime;
                return;
            }
            this.mLinear = true;
            this.mX1 = d13;
            this.mX2 = d15;
            this.mY1 = d14;
            this.mY2 = d16;
            double dHypot = Math.hypot(d18, d17);
            this.mArcDistance = dHypot;
            this.mArcVelocity = dHypot * this.mOneOverDeltaTime;
            double d19 = this.mTime2;
            double d21 = this.mTime1;
            this.mEllipseCenterX = d17 / (d19 - d21);
            this.mEllipseCenterY = d18 / (d19 - d21);
        }

        private void buildTable(double d11, double d12, double d13, double d14) {
            double d15 = d13 - d11;
            double d16 = d12 - d14;
            int i11 = 0;
            double dHypot = 0.0d;
            double d17 = 0.0d;
            double d18 = 0.0d;
            while (true) {
                double[] dArr = sOurPercent;
                if (i11 >= dArr.length) {
                    break;
                }
                int i12 = i11;
                double radians = Math.toRadians((((double) i11) * 90.0d) / ((double) (dArr.length - 1)));
                double dSin = Math.sin(radians) * d15;
                double dCos = Math.cos(radians) * d16;
                if (i12 > 0) {
                    dHypot += Math.hypot(dSin - d17, dCos - d18);
                    sOurPercent[i12] = dHypot;
                }
                i11 = i12 + 1;
                d17 = dSin;
                d18 = dCos;
            }
            this.mArcDistance = dHypot;
            int i13 = 0;
            while (true) {
                double[] dArr2 = sOurPercent;
                if (i13 >= dArr2.length) {
                    break;
                }
                dArr2[i13] = dArr2[i13] / dHypot;
                i13++;
            }
            int i14 = 0;
            while (true) {
                double[] dArr3 = this.mLut;
                if (i14 >= dArr3.length) {
                    return;
                }
                double length = ((double) i14) / ((double) (dArr3.length - 1));
                int iBinarySearch = Arrays.binarySearch(sOurPercent, length);
                if (iBinarySearch >= 0) {
                    this.mLut[i14] = ((double) iBinarySearch) / ((double) (sOurPercent.length - 1));
                } else if (iBinarySearch == -1) {
                    this.mLut[i14] = 0.0d;
                } else {
                    int i15 = -iBinarySearch;
                    int i16 = i15 - 2;
                    double[] dArr4 = sOurPercent;
                    double d19 = dArr4[i16];
                    this.mLut[i14] = (((double) i16) + ((length - d19) / (dArr4[i15 - 1] - d19))) / ((double) (dArr4.length - 1));
                }
                i14++;
            }
        }

        public double getDX() {
            double d11 = this.mEllipseA * this.mTmpCosAngle;
            double dHypot = this.mArcVelocity / Math.hypot(d11, (-this.mEllipseB) * this.mTmpSinAngle);
            return this.mVertical ? (-d11) * dHypot : d11 * dHypot;
        }

        public double getDY() {
            double d11 = this.mEllipseA * this.mTmpCosAngle;
            double d12 = (-this.mEllipseB) * this.mTmpSinAngle;
            double dHypot = this.mArcVelocity / Math.hypot(d11, d12);
            return this.mVertical ? (-d12) * dHypot : d12 * dHypot;
        }

        public double getLinearDX(double d11) {
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d11) {
            return this.mEllipseCenterY;
        }

        public double getLinearX(double d11) {
            double d12 = (d11 - this.mTime1) * this.mOneOverDeltaTime;
            double d13 = this.mX1;
            return d13 + (d12 * (this.mX2 - d13));
        }

        public double getLinearY(double d11) {
            double d12 = (d11 - this.mTime1) * this.mOneOverDeltaTime;
            double d13 = this.mY1;
            return d13 + (d12 * (this.mY2 - d13));
        }

        public double getX() {
            return this.mEllipseCenterX + (this.mEllipseA * this.mTmpSinAngle);
        }

        public double getY() {
            return this.mEllipseCenterY + (this.mEllipseB * this.mTmpCosAngle);
        }

        public double lookup(double d11) {
            if (d11 <= 0.0d) {
                return 0.0d;
            }
            if (d11 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = d11 * ((double) (dArr.length - 1));
            int i11 = (int) length;
            double d12 = length - ((double) i11);
            double d13 = dArr[i11];
            return d13 + (d12 * (dArr[i11 + 1] - d13));
        }

        public void setPoint(double d11) {
            double dLookup = lookup((this.mVertical ? this.mTime2 - d11 : d11 - this.mTime1) * this.mOneOverDeltaTime) * 1.5707963267948966d;
            this.mTmpSinAngle = Math.sin(dLookup);
            this.mTmpCosAngle = Math.cos(dLookup);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d11, double[] dArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d12 = arc.mTime1;
            if (d11 < d12) {
                double d13 = d11 - d12;
                if (arc.mLinear) {
                    dArr[0] = arc.getLinearX(d12) + (this.mArcs[0].getLinearDX(d12) * d13);
                    dArr[1] = this.mArcs[0].getLinearY(d12) + (d13 * this.mArcs[0].getLinearDY(d12));
                    return;
                } else {
                    arc.setPoint(d12);
                    dArr[0] = this.mArcs[0].getX() + (this.mArcs[0].getDX() * d13);
                    dArr[1] = this.mArcs[0].getY() + (d13 * this.mArcs[0].getDY());
                    return;
                }
            }
            if (d11 > arcArr[arcArr.length - 1].mTime2) {
                double d14 = arcArr[arcArr.length - 1].mTime2;
                double d15 = d11 - d14;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.mLinear) {
                    dArr[0] = arc2.getLinearX(d14) + (this.mArcs[length].getLinearDX(d14) * d15);
                    dArr[1] = this.mArcs[length].getLinearY(d14) + (d15 * this.mArcs[length].getLinearDY(d14));
                    return;
                } else {
                    arc2.setPoint(d11);
                    dArr[0] = this.mArcs[length].getX() + (this.mArcs[length].getDX() * d15);
                    dArr[1] = this.mArcs[length].getY() + (d15 * this.mArcs[length].getDY());
                    return;
                }
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d16 = arcArr2[0].mTime1;
            if (d11 < d16) {
                d11 = d16;
            }
            if (d11 > arcArr2[arcArr2.length - 1].mTime2) {
                d11 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i11 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i11 >= arcArr3.length) {
                return;
            }
            Arc arc3 = arcArr3[i11];
            if (d11 <= arc3.mTime2) {
                if (arc3.mLinear) {
                    dArr[0] = arc3.getLinearX(d11);
                    dArr[1] = this.mArcs[i11].getLinearY(d11);
                    return;
                } else {
                    arc3.setPoint(d11);
                    dArr[0] = this.mArcs[i11].getX();
                    dArr[1] = this.mArcs[i11].getY();
                    return;
                }
            }
            i11++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d11, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        double d12 = arcArr[0].mTime1;
        if (d11 < d12) {
            d11 = d12;
        } else if (d11 > arcArr[arcArr.length - 1].mTime2) {
            d11 = arcArr[arcArr.length - 1].mTime2;
        }
        int i11 = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i11 >= arcArr2.length) {
                return;
            }
            Arc arc = arcArr2[i11];
            if (d11 <= arc.mTime2) {
                if (arc.mLinear) {
                    dArr[0] = arc.getLinearDX(d11);
                    dArr[1] = this.mArcs[i11].getLinearDY(d11);
                    return;
                } else {
                    arc.setPoint(d11);
                    dArr[0] = this.mArcs[i11].getDX();
                    dArr[1] = this.mArcs[i11].getDY();
                    return;
                }
            }
            i11++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    public ArcCurveFit(int[] iArr, double[] dArr, double[][] dArr2) {
        this.mTime = dArr;
        this.mArcs = new Arc[dArr.length - 1];
        int i11 = 1;
        int i12 = 1;
        int i13 = 0;
        while (true) {
            Arc[] arcArr = this.mArcs;
            if (i13 >= arcArr.length) {
                return;
            }
            int i14 = iArr[i13];
            int i15 = 3;
            if (i14 != 0) {
                if (i14 == 1) {
                    i11 = 1;
                    i15 = i11;
                } else {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            i15 = 4;
                            if (i14 != 4) {
                                i15 = 5;
                                if (i14 != 5) {
                                    i15 = i12;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                i11 = 1;
                            }
                            i15 = i11;
                        }
                    }
                    i11 = 2;
                    i15 = i11;
                }
            }
            double d11 = dArr[i13];
            int i16 = i13 + 1;
            double d12 = dArr[i16];
            double[] dArr3 = dArr2[i13];
            double d13 = dArr3[0];
            double d14 = dArr3[1];
            double[] dArr4 = dArr2[i16];
            arcArr[i13] = new Arc(i15, d11, d12, d13, d14, dArr4[0], dArr4[1]);
            i13 = i16;
            i12 = i15;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mTime;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d11, int i11) {
        Arc[] arcArr = this.mArcs;
        int i12 = 0;
        double d12 = arcArr[0].mTime1;
        if (d11 < d12) {
            d11 = d12;
        }
        if (d11 > arcArr[arcArr.length - 1].mTime2) {
            d11 = arcArr[arcArr.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i12 >= arcArr2.length) {
                return Double.NaN;
            }
            Arc arc = arcArr2[i12];
            if (d11 <= arc.mTime2) {
                if (arc.mLinear) {
                    if (i11 == 0) {
                        return arc.getLinearDX(d11);
                    }
                    return arc.getLinearDY(d11);
                }
                arc.setPoint(d11);
                if (i11 == 0) {
                    return this.mArcs[i12].getDX();
                }
                return this.mArcs[i12].getDY();
            }
            i12++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d11, float[] fArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d12 = arc.mTime1;
            if (d11 < d12) {
                double d13 = d11 - d12;
                if (arc.mLinear) {
                    fArr[0] = (float) (arc.getLinearX(d12) + (this.mArcs[0].getLinearDX(d12) * d13));
                    fArr[1] = (float) (this.mArcs[0].getLinearY(d12) + (d13 * this.mArcs[0].getLinearDY(d12)));
                    return;
                } else {
                    arc.setPoint(d12);
                    fArr[0] = (float) (this.mArcs[0].getX() + (this.mArcs[0].getDX() * d13));
                    fArr[1] = (float) (this.mArcs[0].getY() + (d13 * this.mArcs[0].getDY()));
                    return;
                }
            }
            if (d11 > arcArr[arcArr.length - 1].mTime2) {
                double d14 = arcArr[arcArr.length - 1].mTime2;
                double d15 = d11 - d14;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.mLinear) {
                    fArr[0] = (float) (arc2.getLinearX(d14) + (this.mArcs[length].getLinearDX(d14) * d15));
                    fArr[1] = (float) (this.mArcs[length].getLinearY(d14) + (d15 * this.mArcs[length].getLinearDY(d14)));
                    return;
                } else {
                    arc2.setPoint(d11);
                    fArr[0] = (float) this.mArcs[length].getX();
                    fArr[1] = (float) this.mArcs[length].getY();
                    return;
                }
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d16 = arcArr2[0].mTime1;
            if (d11 < d16) {
                d11 = d16;
            } else if (d11 > arcArr2[arcArr2.length - 1].mTime2) {
                d11 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i11 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i11 >= arcArr3.length) {
                return;
            }
            Arc arc3 = arcArr3[i11];
            if (d11 <= arc3.mTime2) {
                if (arc3.mLinear) {
                    fArr[0] = (float) arc3.getLinearX(d11);
                    fArr[1] = (float) this.mArcs[i11].getLinearY(d11);
                    return;
                } else {
                    arc3.setPoint(d11);
                    fArr[0] = (float) this.mArcs[i11].getX();
                    fArr[1] = (float) this.mArcs[i11].getY();
                    return;
                }
            }
            i11++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d11, int i11) {
        double linearY;
        double linearDY;
        double y11;
        double dy2;
        double linearY2;
        double linearDY2;
        int i12 = 0;
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d12 = arc.mTime1;
            if (d11 < d12) {
                double d13 = d11 - d12;
                if (arc.mLinear) {
                    if (i11 == 0) {
                        linearY2 = arc.getLinearX(d12);
                        linearDY2 = this.mArcs[0].getLinearDX(d12);
                    } else {
                        linearY2 = arc.getLinearY(d12);
                        linearDY2 = this.mArcs[0].getLinearDY(d12);
                    }
                    return linearY2 + (d13 * linearDY2);
                }
                arc.setPoint(d12);
                if (i11 == 0) {
                    y11 = this.mArcs[0].getX();
                    dy2 = this.mArcs[0].getDX();
                } else {
                    y11 = this.mArcs[0].getY();
                    dy2 = this.mArcs[0].getDY();
                }
                return y11 + (d13 * dy2);
            }
            if (d11 > arcArr[arcArr.length - 1].mTime2) {
                double d14 = arcArr[arcArr.length - 1].mTime2;
                double d15 = d11 - d14;
                int length = arcArr.length - 1;
                if (i11 == 0) {
                    linearY = arcArr[length].getLinearX(d14);
                    linearDY = this.mArcs[length].getLinearDX(d14);
                } else {
                    linearY = arcArr[length].getLinearY(d14);
                    linearDY = this.mArcs[length].getLinearDY(d14);
                }
                return linearY + (d15 * linearDY);
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d16 = arcArr2[0].mTime1;
            if (d11 < d16) {
                d11 = d16;
            } else if (d11 > arcArr2[arcArr2.length - 1].mTime2) {
                d11 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i12 >= arcArr3.length) {
                return Double.NaN;
            }
            Arc arc2 = arcArr3[i12];
            if (d11 <= arc2.mTime2) {
                if (arc2.mLinear) {
                    if (i11 == 0) {
                        return arc2.getLinearX(d11);
                    }
                    return arc2.getLinearY(d11);
                }
                arc2.setPoint(d11);
                if (i11 == 0) {
                    return this.mArcs[i12].getX();
                }
                return this.mArcs[i12].getY();
            }
            i12++;
        }
    }
}
