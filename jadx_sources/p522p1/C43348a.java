package p522p1;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5080h;

/* JADX INFO: renamed from: p1.a */
/* JADX INFO: compiled from: Keyframe.java */
/* JADX INFO: loaded from: classes.dex */
public class C43348a<T> {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final C5080h f95708a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final T f95709b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public T f95710c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final Interpolator f95711d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final Interpolator f95712e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final Interpolator f95713f;

    /* JADX INFO: renamed from: g */
    public final float f95714g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Float f95715h;

    /* JADX INFO: renamed from: i */
    public float f95716i;

    /* JADX INFO: renamed from: j */
    public float f95717j;

    /* JADX INFO: renamed from: k */
    public int f95718k;

    /* JADX INFO: renamed from: l */
    public int f95719l;

    /* JADX INFO: renamed from: m */
    public float f95720m;

    /* JADX INFO: renamed from: n */
    public float f95721n;

    /* JADX INFO: renamed from: o */
    public PointF f95722o;

    /* JADX INFO: renamed from: p */
    public PointF f95723p;

    public C43348a(C5080h c5080h, @Nullable T t11, @Nullable T t12, @Nullable Interpolator interpolator, float f11, @Nullable Float f12) {
        this.f95716i = -3987645.8f;
        this.f95717j = -3987645.8f;
        this.f95718k = 784923401;
        this.f95719l = 784923401;
        this.f95720m = Float.MIN_VALUE;
        this.f95721n = Float.MIN_VALUE;
        this.f95722o = null;
        this.f95723p = null;
        this.f95708a = c5080h;
        this.f95709b = t11;
        this.f95710c = t12;
        this.f95711d = interpolator;
        this.f95712e = null;
        this.f95713f = null;
        this.f95714g = f11;
        this.f95715h = f12;
    }

    /* JADX INFO: renamed from: b */
    public C43348a<T> m95451b(T t11, T t12) {
        return new C43348a<>(t11, t12);
    }

    /* JADX INFO: renamed from: c */
    public float m95452c() {
        if (this.f95708a == null) {
            return 1.0f;
        }
        if (this.f95721n == Float.MIN_VALUE) {
            if (this.f95715h == null) {
                this.f95721n = 1.0f;
            } else {
                this.f95721n = m95455f() + ((this.f95715h.floatValue() - this.f95714g) / this.f95708a.m5654e());
            }
        }
        return this.f95721n;
    }

    /* JADX INFO: renamed from: d */
    public float m95453d() {
        if (this.f95717j == -3987645.8f) {
            this.f95717j = ((Float) this.f95710c).floatValue();
        }
        return this.f95717j;
    }

    /* JADX INFO: renamed from: e */
    public int m95454e() {
        if (this.f95719l == 784923401) {
            this.f95719l = ((Integer) this.f95710c).intValue();
        }
        return this.f95719l;
    }

    /* JADX INFO: renamed from: f */
    public float m95455f() {
        C5080h c5080h = this.f95708a;
        if (c5080h == null) {
            return 0.0f;
        }
        if (this.f95720m == Float.MIN_VALUE) {
            this.f95720m = (this.f95714g - c5080h.m5665p()) / this.f95708a.m5654e();
        }
        return this.f95720m;
    }

    /* JADX INFO: renamed from: g */
    public float m95456g() {
        if (this.f95716i == -3987645.8f) {
            this.f95716i = ((Float) this.f95709b).floatValue();
        }
        return this.f95716i;
    }

    /* JADX INFO: renamed from: h */
    public int m95457h() {
        if (this.f95718k == 784923401) {
            this.f95718k = ((Integer) this.f95709b).intValue();
        }
        return this.f95718k;
    }

    /* JADX INFO: renamed from: i */
    public boolean m95458i() {
        return this.f95711d == null && this.f95712e == null && this.f95713f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f95709b + ", endValue=" + this.f95710c + ", startFrame=" + this.f95714g + ", endFrame=" + this.f95715h + ", interpolator=" + this.f95711d + '}';
    }

    /* JADX INFO: renamed from: a */
    public boolean m95450a(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        if (f11 >= m95455f() && f11 < m95452c()) {
            return true;
        }
        return false;
    }

    public C43348a(C5080h c5080h, @Nullable T t11, @Nullable T t12, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, float f11, @Nullable Float f12) {
        this.f95716i = -3987645.8f;
        this.f95717j = -3987645.8f;
        this.f95718k = 784923401;
        this.f95719l = 784923401;
        this.f95720m = Float.MIN_VALUE;
        this.f95721n = Float.MIN_VALUE;
        this.f95722o = null;
        this.f95723p = null;
        this.f95708a = c5080h;
        this.f95709b = t11;
        this.f95710c = t12;
        this.f95711d = null;
        this.f95712e = interpolator;
        this.f95713f = interpolator2;
        this.f95714g = f11;
        this.f95715h = f12;
    }

    public C43348a(C5080h c5080h, @Nullable T t11, @Nullable T t12, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, @Nullable Interpolator interpolator3, float f11, @Nullable Float f12) {
        this.f95716i = -3987645.8f;
        this.f95717j = -3987645.8f;
        this.f95718k = 784923401;
        this.f95719l = 784923401;
        this.f95720m = Float.MIN_VALUE;
        this.f95721n = Float.MIN_VALUE;
        this.f95722o = null;
        this.f95723p = null;
        this.f95708a = c5080h;
        this.f95709b = t11;
        this.f95710c = t12;
        this.f95711d = interpolator;
        this.f95712e = interpolator2;
        this.f95713f = interpolator3;
        this.f95714g = f11;
        this.f95715h = f12;
    }

    public C43348a(T t11) {
        this.f95716i = -3987645.8f;
        this.f95717j = -3987645.8f;
        this.f95718k = 784923401;
        this.f95719l = 784923401;
        this.f95720m = Float.MIN_VALUE;
        this.f95721n = Float.MIN_VALUE;
        this.f95722o = null;
        this.f95723p = null;
        this.f95708a = null;
        this.f95709b = t11;
        this.f95710c = t11;
        this.f95711d = null;
        this.f95712e = null;
        this.f95713f = null;
        this.f95714g = Float.MIN_VALUE;
        this.f95715h = Float.valueOf(Float.MAX_VALUE);
    }

    public C43348a(T t11, T t12) {
        this.f95716i = -3987645.8f;
        this.f95717j = -3987645.8f;
        this.f95718k = 784923401;
        this.f95719l = 784923401;
        this.f95720m = Float.MIN_VALUE;
        this.f95721n = Float.MIN_VALUE;
        this.f95722o = null;
        this.f95723p = null;
        this.f95708a = null;
        this.f95709b = t11;
        this.f95710c = t12;
        this.f95711d = null;
        this.f95712e = null;
        this.f95713f = null;
        this.f95714g = Float.MIN_VALUE;
        this.f95715h = Float.valueOf(Float.MAX_VALUE);
    }
}
