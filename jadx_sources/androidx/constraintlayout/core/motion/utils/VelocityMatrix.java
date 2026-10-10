package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes23.dex */
public class VelocityMatrix {
    private static String sTag = "VelocityMatrix";
    float mDRotate;
    float mDScaleX;
    float mDScaleY;
    float mDTranslateX;
    float mDTranslateY;
    float mRotate;

    public void clear() {
        this.mDRotate = 0.0f;
        this.mDTranslateY = 0.0f;
        this.mDTranslateX = 0.0f;
        this.mDScaleY = 0.0f;
        this.mDScaleX = 0.0f;
    }

    public void setRotationVelocity(SplineSet splineSet, float f11) {
        if (splineSet != null) {
            this.mDRotate = splineSet.getSlope(f11);
            this.mRotate = splineSet.get(f11);
        }
    }

    public void setScaleVelocity(SplineSet splineSet, SplineSet splineSet2, float f11) {
        if (splineSet != null) {
            this.mDScaleX = splineSet.getSlope(f11);
        }
        if (splineSet2 != null) {
            this.mDScaleY = splineSet2.getSlope(f11);
        }
    }

    public void setTranslationVelocity(SplineSet splineSet, SplineSet splineSet2, float f11) {
        if (splineSet != null) {
            this.mDTranslateX = splineSet.getSlope(f11);
        }
        if (splineSet2 != null) {
            this.mDTranslateY = splineSet2.getSlope(f11);
        }
    }

    public void applyTransform(float f11, float f12, int i11, int i12, float[] fArr) {
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = (f11 - 0.5f) * 2.0f;
        float f16 = (f12 - 0.5f) * 2.0f;
        float f17 = f13 + this.mDTranslateX;
        float f18 = f14 + this.mDTranslateY;
        float f19 = f17 + (this.mDScaleX * f15);
        float f21 = f18 + (this.mDScaleY * f16);
        float radians = (float) Math.toRadians(this.mRotate);
        float radians2 = (float) Math.toRadians(this.mDRotate);
        double d11 = radians;
        double d12 = i12 * f16;
        float fSin = f19 + (((float) ((((double) ((-i11) * f15)) * Math.sin(d11)) - (Math.cos(d11) * d12))) * radians2);
        float fCos = f21 + (radians2 * ((float) ((((double) (i11 * f15)) * Math.cos(d11)) - (d12 * Math.sin(d11)))));
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    public void setRotationVelocity(KeyCycleOscillator keyCycleOscillator, float f11) {
        if (keyCycleOscillator != null) {
            this.mDRotate = keyCycleOscillator.getSlope(f11);
        }
    }

    public void setScaleVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f11) {
        if (keyCycleOscillator != null) {
            this.mDScaleX = keyCycleOscillator.getSlope(f11);
        }
        if (keyCycleOscillator2 != null) {
            this.mDScaleY = keyCycleOscillator2.getSlope(f11);
        }
    }

    public void setTranslationVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f11) {
        if (keyCycleOscillator != null) {
            this.mDTranslateX = keyCycleOscillator.getSlope(f11);
        }
        if (keyCycleOscillator2 != null) {
            this.mDTranslateY = keyCycleOscillator2.getSlope(f11);
        }
    }
}
