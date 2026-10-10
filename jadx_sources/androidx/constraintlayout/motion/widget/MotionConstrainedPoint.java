package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes23.dex */
class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {
    static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    static final int PERPENDICULAR = 1;
    public static final String TAG = "MotionPaths";
    static String[] sNames = {ViewProps.POSITION, "x", "y", "width", "height", "pathRotate"};
    private float mHeight;
    private Easing mKeyFrameEasing;
    private float mPosition;
    int mVisibility;
    private float mWidth;

    /* JADX INFO: renamed from: mX */
    private float f2211mX;

    /* JADX INFO: renamed from: mY */
    private float f2212mY;
    public float rotationY = 0.0f;
    int mVisibilityMode = 0;
    LinkedHashMap<String, ConstraintAttribute> mAttributes = new LinkedHashMap<>();
    int mMode = 0;
    double[] mTempValue = new double[18];
    double[] mTempDelta = new double[18];
    private float mAlpha = 1.0f;
    private boolean mApplyElevation = false;
    private float mElevation = 0.0f;
    private float mRotation = 0.0f;
    private float mRotationX = 0.0f;
    private float mScaleX = 1.0f;
    private float mScaleY = 1.0f;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float mTranslationX = 0.0f;
    private float mTranslationY = 0.0f;
    private float mTranslationZ = 0.0f;
    private int mDrawPath = 0;
    private float mPathRotate = Float.NaN;
    private float mProgress = Float.NaN;
    private int mAnimateRelativeTo = -1;

