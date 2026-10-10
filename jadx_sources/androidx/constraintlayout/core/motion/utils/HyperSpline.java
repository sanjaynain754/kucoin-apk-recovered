package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes23.dex */
public class HyperSpline {
    double[][] mCtl;
    Cubic[][] mCurve;
    double[] mCurveLength;
    int mDimensionality;
    int mPoints;
    double mTotalLength;

    public static class Cubic {

        /* JADX INFO: renamed from: mA */
        double f2186mA;

        /* JADX INFO: renamed from: mB */
        double f2187mB;

        /* JADX INFO: renamed from: mC */
        double f2188mC;

        /* JADX INFO: renamed from: mD */
        double f2189mD;

        public double eval(double d11) {
            return (((((this.f2189mD * d11) + this.f2188mC) * d11) + this.f2187mB) * d11) + this.f2186mA;
        }

        public double vel(double d11) {
            return (((this.f2189mD * 3.0d * d11) + (this.f2188mC * 2.0d)) * d11) + this.f2187mB;
        }

        public Cubic(double d11, double d12, double d13, double d14) {
            this.f2186mA = d11;
            this.f2187mB = d12;
            this.f2188mC = d13;
            this.f2189mD = d14;
        }
    }

    public HyperSpline(double[][] dArr) {
        setup(dArr);
    }

    public void getPos(double d11, double[] dArr) {
        double d12 = d11 * this.mTotalLength;
        int i11 = 0;
        while (true) {
            double[] dArr2 = this.mCurveLength;
            if (i11 >= dArr2.length - 1) {
                break;
            }
            double d13 = dArr2[i11];
            if (d13 >= d12) {
                break;
            }
            d12 -= d13;
            i11++;
        }
        for (int i12 = 0; i12 < dArr.length; i12++) {
            dArr[i12] = this.mCurve[i12][i11].eval(d12 / this.mCurveLength[i11]);
        }
    }

    public void setup(double[][] dArr) {
        int i11;
        int length = dArr[0].length;
        this.mDimensionality = length;
        int length2 = dArr.length;
        this.mPoints = length2;
        this.mCtl = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        this.mCurve = new Cubic[this.mDimensionality][];
        for (int i12 = 0; i12 < this.mDimensionality; i12++) {
            for (int i13 = 0; i13 < this.mPoints; i13++) {
                this.mCtl[i12][i13] = dArr[i13][i12];
            }
        }
        int i14 = 0;
        while (true) {
            i11 = this.mDimensionality;
            if (i14 >= i11) {
                break;
            }
            Cubic[][] cubicArr = this.mCurve;
            double[] dArr2 = this.mCtl[i14];
            cubicArr[i14] = calcNaturalCubic(dArr2.length, dArr2);
            i14++;
        }
        this.mCurveLength = new double[this.mPoints - 1];
        this.mTotalLength = 0.0d;
        Cubic[] cubicArr2 = new Cubic[i11];
        for (int i15 = 0; i15 < this.mCurveLength.length; i15++) {
            for (int i16 = 0; i16 < this.mDimensionality; i16++) {
                cubicArr2[i16] = this.mCurve[i16][i15];
            }
            double d11 = this.mTotalLength;
            double[] dArr3 = this.mCurveLength;
            double dApproxLength = approxLength(cubicArr2);
            dArr3[i15] = dApproxLength;
            this.mTotalLength = d11 + dApproxLength;
        }
    }

