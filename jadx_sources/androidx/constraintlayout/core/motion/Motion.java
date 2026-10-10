package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.MotionKey;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.core.motion.utils.ViewState;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes23.dex */
public class Motion implements TypedValues {
    static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final int INTERPOLATOR_UNDEFINED = -3;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    private static final int SPLINE_STRING = -1;
    private static final String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    private CurveFit mArcSpline;
    private int[] mAttributeInterpolatorCount;
    private String[] mAttributeNames;
    String[] mAttributeTable;
    private HashMap<String, SplineSet> mAttributesMap;
    String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private HashMap<String, KeyCycleOscillator> mCycleMap;
    public String mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private MotionKeyTrigger[] mKeyTriggers;
    Motion mRelativeMotion;
    private CurveFit[] mSpline;
    private HashMap<String, TimeCycleSplineSet> mTimeCycleAttributesMap;
    MotionWidget mView;
    Rect mTempRect = new Rect();
    private int mCurveFitType = 0;
    private MotionPaths mStartMotionPath = new MotionPaths();
    private MotionPaths mEndMotionPath = new MotionPaths();
    private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    float mMotionStagger = Float.NaN;
    float mStaggerOffset = 0.0f;
    float mStaggerScale = 1.0f;
    private int mMaxDimension = 4;
    private float[] mValuesBuff = new float[4];
    private ArrayList<MotionPaths> mMotionPaths = new ArrayList<>();
    private float[] mVelocity = new float[1];
    private ArrayList<MotionKey> mKeyList = new ArrayList<>();
    private int mPathMotionArc = -1;
    private int mTransformPivotTarget = -1;
    private MotionWidget mTransformPivotView = null;
    private int mQuantizeMotionSteps = -1;
    private float mQuantizeMotionPhase = Float.NaN;
    private DifferentialInterpolator mQuantizeMotionInterpolator = null;
    private boolean mNoMovement = false;

    private float getAdjustedPosition(float f11, float[] fArr) {
        float f12 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f13 = this.mStaggerScale;
            if (f13 != 1.0d) {
                float f14 = this.mStaggerOffset;
                if (f11 < f14) {
                    f11 = 0.0f;
                }
                if (f11 > f14 && f11 < 1.0d) {
                    f11 = Math.min((f11 - f14) * f13, 1.0f);
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        float f15 = Float.NaN;
        for (MotionPaths motionPaths : this.mMotionPaths) {
            Easing easing2 = motionPaths.mKeyFrameEasing;
            if (easing2 != null) {
                float f16 = motionPaths.mTime;
                if (f16 < f11) {
                    easing = easing2;
                    f12 = f16;
                } else if (Float.isNaN(f15)) {
                    f15 = motionPaths.mTime;
                }
            }
        }
        if (easing != null) {
            float f17 = (Float.isNaN(f15) ? 1.0f : f15) - f12;
            double d11 = (f11 - f12) / f17;
            f11 = (((float) easing.get(d11)) * f17) + f12;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d11);
            }
        }
        return f11;
    }

    private static DifferentialInterpolator getInterpolator(int i11, String str, int i12) {
        if (i11 != -1) {
            return null;
        }
        final Easing interpolator = Easing.getInterpolator(str);
        return new DifferentialInterpolator() { // from class: androidx.constraintlayout.core.motion.Motion.1

            /* JADX INFO: renamed from: mX */
            float f2181mX;

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getInterpolation(float f11) {
                this.f2181mX = f11;
                return (float) interpolator.get(f11);
            }

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getVelocity() {
                return (float) interpolator.getDiff(this.f2181mX);
            }
        };
    }

