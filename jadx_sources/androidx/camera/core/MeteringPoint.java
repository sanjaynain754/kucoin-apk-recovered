package androidx.camera.core;

import android.util.Rational;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes23.dex */
public class MeteringPoint {
    private float mNormalizedX;
    private float mNormalizedY;
    private float mSize;
    private Rational mSurfaceAspectRatio;

    public float getSize() {
        return this.mSize;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Rational getSurfaceAspectRatio() {
        return this.mSurfaceAspectRatio;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getX() {
        return this.mNormalizedX;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getY() {
        return this.mNormalizedY;
    }

    public MeteringPoint(float f11, float f12, float f13, Rational rational) {
        this.mNormalizedX = f11;
        this.mNormalizedY = f12;
        this.mSize = f13;
        this.mSurfaceAspectRatio = rational;
    }
}
