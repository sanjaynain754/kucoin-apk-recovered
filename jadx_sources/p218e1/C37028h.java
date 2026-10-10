package p218e1;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.C5072d;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.InterfaceC5091m0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import java.util.ArrayList;
import java.util.List;
import p187d1.C36592a;
import p248f1.AbstractC37305a;
import p248f1.C37307c;
import p248f1.C37321q;
import p297h1.C38074d;
import p355j1.C40201d;
import p355j1.C40202e;
import p484o1.C42929k;
import p522p1.C43350c;

/* JADX INFO: renamed from: e1.h */
/* JADX INFO: compiled from: GradientFillContent.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37028h implements InterfaceC37025e, AbstractC37305a.b, InterfaceC37031k {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final String f82198a;

    /* JADX INFO: renamed from: b */
    public final boolean f82199b;

    /* JADX INFO: renamed from: c */
    public final AbstractC5095a f82200c;

    /* JADX INFO: renamed from: d */
    public final LongSparseArray<LinearGradient> f82201d = new LongSparseArray<>();

    /* JADX INFO: renamed from: e */
    public final LongSparseArray<RadialGradient> f82202e = new LongSparseArray<>();

    /* JADX INFO: renamed from: f */
    public final Path f82203f;

    /* JADX INFO: renamed from: g */
    public final Paint f82204g;

    /* JADX INFO: renamed from: h */
    public final RectF f82205h;

    /* JADX INFO: renamed from: i */
    public final List<InterfaceC37033m> f82206i;

    /* JADX INFO: renamed from: j */
    public final GradientType f82207j;

    /* JADX INFO: renamed from: k */
    public final AbstractC37305a<C40201d, C40201d> f82208k;

    /* JADX INFO: renamed from: l */
    public final AbstractC37305a<Integer, Integer> f82209l;

    /* JADX INFO: renamed from: m */
    public final AbstractC37305a<PointF, PointF> f82210m;

    /* JADX INFO: renamed from: n */
    public final AbstractC37305a<PointF, PointF> f82211n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public AbstractC37305a<ColorFilter, ColorFilter> f82212o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public C37321q f82213p;

    /* JADX INFO: renamed from: q */
    public final LottieDrawable f82214q;

    /* JADX INFO: renamed from: r */
    public final int f82215r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public AbstractC37305a<Float, Float> f82216s;

    /* JADX INFO: renamed from: t */
    public float f82217t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public C37307c f82218u;

    @Override // p218e1.InterfaceC37023c
    /* JADX INFO: renamed from: f */
    public void mo5789f(List<InterfaceC37023c> list, List<InterfaceC37023c> list2) {
        for (int i11 = 0; i11 < list2.size(); i11++) {
            InterfaceC37023c interfaceC37023c = list2.get(i11);
            if (interfaceC37023c instanceof InterfaceC37033m) {
                this.f82206i.add((InterfaceC37033m) interfaceC37023c);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private int[] m82863c(int[] iArr) {
        C37321q c37321q = this.f82213p;
        if (c37321q != null) {
            Integer[] numArr = (Integer[]) c37321q.mo83831h();
            int i11 = 0;
            if (iArr.length == numArr.length) {
                while (i11 < iArr.length) {
                    iArr[i11] = numArr[i11].intValue();
                    i11++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i11 < numArr.length) {
                    iArr[i11] = numArr[i11].intValue();
                    i11++;
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: i */
    private int m82864i() {
        int iRound = Math.round(this.f82210m.m83829f() * this.f82215r);
        int iRound2 = Math.round(this.f82211n.m83829f() * this.f82215r);
        int iRound3 = Math.round(this.f82208k.m83829f() * this.f82215r);
        int i11 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i11 = i11 * 31 * iRound2;
        }
        return iRound3 != 0 ? i11 * 31 * iRound3 : i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: a */
    public <T> void mo5785a(T t11, @Nullable C43350c<T> c43350c) {
        C37307c c37307c;
        C37307c c37307c2;
        C37307c c37307c3;
        C37307c c37307c4;
        C37307c c37307c5;
        if (t11 == InterfaceC5091m0.f6010d) {
            this.f82209l.m83838o(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f6001K) {
            AbstractC37305a<ColorFilter, ColorFilter> abstractC37305a = this.f82212o;
            if (abstractC37305a != null) {
                this.f82200c.m5777G(abstractC37305a);
            }
            if (c43350c == null) {
                this.f82212o = null;
                return;
            }
            C37321q c37321q = new C37321q(c43350c);
            this.f82212o = c37321q;
            c37321q.m83824a(this);
            this.f82200c.m5791i(this.f82212o);
            return;
        }
        if (t11 == InterfaceC5091m0.f6002L) {
            C37321q c37321q2 = this.f82213p;
            if (c37321q2 != null) {
                this.f82200c.m5777G(c37321q2);
            }
            if (c43350c == null) {
                this.f82213p = null;
                return;
            }
            this.f82201d.clear();
            this.f82202e.clear();
            C37321q c37321q3 = new C37321q(c43350c);
            this.f82213p = c37321q3;
            c37321q3.m83824a(this);
            this.f82200c.m5791i(this.f82213p);
            return;
        }
        if (t11 == InterfaceC5091m0.f6016j) {
            AbstractC37305a<Float, Float> abstractC37305a2 = this.f82216s;
            if (abstractC37305a2 != null) {
                abstractC37305a2.m83838o(c43350c);
                return;
            }
            C37321q c37321q4 = new C37321q(c43350c);
            this.f82216s = c37321q4;
            c37321q4.m83824a(this);
            this.f82200c.m5791i(this.f82216s);
            return;
        }
        if (t11 == InterfaceC5091m0.f6011e && (c37307c5 = this.f82218u) != null) {
            c37307c5.m83849b(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f5997G && (c37307c4 = this.f82218u) != null) {
            c37307c4.m83852f(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f5998H && (c37307c3 = this.f82218u) != null) {
            c37307c3.m83850c(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f5999I && (c37307c2 = this.f82218u) != null) {
            c37307c2.m83851d(c43350c);
        } else {
            if (t11 != InterfaceC5091m0.f6000J || (c37307c = this.f82218u) == null) {
                return;
            }
            c37307c.m83853g(c43350c);
        }
    }

    @Override // p218e1.InterfaceC37025e
    /* JADX INFO: renamed from: b */
    public void mo5786b(RectF rectF, Matrix matrix, boolean z11) {
        this.f82203f.reset();
        for (int i11 = 0; i11 < this.f82206i.size(); i11++) {
            this.f82203f.addPath(this.f82206i.get(i11).getPath(), matrix);
        }
        this.f82203f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p218e1.InterfaceC37025e
    /* JADX INFO: renamed from: d */
    public void mo5787d(Canvas canvas, Matrix matrix, int i11) {
        if (this.f82199b) {
            return;
        }
        if (C5072d.m5647g()) {
            C5072d.m5642b("GradientFillContent#draw");
        }
        this.f82203f.reset();
        for (int i12 = 0; i12 < this.f82206i.size(); i12++) {
            this.f82203f.addPath(this.f82206i.get(i12).getPath(), matrix);
        }
        this.f82203f.computeBounds(this.f82205h, false);
        Shader shaderM82865j = this.f82207j == GradientType.LINEAR ? m82865j() : m82866k();
        shaderM82865j.setLocalMatrix(matrix);
        this.f82204g.setShader(shaderM82865j);
        AbstractC37305a<ColorFilter, ColorFilter> abstractC37305a = this.f82212o;
        if (abstractC37305a != null) {
            this.f82204g.setColorFilter(abstractC37305a.mo83831h());
        }
        AbstractC37305a<Float, Float> abstractC37305a2 = this.f82216s;
        if (abstractC37305a2 != null) {
            float fFloatValue = abstractC37305a2.mo83831h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f82204g.setMaskFilter(null);
            } else if (fFloatValue != this.f82217t) {
                this.f82204g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f82217t = fFloatValue;
        }
        C37307c c37307c = this.f82218u;
        if (c37307c != null) {
            c37307c.m83848a(this.f82204g);
        }
        this.f82204g.setAlpha(C42929k.m94189c((int) ((((i11 / 255.0f) * this.f82209l.mo83831h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f82203f, this.f82204g);
        if (C5072d.m5647g()) {
            C5072d.m5643c("GradientFillContent#draw");
        }
    }

    @Override // p248f1.AbstractC37305a.b
    /* JADX INFO: renamed from: e */
    public void mo5788e() {
        this.f82214q.invalidateSelf();
    }

    @Override // p218e1.InterfaceC37023c
    public String getName() {
        return this.f82198a;
    }

    public C37028h(LottieDrawable lottieDrawable, C5080h c5080h, AbstractC5095a abstractC5095a, C40202e c40202e) {
        Path path = new Path();
        this.f82203f = path;
        this.f82204g = new C36592a(1);
        this.f82205h = new RectF();
        this.f82206i = new ArrayList();
        this.f82217t = 0.0f;
        this.f82200c = abstractC5095a;
        this.f82198a = c40202e.m88568f();
        this.f82199b = c40202e.m88571i();
        this.f82214q = lottieDrawable;
        this.f82207j = c40202e.m88567e();
        path.setFillType(c40202e.m88565c());
        this.f82215r = (int) (c5080h.m5653d() / 32.0f);
        AbstractC37305a<C40201d, C40201d> abstractC37305aMo86574a = c40202e.m88566d().mo86574a();
        this.f82208k = abstractC37305aMo86574a;
        abstractC37305aMo86574a.m83824a(this);
        abstractC5095a.m5791i(abstractC37305aMo86574a);
        AbstractC37305a<Integer, Integer> abstractC37305aMo86574a2 = c40202e.m88569g().mo86574a();
        this.f82209l = abstractC37305aMo86574a2;
        abstractC37305aMo86574a2.m83824a(this);
        abstractC5095a.m5791i(abstractC37305aMo86574a2);
        AbstractC37305a<PointF, PointF> abstractC37305aMo86574a3 = c40202e.m88570h().mo86574a();
        this.f82210m = abstractC37305aMo86574a3;
        abstractC37305aMo86574a3.m83824a(this);
        abstractC5095a.m5791i(abstractC37305aMo86574a3);
        AbstractC37305a<PointF, PointF> abstractC37305aMo86574a4 = c40202e.m88564b().mo86574a();
        this.f82211n = abstractC37305aMo86574a4;
        abstractC37305aMo86574a4.m83824a(this);
        abstractC5095a.m5791i(abstractC37305aMo86574a4);
        if (abstractC5095a.mo5804w() != null) {
            AbstractC37305a<Float, Float> abstractC37305aMo86574a5 = abstractC5095a.mo5804w().m88551a().mo86574a();
            this.f82216s = abstractC37305aMo86574a5;
            abstractC37305aMo86574a5.m83824a(this);
            abstractC5095a.m5791i(this.f82216s);
        }
        if (abstractC5095a.mo5806y() != null) {
            this.f82218u = new C37307c(this, abstractC5095a, abstractC5095a.mo5806y());
        }
    }

    /* JADX INFO: renamed from: j */
    private LinearGradient m82865j() {
        long jM82864i = m82864i();
        LinearGradient linearGradient = this.f82201d.get(jM82864i);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFMo83831h = this.f82210m.mo83831h();
        PointF pointFMo83831h2 = this.f82211n.mo83831h();
        C40201d c40201dMo83831h = this.f82208k.mo83831h();
        LinearGradient linearGradient2 = new LinearGradient(pointFMo83831h.x, pointFMo83831h.y, pointFMo83831h2.x, pointFMo83831h2.y, m82863c(c40201dMo83831h.m88560d()), c40201dMo83831h.m88561e(), Shader.TileMode.CLAMP);
        this.f82201d.put(jM82864i, linearGradient2);
        return linearGradient2;
    }

    /* JADX INFO: renamed from: k */
    private RadialGradient m82866k() {
        long jM82864i = m82864i();
        RadialGradient radialGradient = this.f82202e.get(jM82864i);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFMo83831h = this.f82210m.mo83831h();
        PointF pointFMo83831h2 = this.f82211n.mo83831h();
        C40201d c40201dMo83831h = this.f82208k.mo83831h();
        int[] iArrM82863c = m82863c(c40201dMo83831h.m88560d());
        float[] fArrM88561e = c40201dMo83831h.m88561e();
        float f11 = pointFMo83831h.x;
        float f12 = pointFMo83831h.y;
        float fHypot = (float) Math.hypot(pointFMo83831h2.x - f11, pointFMo83831h2.y - f12);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f11, f12, fHypot, iArrM82863c, fArrM88561e, Shader.TileMode.CLAMP);
        this.f82202e.put(jM82864i, radialGradient2);
        return radialGradient2;
    }

    @Override // p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: g */
    public void mo5790g(C38074d c38074d, int i11, List<C38074d> list, C38074d c38074d2) {
        C42929k.m94197k(c38074d, i11, list, c38074d2, this);
    }
}
