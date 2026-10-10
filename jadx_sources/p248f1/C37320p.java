package p248f1;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.InterfaceC5091m0;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import java.util.Collections;
import p328i1.C38404l;
import p522p1.C43348a;
import p522p1.C43350c;
import p522p1.C43351d;

/* JADX INFO: renamed from: f1.p */
/* JADX INFO: compiled from: TransformKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class C37320p {

    /* JADX INFO: renamed from: a */
    public final Matrix f82816a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final Matrix f82817b;

    /* JADX INFO: renamed from: c */
    public final Matrix f82818c;

    /* JADX INFO: renamed from: d */
    public final Matrix f82819d;

    /* JADX INFO: renamed from: e */
    public final float[] f82820e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public AbstractC37305a<PointF, PointF> f82821f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public AbstractC37305a<?, PointF> f82822g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public AbstractC37305a<C43351d, C43351d> f82823h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public AbstractC37305a<Float, Float> f82824i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public AbstractC37305a<Integer, Integer> f82825j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public C37308d f82826k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public C37308d f82827l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public AbstractC37305a<?, Float> f82828m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public AbstractC37305a<?, Float> f82829n;

    /* JADX INFO: renamed from: o */
    public final boolean f82830o;

    /* JADX INFO: renamed from: d */
    public final void m83883d() {
        for (int i11 = 0; i11 < 9; i11++) {
            this.f82820e[i11] = 0.0f;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83880a(AbstractC5095a abstractC5095a) {
        abstractC5095a.m5791i(this.f82825j);
        abstractC5095a.m5791i(this.f82828m);
        abstractC5095a.m5791i(this.f82829n);
        abstractC5095a.m5791i(this.f82821f);
        abstractC5095a.m5791i(this.f82822g);
        abstractC5095a.m5791i(this.f82823h);
        abstractC5095a.m5791i(this.f82824i);
        abstractC5095a.m5791i(this.f82826k);
        abstractC5095a.m5791i(this.f82827l);
    }

    /* JADX INFO: renamed from: b */
    public void m83881b(AbstractC37305a.b bVar) {
        AbstractC37305a<Integer, Integer> abstractC37305a = this.f82825j;
        if (abstractC37305a != null) {
            abstractC37305a.m83824a(bVar);
        }
        AbstractC37305a<?, Float> abstractC37305a2 = this.f82828m;
        if (abstractC37305a2 != null) {
            abstractC37305a2.m83824a(bVar);
        }
        AbstractC37305a<?, Float> abstractC37305a3 = this.f82829n;
        if (abstractC37305a3 != null) {
            abstractC37305a3.m83824a(bVar);
        }
        AbstractC37305a<PointF, PointF> abstractC37305a4 = this.f82821f;
        if (abstractC37305a4 != null) {
            abstractC37305a4.m83824a(bVar);
        }
        AbstractC37305a<?, PointF> abstractC37305a5 = this.f82822g;
        if (abstractC37305a5 != null) {
            abstractC37305a5.m83824a(bVar);
        }
        AbstractC37305a<C43351d, C43351d> abstractC37305a6 = this.f82823h;
        if (abstractC37305a6 != null) {
            abstractC37305a6.m83824a(bVar);
        }
        AbstractC37305a<Float, Float> abstractC37305a7 = this.f82824i;
        if (abstractC37305a7 != null) {
            abstractC37305a7.m83824a(bVar);
        }
        C37308d c37308d = this.f82826k;
        if (c37308d != null) {
            c37308d.m83824a(bVar);
        }
        C37308d c37308d2 = this.f82827l;
        if (c37308d2 != null) {
            c37308d2.m83824a(bVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public <T> boolean m83882c(T t11, @Nullable C43350c<T> c43350c) {
        if (t11 == InterfaceC5091m0.f6012f) {
            AbstractC37305a<PointF, PointF> abstractC37305a = this.f82821f;
            if (abstractC37305a == null) {
                this.f82821f = new C37321q(c43350c, new PointF());
                return true;
            }
            abstractC37305a.m83838o(c43350c);
            return true;
        }
        if (t11 == InterfaceC5091m0.f6013g) {
            AbstractC37305a<?, PointF> abstractC37305a2 = this.f82822g;
            if (abstractC37305a2 == null) {
                this.f82822g = new C37321q(c43350c, new PointF());
                return true;
            }
            abstractC37305a2.m83838o(c43350c);
            return true;
        }
        if (t11 == InterfaceC5091m0.f6014h) {
            AbstractC37305a<?, PointF> abstractC37305a3 = this.f82822g;
            if (abstractC37305a3 instanceof C37318n) {
                ((C37318n) abstractC37305a3).m83875s(c43350c);
                return true;
            }
        }
        if (t11 == InterfaceC5091m0.f6015i) {
            AbstractC37305a<?, PointF> abstractC37305a4 = this.f82822g;
            if (abstractC37305a4 instanceof C37318n) {
                ((C37318n) abstractC37305a4).m83876t(c43350c);
                return true;
            }
        }
        if (t11 == InterfaceC5091m0.f6021o) {
            AbstractC37305a<C43351d, C43351d> abstractC37305a5 = this.f82823h;
            if (abstractC37305a5 == null) {
                this.f82823h = new C37321q(c43350c, new C43351d());
                return true;
            }
            abstractC37305a5.m83838o(c43350c);
            return true;
        }
        if (t11 == InterfaceC5091m0.f6022p) {
            AbstractC37305a<Float, Float> abstractC37305a6 = this.f82824i;
            if (abstractC37305a6 == null) {
                this.f82824i = new C37321q(c43350c, Float.valueOf(0.0f));
                return true;
            }
            abstractC37305a6.m83838o(c43350c);
            return true;
        }
        if (t11 == InterfaceC5091m0.f6009c) {
            AbstractC37305a<Integer, Integer> abstractC37305a7 = this.f82825j;
            if (abstractC37305a7 == null) {
                this.f82825j = new C37321q(c43350c, 100);
                return true;
            }
            abstractC37305a7.m83838o(c43350c);
            return true;
        }
        if (t11 == InterfaceC5091m0.f5993C) {
            AbstractC37305a<?, Float> abstractC37305a8 = this.f82828m;
            if (abstractC37305a8 == null) {
                this.f82828m = new C37321q(c43350c, Float.valueOf(100.0f));
                return true;
            }
            abstractC37305a8.m83838o(c43350c);
            return true;
        }
        if (t11 == InterfaceC5091m0.f5994D) {
            AbstractC37305a<?, Float> abstractC37305a9 = this.f82829n;
            if (abstractC37305a9 == null) {
                this.f82829n = new C37321q(c43350c, Float.valueOf(100.0f));
                return true;
            }
            abstractC37305a9.m83838o(c43350c);
            return true;
        }
        if (t11 == InterfaceC5091m0.f6023q) {
            if (this.f82826k == null) {
                this.f82826k = new C37308d(Collections.singletonList(new C43348a(Float.valueOf(0.0f))));
            }
            this.f82826k.m83838o(c43350c);
            return true;
        }
        if (t11 != InterfaceC5091m0.f6024r) {
            return false;
        }
        if (this.f82827l == null) {
            this.f82827l = new C37308d(Collections.singletonList(new C43348a(Float.valueOf(0.0f))));
        }
        this.f82827l.m83838o(c43350c);
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public AbstractC37305a<?, Float> m83884e() {
        return this.f82829n;
    }

    /* JADX INFO: renamed from: f */
    public Matrix m83885f() {
        PointF pointFMo83831h;
        C43351d c43351dMo83831h;
        PointF pointFMo83831h2;
        this.f82816a.reset();
        AbstractC37305a<?, PointF> abstractC37305a = this.f82822g;
        if (abstractC37305a != null && (pointFMo83831h2 = abstractC37305a.mo83831h()) != null) {
            float f11 = pointFMo83831h2.x;
            if (f11 != 0.0f || pointFMo83831h2.y != 0.0f) {
                this.f82816a.preTranslate(f11, pointFMo83831h2.y);
            }
        }
        if (!this.f82830o) {
            AbstractC37305a<Float, Float> abstractC37305a2 = this.f82824i;
            if (abstractC37305a2 != null) {
                float fFloatValue = abstractC37305a2 instanceof C37321q ? abstractC37305a2.mo83831h().floatValue() : ((C37308d) abstractC37305a2).m83855q();
                if (fFloatValue != 0.0f) {
                    this.f82816a.preRotate(fFloatValue);
                }
            }
        } else if (abstractC37305a != null) {
            float fM83829f = abstractC37305a.m83829f();
            PointF pointFMo83831h3 = abstractC37305a.mo83831h();
            float f12 = pointFMo83831h3.x;
            float f13 = pointFMo83831h3.y;
            abstractC37305a.mo83837n(1.0E-4f + fM83829f);
            PointF pointFMo83831h4 = abstractC37305a.mo83831h();
            abstractC37305a.mo83837n(fM83829f);
            this.f82816a.preRotate((float) Math.toDegrees(Math.atan2(pointFMo83831h4.y - f13, pointFMo83831h4.x - f12)));
        }
        C37308d c37308d = this.f82826k;
        if (c37308d != null) {
            C37308d c37308d2 = this.f82827l;
            float fCos = c37308d2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-c37308d2.m83855q()) + 90.0f));
            C37308d c37308d3 = this.f82827l;
            float fSin = c37308d3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-c37308d3.m83855q()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(c37308d.m83855q()));
            m83883d();
            float[] fArr = this.f82820e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f14 = -fSin;
            fArr[3] = f14;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f82817b.setValues(fArr);
            m83883d();
            float[] fArr2 = this.f82820e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f82818c.setValues(fArr2);
            m83883d();
            float[] fArr3 = this.f82820e;
            fArr3[0] = fCos;
            fArr3[1] = f14;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f82819d.setValues(fArr3);
            this.f82818c.preConcat(this.f82817b);
            this.f82819d.preConcat(this.f82818c);
            this.f82816a.preConcat(this.f82819d);
        }
        AbstractC37305a<C43351d, C43351d> abstractC37305a3 = this.f82823h;
        if (abstractC37305a3 != null && (c43351dMo83831h = abstractC37305a3.mo83831h()) != null && (c43351dMo83831h.m95470b() != 1.0f || c43351dMo83831h.m95471c() != 1.0f)) {
            this.f82816a.preScale(c43351dMo83831h.m95470b(), c43351dMo83831h.m95471c());
        }
        AbstractC37305a<PointF, PointF> abstractC37305a4 = this.f82821f;
        if (abstractC37305a4 != null && (pointFMo83831h = abstractC37305a4.mo83831h()) != null) {
            float f15 = pointFMo83831h.x;
            if (f15 != 0.0f || pointFMo83831h.y != 0.0f) {
                this.f82816a.preTranslate(-f15, -pointFMo83831h.y);
            }
        }
        return this.f82816a;
    }

    /* JADX INFO: renamed from: g */
    public Matrix m83886g(float f11) {
        AbstractC37305a<?, PointF> abstractC37305a = this.f82822g;
        PointF pointFMo83831h = abstractC37305a == null ? null : abstractC37305a.mo83831h();
        AbstractC37305a<C43351d, C43351d> abstractC37305a2 = this.f82823h;
        C43351d c43351dMo83831h = abstractC37305a2 == null ? null : abstractC37305a2.mo83831h();
        this.f82816a.reset();
        if (pointFMo83831h != null) {
            this.f82816a.preTranslate(pointFMo83831h.x * f11, pointFMo83831h.y * f11);
        }
        if (c43351dMo83831h != null) {
            double d11 = f11;
            this.f82816a.preScale((float) Math.pow(c43351dMo83831h.m95470b(), d11), (float) Math.pow(c43351dMo83831h.m95471c(), d11));
        }
        AbstractC37305a<Float, Float> abstractC37305a3 = this.f82824i;
        if (abstractC37305a3 != null) {
            float fFloatValue = abstractC37305a3.mo83831h().floatValue();
            AbstractC37305a<PointF, PointF> abstractC37305a4 = this.f82821f;
            PointF pointFMo83831h2 = abstractC37305a4 != null ? abstractC37305a4.mo83831h() : null;
            this.f82816a.preRotate(fFloatValue * f11, pointFMo83831h2 == null ? 0.0f : pointFMo83831h2.x, pointFMo83831h2 != null ? pointFMo83831h2.y : 0.0f);
        }
        return this.f82816a;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public AbstractC37305a<?, Integer> m83887h() {
        return this.f82825j;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public AbstractC37305a<?, Float> m83888i() {
        return this.f82828m;
    }

    /* JADX INFO: renamed from: j */
    public void m83889j(float f11) {
        AbstractC37305a<Integer, Integer> abstractC37305a = this.f82825j;
        if (abstractC37305a != null) {
            abstractC37305a.mo83837n(f11);
        }
        AbstractC37305a<?, Float> abstractC37305a2 = this.f82828m;
        if (abstractC37305a2 != null) {
            abstractC37305a2.mo83837n(f11);
        }
        AbstractC37305a<?, Float> abstractC37305a3 = this.f82829n;
        if (abstractC37305a3 != null) {
            abstractC37305a3.mo83837n(f11);
        }
        AbstractC37305a<PointF, PointF> abstractC37305a4 = this.f82821f;
        if (abstractC37305a4 != null) {
            abstractC37305a4.mo83837n(f11);
        }
        AbstractC37305a<?, PointF> abstractC37305a5 = this.f82822g;
        if (abstractC37305a5 != null) {
            abstractC37305a5.mo83837n(f11);
        }
        AbstractC37305a<C43351d, C43351d> abstractC37305a6 = this.f82823h;
        if (abstractC37305a6 != null) {
            abstractC37305a6.mo83837n(f11);
        }
        AbstractC37305a<Float, Float> abstractC37305a7 = this.f82824i;
        if (abstractC37305a7 != null) {
            abstractC37305a7.mo83837n(f11);
        }
        C37308d c37308d = this.f82826k;
        if (c37308d != null) {
            c37308d.mo83837n(f11);
        }
        C37308d c37308d2 = this.f82827l;
        if (c37308d2 != null) {
            c37308d2.mo83837n(f11);
        }
    }

    public C37320p(C38404l c38404l) {
        AbstractC37305a<PointF, PointF> abstractC37305aMo86574a;
        AbstractC37305a<PointF, PointF> abstractC37305aMo86574a2;
        AbstractC37305a<C43351d, C43351d> abstractC37305aMo86574a3;
        AbstractC37305a<Float, Float> abstractC37305aMo86574a4;
        C37308d c37308d;
        C37308d c37308d2;
        if (c38404l.m86582c() == null) {
            abstractC37305aMo86574a = null;
        } else {
            abstractC37305aMo86574a = c38404l.m86582c().mo86574a();
        }
        this.f82821f = abstractC37305aMo86574a;
        if (c38404l.m86585f() == null) {
            abstractC37305aMo86574a2 = null;
        } else {
            abstractC37305aMo86574a2 = c38404l.m86585f().mo86574a();
        }
        this.f82822g = abstractC37305aMo86574a2;
        if (c38404l.m86587h() == null) {
            abstractC37305aMo86574a3 = null;
        } else {
            abstractC37305aMo86574a3 = c38404l.m86587h().mo86574a();
        }
        this.f82823h = abstractC37305aMo86574a3;
        if (c38404l.m86586g() == null) {
            abstractC37305aMo86574a4 = null;
        } else {
            abstractC37305aMo86574a4 = c38404l.m86586g().mo86574a();
        }
        this.f82824i = abstractC37305aMo86574a4;
        if (c38404l.m86588i() == null) {
            c37308d = null;
        } else {
            c37308d = (C37308d) c38404l.m86588i().mo86574a();
        }
        this.f82826k = c37308d;
        this.f82830o = c38404l.m86591l();
        if (this.f82826k != null) {
            this.f82817b = new Matrix();
            this.f82818c = new Matrix();
            this.f82819d = new Matrix();
            this.f82820e = new float[9];
        } else {
            this.f82817b = null;
            this.f82818c = null;
            this.f82819d = null;
            this.f82820e = null;
        }
        if (c38404l.m86589j() == null) {
            c37308d2 = null;
        } else {
            c37308d2 = (C37308d) c38404l.m86589j().mo86574a();
        }
        this.f82827l = c37308d2;
        if (c38404l.m86584e() != null) {
            this.f82825j = c38404l.m86584e().mo86574a();
        }
        if (c38404l.m86590k() != null) {
            this.f82828m = c38404l.m86590k().mo86574a();
        } else {
            this.f82828m = null;
        }
        if (c38404l.m86583d() != null) {
            this.f82829n = c38404l.m86583d().mo86574a();
        } else {
            this.f82829n = null;
        }
    }
}
