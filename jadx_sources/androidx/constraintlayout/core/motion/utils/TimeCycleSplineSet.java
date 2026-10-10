package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes23.dex */
public abstract class TimeCycleSplineSet {
    protected static final int CURVE_OFFSET = 2;
    protected static final int CURVE_PERIOD = 1;
    protected static final int CURVE_VALUE = 0;
    private static final String TAG = "SplineSet";
    protected static float sVal2PI = 6.2831855f;
    protected int mCount;
    protected CurveFit mCurveFit;
    protected long mLastTime;
    protected String mType;
    protected int mWaveShape = 0;
    protected int[] mTimePoints = new int[10];
    protected float[][] mValues = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
    protected float[] mCache = new float[3];
    protected boolean mContinue = false;
    protected float mLastCycle = Float.NaN;

    public static class CustomSet extends TimeCycleSplineSet {
        String mAttributeName;
        KeyFrameArray.CustomArray mConstraintAttributeList;
        float[] mCustomCache;
        float[] mTempValues;
        KeyFrameArray.FloatArray mWaveProperties = new KeyFrameArray.FloatArray();

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i11, float f11, float f12, int i12, float f13) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void setPoint(int i11, CustomAttribute customAttribute, float f11, int i12, float f12) {
            this.mConstraintAttributeList.append(i11, customAttribute);
            this.mWaveProperties.append(i11, new float[]{f11, f12});
            this.mWaveShape = Math.max(this.mWaveShape, i12);
        }

