package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes23.dex */
public class LinearCurveFit extends CurveFit {
    private static final String TAG = "LinearCurveFit";
    private boolean mExtrapolate = true;
    double[] mSlopeTemp;

    /* JADX INFO: renamed from: mT */
    private double[] f2190mT;
    private double mTotalLength;

    /* JADX INFO: renamed from: mY */
    private double[][] f2191mY;

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d11, double[] dArr) {
        double[] dArr2 = this.f2190mT;
        int length = dArr2.length;
        int i11 = 0;
        int length2 = this.f2191mY[0].length;
        if (this.mExtrapolate) {
            double d12 = dArr2[0];
            if (d11 <= d12) {
                getSlope(d12, this.mSlopeTemp);
                for (int i12 = 0; i12 < length2; i12++) {
                    dArr[i12] = this.f2191mY[0][i12] + ((d11 - this.f2190mT[0]) * this.mSlopeTemp[i12]);
                }
                return;
            }
            int i13 = length - 1;
            double d13 = dArr2[i13];
            if (d11 >= d13) {
                getSlope(d13, this.mSlopeTemp);
                while (i11 < length2) {
                    dArr[i11] = this.f2191mY[i13][i11] + ((d11 - this.f2190mT[i13]) * this.mSlopeTemp[i11]);
                    i11++;
                }
                return;
            }
        } else {
            if (d11 <= dArr2[0]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    dArr[i14] = this.f2191mY[0][i14];
                }
                return;
            }
            int i15 = length - 1;
            if (d11 >= dArr2[i15]) {
                while (i11 < length2) {
                    dArr[i11] = this.f2191mY[i15][i11];
                    i11++;
                }
                return;
            }
        }
        int i16 = 0;
        while (i16 < length - 1) {
            if (d11 == this.f2190mT[i16]) {
                for (int i17 = 0; i17 < length2; i17++) {
                    dArr[i17] = this.f2191mY[i16][i17];
                }
            }
            double[] dArr3 = this.f2190mT;
            int i18 = i16 + 1;
            double d14 = dArr3[i18];
            if (d11 < d14) {
                double d15 = dArr3[i16];
                double d16 = (d11 - d15) / (d14 - d15);
                while (i11 < length2) {
                    double[][] dArr4 = this.f2191mY;
                    dArr[i11] = (dArr4[i16][i11] * (1.0d - d16)) + (dArr4[i18][i11] * d16);
                    i11++;
                }
                return;
            }
            i16 = i18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000f A[PHI: r4
      0x000f: PHI (r4v5 double) = (r4v0 double), (r4v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d11, double[] dArr) {
        double[] dArr2 = this.f2190mT;
        int length = dArr2.length;
        int length2 = this.f2191mY[0].length;
        double d12 = dArr2[0];
        if (d11 <= d12) {
            d11 = d12;
        } else {
            d12 = dArr2[length - 1];
            if (d11 >= d12) {
                d11 = d12;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            double[] dArr3 = this.f2190mT;
            int i12 = i11 + 1;
            double d13 = dArr3[i12];
            if (d11 <= d13) {
                double d14 = d13 - dArr3[i11];
                for (int i13 = 0; i13 < length2; i13++) {
                    double[][] dArr4 = this.f2191mY;
                    dArr[i13] = (dArr4[i12][i13] - dArr4[i11][i13]) / d14;
                }
                return;
            }
            i11 = i12;
        }
    }

    private double getLength2D(double d11) {
        if (Double.isNaN(this.mTotalLength)) {
            return 0.0d;
        }
        double[] dArr = this.f2190mT;
        int length = dArr.length;
        if (d11 <= dArr[0]) {
            return 0.0d;
        }
        int i11 = length - 1;
        if (d11 >= dArr[i11]) {
            return this.mTotalLength;
        }
        double dHypot = 0.0d;
        double d12 = 0.0d;
        double d13 = 0.0d;
        int i12 = 0;
        while (i12 < i11) {
            double[] dArr2 = this.f2191mY[i12];
            double d14 = dArr2[0];
            double d15 = dArr2[1];
            if (i12 > 0) {
                dHypot += Math.hypot(d14 - d12, d15 - d13);
            }
            double[] dArr3 = this.f2190mT;
            double d16 = dArr3[i12];
            if (d11 == d16) {
                return dHypot;
            }
            int i13 = i12 + 1;
            double d17 = dArr3[i13];
            if (d11 < d17) {
                double d18 = (d11 - d16) / (d17 - d16);
                double[][] dArr4 = this.f2191mY;
                double[] dArr5 = dArr4[i12];
                double d19 = dArr5[0];
                double[] dArr6 = dArr4[i13];
                double d21 = 1.0d - d18;
                return dHypot + Math.hypot(d15 - ((dArr5[1] * d21) + (dArr6[1] * d18)), d14 - ((d19 * d21) + (dArr6[0] * d18)));
            }
            i12 = i13;
            d12 = d14;
            d13 = d15;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.f2190mT;
    }

    public LinearCurveFit(double[] dArr, double[][] dArr2) {
        this.mTotalLength = Double.NaN;
        int length = dArr2[0].length;
        this.mSlopeTemp = new double[length];
        this.f2190mT = dArr;
        this.f2191mY = dArr2;
        if (length > 2) {
            int i11 = 0;
            double d11 = 0.0d;
            while (true) {
                double d12 = d11;
                if (i11 < dArr.length) {
                    double d13 = dArr2[i11][0];
                    if (i11 > 0) {
                        Math.hypot(d13 - d11, d13 - d12);
                    }
                    i11++;
                    d11 = d13;
                } else {
                    this.mTotalLength = 0.0d;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v4 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d11, int i11) {
        double[] dArr = this.f2190mT;
        int length = dArr.length;
        int i12 = 0;
        double d12 = dArr[0];
        if (d11 < d12) {
            d11 = d12;
        } else {
            d12 = dArr[length - 1];
            if (d11 >= d12) {
                d11 = d12;
            }
        }
        while (i12 < length - 1) {
            double[] dArr2 = this.f2190mT;
            int i13 = i12 + 1;
            double d13 = dArr2[i13];
            if (d11 <= d13) {
                double d14 = d13 - dArr2[i12];
                double[][] dArr3 = this.f2191mY;
                return (dArr3[i13][i11] - dArr3[i12][i11]) / d14;
            }
            i12 = i13;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d11, float[] fArr) {
        double[] dArr = this.f2190mT;
        int length = dArr.length;
        int i11 = 0;
        int length2 = this.f2191mY[0].length;
        if (this.mExtrapolate) {
            double d12 = dArr[0];
            if (d11 <= d12) {
                getSlope(d12, this.mSlopeTemp);
                for (int i12 = 0; i12 < length2; i12++) {
                    fArr[i12] = (float) (this.f2191mY[0][i12] + ((d11 - this.f2190mT[0]) * this.mSlopeTemp[i12]));
                }
                return;
            }
            int i13 = length - 1;
            double d13 = dArr[i13];
            if (d11 >= d13) {
                getSlope(d13, this.mSlopeTemp);
                while (i11 < length2) {
                    fArr[i11] = (float) (this.f2191mY[i13][i11] + ((d11 - this.f2190mT[i13]) * this.mSlopeTemp[i11]));
                    i11++;
                }
                return;
            }
        } else {
            if (d11 <= dArr[0]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    fArr[i14] = (float) this.f2191mY[0][i14];
                }
                return;
            }
            int i15 = length - 1;
            if (d11 >= dArr[i15]) {
                while (i11 < length2) {
                    fArr[i11] = (float) this.f2191mY[i15][i11];
                    i11++;
                }
                return;
            }
        }
        int i16 = 0;
        while (i16 < length - 1) {
            if (d11 == this.f2190mT[i16]) {
                for (int i17 = 0; i17 < length2; i17++) {
                    fArr[i17] = (float) this.f2191mY[i16][i17];
                }
            }
            double[] dArr2 = this.f2190mT;
            int i18 = i16 + 1;
            double d14 = dArr2[i18];
            if (d11 < d14) {
                double d15 = dArr2[i16];
                double d16 = (d11 - d15) / (d14 - d15);
                while (i11 < length2) {
                    double[][] dArr3 = this.f2191mY;
                    fArr[i11] = (float) ((dArr3[i16][i11] * (1.0d - d16)) + (dArr3[i18][i11] * d16));
                    i11++;
                }
                return;
            }
            i16 = i18;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d11, int i11) {
        double d12;
        double d13;
        double slope;
        double[] dArr = this.f2190mT;
        int length = dArr.length;
        int i12 = 0;
        if (this.mExtrapolate) {
            double d14 = dArr[0];
            if (d11 <= d14) {
                d12 = this.f2191mY[0][i11];
                d13 = d11 - d14;
                slope = getSlope(d14, i11);
            } else {
                int i13 = length - 1;
                double d15 = dArr[i13];
                if (d11 >= d15) {
                    d12 = this.f2191mY[i13][i11];
                    d13 = d11 - d15;
                    slope = getSlope(d15, i11);
                }
            }
            return d12 + (d13 * slope);
        }
        if (d11 <= dArr[0]) {
            return this.f2191mY[0][i11];
        }
        int i14 = length - 1;
        if (d11 >= dArr[i14]) {
            return this.f2191mY[i14][i11];
        }
        while (i12 < length - 1) {
            double[] dArr2 = this.f2190mT;
            double d16 = dArr2[i12];
            if (d11 == d16) {
                return this.f2191mY[i12][i11];
            }
            int i15 = i12 + 1;
            double d17 = dArr2[i15];
            if (d11 < d17) {
                double d18 = (d11 - d16) / (d17 - d16);
                double[][] dArr3 = this.f2191mY;
                return (dArr3[i12][i11] * (1.0d - d18)) + (dArr3[i15][i11] * d18);
            }
            i12 = i15;
        }
        return 0.0d;
    }
}
