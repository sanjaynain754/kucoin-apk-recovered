package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes23.dex */
public class MotionKeyPosition extends MotionKey {
    static final int KEY_TYPE = 2;
    static final String NAME = "KeyPosition";
    protected static final float SELECTION_SLOPE = 20.0f;
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    public float mAltPercentX;
    public float mAltPercentY;
    private float mCalculatedPositionX;
    private float mCalculatedPositionY;
    public int mCurveFit;
    public int mDrawPath;
    public int mPathMotionArc;
    public float mPercentHeight;
    public float mPercentWidth;
    public float mPercentX;
    public float mPercentY;
    public int mPositionType;
    public String mTransitionEasing;

    private void calcCartesianPosition(float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float f17 = Float.isNaN(this.mPercentX) ? 0.0f : this.mPercentX;
        float f18 = Float.isNaN(this.mAltPercentY) ? 0.0f : this.mAltPercentY;
        float f19 = Float.isNaN(this.mPercentY) ? 0.0f : this.mPercentY;
        this.mCalculatedPositionX = (int) (f11 + (f17 * f15) + ((Float.isNaN(this.mAltPercentX) ? 0.0f : this.mAltPercentX) * f16));
        this.mCalculatedPositionY = (int) (f12 + (f15 * f18) + (f16 * f19));
    }

    private void calcPathPosition(float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float f17 = this.mPercentX;
        float f18 = this.mPercentY;
        this.mCalculatedPositionX = f11 + (f15 * f17) + ((-f16) * f18);
        this.mCalculatedPositionY = f12 + (f16 * f17) + (f15 * f18);
    }

    private void calcScreenPosition(int i11, int i12) {
        float f11 = this.mPercentX;
        float f12 = 0;
        this.mCalculatedPositionX = (i11 * f11) + f12;
        this.mCalculatedPositionY = (i12 * f11) + f12;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, int i12) {
        if (i11 == 100) {
            this.mFramePosition = i12;
            return true;
        }
        if (i11 == 508) {
            this.mCurveFit = i12;
            return true;
        }
        if (i11 != 510) {
            return super.setValue(i11, i12);
        }
        this.mPositionType = i12;
        return true;
    }