    public int buildKeyBounds(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                iArr[i11] = it.next().mMode;
                i11++;
            }
        }
        int i12 = 0;
        for (double d11 : timePoints) {
            this.mSpline[0].getPos(d11, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i12);
            i12 += 2;
        }
        return i12 / 2;
    }

    public int buildKeyFrames(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                iArr[i11] = it.next().mMode;
                i11++;
            }
        }
        if (iArr2 != null) {
            Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                iArr2[i12] = (int) (it2.next().mPosition * 100.0f);
                i12++;
            }
        }
        int i13 = 0;
        for (int i14 = 0; i14 < timePoints.length; i14++) {
            this.mSpline[0].getPos(timePoints[i14], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i14], this.mInterpolateVariables, this.mInterpolateData, fArr, i13);
            i13 += 2;
        }
        return i13 / 2;
    }

    public void buildRect(float f11, float[] fArr, int i11) {
        this.mSpline[0].getPos(getAdjustedPosition(f11, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i11);
    }

    public void getCenter(double d11, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.mSpline[0].getPos(d11, dArr);
        this.mSpline[0].getSlope(d11, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.mStartMotionPath.getCenter(d11, this.mInterpolateVariables, dArr, fArr, dArr2, fArr2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public int getKeyFrameInfo(int i11, int[] iArr) {
        float[] fArr = new float[2];
        int i12 = 0;
        int i13 = 0;
        for (MotionKey motionKey : this.mKeyList) {
            int i14 = motionKey.mType;
            if (i14 == i11 || i11 != -1) {
                iArr[i13] = 0;
                iArr[i13 + 1] = i14;
                int i15 = motionKey.mFramePosition;
                iArr[i13 + 2] = i15;
                double d11 = i15 / 100.0f;
                this.mSpline[0].getPos(d11, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d11, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                iArr[i13 + 3] = Float.floatToIntBits(fArr[0]);
                int i16 = i13 + 4;
                iArr[i16] = Float.floatToIntBits(fArr[1]);
                if (motionKey instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
                    iArr[i13 + 5] = motionKeyPosition.mPositionType;
                    iArr[i13 + 6] = Float.floatToIntBits(motionKeyPosition.mPercentX);
                    i16 = i13 + 7;
                    iArr[i16] = Float.floatToIntBits(motionKeyPosition.mPercentY);
                }
                int i17 = i16 + 1;
                iArr[i13] = i17 - i13;
                i12++;
                i13 = i17;
            }
        }
        return i12;
    }

    public void rotate(Rect rect, Rect rect2, int i11, int i12, int i13) {
        if (i11 == 1) {
            int i14 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i13 - ((i14 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i11 == 2) {
            int i15 = rect.left + rect.right;
            rect2.left = i12 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i15 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i11 == 3) {
            int i16 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i16 / 2);
            rect2.top = i13 - ((i16 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i11 != 4) {
            return;
        }
        int i17 = rect.left + rect.right;
        rect2.left = i12 - (((rect.bottom + rect.top) + rect.width()) / 2);
        rect2.top = (i17 - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, boolean z11) {
        return false;
    }

    public void setupRelative(Motion motion) {
        this.mRelativeMotion = motion;
    }

    private float getPreCycleDistance() {
        float[] fArr = new float[2];
        float f11 = 1.0f / 99;
        double d11 = 0.0d;
        double d12 = 0.0d;
        int i11 = 0;
        float fHypot = 0.0f;
        while (i11 < 100) {
            float f12 = i11 * f11;
            double d13 = f12;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f13 = Float.NaN;
            float f14 = 0.0f;
            for (MotionPaths motionPaths : this.mMotionPaths) {
                Easing easing2 = motionPaths.mKeyFrameEasing;
                if (easing2 != null) {
                    float f15 = motionPaths.mTime;
                    if (f15 < f12) {
                        easing = easing2;
                        f14 = f15;
                    } else if (Float.isNaN(f13)) {
                        f13 = motionPaths.mTime;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f13)) {
                    f13 = 1.0f;
                }
                float f16 = f13 - f14;
                d13 = (((float) easing.get((f12 - f14) / f16)) * f16) + f14;
            }
            double d14 = d13;
            this.mSpline[0].getPos(d14, this.mInterpolateData);
            int i12 = i11;
            this.mStartMotionPath.getCenter(d14, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i12 > 0) {
                fHypot += (float) Math.hypot(d12 - ((double) fArr[1]), d11 - ((double) fArr[0]));
            }
            d11 = fArr[0];
            d12 = fArr[1];
            i11 = i12 + 1;
        }
        return fHypot;
    }

    private void insertKey(MotionPaths motionPaths) {
        MotionPaths motionPaths2 = null;
        for (MotionPaths motionPaths3 : this.mMotionPaths) {
            if (motionPaths.mPosition == motionPaths3.mPosition) {
                motionPaths2 = motionPaths3;
            }
        }
        if (motionPaths2 != null) {
            this.mMotionPaths.remove(motionPaths2);
        }
        int iBinarySearch = Collections.binarySearch(this.mMotionPaths, motionPaths);
        if (iBinarySearch == 0) {
            Utils.loge(TAG, " KeyPath position \"" + motionPaths.mPosition + "\" outside of range");
        }
        this.mMotionPaths.add((-iBinarySearch) - 1, motionPaths);
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds(this.mView.getX(), this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    private void setupRelative() {
        Motion motion = this.mRelativeMotion;
        if (motion == null) {
            return;
        }
        this.mStartMotionPath.setupRelative(motion, motion.mStartMotionPath);
        MotionPaths motionPaths = this.mEndMotionPath;
        Motion motion2 = this.mRelativeMotion;
        motionPaths.setupRelative(motion2, motion2.mEndMotionPath);
    }

    public void addKey(MotionKey motionKey) {
        this.mKeyList.add(motionKey);
    }

    public void addKeys(ArrayList<MotionKey> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    public void buildBounds(float[] fArr, int i11) {
        float f11 = 1.0f / (i11 - 1);
        HashMap<String, SplineSet> map = this.mAttributesMap;
        if (map != null) {
            map.get("translationX");
        }
        HashMap<String, SplineSet> map2 = this.mAttributesMap;
        if (map2 != null) {
            map2.get("translationY");
        }
        HashMap<String, KeyCycleOscillator> map3 = this.mCycleMap;
        if (map3 != null) {
            map3.get("translationX");
        }
        HashMap<String, KeyCycleOscillator> map4 = this.mCycleMap;
        if (map4 != null) {
            map4.get("translationY");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            float fMin = i12 * f11;
            float f12 = this.mStaggerScale;
            float f13 = 0.0f;
            if (f12 != 1.0f) {
                float f14 = this.mStaggerOffset;
                if (fMin < f14) {
                    fMin = 0.0f;
                }
                if (fMin > f14 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f14) * f12, 1.0f);
                }
            }
            double d11 = fMin;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f15 = Float.NaN;
            for (MotionPaths motionPaths : this.mMotionPaths) {
                Easing easing2 = motionPaths.mKeyFrameEasing;
                if (easing2 != null) {
                    float f16 = motionPaths.mTime;
                    if (f16 < fMin) {
                        easing = easing2;
                        f13 = f16;
                    } else if (Float.isNaN(f15)) {
                        f15 = motionPaths.mTime;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                float f17 = f15 - f13;
                d11 = (((float) easing.get((fMin - f13) / f17)) * f17) + f13;
            }
            this.mSpline[0].getPos(d11, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d11, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i12 * 2);
        }
    }

    public void buildPath(float[] fArr, int i11) {
        int i12 = i11;
        float f11 = 1.0f;
        float f12 = 1.0f / (i12 - 1);
        HashMap<String, SplineSet> map = this.mAttributesMap;
        SplineSet splineSet = map == null ? null : map.get("translationX");
        HashMap<String, SplineSet> map2 = this.mAttributesMap;
        SplineSet splineSet2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, KeyCycleOscillator> map3 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator = map3 == null ? null : map3.get("translationX");
        HashMap<String, KeyCycleOscillator> map4 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = map4 != null ? map4.get("translationY") : null;
        int i13 = 0;
        while (i13 < i12) {
            float fMin = i13 * f12;
            float f13 = this.mStaggerScale;
            float f14 = 0.0f;
            if (f13 != f11) {
                float f15 = this.mStaggerOffset;
                if (fMin < f15) {
                    fMin = 0.0f;
                }
                if (fMin > f15 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f15) * f13, f11);
                }
            }
            double d11 = fMin;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f16 = Float.NaN;
            for (MotionPaths motionPaths : this.mMotionPaths) {
                Easing easing2 = motionPaths.mKeyFrameEasing;
                if (easing2 != null) {
                    float f17 = motionPaths.mTime;
                    if (f17 < fMin) {
                        f14 = f17;
                        easing = easing2;
                    } else if (Float.isNaN(f16)) {
                        f16 = motionPaths.mTime;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f16)) {
                    f16 = 1.0f;
                }
                float f18 = f16 - f14;
                d11 = (((float) easing.get((fMin - f14) / f18)) * f18) + f14;
            }
            this.mSpline[0].getPos(d11, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d11, dArr);
                }
            }
            int i14 = i13 * 2;
            this.mStartMotionPath.getCenter(d11, this.mInterpolateVariables, this.mInterpolateData, fArr, i14);
            if (keyCycleOscillator != null) {
                fArr[i14] = fArr[i14] + keyCycleOscillator.get(fMin);
            } else if (splineSet != null) {
                fArr[i14] = fArr[i14] + splineSet.get(fMin);
            }
            if (keyCycleOscillator2 != null) {
                int i15 = i14 + 1;
                fArr[i15] = fArr[i15] + keyCycleOscillator2.get(fMin);
            } else if (splineSet2 != null) {
                int i16 = i14 + 1;
                fArr[i16] = fArr[i16] + splineSet2.get(fMin);
            }
            i13++;
            i12 = i11;
            f11 = 1.0f;
        }
    }

    public void buildRectangles(float[] fArr, int i11) {
        float f11 = 1.0f / (i11 - 1);
        for (int i12 = 0; i12 < i11; i12++) {
            this.mSpline[0].getPos(getAdjustedPosition(i12 * f11, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i12 * 8);
        }
    }

    public String getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    public int getAttributeValues(String str, float[] fArr, int i11) {
        SplineSet splineSet = this.mAttributesMap.get(str);
        if (splineSet == null) {
            return -1;
        }
        for (int i12 = 0; i12 < fArr.length; i12++) {
            fArr[i12] = splineSet.get(i12 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public float getCenterX() {
        return this.mCurrentCenterX;
    }

    public float getCenterY() {
        return this.mCurrentCenterY;
    }

    public void getDpDt(float f11, float f12, float f13, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f11, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        int i11 = 0;
        if (curveFitArr == null) {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f14 = motionPaths.f2184mX;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f15 = f14 - motionPaths2.f2184mX;
            float f16 = motionPaths.f2185mY - motionPaths2.f2185mY;
            float f17 = (motionPaths.mWidth - motionPaths2.mWidth) + f15;
            float f18 = (motionPaths.mHeight - motionPaths2.mHeight) + f16;
            fArr[0] = (f15 * (1.0f - f12)) + (f17 * f12);
            fArr[1] = (f16 * (1.0f - f13)) + (f18 * f13);
            return;
        }
        double d11 = adjustedPosition;
        curveFitArr[0].getSlope(d11, this.mInterpolateVelocity);
        this.mSpline[0].getPos(d11, this.mInterpolateData);
        float f19 = this.mVelocity[0];
        while (true) {
            dArr = this.mInterpolateVelocity;
            if (i11 >= dArr.length) {
                break;
            }
            dArr[i11] = dArr[i11] * ((double) f19);
            i11++;
        }
        CurveFit curveFit = this.mArcSpline;
        if (curveFit == null) {
            this.mStartMotionPath.setDpDt(f12, f13, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        double[] dArr2 = this.mInterpolateData;
        if (dArr2.length > 0) {
            curveFit.getPos(d11, dArr2);
            this.mArcSpline.getSlope(d11, this.mInterpolateVelocity);
            this.mStartMotionPath.setDpDt(f12, f13, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
        }
    }

    public int getDrawPath() {
        int iMax = this.mStartMotionPath.mDrawPath;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().mDrawPath);
        }
        return Math.max(iMax, this.mEndMotionPath.mDrawPath);
    }

    public float getFinalHeight() {
        return this.mEndMotionPath.mHeight;
    }

    public float getFinalWidth() {
        return this.mEndMotionPath.mWidth;
    }

    public float getFinalX() {
        return this.mEndMotionPath.f2184mX;
    }

    public float getFinalY() {
        return this.mEndMotionPath.f2185mY;
    }

    public MotionPaths getKeyFrame(int i11) {
        return this.mMotionPaths.get(i11);
    }

    public float getKeyFrameParameter(int i11, float f11, float f12) {
        MotionPaths motionPaths = this.mEndMotionPath;
        float f13 = motionPaths.f2184mX;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f14 = motionPaths2.f2184mX;
        float f15 = f13 - f14;
        float f16 = motionPaths.f2185mY;
        float f17 = motionPaths2.f2185mY;
        float f18 = f16 - f17;
        float f19 = f14 + (motionPaths2.mWidth / 2.0f);
        float f21 = f17 + (motionPaths2.mHeight / 2.0f);
        float fHypot = (float) Math.hypot(f15, f18);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f22 = f11 - f19;
        float f23 = f12 - f21;
        if (((float) Math.hypot(f22, f23)) == 0.0f) {
            return 0.0f;
        }
        float f24 = (f22 * f15) + (f23 * f18);
        if (i11 == 0) {
            return f24 / fHypot;
        }
        if (i11 == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f24 * f24));
        }
        if (i11 == 2) {
            return f22 / f15;
        }
        if (i11 == 3) {
            return f23 / f15;
        }
        if (i11 == 4) {
            return f22 / f18;
        }
        if (i11 != 5) {
            return 0.0f;
        }
        return f23 / f18;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        int i11 = 0;
        int i12 = 0;
        for (MotionKey motionKey : this.mKeyList) {
            int i13 = motionKey.mFramePosition;
            iArr[i11] = (motionKey.mType * 1000) + i13;
            double d11 = i13 / 100.0f;
            this.mSpline[0].getPos(d11, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d11, this.mInterpolateVariables, this.mInterpolateData, fArr, i12);
            i12 += 2;
            i11++;
        }
        return i11;
    }

    public float getMotionStagger() {
        return this.mMotionStagger;
    }

    public double[] getPos(double d11) {
        this.mSpline[0].getPos(d11, this.mInterpolateData);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                curveFit.getPos(d11, dArr);
            }
        }
        return this.mInterpolateData;
    }

    public MotionKeyPosition getPositionKeyframe(int i11, int i12, float f11, float f12) {
        int i13;
        int i14;
        float f13;
        float f14;
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f15 = motionPaths.f2184mX;
        floatRect.left = f15;
        float f16 = motionPaths.f2185mY;
        floatRect.top = f16;
        floatRect.right = f15 + motionPaths.mWidth;
        floatRect.bottom = f16 + motionPaths.mHeight;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f17 = motionPaths2.f2184mX;
        floatRect2.left = f17;
        float f18 = motionPaths2.f2185mY;
        floatRect2.top = f18;
        floatRect2.right = f17 + motionPaths2.mWidth;
        floatRect2.bottom = f18 + motionPaths2.mHeight;
        for (MotionKey motionKey : this.mKeyList) {
            if (motionKey instanceof MotionKeyPosition) {
                MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
                i13 = i11;
                i14 = i12;
                f13 = f11;
                f14 = f12;
                if (motionKeyPosition.intersects(i13, i14, floatRect, floatRect2, f13, f14)) {
                    return motionKeyPosition;
                }
            } else {
                i13 = i11;
                i14 = i12;
                f13 = f11;
                f14 = f12;
            }
            i11 = i13;
            i12 = i14;
            f11 = f13;
            f12 = f14;
        }
        return null;
    }

    public void getPostLayoutDvDp(float f11, int i11, int i12, float f12, float f13, float[] fArr) {
        float adjustedPosition = getAdjustedPosition(f11, this.mVelocity);
        HashMap<String, SplineSet> map = this.mAttributesMap;
        SplineSet splineSet = map == null ? null : map.get("translationX");
        HashMap<String, SplineSet> map2 = this.mAttributesMap;
        SplineSet splineSet2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, SplineSet> map3 = this.mAttributesMap;
        SplineSet splineSet3 = map3 == null ? null : map3.get("rotationZ");
        HashMap<String, SplineSet> map4 = this.mAttributesMap;
        SplineSet splineSet4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, SplineSet> map5 = this.mAttributesMap;
        SplineSet splineSet5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, KeyCycleOscillator> map6 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator = map6 == null ? null : map6.get("translationX");
        HashMap<String, KeyCycleOscillator> map7 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = map7 == null ? null : map7.get("translationY");
        HashMap<String, KeyCycleOscillator> map8 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator3 = map8 == null ? null : map8.get("rotationZ");
        HashMap<String, KeyCycleOscillator> map9 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator4 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, KeyCycleOscillator> map10 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator5 = map10 != null ? map10.get("scaleY") : null;
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
        velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
        velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator5, adjustedPosition);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d11 = adjustedPosition;
                curveFit.getPos(d11, dArr);
                this.mArcSpline.getSlope(d11, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f12, f13, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f12, f13, i11, i12, fArr);
            return;
        }
        int i13 = 0;
        if (this.mSpline == null) {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f14 = motionPaths.f2184mX;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f15 = f14 - motionPaths2.f2184mX;
            float f16 = motionPaths.f2185mY - motionPaths2.f2185mY;
            float f17 = (motionPaths.mWidth - motionPaths2.mWidth) + f15;
            float f18 = f16 + (motionPaths.mHeight - motionPaths2.mHeight);
            fArr[0] = (f15 * (1.0f - f12)) + (f17 * f12);
            fArr[1] = (f16 * (1.0f - f13)) + (f18 * f13);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
            velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator5, adjustedPosition);
            velocityMatrix.applyTransform(f12, f13, i11, i12, fArr);
            return;
        }
        double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
        this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
        this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
        float f19 = this.mVelocity[0];
        while (true) {
            double[] dArr2 = this.mInterpolateVelocity;
            if (i13 >= dArr2.length) {
                this.mStartMotionPath.setDpDt(f12, f13, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                velocityMatrix.applyTransform(f12, f13, i11, i12, fArr);
                return;
            } else {
                dArr2[i13] = dArr2[i13] * ((double) f19);
                i13++;
            }
        }
    }

    public float getStartHeight() {
        return this.mStartMotionPath.mHeight;
    }

    public float getStartWidth() {
        return this.mStartMotionPath.mWidth;
    }

    public float getStartX() {
        return this.mStartMotionPath.f2184mX;
    }

    public float getStartY() {
        return this.mStartMotionPath.f2185mY;
    }

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public MotionWidget getView() {
        return this.mView;
    }

    public boolean interpolate(MotionWidget motionWidget, float f11, long j11, KeyCache keyCache) {
        MotionWidget motionWidget2 = motionWidget;
        float adjustedPosition = getAdjustedPosition(f11, null);
        int i11 = this.mQuantizeMotionSteps;
        if (i11 != -1) {
            float f12 = 1.0f / i11;
            float fFloor = ((float) Math.floor(adjustedPosition / f12)) * f12;
            float f13 = (adjustedPosition % f12) / f12;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f13 = (f13 + this.mQuantizeMotionPhase) % 1.0f;
            }
            DifferentialInterpolator differentialInterpolator = this.mQuantizeMotionInterpolator;
            adjustedPosition = ((differentialInterpolator != null ? differentialInterpolator.getInterpolation(f13) : ((double) f13) > 0.5d ? 1.0f : 0.0f) * f12) + fFloor;
        }
        float f14 = adjustedPosition;
        HashMap<String, SplineSet> map = this.mAttributesMap;
        if (map != null) {
            Iterator<SplineSet> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(motionWidget2, f14);
            }
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d11 = f14;
            curveFitArr[0].getPos(d11, this.mInterpolateData);
            this.mSpline[0].getSlope(d11, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d11, dArr);
                    this.mArcSpline.getSlope(d11, this.mInterpolateVelocity);
                }
            }
            if (!this.mNoMovement) {
                this.mStartMotionPath.setView(f14, motionWidget2, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null);
                f14 = f14;
                motionWidget2 = motionWidget2;
            }
            if (this.mTransformPivotTarget != -1) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = motionWidget2.getParent().findViewById(this.mTransformPivotTarget);
                }
                MotionWidget motionWidget3 = this.mTransformPivotView;
                if (motionWidget3 != null) {
                    float top = (motionWidget3.getTop() + this.mTransformPivotView.getBottom()) / 2.0f;
                    float left = (this.mTransformPivotView.getLeft() + this.mTransformPivotView.getRight()) / 2.0f;
                    if (motionWidget2.getRight() - motionWidget2.getLeft() > 0 && motionWidget2.getBottom() - motionWidget2.getTop() > 0) {
                        float left2 = left - motionWidget2.getLeft();
                        float top2 = top - motionWidget2.getTop();
                        motionWidget2.setPivotX(left2);
                        motionWidget2.setPivotY(top2);
                    }
                }
            }
            int i12 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i12 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i12].getPos(d11, this.mValuesBuff);
                this.mStartMotionPath.mCustomAttributes.get(this.mAttributeNames[i12 - 1]).setInterpolatedValue(motionWidget2, this.mValuesBuff);
                i12++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (f14 <= 0.0f) {
                    motionWidget2.setVisibility(motionConstrainedPoint.mVisibility);
                } else if (f14 >= 1.0f) {
                    motionWidget2.setVisibility(this.mEndPoint.mVisibility);
                } else if (this.mEndPoint.mVisibility != motionConstrainedPoint.mVisibility) {
                    motionWidget2.setVisibility(4);
                }
            }
            if (this.mKeyTriggers != null) {
                int i13 = 0;
                while (true) {
                    MotionKeyTrigger[] motionKeyTriggerArr = this.mKeyTriggers;
                    if (i13 >= motionKeyTriggerArr.length) {
                        break;
                    }
                    motionKeyTriggerArr[i13].conditionallyFire(f14, motionWidget2);
                    i13++;
                }
            }
        } else {
            MotionPaths motionPaths = this.mStartMotionPath;
            float f15 = motionPaths.f2184mX;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float f16 = f15 + ((motionPaths2.f2184mX - f15) * f14);
            float f17 = motionPaths.f2185mY;
            float f18 = f17 + ((motionPaths2.f2185mY - f17) * f14);
            float f19 = motionPaths.mWidth;
            float f21 = f19 + ((motionPaths2.mWidth - f19) * f14);
            float f22 = motionPaths.mHeight;
            float f23 = f16 + 0.5f;
            float f24 = f18 + 0.5f;
            motionWidget2.layout((int) f23, (int) f24, (int) (f23 + f21), (int) (f24 + f22 + ((motionPaths2.mHeight - f22) * f14)));
        }
        HashMap<String, KeyCycleOscillator> map2 = this.mCycleMap;
        if (map2 != null) {
            for (KeyCycleOscillator keyCycleOscillator : map2.values()) {
                if (keyCycleOscillator instanceof KeyCycleOscillator.PathRotateSet) {
                    double[] dArr2 = this.mInterpolateVelocity;
                    ((KeyCycleOscillator.PathRotateSet) keyCycleOscillator).setPathRotate(motionWidget2, f14, dArr2[0], dArr2[1]);
                } else {
                    keyCycleOscillator.setProperty(motionWidget2, f14);
                }
            }
        }
        return false;
    }

    public String name() {
        return this.mView.getName();
    }

    public void positionKeyframe(MotionWidget motionWidget, MotionKeyPosition motionKeyPosition, float f11, float f12, String[] strArr, float[] fArr) {
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f13 = motionPaths.f2184mX;
        floatRect.left = f13;
        float f14 = motionPaths.f2185mY;
        floatRect.top = f14;
        floatRect.right = f13 + motionPaths.mWidth;
        floatRect.bottom = f14 + motionPaths.mHeight;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f15 = motionPaths2.f2184mX;
        floatRect2.left = f15;
        float f16 = motionPaths2.f2185mY;
        floatRect2.top = f16;
        floatRect2.right = f15 + motionPaths2.mWidth;
        floatRect2.bottom = f16 + motionPaths2.mHeight;
        motionKeyPosition.positionAttributes(motionWidget, floatRect, floatRect2, f11, f12, strArr, fArr);
    }

    public void setBothStates(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        this.mNoMovement = true;
        motionPaths.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mEndMotionPath.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mStartPoint.setState(motionWidget);
        this.mEndPoint.setState(motionWidget);
    }

    public void setDrawPath(int i11) {
        this.mStartMotionPath.mDrawPath = i11;
    }

    public void setEnd(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mEndMotionPath;
        motionPaths.mTime = 1.0f;
        motionPaths.mPosition = 1.0f;
        readView(motionPaths);
        this.mEndMotionPath.setBounds(motionWidget.getLeft(), motionWidget.getTop(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mEndMotionPath.applyParameters(motionWidget);
        this.mEndPoint.setState(motionWidget);
    }

    public void setIdString(String str) {
        this.mId = str;
        this.mStartMotionPath.mId = str;
    }

    public void setPathMotionArc(int i11) {
        this.mPathMotionArc = i11;
    }

    public void setStaggerOffset(float f11) {
        this.mStaggerOffset = f11;
    }

    public void setStaggerScale(float f11) {
        this.mStaggerScale = f11;
    }

    public void setStart(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        motionPaths.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mStartMotionPath.applyParameters(motionWidget);
        this.mStartPoint.setState(motionWidget);
        TypedBundle motionProperties = motionWidget.getWidgetFrame().getMotionProperties();
        if (motionProperties != null) {
            motionProperties.applyDelta(this);
        }
    }

    public void setStartState(ViewState viewState, MotionWidget motionWidget, int i11, int i12, int i13) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        Rect rect = new Rect();
        if (i11 == 1) {
            int i14 = viewState.left + viewState.right;
            rect.left = ((viewState.top + viewState.bottom) - viewState.width()) / 2;
            rect.top = i12 - ((i14 + viewState.height()) / 2);
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        } else if (i11 == 2) {
            int i15 = viewState.left + viewState.right;
            rect.left = i13 - (((viewState.top + viewState.bottom) + viewState.width()) / 2);
            rect.top = (i15 - viewState.height()) / 2;
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        }
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mStartPoint.setState(rect, motionWidget, i11, viewState.rotation);
    }

    public void setTransformPivotTarget(int i11) {
        this.mTransformPivotTarget = i11;
        this.mTransformPivotView = null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, int i12) {
        if (i11 == 509) {
            setPathMotionArc(i12);
            return true;
        }
        if (i11 != 610) {
            return i11 == 704;
        }
        this.mQuantizeMotionSteps = i12;
        return true;
    }

    public void setView(MotionWidget motionWidget) {
        this.mView = motionWidget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setup(int i11, int i12, float f11, long j11) {
        ArrayList arrayList;
        int i13;
        String[] strArr;
        int i14;
        CustomVariable customVariable;
        SplineSet splineSetMakeSpline;
        CustomVariable customVariable2;
        Integer num;
        SplineSet splineSetMakeSpline2;
        CustomVariable customVariable3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        setupRelative();
        int i15 = this.mPathMotionArc;
        if (i15 != -1) {
            MotionPaths motionPaths = this.mStartMotionPath;
            if (motionPaths.mPathMotionArc == -1) {
                motionPaths.mPathMotionArc = i15;
            }
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        ArrayList<MotionKey> arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            arrayList = null;
            for (MotionKey motionKey : arrayList2) {
                if (motionKey instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
                    insertKey(new MotionPaths(i11, i12, motionKeyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i16 = motionKeyPosition.mCurveFit;
                    if (i16 != -1) {
                        this.mCurveFitType = i16;
                    }
                } else if (motionKey instanceof MotionKeyCycle) {
                    motionKey.getAttributeNames(hashSet3);
                } else if (motionKey instanceof MotionKeyTimeCycle) {
                    motionKey.getAttributeNames(hashSet);
                } else if (motionKey instanceof MotionKeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((MotionKeyTrigger) motionKey);
                } else {
                    motionKey.setInterpolation(map);
                    motionKey.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.mKeyTriggers = (MotionKeyTrigger[]) arrayList.toArray(new MotionKeyTrigger[0]);
        }
        int i17 = 1;
        if (hashSet2.isEmpty()) {
            i13 = 1;
        } else {
            this.mAttributesMap = new HashMap<>();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    KeyFrameArray.CustomVar customVar = new KeyFrameArray.CustomVar();
                    String str2 = str.split(",")[i17];
                    for (MotionKey motionKey2 : this.mKeyList) {
                        HashMap<String, CustomVariable> map2 = motionKey2.mCustom;
                        if (map2 != null && (customVariable3 = map2.get(str2)) != null) {
                            customVar.append(motionKey2.mFramePosition, customVariable3);
                        }
                    }
                    splineSetMakeSpline2 = SplineSet.makeCustomSplineSet(str, customVar);
                } else {
                    splineSetMakeSpline2 = SplineSet.makeSpline(str, j11);
                }
                if (splineSetMakeSpline2 != null) {
                    splineSetMakeSpline2.setType(str);
                    this.mAttributesMap.put(str, splineSetMakeSpline2);
                }
                i17 = i17;
            }
            i13 = i17;
            ArrayList<MotionKey> arrayList3 = this.mKeyList;
            if (arrayList3 != null) {
                for (MotionKey motionKey3 : arrayList3) {
                    if (motionKey3 instanceof MotionKeyAttributes) {
                        motionKey3.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str3 : this.mAttributesMap.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                SplineSet splineSet = this.mAttributesMap.get(str3);
                if (splineSet != null) {
                    splineSet.setup(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.mTimeCycleAttributesMap == null) {
                this.mTimeCycleAttributesMap = new HashMap<>();
            }
            for (String str4 : hashSet) {
                if (!this.mTimeCycleAttributesMap.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        KeyFrameArray.CustomVar customVar2 = new KeyFrameArray.CustomVar();
                        String str5 = str4.split(",")[i13];
                        for (MotionKey motionKey4 : this.mKeyList) {
                            HashMap<String, CustomVariable> map3 = motionKey4.mCustom;
                            if (map3 != null && (customVariable2 = map3.get(str5)) != null) {
                                customVar2.append(motionKey4.mFramePosition, customVariable2);
                            }
                        }
                        splineSetMakeSpline = SplineSet.makeCustomSplineSet(str4, customVar2);
                    } else {
                        splineSetMakeSpline = SplineSet.makeSpline(str4, j11);
                    }
                    if (splineSetMakeSpline != null) {
                        splineSetMakeSpline.setType(str4);
                    }
                }
            }
            ArrayList<MotionKey> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                for (MotionKey motionKey5 : arrayList4) {
                    if (motionKey5 instanceof MotionKeyTimeCycle) {
                        ((MotionKeyTimeCycle) motionKey5).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str6 : this.mTimeCycleAttributesMap.keySet()) {
                this.mTimeCycleAttributesMap.get(str6).setup(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int size = this.mMotionPaths.size();
        int i18 = size + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i18];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size + 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == MotionKey.UNSET) {
            this.mCurveFitType = 0;
        }
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        int i19 = i13;
        while (it.hasNext()) {
            motionPathsArr[i19] = it.next();
            i19++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.mEndMotionPath.mCustomAttributes.keySet()) {
            if (this.mStartMotionPath.mCustomAttributes.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.mAttributeNames = strArr2;
        this.mAttributeInterpolatorCount = new int[strArr2.length];
        int i21 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i21 >= strArr.length) {
                break;
            }
            String str8 = strArr[i21];
            this.mAttributeInterpolatorCount[i21] = 0;
            for (int i22 = 0; i22 < i18; i22++) {
                if (motionPathsArr[i22].mCustomAttributes.containsKey(str8) && (customVariable = motionPathsArr[i22].mCustomAttributes.get(str8)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i21] = iArr[i21] + customVariable.numberOfInterpolatedValues();
                    break;
                }
            }
            i21++;
        }
        boolean z11 = motionPathsArr[0].mPathMotionArc != -1 ? i13 : 0;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i23 = i13; i23 < i18; i23++) {
            motionPathsArr[i23].different(motionPathsArr[i23 - 1], zArr, this.mAttributeNames, z11);
        }
        int i24 = 0;
        for (int i25 = i13; i25 < length; i25++) {
            if (zArr[i25]) {
                i24++;
            }
        }
        this.mInterpolateVariables = new int[i24];
        int i26 = 2;
        int iMax = Math.max(2, i24);
        this.mInterpolateData = new double[iMax];
        this.mInterpolateVelocity = new double[iMax];
        int i27 = 0;
        for (int i28 = i13; i28 < length; i28++) {
            if (zArr[i28]) {
                this.mInterpolateVariables[i27] = i28;
                i27++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[i13] = this.mInterpolateVariables.length;
        iArr2[0] = i18;
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i18];
        for (int i29 = 0; i29 < i18; i29++) {
            motionPathsArr[i29].fillStandard(dArr[i29], this.mInterpolateVariables);
            dArr2[i29] = motionPathsArr[i29].mTime;
        }
        int i31 = 0;
        while (true) {
            int[] iArr3 = this.mInterpolateVariables;
            if (i31 >= iArr3.length) {
                break;
            }
            if (iArr3[i31] < MotionPaths.sNames.length) {
                String str9 = MotionPaths.sNames[this.mInterpolateVariables[i31]] + " [";
                for (int i32 = 0; i32 < i18; i32++) {
                    str9 = str9 + dArr[i32][i31];
                }
            }
            i31++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i33 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i33 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i33];
            int i34 = 0;
            int i35 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i34 < i18) {
                if (motionPathsArr[i34].hasCustomData(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i18];
                        int[] iArr4 = new int[i26];
                        iArr4[i13] = motionPathsArr[i34].getCustomDataCount(str10);
                        i14 = 0;
                        iArr4[0] = i18;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    } else {
                        i14 = 0;
                    }
                    MotionPaths motionPaths2 = motionPathsArr[i34];
                    dArr3[i35] = motionPaths2.mTime;
                    motionPaths2.getCustomData(str10, dArr4[i35], i14);
                    i35++;
                }
                i34++;
                i33 = i33;
                i26 = 2;
            }
            int i36 = i33 + 1;
            this.mSpline[i36] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i35), (double[][]) Arrays.copyOf(dArr4, i35));
            i33 = i36;
            i26 = 2;
        }
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != -1) {
            int[] iArr5 = new int[i18];
            double[] dArr5 = new double[i18];
            int[] iArr6 = new int[2];
            iArr6[i13] = 2;
            iArr6[0] = i18;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i37 = 0; i37 < i18; i37++) {
                MotionPaths motionPaths3 = motionPathsArr[i37];
                iArr5[i37] = motionPaths3.mPathMotionArc;
                dArr5[i37] = motionPaths3.mTime;
                double[] dArr7 = dArr6[i37];
                dArr7[0] = motionPaths3.f2184mX;
                dArr7[i13] = motionPaths3.f2185mY;
            }
            this.mArcSpline = CurveFit.getArc(iArr5, dArr5, dArr6);
        }
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            float preCycleDistance = Float.NaN;
            for (String str11 : hashSet3) {
                KeyCycleOscillator keyCycleOscillatorMakeWidgetCycle = KeyCycleOscillator.makeWidgetCycle(str11);
                if (keyCycleOscillatorMakeWidgetCycle != null) {
                    if (keyCycleOscillatorMakeWidgetCycle.variesByPath() && Float.isNaN(preCycleDistance)) {
                        preCycleDistance = getPreCycleDistance();
                    }
                    keyCycleOscillatorMakeWidgetCycle.setType(str11);
                    this.mCycleMap.put(str11, keyCycleOscillatorMakeWidgetCycle);
                }
            }
            for (MotionKey motionKey6 : this.mKeyList) {
                if (motionKey6 instanceof MotionKeyCycle) {
                    ((MotionKeyCycle) motionKey6).addCycleValues(this.mCycleMap);
                }
            }
            Iterator<KeyCycleOscillator> it2 = this.mCycleMap.values().iterator();
            while (it2.hasNext()) {
                it2.next().setup(preCycleDistance);
            }
        }
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.f2184mX + " y: " + this.mStartMotionPath.f2185mY + " end: x: " + this.mEndMotionPath.f2184mX + " y: " + this.mEndMotionPath.f2185mY;
    }

    public Motion(MotionWidget motionWidget) {
        setView(motionWidget);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, float f11) {
        if (602 == i11) {
            this.mQuantizeMotionPhase = f11;
            return true;
        }
        if (600 != i11) {
            return false;
        }
        this.mMotionStagger = f11;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, String str) {
        if (705 == i11 || 611 == i11) {
            this.mQuantizeMotionInterpolator = getInterpolator(-1, str, 0);
            return true;
        }
        if (605 != i11) {
            return false;
        }
        this.mStartMotionPath.mAnimateRelativeTo = str;
        return true;
    }

    public void endTrigger(boolean z11) {
    }
}