    public void addValues(HashMap<String, ViewSpline> map, int i11) {
        for (String str : map.keySet()) {
            ViewSpline viewSpline = map.get(str);
            if (viewSpline != null) {
                str.getClass();
                switch (str) {
                    case "rotationX":
                        viewSpline.setPoint(i11, Float.isNaN(this.mRotationX) ? 0.0f : this.mRotationX);
                        break;
                    case "rotationY":
                        viewSpline.setPoint(i11, Float.isNaN(this.rotationY) ? 0.0f : this.rotationY);
                        break;
                    case "translationX":
                        viewSpline.setPoint(i11, Float.isNaN(this.mTranslationX) ? 0.0f : this.mTranslationX);
                        break;
                    case "translationY":
                        viewSpline.setPoint(i11, Float.isNaN(this.mTranslationY) ? 0.0f : this.mTranslationY);
                        break;
                    case "translationZ":
                        viewSpline.setPoint(i11, Float.isNaN(this.mTranslationZ) ? 0.0f : this.mTranslationZ);
                        break;
                    case "progress":
                        viewSpline.setPoint(i11, Float.isNaN(this.mProgress) ? 0.0f : this.mProgress);
                        break;
                    case "scaleX":
                        viewSpline.setPoint(i11, Float.isNaN(this.mScaleX) ? 1.0f : this.mScaleX);
                        break;
                    case "scaleY":
                        viewSpline.setPoint(i11, Float.isNaN(this.mScaleY) ? 1.0f : this.mScaleY);
                        break;
                    case "transformPivotX":
                        viewSpline.setPoint(i11, Float.isNaN(this.mPivotX) ? 0.0f : this.mPivotX);
                        break;
                    case "transformPivotY":
                        viewSpline.setPoint(i11, Float.isNaN(this.mPivotY) ? 0.0f : this.mPivotY);
                        break;
                    case "rotation":
                        viewSpline.setPoint(i11, Float.isNaN(this.mRotation) ? 0.0f : this.mRotation);
                        break;
                    case "elevation":
                        viewSpline.setPoint(i11, Float.isNaN(this.mElevation) ? 0.0f : this.mElevation);
                        break;
                    case "transitionPathRotate":
                        viewSpline.setPoint(i11, Float.isNaN(this.mPathRotate) ? 0.0f : this.mPathRotate);
                        break;
                    case "alpha":
                        viewSpline.setPoint(i11, Float.isNaN(this.mAlpha) ? 1.0f : this.mAlpha);
                        break;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.e("MotionPaths", "UNKNOWN spline " + str);
                            break;
                        } else {
                            String str2 = str.split(",")[1];
                            if (this.mAttributes.containsKey(str2)) {
                                ConstraintAttribute constraintAttribute = this.mAttributes.get(str2);
                                if (viewSpline instanceof ViewSpline.CustomSet) {
                                    ((ViewSpline.CustomSet) viewSpline).setPoint(i11, constraintAttribute);
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i11 + ", value" + constraintAttribute.getValueToInterpolate() + viewSpline);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        }
    }

    public void applyParameters(View view) {
        this.mVisibility = view.getVisibility();
        this.mAlpha = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.mApplyElevation = false;
        this.mElevation = view.getElevation();
        this.mRotation = view.getRotation();
        this.mRotationX = view.getRotationX();
        this.rotationY = view.getRotationY();
        this.mScaleX = view.getScaleX();
        this.mScaleY = view.getScaleY();
        this.mPivotX = view.getPivotX();
        this.mPivotY = view.getPivotY();
        this.mTranslationX = view.getTranslationX();
        this.mTranslationY = view.getTranslationY();
        this.mTranslationZ = view.getTranslationZ();
    }

    public void different(MotionConstrainedPoint motionConstrainedPoint, HashSet<String> hashSet) {
        if (diff(this.mAlpha, motionConstrainedPoint.mAlpha)) {
            hashSet.add("alpha");
        }
        if (diff(this.mElevation, motionConstrainedPoint.mElevation)) {
            hashSet.add("elevation");
        }
        int i11 = this.mVisibility;
        int i12 = motionConstrainedPoint.mVisibility;
        if (i11 != i12 && this.mVisibilityMode == 0 && (i11 == 0 || i12 == 0)) {
            hashSet.add("alpha");
        }
        if (diff(this.mRotation, motionConstrainedPoint.mRotation)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.mPathRotate) || !Float.isNaN(motionConstrainedPoint.mPathRotate)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.mProgress) || !Float.isNaN(motionConstrainedPoint.mProgress)) {
            hashSet.add("progress");
        }
        if (diff(this.mRotationX, motionConstrainedPoint.mRotationX)) {
            hashSet.add("rotationX");
        }
        if (diff(this.rotationY, motionConstrainedPoint.rotationY)) {
            hashSet.add("rotationY");
        }
        if (diff(this.mPivotX, motionConstrainedPoint.mPivotX)) {
            hashSet.add(Key.PIVOT_X);
        }
        if (diff(this.mPivotY, motionConstrainedPoint.mPivotY)) {
            hashSet.add(Key.PIVOT_Y);
        }
        if (diff(this.mScaleX, motionConstrainedPoint.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (diff(this.mScaleY, motionConstrainedPoint.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (diff(this.mTranslationX, motionConstrainedPoint.mTranslationX)) {
            hashSet.add("translationX");
        }
        if (diff(this.mTranslationY, motionConstrainedPoint.mTranslationY)) {
            hashSet.add("translationY");
        }
        if (diff(this.mTranslationZ, motionConstrainedPoint.mTranslationZ)) {
            hashSet.add("translationZ");
        }
    }

    public void setState(View view) {
        setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        applyParameters(view);
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        return Float.compare(this.mPosition, motionConstrainedPoint.mPosition);
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        int i11 = 0;
        float[] fArr = {this.mPosition, this.f2211mX, this.f2212mY, this.mWidth, this.mHeight, this.mAlpha, this.mElevation, this.mRotation, this.mRotationX, this.rotationY, this.mScaleX, this.mScaleY, this.mPivotX, this.mPivotY, this.mTranslationX, this.mTranslationY, this.mTranslationZ, this.mPathRotate};
        for (int i12 : iArr) {
            if (i12 < 18) {
                dArr[i11] = fArr[i12];
                i11++;
            }
        }
    }

    public int getCustomData(String str, double[] dArr, int i11) {
        ConstraintAttribute constraintAttribute = this.mAttributes.get(str);
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            dArr[i11] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int iNumberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        float[] fArr = new float[iNumberOfInterpolatedValues];
        constraintAttribute.getValuesToInterpolate(fArr);
        int i12 = 0;
        while (i12 < iNumberOfInterpolatedValues) {
            dArr[i11] = fArr[i12];
            i12++;
            i11++;
        }
        return iNumberOfInterpolatedValues;
    }

    public int getCustomDataCount(String str) {
        return this.mAttributes.get(str).numberOfInterpolatedValues();
    }

    public boolean hasCustomData(String str) {
        return this.mAttributes.containsKey(str);
    }

    public void setBounds(float f11, float f12, float f13, float f14) {
        this.f2211mX = f11;
        this.f2212mY = f12;
        this.mWidth = f13;
        this.mHeight = f14;
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

    public void setState(Rect rect, View view, int i11, float f11) {
        setBounds(rect.left, rect.top, rect.width(), rect.height());
        applyParameters(view);
        this.mPivotX = Float.NaN;
        this.mPivotY = Float.NaN;
        if (i11 == 1) {
            this.mRotation = f11 - 90.0f;
        } else {
            if (i11 != 2) {
                return;
            }
            this.mRotation = f11 + 90.0f;
        }
    }

    public void setState(Rect rect, ConstraintSet constraintSet, int i11, int i12) {
        setBounds(rect.left, rect.top, rect.width(), rect.height());
        applyParameters(constraintSet.getParameters(i12));
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return;
                    }
                }
            }
            float f11 = this.mRotation + 90.0f;
            this.mRotation = f11;
            if (f11 > 180.0f) {
                this.mRotation = f11 - 360.0f;
                return;
            }
            return;
        }
        this.mRotation -= 90.0f;
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        ConstraintSet.PropertySet propertySet = constraint.propertySet;
        int i11 = propertySet.mVisibilityMode;
        this.mVisibilityMode = i11;
        int i12 = propertySet.visibility;
        this.mVisibility = i12;
        this.mAlpha = (i12 == 0 || i11 != 0) ? propertySet.alpha : 0.0f;
        ConstraintSet.Transform transform = constraint.transform;
        this.mApplyElevation = transform.applyElevation;
        this.mElevation = transform.elevation;
        this.mRotation = transform.rotation;
        this.mRotationX = transform.rotationX;
        this.rotationY = transform.rotationY;
        this.mScaleX = transform.scaleX;
        this.mScaleY = transform.scaleY;
        this.mPivotX = transform.transformPivotX;
        this.mPivotY = transform.transformPivotY;
        this.mTranslationX = transform.translationX;
        this.mTranslationY = transform.translationY;
        this.mTranslationZ = transform.translationZ;
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mProgress = constraint.propertySet.mProgress;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute.isContinuous()) {
                this.mAttributes.put(str, constraintAttribute);
            }
        }
    }

    public void different(MotionConstrainedPoint motionConstrainedPoint, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | diff(this.mPosition, motionConstrainedPoint.mPosition);
        zArr[1] = zArr[1] | diff(this.f2211mX, motionConstrainedPoint.f2211mX);
        zArr[2] = zArr[2] | diff(this.f2212mY, motionConstrainedPoint.f2212mY);
        zArr[3] = zArr[3] | diff(this.mWidth, motionConstrainedPoint.mWidth);
        zArr[4] = diff(this.mHeight, motionConstrainedPoint.mHeight) | zArr[4];
    }
}