    public void calcPosition(int i11, int i12, float f11, float f12, float f13, float f14) {
        int i13 = this.mPositionType;
        if (i13 == 1) {
            calcPathPosition(f11, f12, f13, f14);
        } else if (i13 != 2) {
            calcCartesianPosition(f11, f12, f13, f14);
        } else {
            calcScreenPosition(i11, i12);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: clone */
    public MotionKey mo103472clone() {
        return new MotionKeyPosition().copy(this);
    }

    public float getPositionX() {
        return this.mCalculatedPositionX;
    }

    public float getPositionY() {
        return this.mCalculatedPositionY;
    }

    public void positionAttributes(MotionWidget motionWidget, FloatRect floatRect, FloatRect floatRect2, float f11, float f12, String[] strArr, float[] fArr) {
        int i11 = this.mPositionType;
        if (i11 == 1) {
            positionPathAttributes(floatRect, floatRect2, f11, f12, strArr, fArr);
        } else if (i11 != 2) {
            positionCartAttributes(floatRect, floatRect2, f11, f12, strArr, fArr);
        } else {
            positionScreenAttributes(motionWidget, floatRect, floatRect2, f11, f12, strArr, fArr);
        }
    }

    public MotionKeyPosition() {
        int i11 = MotionKey.UNSET;
        this.mCurveFit = i11;
        this.mTransitionEasing = null;
        this.mPathMotionArc = i11;
        this.mDrawPath = 0;
        this.mPercentWidth = Float.NaN;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = Float.NaN;
        this.mPercentY = Float.NaN;
        this.mAltPercentX = Float.NaN;
        this.mAltPercentY = Float.NaN;
        this.mPositionType = 0;
        this.mCalculatedPositionX = Float.NaN;
        this.mCalculatedPositionY = Float.NaN;
        this.mType = 2;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey copy(MotionKey motionKey) {
        super.copy(motionKey);
        MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
        this.mTransitionEasing = motionKeyPosition.mTransitionEasing;
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mPercentWidth = motionKeyPosition.mPercentWidth;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = motionKeyPosition.mPercentX;
        this.mPercentY = motionKeyPosition.mPercentY;
        this.mAltPercentX = motionKeyPosition.mAltPercentX;
        this.mAltPercentY = motionKeyPosition.mAltPercentY;
        this.mCalculatedPositionX = motionKeyPosition.mCalculatedPositionX;
        this.mCalculatedPositionY = motionKeyPosition.mCalculatedPositionY;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return TypedValues.PositionType.getId(str);
    }

    public boolean intersects(int i11, int i12, FloatRect floatRect, FloatRect floatRect2, float f11, float f12) {
        calcPosition(i11, i12, floatRect.centerX(), floatRect.centerY(), floatRect2.centerX(), floatRect2.centerY());
        if (Math.abs(f11 - this.mCalculatedPositionX) < SELECTION_SLOPE && Math.abs(f12 - this.mCalculatedPositionY) < SELECTION_SLOPE) {
            return true;
        }
        return false;
    }

    public void positionCartAttributes(FloatRect floatRect, FloatRect floatRect2, float f11, float f12, String[] strArr, float[] fArr) {
        float fCenterX = floatRect.centerX();
        float fCenterY = floatRect.centerY();
        float fCenterX2 = floatRect2.centerX() - fCenterX;
        float fCenterY2 = floatRect2.centerY() - fCenterY;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = (f11 - fCenterX) / fCenterX2;
                fArr[1] = (f12 - fCenterY) / fCenterY2;
                return;
            } else {
                fArr[1] = (f11 - fCenterX) / fCenterX2;
                fArr[0] = (f12 - fCenterY) / fCenterY2;
                return;
            }
        }
        strArr[0] = "percentX";
        fArr[0] = (f11 - fCenterX) / fCenterX2;
        strArr[1] = "percentY";
        fArr[1] = (f12 - fCenterY) / fCenterY2;
    }

    public void positionPathAttributes(FloatRect floatRect, FloatRect floatRect2, float f11, float f12, String[] strArr, float[] fArr) {
        float fCenterX = floatRect.centerX();
        float fCenterY = floatRect.centerY();
        float fCenterX2 = floatRect2.centerX() - fCenterX;
        float fCenterY2 = floatRect2.centerY() - fCenterY;
        float fHypot = (float) Math.hypot(fCenterX2, fCenterY2);
        if (fHypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f13 = fCenterX2 / fHypot;
        float f14 = fCenterY2 / fHypot;
        float f15 = f12 - fCenterY;
        float f16 = f11 - fCenterX;
        float f17 = ((f13 * f15) - (f16 * f14)) / fHypot;
        float f18 = ((f13 * f16) + (f14 * f15)) / fHypot;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f18;
                fArr[1] = f17;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f18;
        fArr[1] = f17;
    }

    public void positionScreenAttributes(MotionWidget motionWidget, FloatRect floatRect, FloatRect floatRect2, float f11, float f12, String[] strArr, float[] fArr) {
        floatRect.centerX();
        floatRect.centerY();
        floatRect2.centerX();
        floatRect2.centerY();
        MotionWidget parent = motionWidget.getParent();
        int width = parent.getWidth();
        int height = parent.getHeight();
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f11 / width;
                fArr[1] = f12 / height;
                return;
            } else {
                fArr[1] = f11 / width;
                fArr[0] = f12 / height;
                return;
            }
        }
        strArr[0] = "percentX";
        fArr[0] = f11 / width;
        strArr[1] = "percentY";
        fArr[1] = f12 / height;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, float f11) {
        switch (i11) {
            case 503:
                this.mPercentWidth = f11;
                return true;
            case 504:
                this.mPercentHeight = f11;
                return true;
            case 505:
                this.mPercentWidth = f11;
                this.mPercentHeight = f11;
                return true;
            case 506:
                this.mPercentX = f11;
                return true;
            case 507:
                this.mPercentY = f11;
                return true;
            default:
                return super.setValue(i11, f11);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, String str) {
        if (i11 != 501) {
            return super.setValue(i11, str);
        }
        this.mTransitionEasing = str.toString();
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> map) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
    }
}
