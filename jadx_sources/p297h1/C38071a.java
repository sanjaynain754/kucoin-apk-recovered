package p297h1;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: renamed from: h1.a */
/* JADX INFO: compiled from: CubicCurveData.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C38071a {

    /* JADX INFO: renamed from: a */
    public final PointF f85700a;

    /* JADX INFO: renamed from: b */
    public final PointF f85701b;

    /* JADX INFO: renamed from: c */
    public final PointF f85702c;

    public C38071a() {
        this.f85700a = new PointF();
        this.f85701b = new PointF();
        this.f85702c = new PointF();
    }

    /* JADX INFO: renamed from: a */
    public PointF m85951a() {
        return this.f85700a;
    }

    /* JADX INFO: renamed from: b */
    public PointF m85952b() {
        return this.f85701b;
    }

    /* JADX INFO: renamed from: c */
    public PointF m85953c() {
        return this.f85702c;
    }

    /* JADX INFO: renamed from: d */
    public void m85954d(float f11, float f12) {
        this.f85700a.set(f11, f12);
    }

    /* JADX INFO: renamed from: e */
    public void m85955e(float f11, float f12) {
        this.f85701b.set(f11, f12);
    }

    /* JADX INFO: renamed from: f */
    public void m85956f(float f11, float f12) {
        this.f85702c.set(f11, f12);
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f85702c.x), Float.valueOf(this.f85702c.y), Float.valueOf(this.f85700a.x), Float.valueOf(this.f85700a.y), Float.valueOf(this.f85701b.x), Float.valueOf(this.f85701b.y));
    }

    public C38071a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f85700a = pointF;
        this.f85701b = pointF2;
        this.f85702c = pointF3;
    }
}