    public static Cubic[] calcNaturalCubic(int i11, double[] dArr) {
        double[] dArr2 = new double[i11];
        double[] dArr3 = new double[i11];
        double[] dArr4 = new double[i11];
        int i12 = i11 - 1;
        int i13 = 0;
        dArr2[0] = 0.5d;
        int i14 = 1;
        for (int i15 = 1; i15 < i12; i15++) {
            dArr2[i15] = 1.0d / (4.0d - dArr2[i15 - 1]);
        }
        int i16 = i11 - 2;
        dArr2[i12] = 1.0d / (2.0d - dArr2[i16]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i14 < i12) {
            int i17 = i14 + 1;
            int i18 = i14 - 1;
            dArr3[i14] = (((dArr[i17] - dArr[i18]) * 3.0d) - dArr3[i18]) * dArr2[i14];
            i14 = i17;
        }
        double d11 = (((dArr[i12] - dArr[i16]) * 3.0d) - dArr3[i16]) * dArr2[i12];
        dArr3[i12] = d11;
        dArr4[i12] = d11;
        while (i16 >= 0) {
            dArr4[i16] = dArr3[i16] - (dArr2[i16] * dArr4[i16 + 1]);
            i16--;
        }
        Cubic[] cubicArr = new Cubic[i12];
        while (i13 < i12) {
            double d12 = dArr[i13];
            double d13 = dArr4[i13];
            int i19 = i13 + 1;
            double d14 = dArr[i19];
            double d15 = dArr4[i19];
            cubicArr[i13] = new Cubic((float) d12, d13, (((d14 - d12) * 3.0d) - (d13 * 2.0d)) - d15, ((d12 - d14) * 2.0d) + d13 + d15);
            i13 = i19;
        }
        return cubicArr;
    }

    public double approxLength(Cubic[] cubicArr) {
        int i11;
        int length = cubicArr.length;
        double[] dArr = new double[length];
        double d11 = 0.0d;
        double d12 = 0.0d;
        double dSqrt = 0.0d;
        while (true) {
            i11 = 0;
            if (d12 >= 1.0d) {
                break;
            }
            double d13 = 0.0d;
            while (i11 < length) {
                double d14 = dArr[i11];
                double dEval = cubicArr[i11].eval(d12);
                dArr[i11] = dEval;
                double d15 = d14 - dEval;
                d13 += d15 * d15;
                i11++;
            }
            if (d12 > 0.0d) {
                dSqrt += Math.sqrt(d13);
            }
            d12 += 0.1d;
        }
        while (i11 < length) {
            double d16 = dArr[i11];
            double dEval2 = cubicArr[i11].eval(1.0d);
            dArr[i11] = dEval2;
            double d17 = d16 - dEval2;
            d11 += d17 * d17;
            i11++;
        }
        return dSqrt + Math.sqrt(d11);
    }

    public void getVelocity(double d11, double[] dArr) {
        double d12 = d11 * this.mTotalLength;
        int i11 = 0;
        while (true) {
            double[] dArr2 = this.mCurveLength;
            if (i11 >= dArr2.length - 1) {
                break;
            }
            double d13 = dArr2[i11];
            if (d13 >= d12) {
                break;
            }
            d12 -= d13;
            i11++;
        }
        for (int i12 = 0; i12 < dArr.length; i12++) {
            dArr[i12] = this.mCurve[i12][i11].vel(d12 / this.mCurveLength[i11]);
        }
    }

    public HyperSpline() {
    }

    public void getPos(double d11, float[] fArr) {
        double d12 = d11 * this.mTotalLength;
        int i11 = 0;
        while (true) {
            double[] dArr = this.mCurveLength;
            if (i11 >= dArr.length - 1) {
                break;
            }
            double d13 = dArr[i11];
            if (d13 >= d12) {
                break;
            }
            d12 -= d13;
            i11++;
        }
        for (int i12 = 0; i12 < fArr.length; i12++) {
            fArr[i12] = (float) this.mCurve[i12][i11].eval(d12 / this.mCurveLength[i11]);
        }
    }

    public double getPos(double d11, int i11) {
        double[] dArr;
        double d12 = d11 * this.mTotalLength;
        int i12 = 0;
        while (true) {
            dArr = this.mCurveLength;
            if (i12 >= dArr.length - 1) {
                break;
            }
            double d13 = dArr[i12];
            if (d13 >= d12) {
                break;
            }
            d12 -= d13;
            i12++;
        }
        return this.mCurve[i11][i12].eval(d12 / dArr[i12]);
    }
}
