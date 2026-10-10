package androidx.camera.core;

import android.graphics.PointF;
import android.util.Rational;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes23.dex */
public abstract class MeteringPointFactory {
    private Rational mSurfaceAspectRatio;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MeteringPointFactory() {
        this(null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract PointF convertPoint(float f11, float f12);

    public final MeteringPoint createPoint(float f11, float f12) {
        return createPoint(f11, f12, getDefaultPointSize());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MeteringPointFactory(Rational rational) {
        this.mSurfaceAspectRatio = rational;
    }

    public final MeteringPoint createPoint(float f11, float f12, float f13) {
        PointF pointFConvertPoint = convertPoint(f11, f12);
        return new MeteringPoint(pointFConvertPoint.x, pointFConvertPoint.y, f13, this.mSurfaceAspectRatio);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSurfaceAspectRatio(Rational rational) {
        this.mSurfaceAspectRatio = rational;
    }

    public static float getDefaultPointSize() {
        return 0.15f;
    }
}
