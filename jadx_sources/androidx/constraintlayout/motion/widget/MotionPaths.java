package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import com.facebook.react.uimanager.ViewProps;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes23.dex */
class MotionPaths implements Comparable<MotionPaths> {
    static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    static final int PERPENDICULAR = 1;
    static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    static String[] sNames = {ViewProps.POSITION, "x", "y", "width", "height", "pathRotate"};
    int mAnimateCircleAngleTo;
    int mAnimateRelativeTo;
    LinkedHashMap<String, ConstraintAttribute> mAttributes;
    float mHeight;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPosition;
    float mRelativeAngle;
    MotionController mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float mTime;
    float mWidth;

    /* JADX INFO: renamed from: mX */
    float f2213mX;

    /* JADX INFO: renamed from: mY */
    float f2214mY;
    int mDrawPath = 0;
    float mPathRotate = Float.NaN;
    float mProgress = Float.NaN;

    public MotionPaths() {
        int i11 = Key.UNSET;
        this.mPathMotionArc = i11;
        this.mAnimateRelativeTo = i11;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mAttributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    private static float xRotate(float f11, float f12, float f13, float f14, float f15, float f16) {
        return (((f15 - f13) * f12) - ((f16 - f14) * f11)) + f13;
    }

    private static float yRotate(float f11, float f12, float f13, float f14, float f15, float f16) {
        return ((f15 - f13) * f11) + ((f16 - f14) * f12) + f14;
    }

    public void getCenter(double d11, int[] iArr, double[] dArr, float[] fArr, int i11) {
        float fSin = this.f2213mX;
        float fCos = this.f2214mY;
        float f11 = this.mWidth;
        float f12 = this.mHeight;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f13 = (float) dArr[i12];
            int i13 = iArr[i12];
            if (i13 == 1) {
                fSin = f13;
            } else if (i13 == 2) {
                fCos = f13;
            } else if (i13 == 3) {
                f11 = f13;
            } else if (i13 == 4) {
                f12 = f13;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d11, fArr2, new float[2]);
            float f14 = fArr2[0];
            float f15 = fArr2[1];
            double d12 = f14;
            double d13 = fSin;
            double d14 = fCos;
            fSin = (float) ((d12 + (Math.sin(d14) * d13)) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) f15) - (d13 * Math.cos(d14))) - ((double) (f12 / 2.0f)));
        }
        fArr[i11] = fSin + (f11 / 2.0f) + 0.0f;
        fArr[i11 + 1] = fCos + (f12 / 2.0f) + 0.0f;
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = constraint.propertySet.mProgress;
        this.mRelativeAngle = constraint.layout.circleAngle;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute != null && constraintAttribute.isContinuous()) {
                this.mAttributes.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull MotionPaths motionPaths) {
        return Float.compare(this.mPosition, motionPaths.mPosition);
    }

    public void configureRelativeTo(MotionController motionController) {
        motionController.getPos(this.mProgress);
    }

    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z11) {
        boolean zDiff = diff(this.f2213mX, motionPaths.f2213mX);
        boolean zDiff2 = diff(this.f2214mY, motionPaths.f2214mY);
        zArr[0] = zArr[0] | diff(this.mPosition, motionPaths.mPosition);
        boolean z12 = zDiff | zDiff2 | z11;
        zArr[1] = zArr[1] | z12;
        zArr[2] = z12 | zArr[2];
        zArr[3] = zArr[3] | diff(this.mWidth, motionPaths.mWidth);
        zArr[4] = diff(this.mHeight, motionPaths.mHeight) | zArr[4];
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.mPosition, this.f2213mX, this.f2214mY, this.mWidth, this.mHeight, this.mPathRotate};
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 < 6) {
                dArr[i11] = fArr[i12];
                i11++;
            }
        }
    }

    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i11) {
        float f11 = this.mWidth;
        float f12 = this.mHeight;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f13 = (float) dArr[i12];
            int i13 = iArr[i12];
            if (i13 == 3) {
                f11 = f13;
            } else if (i13 == 4) {
                f12 = f13;
            }
        }
        fArr[i11] = f11;
        fArr[i11 + 1] = f12;
    }

    public void getCenterVelocity(double d11, int[] iArr, double[] dArr, float[] fArr, int i11) {
        float fSin = this.f2213mX;
        float fCos = this.f2214mY;
        float f11 = this.mWidth;
        float f12 = this.mHeight;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f13 = (float) dArr[i12];
            int i13 = iArr[i12];
            if (i13 == 1) {
                fSin = f13;
            } else if (i13 == 2) {
                fCos = f13;
            } else if (i13 == 3) {
                f11 = f13;
            } else if (i13 == 4) {
                f12 = f13;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d11, fArr2, new float[2]);
            float f14 = fArr2[0];
            float f15 = fArr2[1];
            double d12 = f14;
            double d13 = fSin;
            double d14 = fCos;
            fSin = (float) ((d12 + (Math.sin(d14) * d13)) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) f15) - (d13 * Math.cos(d14))) - ((double) (f12 / 2.0f)));
        }
        fArr[i11] = fSin + (f11 / 2.0f) + 0.0f;
        fArr[i11 + 1] = fCos + (f12 / 2.0f) + 0.0f;
    }

    public int getCustomData(String str, double[] dArr, int i11) {
        ConstraintAttribute constraintAttribute = this.mAttributes.get(str);
        int i12 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            dArr[i11] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int iNumberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        float[] fArr = new float[iNumberOfInterpolatedValues];
        constraintAttribute.getValuesToInterpolate(fArr);
        while (i12 < iNumberOfInterpolatedValues) {
            dArr[i11] = fArr[i12];
            i12++;
            i11++;
        }
        return iNumberOfInterpolatedValues;
    }

    public int getCustomDataCount(String str) {
        ConstraintAttribute constraintAttribute = this.mAttributes.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.numberOfInterpolatedValues();
    }

    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i11) {
        float f11 = this.f2213mX;
        float fCos = this.f2214mY;
        float f12 = this.mWidth;
        float f13 = this.mHeight;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f14 = (float) dArr[i12];
            int i13 = iArr[i12];
            if (i13 == 1) {
                f11 = f14;
            } else if (i13 == 2) {
                fCos = f14;
            } else if (i13 == 3) {
                f12 = f14;
            } else if (i13 == 4) {
                f13 = f14;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float centerX = motionController.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d11 = f11;
            double d12 = fCos;
            float fSin = (float) ((((double) centerX) + (Math.sin(d12) * d11)) - ((double) (f12 / 2.0f)));
            fCos = (float) ((((double) centerY) - (d11 * Math.cos(d12))) - ((double) (f13 / 2.0f)));
            f11 = fSin;
        }
        float f15 = f12 + f11;
        float f16 = f13 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i11] = f11 + 0.0f;
        fArr[i11 + 1] = fCos + 0.0f;
        fArr[i11 + 2] = f15 + 0.0f;
        fArr[i11 + 3] = fCos + 0.0f;
        fArr[i11 + 4] = f15 + 0.0f;
        fArr[i11 + 5] = f16 + 0.0f;
        fArr[i11 + 6] = f11 + 0.0f;
        fArr[i11 + 7] = f16 + 0.0f;
    }

    public boolean hasCustomData(String str) {
        return this.mAttributes.containsKey(str);
    }

    public void initAxis(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f11 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f11;
        this.mDrawPath = keyPosition.mDrawPath;
        float f12 = Float.isNaN(keyPosition.mPercentWidth) ? f11 : keyPosition.mPercentWidth;
        float f13 = Float.isNaN(keyPosition.mPercentHeight) ? f11 : keyPosition.mPercentHeight;
        float f14 = motionPaths2.mWidth;
        float f15 = motionPaths.mWidth;
        float f16 = f14 - f15;
        float f17 = motionPaths2.mHeight;
        float f18 = motionPaths.mHeight;
        float f19 = f17 - f18;
        this.mPosition = this.mTime;
        float f21 = motionPaths.f2213mX;
        float f22 = (f15 / 2.0f) + f21;
        float f23 = motionPaths.f2214mY;
        float f24 = f23 + (f18 / 2.0f);
        float f25 = f11;
        float f26 = motionPaths2.f2213mX + (f14 / 2.0f);
        float f27 = motionPaths2.f2214mY + (f17 / 2.0f);
        if (f22 > f26) {
            f22 = f26;
            f26 = f22;
        }
        if (f24 <= f27) {
            f24 = f27;
            f27 = f24;
        }
        float f28 = f26 - f22;
        float f29 = f24 - f27;
        float f31 = f16 * f12;
        float f32 = f31 / 2.0f;
        this.f2213mX = (int) ((f21 + (f28 * f25)) - f32);
        float f33 = f19 * f13;
        float f34 = f33 / 2.0f;
        this.f2214mY = (int) ((f23 + (f29 * f25)) - f34);
        this.mWidth = (int) (f15 + f31);
        this.mHeight = (int) (f18 + f33);
        float f35 = Float.isNaN(keyPosition.mPercentX) ? f25 : keyPosition.mPercentX;
        float f36 = Float.isNaN(keyPosition.mAltPercentY) ? 0.0f : keyPosition.mAltPercentY;
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f25 = keyPosition.mPercentY;
        }
        float f37 = Float.isNaN(keyPosition.mAltPercentX) ? 0.0f : keyPosition.mAltPercentX;
        this.mMode = 0;
        this.f2213mX = (int) (((motionPaths.f2213mX + (f35 * f28)) + (f37 * f29)) - f32);
        this.f2214mY = (int) (((motionPaths.f2214mY + (f28 * f36)) + (f29 * f25)) - f34);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initCartesian(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f11 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f11;
        this.mDrawPath = keyPosition.mDrawPath;
        float f12 = Float.isNaN(keyPosition.mPercentWidth) ? f11 : keyPosition.mPercentWidth;
        float f13 = Float.isNaN(keyPosition.mPercentHeight) ? f11 : keyPosition.mPercentHeight;
        float f14 = motionPaths2.mWidth;
        float f15 = motionPaths.mWidth;
        float f16 = motionPaths2.mHeight;
        float f17 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        float f18 = motionPaths.f2213mX;
        float f19 = motionPaths.f2214mY;
        float f21 = f11;
        float f22 = (motionPaths2.f2213mX + (f14 / 2.0f)) - ((f15 / 2.0f) + f18);
        float f23 = (motionPaths2.f2214mY + (f16 / 2.0f)) - (f19 + (f17 / 2.0f));
        float f24 = (f14 - f15) * f12;
        float f25 = f24 / 2.0f;
        this.f2213mX = (int) ((f18 + (f22 * f21)) - f25);
        float f26 = (f16 - f17) * f13;
        float f27 = f26 / 2.0f;
        this.f2214mY = (int) ((f19 + (f23 * f21)) - f27);
        this.mWidth = (int) (f15 + f24);
        this.mHeight = (int) (f17 + f26);
        float f28 = Float.isNaN(keyPosition.mPercentX) ? f21 : keyPosition.mPercentX;
        float f29 = Float.isNaN(keyPosition.mAltPercentY) ? 0.0f : keyPosition.mAltPercentY;
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f21 = keyPosition.mPercentY;
        }
        float f31 = Float.isNaN(keyPosition.mAltPercentX) ? 0.0f : keyPosition.mAltPercentX;
        this.mMode = 0;
        this.f2213mX = (int) (((motionPaths.f2213mX + (f28 * f22)) + (f31 * f23)) - f25);
        this.f2214mY = (int) (((motionPaths.f2214mY + (f22 * f29)) + (f23 * f21)) - f27);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initPath(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f11 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f11;
        this.mDrawPath = keyPosition.mDrawPath;
        float f12 = Float.isNaN(keyPosition.mPercentWidth) ? f11 : keyPosition.mPercentWidth;
        float f13 = Float.isNaN(keyPosition.mPercentHeight) ? f11 : keyPosition.mPercentHeight;
        float f14 = motionPaths2.mWidth - motionPaths.mWidth;
        float f15 = motionPaths2.mHeight - motionPaths.mHeight;
        this.mPosition = this.mTime;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            f11 = keyPosition.mPercentX;
        }
        float f16 = motionPaths.f2213mX;
        float f17 = motionPaths.mWidth;
        float f18 = motionPaths.f2214mY;
        float f19 = motionPaths.mHeight;
        float f21 = f11;
        float f22 = (motionPaths2.f2213mX + (motionPaths2.mWidth / 2.0f)) - ((f17 / 2.0f) + f16);
        float f23 = (motionPaths2.f2214mY + (motionPaths2.mHeight / 2.0f)) - ((f19 / 2.0f) + f18);
        float f24 = f22 * f21;
        float f25 = f14 * f12;
        float f26 = f25 / 2.0f;
        this.f2213mX = (int) ((f16 + f24) - f26);
        float f27 = f23 * f21;
        float f28 = f15 * f13;
        float f29 = f28 / 2.0f;
        this.f2214mY = (int) ((f18 + f27) - f29);
        this.mWidth = (int) (f17 + f25);
        this.mHeight = (int) (f19 + f28);
        float f31 = Float.isNaN(keyPosition.mPercentY) ? 0.0f : keyPosition.mPercentY;
        this.mMode = 1;
        float f32 = (int) ((motionPaths.f2213mX + f24) - f26);
        float f33 = (int) ((motionPaths.f2214mY + f27) - f29);
        this.f2213mX = f32 + ((-f23) * f31);
        this.f2214mY = f33 + (f22 * f31);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initPolar(int i11, int i12, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float fMin;
        float f11;
        float f12 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f12;
        this.mDrawPath = keyPosition.mDrawPath;
        this.mMode = keyPosition.mPositionType;
        float f13 = Float.isNaN(keyPosition.mPercentWidth) ? f12 : keyPosition.mPercentWidth;
        float f14 = Float.isNaN(keyPosition.mPercentHeight) ? f12 : keyPosition.mPercentHeight;
        float f15 = motionPaths2.mWidth;
        float f16 = motionPaths.mWidth;
        float f17 = motionPaths2.mHeight;
        float f18 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        this.mWidth = (int) (f16 + ((f15 - f16) * f13));
        this.mHeight = (int) (f18 + ((f17 - f18) * f14));
        if (keyPosition.mPositionType != 2) {
            float f19 = Float.isNaN(keyPosition.mPercentX) ? f12 : keyPosition.mPercentX;
            float f21 = motionPaths2.f2213mX;
            float f22 = motionPaths.f2213mX;
            this.f2213mX = (f19 * (f21 - f22)) + f22;
            if (!Float.isNaN(keyPosition.mPercentY)) {
                f12 = keyPosition.mPercentY;
            }
            float f23 = motionPaths2.f2214mY;
            float f24 = motionPaths.f2214mY;
            this.f2214mY = (f12 * (f23 - f24)) + f24;
        } else {
            if (Float.isNaN(keyPosition.mPercentX)) {
                float f25 = motionPaths2.f2213mX;
                float f26 = motionPaths.f2213mX;
                fMin = ((f25 - f26) * f12) + f26;
            } else {
                fMin = Math.min(f14, f13) * keyPosition.mPercentX;
            }
            this.f2213mX = fMin;
            if (Float.isNaN(keyPosition.mPercentY)) {
                float f27 = motionPaths2.f2214mY;
                float f28 = motionPaths.f2214mY;
                f11 = (f12 * (f27 - f28)) + f28;
            } else {
                f11 = keyPosition.mPercentY;
            }
            this.f2214mY = f11;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initScreen(int i11, int i12, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f11 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f11;
        this.mDrawPath = keyPosition.mDrawPath;
        float f12 = Float.isNaN(keyPosition.mPercentWidth) ? f11 : keyPosition.mPercentWidth;
        float f13 = Float.isNaN(keyPosition.mPercentHeight) ? f11 : keyPosition.mPercentHeight;
        float f14 = motionPaths2.mWidth;
        float f15 = motionPaths.mWidth;
        float f16 = motionPaths2.mHeight;
        float f17 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        float f18 = motionPaths.f2213mX;
        float f19 = motionPaths.f2214mY;
        float f21 = motionPaths2.f2213mX + (f14 / 2.0f);
        float f22 = motionPaths2.f2214mY + (f16 / 2.0f);
        float f23 = (f14 - f15) * f12;
        this.f2213mX = (int) ((f18 + ((f21 - ((f15 / 2.0f) + f18)) * f11)) - (f23 / 2.0f));
        float f24 = (f16 - f17) * f13;
        this.f2214mY = (int) ((f19 + ((f22 - (f19 + (f17 / 2.0f))) * f11)) - (f24 / 2.0f));
        this.mWidth = (int) (f15 + f23);
        this.mHeight = (int) (f17 + f24);
        this.mMode = 2;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            this.f2213mX = (int) (keyPosition.mPercentX * (i11 - ((int) this.mWidth)));
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            this.f2214mY = (int) (keyPosition.mPercentY * (i12 - ((int) this.mHeight)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void setBounds(float f11, float f12, float f13, float f14) {
        this.f2213mX = f11;
        this.f2214mY = f12;
        this.mWidth = f13;
        this.mHeight = f14;
    }

    public void setDpDt(float f11, float f12, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f17 = (float) dArr[i11];
            double d11 = dArr2[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f13 = f17;
            } else if (i12 == 2) {
                f15 = f17;
            } else if (i12 == 3) {
                f14 = f17;
            } else if (i12 == 4) {
                f16 = f17;
            }
        }
        float f18 = f13 - ((0.0f * f14) / 2.0f);
        float f19 = f15 - ((0.0f * f16) / 2.0f);
        fArr[0] = (f18 * (1.0f - f11)) + (((f14 * 1.0f) + f18) * f11) + 0.0f;
        fArr[1] = (f19 * (1.0f - f12)) + (((f16 * 1.0f) + f19) * f12) + 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setView(float f11, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z11) {
        float f12;
        float fSin = this.f2213mX;
        float fCos = this.f2214mY;
        float f13 = this.mWidth;
        float f14 = this.mHeight;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i11 = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i11];
            this.mTempDelta = new double[i11];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i12 = 0; i12 < iArr.length; i12++) {
            double[] dArr4 = this.mTempValue;
            int i13 = iArr[i12];
            dArr4[i13] = dArr[i12];
            this.mTempDelta[i13] = dArr2[i12];
        }
        float f15 = Float.NaN;
        int i14 = 0;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i14 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i14]) && (dArr3 == null || dArr3[i14] == 0.0d)) {
                f12 = f15;
            } else {
                double d11 = dArr3 != null ? dArr3[i14] : 0.0d;
                if (!Double.isNaN(this.mTempValue[i14])) {
                    d11 = this.mTempValue[i14] + d11;
                }
                f12 = f15;
                float f21 = (float) d11;
                float f22 = (float) this.mTempDelta[i14];
                if (i14 == 1) {
                    f15 = f12;
                    f16 = f22;
                    fSin = f21;
                } else if (i14 == 2) {
                    f15 = f12;
                    f17 = f22;
                    fCos = f21;
                } else if (i14 == 3) {
                    f15 = f12;
                    f18 = f22;
                    f13 = f21;
                } else if (i14 == 4) {
                    f15 = f12;
                    f19 = f22;
                    f14 = f21;
                } else if (i14 == 5) {
                    f15 = f21;
                }
                i14++;
            }
            f15 = f12;
            i14++;
        }
        float f23 = f15;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.getCenter(f11, fArr, fArr2);
            float f24 = fArr[0];
            float f25 = fArr[1];
            float f26 = fArr2[0];
            float f27 = fArr2[1];
            double d12 = f24;
            double d13 = fSin;
            double d14 = fCos;
            fSin = (float) ((d12 + (Math.sin(d14) * d13)) - ((double) (f13 / 2.0f)));
            fCos = (float) ((((double) f25) - (Math.cos(d14) * d13)) - ((double) (f14 / 2.0f)));
            double d15 = f26;
            double d16 = f16;
            double dSin = d15 + (Math.sin(d14) * d16);
            double dCos = Math.cos(d14) * d13;
            double d17 = f17;
            float f28 = (float) (dSin + (dCos * d17));
            float fCos2 = (float) ((((double) f27) - (d16 * Math.cos(d14))) + (Math.sin(d14) * d13 * d17));
            if (dArr2.length >= 2) {
                dArr2[0] = f28;
                dArr2[1] = fCos2;
            }
            if (!Float.isNaN(f23)) {
                view.setRotation((float) (((double) f23) + Math.toDegrees(Math.atan2(fCos2, f28))));
            }
        } else if (!Float.isNaN(f23)) {
            view.setRotation(f23 + ((float) Math.toDegrees(Math.atan2(f17 + (f19 / 2.0f), f16 + (f18 / 2.0f)))) + 0.0f);
        }
        if (view instanceof FloatLayout) {
            ((FloatLayout) view).layout(fSin, fCos, f13 + fSin, f14 + fCos);
            return;
        }
        float f29 = fSin + 0.5f;
        int i15 = (int) f29;
        float f31 = fCos + 0.5f;
        int i16 = (int) f31;
        int i17 = (int) (f29 + f13);
        int i18 = (int) (f31 + f14);
        int i19 = i17 - i15;
        int i21 = i18 - i16;
        if (i19 != view.getMeasuredWidth() || i21 != view.getMeasuredHeight() || z11) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i21, 1073741824));
        }
        view.layout(i15, i16, i17, i18);
    }

    public void setupRelative(MotionController motionController, MotionPaths motionPaths) {
        double d11 = ((this.f2213mX + (this.mWidth / 2.0f)) - motionPaths.f2213mX) - (motionPaths.mWidth / 2.0f);
        double d12 = ((this.f2214mY + (this.mHeight / 2.0f)) - motionPaths.f2214mY) - (motionPaths.mHeight / 2.0f);
        this.mRelativeToController = motionController;
        this.f2213mX = (float) Math.hypot(d12, d11);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.f2214mY = (float) (Math.atan2(d12, d11) + 1.5707963267948966d);
        } else {
            this.f2214mY = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    private boolean diff(float f11, float f12) {
        if (!Float.isNaN(f11) && !Float.isNaN(f12)) {
            if (Math.abs(f11 - f12) <= 1.0E-6f) {
                return false;
            }
            return true;
        }
        if (Float.isNaN(f11) == Float.isNaN(f12)) {
            return false;
        }
        return true;
    }

    public MotionPaths(int i11, int i12, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        int i13 = Key.UNSET;
        this.mPathMotionArc = i13;
        this.mAnimateRelativeTo = i13;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mAttributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != Key.UNSET) {
            initPolar(i11, i12, keyPosition, motionPaths, motionPaths2);
            return;
        }
        int i14 = keyPosition.mPositionType;
        if (i14 == 1) {
            initPath(keyPosition, motionPaths, motionPaths2);
            return;
        }
        if (i14 == 2) {
            initScreen(i11, i12, keyPosition, motionPaths, motionPaths2);
        } else if (i14 != 3) {
            initCartesian(keyPosition, motionPaths, motionPaths2);
        } else {
            initAxis(keyPosition, motionPaths, motionPaths2);
        }
    }

    public void getCenter(double d11, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f11;
        float fSin = this.f2213mX;
        float fCos = this.f2214mY;
        float f12 = this.mWidth;
        float f13 = this.mHeight;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f18 = (float) dArr[i11];
            float f19 = (float) dArr2[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                fSin = f18;
                f14 = f19;
            } else if (i12 == 2) {
                fCos = f18;
                f16 = f19;
            } else if (i12 == 3) {
                f12 = f18;
                f15 = f19;
            } else if (i12 == 4) {
                f13 = f18;
                f17 = f19;
            }
        }
        float f21 = (f15 / 2.0f) + f14;
        float fCos2 = (f17 / 2.0f) + f16;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motionController.getCenter(d11, fArr3, fArr4);
            float f22 = fArr3[0];
            float f23 = fArr3[1];
            float f24 = fArr4[0];
            float f25 = fArr4[1];
            f11 = 2.0f;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) ((((double) f22) + (Math.sin(d13) * d12)) - ((double) (f12 / 2.0f)));
            fCos = (float) ((((double) f23) - (Math.cos(d13) * d12)) - ((double) (f13 / 2.0f)));
            double d14 = f14;
            double dSin = ((double) f24) + (Math.sin(d13) * d14);
            double d15 = f16;
            float fCos3 = (float) (dSin + (Math.cos(d13) * d15));
            fCos2 = (float) ((((double) f25) - (d14 * Math.cos(d13))) + (Math.sin(d13) * d15));
            f21 = fCos3;
        } else {
            f11 = 2.0f;
        }
        fArr[0] = fSin + (f12 / f11) + 0.0f;
        fArr[1] = fCos + (f13 / f11) + 0.0f;
        fArr2[0] = f21;
        fArr2[1] = fCos2;
    }
}