        public boolean setProperty(MotionWidget motionWidget, float f11, long j11, KeyCache keyCache) {
            this.mCurveFit.getPos(f11, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            long j12 = j11 - this.mLastTime;
            if (Float.isNaN(this.mLastCycle)) {
                float floatValue = keyCache.getFloatValue(motionWidget, this.mAttributeName, 0);
                this.mLastCycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.mLastCycle = 0.0f;
                }
            }
            float f14 = (float) ((((double) this.mLastCycle) + ((j12 * 1.0E-9d) * ((double) f12))) % 1.0d);
            this.mLastCycle = f14;
            this.mLastTime = j11;
            float fCalcWave = calcWave(f14);
            this.mContinue = false;
            int i11 = 0;
            while (true) {
                float[] fArr2 = this.mCustomCache;
                if (i11 >= fArr2.length) {
                    break;
                }
                boolean z11 = this.mContinue;
                float f15 = this.mTempValues[i11];
                this.mContinue = z11 | (((double) f15) != 0.0d);
                fArr2[i11] = (f15 * fCalcWave) + f13;
                i11++;
            }
            motionWidget.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), this.mCustomCache);
            if (f12 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i11) {
            int size = this.mConstraintAttributeList.size();
            int iNumberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i12 = iNumberOfInterpolatedValues + 2;
            this.mTempValues = new float[i12];
            this.mCustomCache = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i12);
            for (int i13 = 0; i13 < size; i13++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i13);
                CustomAttribute customAttributeValueAt = this.mConstraintAttributeList.valueAt(i13);
                float[] fArrValueAt = this.mWaveProperties.valueAt(i13);
                dArr[i13] = ((double) iKeyAt) * 0.01d;
                customAttributeValueAt.getValuesToInterpolate(this.mTempValues);
                int i14 = 0;
                while (true) {
                    float[] fArr = this.mTempValues;
                    if (i14 < fArr.length) {
                        dArr2[i13][i14] = fArr[i14];
                        i14++;
                    }
                }
                double[] dArr3 = dArr2[i13];
                dArr3[iNumberOfInterpolatedValues] = fArrValueAt[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArrValueAt[1];
            }
            this.mCurveFit = CurveFit.get(i11, dArr, dArr2);
        }

        public CustomSet(String str, KeyFrameArray.CustomArray customArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customArray;
        }
    }

    public static class CustomVarSet extends TimeCycleSplineSet {
        String mAttributeName;
        KeyFrameArray.CustomVar mConstraintAttributeList;
        float[] mCustomCache;
        float[] mTempValues;
        KeyFrameArray.FloatArray mWaveProperties = new KeyFrameArray.FloatArray();

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i11, float f11, float f12, int i12, float f13) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void setPoint(int i11, CustomVariable customVariable, float f11, int i12, float f12) {
            this.mConstraintAttributeList.append(i11, customVariable);
            this.mWaveProperties.append(i11, new float[]{f11, f12});
            this.mWaveShape = Math.max(this.mWaveShape, i12);
        }

        public boolean setProperty(MotionWidget motionWidget, float f11, long j11, KeyCache keyCache) {
            this.mCurveFit.getPos(f11, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            long j12 = j11 - this.mLastTime;
            if (Float.isNaN(this.mLastCycle)) {
                float floatValue = keyCache.getFloatValue(motionWidget, this.mAttributeName, 0);
                this.mLastCycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.mLastCycle = 0.0f;
                }
            }
            float f14 = (float) ((((double) this.mLastCycle) + ((j12 * 1.0E-9d) * ((double) f12))) % 1.0d);
            this.mLastCycle = f14;
            this.mLastTime = j11;
            float fCalcWave = calcWave(f14);
            this.mContinue = false;
            int i11 = 0;
            while (true) {
                float[] fArr2 = this.mCustomCache;
                if (i11 >= fArr2.length) {
                    break;
                }
                boolean z11 = this.mContinue;
                float f15 = this.mTempValues[i11];
                this.mContinue = z11 | (((double) f15) != 0.0d);
                fArr2[i11] = (f15 * fCalcWave) + f13;
                i11++;
            }
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(motionWidget, this.mCustomCache);
            if (f12 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i11) {
            int size = this.mConstraintAttributeList.size();
            int iNumberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i12 = iNumberOfInterpolatedValues + 2;
            this.mTempValues = new float[i12];
            this.mCustomCache = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i12);
            for (int i13 = 0; i13 < size; i13++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i13);
                CustomVariable customVariableValueAt = this.mConstraintAttributeList.valueAt(i13);
                float[] fArrValueAt = this.mWaveProperties.valueAt(i13);
                dArr[i13] = ((double) iKeyAt) * 0.01d;
                customVariableValueAt.getValuesToInterpolate(this.mTempValues);
                int i14 = 0;
                while (true) {
                    float[] fArr = this.mTempValues;
                    if (i14 < fArr.length) {
                        dArr2[i13][i14] = fArr[i14];
                        i14++;
                    }
                }
                double[] dArr3 = dArr2[i13];
                dArr3[iNumberOfInterpolatedValues] = fArrValueAt[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArrValueAt[1];
            }
            this.mCurveFit = CurveFit.get(i11, dArr, dArr2);
        }

        public CustomVarSet(String str, KeyFrameArray.CustomVar customVar) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customVar;
        }
    }

    public static class Sort {
        public static void doubleQuickSort(int[] iArr, float[][] fArr, int i11, int i12) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i12;
            iArr2[1] = i11;
            int i13 = 2;
            while (i13 > 0) {
                int i14 = iArr2[i13 - 1];
                int i15 = i13 - 2;
                int i16 = iArr2[i15];
                if (i14 < i16) {
                    int iPartition = partition(iArr, fArr, i14, i16);
                    iArr2[i15] = iPartition - 1;
                    iArr2[i13 - 1] = i14;
                    int i17 = i13 + 1;
                    iArr2[i13] = i16;
                    i13 += 2;
                    iArr2[i17] = iPartition + 1;
                } else {
                    i13 = i15;
                }
            }
        }

        private static int partition(int[] iArr, float[][] fArr, int i11, int i12) {
            int i13 = iArr[i12];
            int i14 = i11;
            while (i11 < i12) {
                if (iArr[i11] <= i13) {
                    swap(iArr, fArr, i14, i11);
                    i14++;
                }
                i11++;
            }
            swap(iArr, fArr, i14, i12);
            return i14;
        }

        private static void swap(int[] iArr, float[][] fArr, int i11, int i12) {
            int i13 = iArr[i11];
            iArr[i11] = iArr[i12];
            iArr[i12] = i13;
            float[] fArr2 = fArr[i11];
            fArr[i11] = fArr[i12];
            fArr[i12] = fArr2;
        }
    }

    public float calcWave(float f11) {
        float fAbs;
        switch (this.mWaveShape) {
            case 1:
                return Math.signum(f11 * sVal2PI);
            case 2:
                fAbs = Math.abs(f11);
                break;
            case 3:
                return (((f11 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f11 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f11 * sVal2PI);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f11 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f11 * sVal2PI);
        }
        return 1.0f - fAbs;
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public void setPoint(int i11, float f11, float f12, int i12, float f13) {
        int[] iArr = this.mTimePoints;
        int i13 = this.mCount;
        iArr[i13] = i11;
        float[] fArr = this.mValues[i13];
        fArr[0] = f11;
        fArr[1] = f12;
        fArr[2] = f13;
        this.mWaveShape = Math.max(this.mWaveShape, i12);
        this.mCount++;
    }

    public void setStartTime(long j11) {
        this.mLastTime = j11;
    }

    public void setType(String str) {
        this.mType = str;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    public void setup(int i11) {
        int i12 = this.mCount;
        if (i12 == 0) {
            System.err.println("Error no points added to " + this.mType);
            return;
        }
        Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i12 - 1);
        int i13 = 1;
        int i14 = 0;
        while (true) {
            int[] iArr = this.mTimePoints;
            if (i13 >= iArr.length) {
                break;
            }
            if (iArr[i13] != iArr[i13 - 1]) {
                i14++;
            }
            i13++;
        }
        if (i14 == 0) {
            i14 = 1;
        }
        double[] dArr = new double[i14];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i14, 3);
        int i15 = 0;
        for (int i16 = 0; i16 < this.mCount; i16++) {
            if (i16 > 0) {
                int[] iArr2 = this.mTimePoints;
                if (iArr2[i16] != iArr2[i16 - 1]) {
                    dArr[i15] = ((double) this.mTimePoints[i16]) * 0.01d;
                    double[] dArr3 = dArr2[i15];
                    float[] fArr = this.mValues[i16];
                    dArr3[0] = fArr[0];
                    dArr3[1] = fArr[1];
                    dArr3[2] = fArr[2];
                    i15++;
                }
            } else {
                dArr[i15] = ((double) this.mTimePoints[i16]) * 0.01d;
                double[] dArr4 = dArr2[i15];
                float[] fArr2 = this.mValues[i16];
                dArr4[0] = fArr2[0];
                dArr4[1] = fArr2[1];
                dArr4[2] = fArr2[2];
                i15++;
            }
        }
        this.mCurveFit = CurveFit.get(i11, dArr, dArr2);
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i11 = 0; i11 < this.mCount; i11++) {
            str = str + "[" + this.mTimePoints[i11] + " , " + decimalFormat.format(this.mValues[i11]) + "] ";
        }
        return str;
    }
}
