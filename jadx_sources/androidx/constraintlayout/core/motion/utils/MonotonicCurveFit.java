package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes23.dex */
public class MonotonicCurveFit extends CurveFit {
    private static final String TAG = "MonotonicCurveFit";
    private boolean mExtrapolate = true;
    double[] mSlopeTemp;

    /* JADX INFO: renamed from: mT */
    private double[] f2192mT;
    private double[][] mTangent;

    /* JADX INFO: renamed from: mY */
    private double[][] f2193mY;

    public static MonotonicCurveFit buildWave(String str) {
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i11 = 0;
        while (iIndexOf2 != -1) {
            dArr[i11] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i11++;
        }
        dArr[i11] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        return buildWave(Arrays.copyOf(dArr, i11 + 1));
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d11, double[] dArr) {
        double[] dArr2 = this.f2192mT;
        int length = dArr2.length;
        int i11 = 0;
        int length2 = this.f2193mY[0].length;
        if (this.mExtrapolate) {
            double d12 = dArr2[0];
            if (d11 <= d12) {
                getSlope(d12, this.mSlopeTemp);
                for (int i12 = 0; i12 < length2; i12++) {
                    dArr[i12] = this.f2193mY[0][i12] + ((d11 - this.f2192mT[0]) * this.mSlopeTemp[i12]);
                }
                return;
            }
            int i13 = length - 1;
            double d13 = dArr2[i13];
            if (d11 >= d13) {
                getSlope(d13, this.mSlopeTemp);
                while (i11 < length2) {
                    dArr[i11] = this.f2193mY[i13][i11] + ((d11 - this.f2192mT[i13]) * this.mSlopeTemp[i11]);
                    i11++;
                }
                return;
            }
        } else {
            if (d11 <= dArr2[0]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    dArr[i14] = this.f2193mY[0][i14];
                }
                return;
            }
            int i15 = length - 1;
            if (d11 >= dArr2[i15]) {
                while (i11 < length2) {
                    dArr[i11] = this.f2193mY[i15][i11];
                    i11++;
                }
                return;
            }
        }
        int i16 = 0;
        while (i16 < length - 1) {
            if (d11 == this.f2192mT[i16]) {
                for (int i17 = 0; i17 < length2; i17++) {
                    dArr[i17] = this.f2193mY[i16][i17];
                }
            }
            double[] dArr3 = this.f2192mT;
            int i18 = i16 + 1;
            double d14 = dArr3[i18];
            if (d11 < d14) {
                double d15 = dArr3[i16];
                double d16 = d14 - d15;
                double d17 = (d11 - d15) / d16;
                while (i11 < length2) {
                    double[][] dArr4 = this.f2193mY;
                    double d18 = dArr4[i16][i11];
                    double d19 = dArr4[i18][i11];
                    double[][] dArr5 = this.mTangent;
                    dArr[i11] = interpolate(d16, d17, d18, d19, dArr5[i16][i11], dArr5[i18][i11]);
                    i11++;
                }
                return;
            }
            i16 = i18;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d11, double[] dArr) {
        double[] dArr2 = this.f2192mT;
        int length = dArr2.length;
        int length2 = this.f2193mY[0].length;
        double d12 = dArr2[0];
        if (d11 > d12) {
            d12 = dArr2[length - 1];
            if (d11 < d12) {
                d12 = d11;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            double[] dArr3 = this.f2192mT;
            int i12 = i11 + 1;
            double d13 = dArr3[i12];
            if (d12 <= d13) {
                double d14 = dArr3[i11];
                double d15 = d13 - d14;
                double d16 = (d12 - d14) / d15;
                for (int i13 = 0; i13 < length2; i13++) {
                    double[][] dArr4 = this.f2193mY;
                    double d17 = dArr4[i11][i13];
                    double d18 = dArr4[i12][i13];
                    double[][] dArr5 = this.mTangent;
                    dArr[i13] = diff(d15, d16, d17, d18, dArr5[i11][i13], dArr5[i12][i13]) / d15;
                }
                return;
            }
            i11 = i12;
        }
    }

    public MonotonicCurveFit(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.mSlopeTemp = new double[length2];
        int i11 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i11, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i12 = 0; i12 < length2; i12++) {
            int i13 = 0;
            while (i13 < i11) {
                int i14 = i13 + 1;
                double d11 = dArr[i14] - dArr[i13];
                double[] dArr5 = dArr3[i13];
                double d12 = (dArr2[i14][i12] - dArr2[i13][i12]) / d11;
                dArr5[i12] = d12;
                if (i13 == 0) {
                    dArr4[i13][i12] = d12;
                } else {
                    dArr4[i13][i12] = (dArr3[i13 - 1][i12] + d12) * 0.5d;
                }
                i13 = i14;
            }
            dArr4[i11][i12] = dArr3[length - 2][i12];
        }
        for (int i15 = 0; i15 < i11; i15++) {
            for (int i16 = 0; i16 < length2; i16++) {
                double d13 = dArr3[i15][i16];
                if (d13 == 0.0d) {
                    dArr4[i15][i16] = 0.0d;
                    dArr4[i15 + 1][i16] = 0.0d;
                } else {
                    double d14 = dArr4[i15][i16] / d13;
                    int i17 = i15 + 1;
                    double d15 = dArr4[i17][i16] / d13;
                    double dHypot = Math.hypot(d14, d15);
                    if (dHypot > 9.0d) {
                        double d16 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i15];
                        double[] dArr7 = dArr3[i15];
                        dArr6[i16] = d14 * d16 * dArr7[i16];
                        dArr4[i17][i16] = d16 * d15 * dArr7[i16];
                    }
                }
            }
        }
        this.f2192mT = dArr;
        this.f2193mY = dArr2;
        this.mTangent = dArr4;
    }

    private static double diff(double d11, double d12, double d13, double d14, double d15, double d16) {
        double d17 = d12 * d12;
        double d18 = d12 * 6.0d;
        double d19 = (((((-6.0d) * d17) * d14) + (d18 * d14)) + ((6.0d * d17) * d13)) - (d18 * d13);
        double d21 = 3.0d * d11;
        return ((((d19 + ((d21 * d16) * d17)) + ((d21 * d15) * d17)) - (((2.0d * d11) * d16) * d12)) - (((4.0d * d11) * d15) * d12)) + (d11 * d15);
    }

    private static double interpolate(double d11, double d12, double d13, double d14, double d15, double d16) {
        double d17 = d12 * d12;
        double d18 = d17 * d12;
        double d19 = 3.0d * d17;
        double d21 = ((((((-2.0d) * d18) * d14) + (d19 * d14)) + ((d18 * 2.0d) * d13)) - (d19 * d13)) + d13;
        double d22 = d11 * d16;
        double d23 = d11 * d15;
        return ((((d21 + (d22 * d18)) + (d18 * d23)) - (d22 * d17)) - (((d11 * 2.0d) * d15) * d17)) + (d23 * d12);
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.f2192mT;
    }

    private static MonotonicCurveFit buildWave(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d11 = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i11 = 0; i11 < dArr.length; i11++) {
            double d12 = dArr[i11];
            int i12 = i11 + length2;
            dArr2[i12][0] = d12;
            double d13 = ((double) i11) * d11;
            dArr3[i12] = d13;
            if (i11 > 0) {
                int i13 = (length2 * 2) + i11;
                dArr2[i13][0] = d12 + 1.0d;
                dArr3[i13] = d13 + 1.0d;
                int i14 = i11 - 1;
                dArr2[i14][0] = (d12 - 1.0d) - d11;
                dArr3[i14] = (d13 - 1.0d) - d11;
            }
        }
        return new MonotonicCurveFit(dArr3, dArr2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d11, int i11) {
        double[] dArr = this.f2192mT;
        int length = dArr.length;
        int i12 = 0;
        double d12 = dArr[0];
        if (d11 >= d12) {
            d12 = dArr[length - 1];
            if (d11 < d12) {
                d12 = d11;
            }
        }
        while (i12 < length - 1) {
            double[] dArr2 = this.f2192mT;
            int i13 = i12 + 1;
            double d13 = dArr2[i13];
            if (d12 <= d13) {
                double d14 = dArr2[i12];
                double d15 = d13 - d14;
                double[][] dArr3 = this.f2193mY;
                double d16 = dArr3[i12][i11];
                double d17 = dArr3[i13][i11];
                double[][] dArr4 = this.mTangent;
                return diff(d15, (d12 - d14) / d15, d16, d17, dArr4[i12][i11], dArr4[i13][i11]) / d15;
            }
            i12 = i13;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d11, float[] fArr) {
        double[] dArr = this.f2192mT;
        int length = dArr.length;
        int i11 = 0;
        int length2 = this.f2193mY[0].length;
        if (this.mExtrapolate) {
            double d12 = dArr[0];
            if (d11 <= d12) {
                getSlope(d12, this.mSlopeTemp);
                for (int i12 = 0; i12 < length2; i12++) {
                    fArr[i12] = (float) (this.f2193mY[0][i12] + ((d11 - this.f2192mT[0]) * this.mSlopeTemp[i12]));
                }
                return;
            }
            int i13 = length - 1;
            double d13 = dArr[i13];
            if (d11 >= d13) {
                getSlope(d13, this.mSlopeTemp);
                while (i11 < length2) {
                    fArr[i11] = (float) (this.f2193mY[i13][i11] + ((d11 - this.f2192mT[i13]) * this.mSlopeTemp[i11]));
                    i11++;
                }
                return;
            }
        } else {
            if (d11 <= dArr[0]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    fArr[i14] = (float) this.f2193mY[0][i14];
                }
                return;
            }
            int i15 = length - 1;
            if (d11 >= dArr[i15]) {
                while (i11 < length2) {
                    fArr[i11] = (float) this.f2193mY[i15][i11];
                    i11++;
                }
                return;
            }
        }
        int i16 = 0;
        while (i16 < length - 1) {
            if (d11 == this.f2192mT[i16]) {
                for (int i17 = 0; i17 < length2; i17++) {
                    fArr[i17] = (float) this.f2193mY[i16][i17];
                }
            }
            double[] dArr2 = this.f2192mT;
            int i18 = i16 + 1;
            double d14 = dArr2[i18];
            if (d11 < d14) {
                double d15 = dArr2[i16];
                double d16 = d14 - d15;
                double d17 = (d11 - d15) / d16;
                while (i11 < length2) {
                    double[][] dArr3 = this.f2193mY;
                    double d18 = dArr3[i16][i11];
                    double d19 = dArr3[i18][i11];
                    double[][] dArr4 = this.mTangent;
                    fArr[i11] = (float) interpolate(d16, d17, d18, d19, dArr4[i16][i11], dArr4[i18][i11]);
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
        double[] dArr = this.f2192mT;
        int length = dArr.length;
        int i12 = 0;
        if (this.mExtrapolate) {
            double d14 = dArr[0];
            if (d11 <= d14) {
                d12 = this.f2193mY[0][i11];
                d13 = d11 - d14;
                slope = getSlope(d14, i11);
            } else {
                int i13 = length - 1;
                double d15 = dArr[i13];
                if (d11 >= d15) {
                    d12 = this.f2193mY[i13][i11];
                    d13 = d11 - d15;
                    slope = getSlope(d15, i11);
                }
            }
            return d12 + (d13 * slope);
        }
        if (d11 <= dArr[0]) {
            return this.f2193mY[0][i11];
        }
        int i14 = length - 1;
        if (d11 >= dArr[i14]) {
            return this.f2193mY[i14][i11];
        }
        while (i12 < length - 1) {
            double[] dArr2 = this.f2192mT;
            double d16 = dArr2[i12];
            if (d11 == d16) {
                return this.f2193mY[i12][i11];
            }
            int i15 = i12 + 1;
            double d17 = dArr2[i15];
            if (d11 < d17) {
                double d18 = d17 - d16;
                double d19 = (d11 - d16) / d18;
                double[][] dArr3 = this.f2193mY;
                double d21 = dArr3[i12][i11];
                double d22 = dArr3[i15][i11];
                double[][] dArr4 = this.mTangent;
                return interpolate(d18, d19, d21, d22, dArr4[i12][i11], dArr4[i15][i11]);
            }
            i12 = i15;
        }
        return 0.0d;
    }
}
