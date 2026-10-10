package p218e1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.InterfaceC5091m0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import java.util.List;
import p248f1.AbstractC37305a;
import p297h1.C38074d;
import p484o1.C42929k;
import p522p1.C43350c;

/* JADX INFO: renamed from: e1.n */
/* JADX INFO: compiled from: PolystarContent.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37034n implements InterfaceC37033m, AbstractC37305a.b, InterfaceC37031k {

    /* JADX INFO: renamed from: e */
    public final String f82241e;

    /* JADX INFO: renamed from: f */
    public final LottieDrawable f82242f;

    /* JADX INFO: renamed from: g */
    public final PolystarShape.Type f82243g;

    /* JADX INFO: renamed from: h */
    public final boolean f82244h;

    /* JADX INFO: renamed from: i */
    public final boolean f82245i;

    /* JADX INFO: renamed from: j */
    public final AbstractC37305a<?, Float> f82246j;

    /* JADX INFO: renamed from: k */
    public final AbstractC37305a<?, PointF> f82247k;

    /* JADX INFO: renamed from: l */
    public final AbstractC37305a<?, Float> f82248l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public final AbstractC37305a<?, Float> f82249m;

    /* JADX INFO: renamed from: n */
    public final AbstractC37305a<?, Float> f82250n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public final AbstractC37305a<?, Float> f82251o;

    /* JADX INFO: renamed from: p */
    public final AbstractC37305a<?, Float> f82252p;

    /* JADX INFO: renamed from: r */
    public boolean f82254r;

    /* JADX INFO: renamed from: a */
    public final Path f82237a = new Path();

    /* JADX INFO: renamed from: b */
    public final Path f82238b = new Path();

    /* JADX INFO: renamed from: c */
    public final PathMeasure f82239c = new PathMeasure();

    /* JADX INFO: renamed from: d */
    public final float[] f82240d = new float[2];

    /* JADX INFO: renamed from: q */
    public final C37022b f82253q = new C37022b();

    /* JADX INFO: renamed from: j */
    private void m82874j() {
        this.f82254r = false;
        this.f82242f.invalidateSelf();
    }

    @Override // p218e1.InterfaceC37023c
    /* JADX INFO: renamed from: f */
    public void mo5789f(List<InterfaceC37023c> list, List<InterfaceC37023c> list2) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            InterfaceC37023c interfaceC37023c = list.get(i11);
            if (interfaceC37023c instanceof C37041u) {
                C37041u c37041u = (C37041u) interfaceC37023c;
                if (c37041u.m82888j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f82253q.m82854a(c37041u);
                    c37041u.m82884a(this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e1.n$a */
    /* JADX INFO: compiled from: PolystarContent.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f82255a;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            f82255a = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82255a[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: a */
    public <T> void mo5785a(T t11, @Nullable C43350c<T> c43350c) {
        AbstractC37305a<?, Float> abstractC37305a;
        AbstractC37305a<?, Float> abstractC37305a2;
        if (t11 == InterfaceC5091m0.f6029w) {
            this.f82246j.m83838o(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f6030x) {
            this.f82248l.m83838o(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f6020n) {
            this.f82247k.m83838o(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f6031y && (abstractC37305a2 = this.f82249m) != null) {
            abstractC37305a2.m83838o(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f6032z) {
            this.f82250n.m83838o(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f5991A && (abstractC37305a = this.f82251o) != null) {
            abstractC37305a.m83838o(c43350c);
        } else if (t11 == InterfaceC5091m0.f5992B) {
            this.f82252p.m83838o(c43350c);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m82875c() {
        double d11;
        float f11;
        float f12;
        float f13;
        int iFloor = (int) Math.floor(this.f82246j.mo83831h().floatValue());
        AbstractC37305a<?, Float> abstractC37305a = this.f82248l;
        double radians = Math.toRadians((abstractC37305a == null ? 0.0d : abstractC37305a.mo83831h().floatValue()) - 90.0d);
        double d12 = iFloor;
        float fFloatValue = this.f82252p.mo83831h().floatValue() / 100.0f;
        float fFloatValue2 = this.f82250n.mo83831h().floatValue();
        double d13 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d13);
        float fSin = (float) (Math.sin(radians) * d13);
        this.f82237a.moveTo(fCos, fSin);
        double d14 = (float) (6.283185307179586d / d12);
        double dCeil = Math.ceil(d12);
        double d15 = radians + d14;
        int i11 = 0;
        while (true) {
            double d16 = i11;
            if (d16 >= dCeil) {
                PointF pointFMo83831h = this.f82247k.mo83831h();
                this.f82237a.offset(pointFMo83831h.x, pointFMo83831h.y);
                this.f82237a.close();
                return;
            }
            float fCos2 = (float) (d13 * Math.cos(d15));
            float fSin2 = (float) (Math.sin(d15) * d13);
            if (fFloatValue != 0.0f) {
                d11 = dCeil;
                f11 = fFloatValue;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan3 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f14 = fFloatValue2 * f11 * 0.25f;
                float f15 = f14 * fCos3;
                float f16 = f14 * fSin3;
                float fCos4 = ((float) Math.cos(dAtan3)) * f14;
                float fSin4 = f14 * ((float) Math.sin(dAtan3));
                if (d16 == d11 - 1.0d) {
                    this.f82238b.reset();
                    this.f82238b.moveTo(fCos, fSin);
                    float f17 = fCos - f15;
                    float f18 = fSin - f16;
                    float f19 = fCos2 + fCos4;
                    float f21 = fSin2 + fSin4;
                    f12 = fCos2;
                    f13 = fSin2;
                    this.f82238b.cubicTo(f17, f18, f19, f21, f12, f13);
                    this.f82239c.setPath(this.f82238b, false);
                    PathMeasure pathMeasure = this.f82239c;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, this.f82240d, null);
                    Path path = this.f82237a;
                    float[] fArr = this.f82240d;
                    path.cubicTo(f17, f18, f19, f21, fArr[0], fArr[1]);
                } else {
                    f12 = fCos2;
                    f13 = fSin2;
                    this.f82237a.cubicTo(fCos - f15, fSin - f16, f12 + fCos4, f13 + fSin4, f12, f13);
                }
                fCos = f12;
                fSin = f13;
            } else {
                fCos = fCos2;
                fSin = fSin2;
                d11 = dCeil;
                f11 = fFloatValue;
                if (d16 != d11 - 1.0d) {
                    this.f82237a.lineTo(fCos, fSin);
                }
                i11++;
                dCeil = d11;
                fFloatValue = f11;
            }
            d15 += d14;
            i11++;
            dCeil = d11;
            fFloatValue = f11;
        }
    }

    @Override // p218e1.InterfaceC37023c
    public String getName() {
        return this.f82241e;
    }

    @Override // p218e1.InterfaceC37033m
    public Path getPath() {
        if (this.f82254r) {
            return this.f82237a;
        }
        this.f82237a.reset();
        if (this.f82244h) {
            this.f82254r = true;
            return this.f82237a;
        }
        int i11 = a.f82255a[this.f82243g.ordinal()];
        if (i11 == 1) {
            m82876i();
        } else if (i11 == 2) {
            m82875c();
        }
        this.f82237a.close();
        this.f82253q.m82855b(this.f82237a);
        this.f82254r = true;
        return this.f82237a;
    }

    /* JADX INFO: renamed from: i */
    public final void m82876i() {
        float f11;
        float f12;
        float fCos;
        float fSin;
        float f13;
        double d11;
        float f14;
        float f15;
        float f16;
        float fFloatValue = this.f82246j.mo83831h().floatValue();
        AbstractC37305a<?, Float> abstractC37305a = this.f82248l;
        double radians = Math.toRadians((abstractC37305a == null ? 0.0d : abstractC37305a.mo83831h().floatValue()) - 90.0d);
        double d12 = fFloatValue;
        float f17 = (float) (6.283185307179586d / d12);
        if (this.f82245i) {
            f17 *= -1.0f;
        }
        float f18 = f17 / 2.0f;
        float f19 = fFloatValue - ((int) fFloatValue);
        if (f19 != 0.0f) {
            radians += (double) ((1.0f - f19) * f18);
        }
        float fFloatValue2 = this.f82250n.mo83831h().floatValue();
        float fFloatValue3 = this.f82249m.mo83831h().floatValue();
        AbstractC37305a<?, Float> abstractC37305a2 = this.f82251o;
        float fFloatValue4 = abstractC37305a2 != null ? abstractC37305a2.mo83831h().floatValue() / 100.0f : 0.0f;
        AbstractC37305a<?, Float> abstractC37305a3 = this.f82252p;
        float fFloatValue5 = abstractC37305a3 != null ? abstractC37305a3.mo83831h().floatValue() / 100.0f : 0.0f;
        if (f19 != 0.0f) {
            f14 = ((fFloatValue2 - fFloatValue3) * f19) + fFloatValue3;
            f12 = 0.0f;
            double d13 = f14;
            f11 = 2.0f;
            float fCos2 = (float) (d13 * Math.cos(radians));
            fSin = (float) (d13 * Math.sin(radians));
            this.f82237a.moveTo(fCos2, fSin);
            d11 = radians + ((double) ((f17 * f19) / 2.0f));
            fCos = fCos2;
            f13 = f18;
        } else {
            f11 = 2.0f;
            f12 = 0.0f;
            double d14 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d14);
            fSin = (float) (d14 * Math.sin(radians));
            this.f82237a.moveTo(fCos, fSin);
            f13 = f18;
            d11 = radians + ((double) f13);
            f14 = 0.0f;
        }
        double dCeil = Math.ceil(d12) * 2.0d;
        int i11 = 0;
        boolean z11 = false;
        double d15 = d11;
        float f21 = fSin;
        float f22 = fCos;
        double d16 = d15;
        while (true) {
            double d17 = i11;
            if (d17 >= dCeil) {
                PointF pointFMo83831h = this.f82247k.mo83831h();
                this.f82237a.offset(pointFMo83831h.x, pointFMo83831h.y);
                this.f82237a.close();
                return;
            }
            float f23 = z11 ? fFloatValue2 : fFloatValue3;
            float f24 = (f14 == f12 || d17 != dCeil - 2.0d) ? f13 : (f17 * f19) / f11;
            double d18 = (f14 == f12 || d17 != dCeil - 1.0d) ? f23 : f14;
            float fCos3 = (float) (d18 * Math.cos(d16));
            float f25 = f17;
            float fSin2 = (float) (d18 * Math.sin(d16));
            if (fFloatValue4 == f12 && fFloatValue5 == f12) {
                this.f82237a.lineTo(fCos3, fSin2);
                f16 = fCos3;
                f15 = fSin2;
            } else {
                double dAtan2 = (float) (Math.atan2(f21, f22) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f26 = f22;
                float f27 = f21;
                f15 = fSin2;
                double dAtan3 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan3);
                float fSin4 = (float) Math.sin(dAtan3);
                float f28 = z11 ? fFloatValue4 : fFloatValue5;
                float f29 = z11 ? fFloatValue5 : fFloatValue4;
                float f31 = (z11 ? fFloatValue3 : fFloatValue2) * f28 * 0.47829f;
                float f32 = fCos4 * f31;
                float f33 = f31 * fSin3;
                float f34 = (z11 ? fFloatValue2 : fFloatValue3) * f29 * 0.47829f;
                float f35 = fCos5 * f34;
                float f36 = f34 * fSin4;
                if (f19 != 0.0f) {
                    if (i11 == 0) {
                        f32 *= f19;
                        f33 *= f19;
                    } else if (d17 == dCeil - 1.0d) {
                        f35 *= f19;
                        f36 *= f19;
                    }
                }
                f16 = fCos3;
                this.f82237a.cubicTo(f26 - f32, f27 - f33, fCos3 + f35, f15 + f36, f16, f15);
            }
            d16 += (double) f24;
            z11 = !z11;
            i11++;
            f13 = f13;
            f22 = f16;
            f21 = f15;
            f17 = f25;
        }
    }

    public C37034n(LottieDrawable lottieDrawable, AbstractC5095a abstractC5095a, PolystarShape polystarShape) {
        this.f82242f = lottieDrawable;
        this.f82241e = polystarShape.m5699d();
        PolystarShape.Type typeM5705j = polystarShape.m5705j();
        this.f82243g = typeM5705j;
        this.f82244h = polystarShape.m5706k();
        this.f82245i = polystarShape.m5707l();
        AbstractC37305a<Float, Float> abstractC37305aMo86574a = polystarShape.m5702g().mo86574a();
        this.f82246j = abstractC37305aMo86574a;
        AbstractC37305a<PointF, PointF> abstractC37305aMo86574a2 = polystarShape.m5703h().mo86574a();
        this.f82247k = abstractC37305aMo86574a2;
        AbstractC37305a<Float, Float> abstractC37305aMo86574a3 = polystarShape.m5704i().mo86574a();
        this.f82248l = abstractC37305aMo86574a3;
        AbstractC37305a<Float, Float> abstractC37305aMo86574a4 = polystarShape.m5700e().mo86574a();
        this.f82250n = abstractC37305aMo86574a4;
        AbstractC37305a<Float, Float> abstractC37305aMo86574a5 = polystarShape.m5701f().mo86574a();
        this.f82252p = abstractC37305aMo86574a5;
        PolystarShape.Type type = PolystarShape.Type.STAR;
        if (typeM5705j == type) {
            this.f82249m = polystarShape.m5697b().mo86574a();
            this.f82251o = polystarShape.m5698c().mo86574a();
        } else {
            this.f82249m = null;
            this.f82251o = null;
        }
        abstractC5095a.m5791i(abstractC37305aMo86574a);
        abstractC5095a.m5791i(abstractC37305aMo86574a2);
        abstractC5095a.m5791i(abstractC37305aMo86574a3);
        abstractC5095a.m5791i(abstractC37305aMo86574a4);
        abstractC5095a.m5791i(abstractC37305aMo86574a5);
        if (typeM5705j == type) {
            abstractC5095a.m5791i(this.f82249m);
            abstractC5095a.m5791i(this.f82251o);
        }
        abstractC37305aMo86574a.m83824a(this);
        abstractC37305aMo86574a2.m83824a(this);
        abstractC37305aMo86574a3.m83824a(this);
        abstractC37305aMo86574a4.m83824a(this);
        abstractC37305aMo86574a5.m83824a(this);
        if (typeM5705j == type) {
            this.f82249m.m83824a(this);
            this.f82251o.m83824a(this);
        }
    }

    @Override // p248f1.AbstractC37305a.b
    /* JADX INFO: renamed from: e */
    public void mo5788e() {
        m82874j();
    }

    @Override // p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: g */
    public void mo5790g(C38074d c38074d, int i11, List<C38074d> list, C38074d c38074d2) {
        C42929k.m94197k(c38074d, i11, list, c38074d2, this);
    }
}
