package p218e1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5072d;
import com.airbnb.lottie.InterfaceC5091m0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import java.util.ArrayList;
import java.util.List;
import p187d1.C36592a;
import p248f1.AbstractC37305a;
import p248f1.C37307c;
import p248f1.C37308d;
import p248f1.C37310f;
import p248f1.C37321q;
import p297h1.C38074d;
import p328i1.C38394b;
import p328i1.C38396d;
import p484o1.C42929k;
import p484o1.C42930l;
import p522p1.C43350c;

/* JADX INFO: renamed from: e1.a */
/* JADX INFO: compiled from: BaseStrokeContent.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC37021a implements AbstractC37305a.b, InterfaceC37031k, InterfaceC37025e {

    /* JADX INFO: renamed from: e */
    public final LottieDrawable f82150e;

    /* JADX INFO: renamed from: f */
    public final AbstractC5095a f82151f;

    /* JADX INFO: renamed from: h */
    public final float[] f82153h;

    /* JADX INFO: renamed from: i */
    public final Paint f82154i;

    /* JADX INFO: renamed from: j */
    public final AbstractC37305a<?, Float> f82155j;

    /* JADX INFO: renamed from: k */
    public final AbstractC37305a<?, Integer> f82156k;

    /* JADX INFO: renamed from: l */
    public final List<AbstractC37305a<?, Float>> f82157l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public final AbstractC37305a<?, Float> f82158m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public AbstractC37305a<ColorFilter, ColorFilter> f82159n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public AbstractC37305a<Float, Float> f82160o;

    /* JADX INFO: renamed from: p */
    public float f82161p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public C37307c f82162q;

    /* JADX INFO: renamed from: a */
    public final PathMeasure f82146a = new PathMeasure();

    /* JADX INFO: renamed from: b */
    public final Path f82147b = new Path();

    /* JADX INFO: renamed from: c */
    public final Path f82148c = new Path();

    /* JADX INFO: renamed from: d */
    public final RectF f82149d = new RectF();

    /* JADX INFO: renamed from: g */
    public final List<b> f82152g = new ArrayList();

    /* JADX INFO: renamed from: e1.a$b */
    /* JADX INFO: compiled from: BaseStrokeContent.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC37033m> f82163a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final C37041u f82164b;

        public b(@Nullable C37041u c37041u) {
            this.f82163a = new ArrayList();
            this.f82164b = c37041u;
        }
    }

    @Override // p297h1.InterfaceC38075e
    @CallSuper
    /* JADX INFO: renamed from: a */
    public <T> void mo5785a(T t11, @Nullable C43350c<T> c43350c) {
        C37307c c37307c;
        C37307c c37307c2;
        C37307c c37307c3;
        C37307c c37307c4;
        C37307c c37307c5;
        if (t11 == InterfaceC5091m0.f6010d) {
            this.f82156k.m83838o(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f6025s) {
            this.f82155j.m83838o(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f6001K) {
            AbstractC37305a<ColorFilter, ColorFilter> abstractC37305a = this.f82159n;
            if (abstractC37305a != null) {
                this.f82151f.m5777G(abstractC37305a);
            }
            if (c43350c == null) {
                this.f82159n = null;
                return;
            }
            C37321q c37321q = new C37321q(c43350c);
            this.f82159n = c37321q;
            c37321q.m83824a(this);
            this.f82151f.m5791i(this.f82159n);
            return;
        }
        if (t11 == InterfaceC5091m0.f6016j) {
            AbstractC37305a<Float, Float> abstractC37305a2 = this.f82160o;
            if (abstractC37305a2 != null) {
                abstractC37305a2.m83838o(c43350c);
                return;
            }
            C37321q c37321q2 = new C37321q(c43350c);
            this.f82160o = c37321q2;
            c37321q2.m83824a(this);
            this.f82151f.m5791i(this.f82160o);
            return;
        }
        if (t11 == InterfaceC5091m0.f6011e && (c37307c5 = this.f82162q) != null) {
            c37307c5.m83849b(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f5997G && (c37307c4 = this.f82162q) != null) {
            c37307c4.m83852f(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f5998H && (c37307c3 = this.f82162q) != null) {
            c37307c3.m83850c(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f5999I && (c37307c2 = this.f82162q) != null) {
            c37307c2.m83851d(c43350c);
        } else {
            if (t11 != InterfaceC5091m0.f6000J || (c37307c = this.f82162q) == null) {
                return;
            }
            c37307c.m83853g(c43350c);
        }
    }

    @Override // p248f1.AbstractC37305a.b
    /* JADX INFO: renamed from: e */
    public void mo5788e() {
        this.f82150e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x012e  */
    /* JADX INFO: renamed from: i */
    public final void m82851i(Canvas canvas, b bVar, Matrix matrix) {
        float f11;
        if (C5072d.m5647g()) {
            C5072d.m5642b("StrokeContent#applyTrimPath");
        }
        if (bVar.f82164b == null) {
            if (C5072d.m5647g()) {
                C5072d.m5643c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f82147b.reset();
        for (int size = bVar.f82163a.size() - 1; size >= 0; size--) {
            this.f82147b.addPath(((InterfaceC37033m) bVar.f82163a.get(size)).getPath(), matrix);
        }
        float fFloatValue = bVar.f82164b.m82887i().mo83831h().floatValue() / 100.0f;
        float fFloatValue2 = bVar.f82164b.m82885c().mo83831h().floatValue() / 100.0f;
        float fFloatValue3 = bVar.f82164b.m82886g().mo83831h().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.f82147b, this.f82154i);
            if (C5072d.m5647g()) {
                C5072d.m5643c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f82146a.setPath(this.f82147b, false);
        float length = this.f82146a.getLength();
        while (this.f82146a.nextContour()) {
            length += this.f82146a.getLength();
        }
        float f12 = fFloatValue3 * length;
        float f13 = (fFloatValue * length) + f12;
        float fMin = Math.min((fFloatValue2 * length) + f12, (f13 + length) - 1.0f);
        float f14 = 0.0f;
        for (int size2 = bVar.f82163a.size() - 1; size2 >= 0; size2--) {
            this.f82148c.set(((InterfaceC37033m) bVar.f82163a.get(size2)).getPath());
            this.f82148c.transform(matrix);
            this.f82146a.setPath(this.f82148c, false);
            float length2 = this.f82146a.getLength();
            if (fMin > length) {
                float f15 = fMin - length;
                if (f15 >= f14 + length2 || f14 >= f15) {
                    f11 = f14 + length2;
                    if (f11 < f13 && f14 <= fMin) {
                        if (f11 > fMin || f13 >= f14) {
                            C42930l.m94198a(this.f82148c, f13 < f14 ? 0.0f : (f13 - f14) / length2, fMin > f11 ? 1.0f : (fMin - f14) / length2, 0.0f);
                            canvas.drawPath(this.f82148c, this.f82154i);
                        } else {
                            canvas.drawPath(this.f82148c, this.f82154i);
                        }
                    }
                } else {
                    C42930l.m94198a(this.f82148c, f13 > length ? (f13 - length) / length2 : 0.0f, Math.min(f15 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f82148c, this.f82154i);
                }
            } else {
                f11 = f14 + length2;
                if (f11 < f13) {
                }
            }
            f14 += length2;
        }
        if (C5072d.m5647g()) {
            C5072d.m5643c("StrokeContent#applyTrimPath");
        }
    }

    public AbstractC37021a(LottieDrawable lottieDrawable, AbstractC5095a abstractC5095a, Paint.Cap cap, Paint.Join join, float f11, C38396d c38396d, C38394b c38394b, List<C38394b> list, C38394b c38394b2) {
        C36592a c36592a = new C36592a(1);
        this.f82154i = c36592a;
        this.f82161p = 0.0f;
        this.f82150e = lottieDrawable;
        this.f82151f = abstractC5095a;
        c36592a.setStyle(Paint.Style.STROKE);
        c36592a.setStrokeCap(cap);
        c36592a.setStrokeJoin(join);
        c36592a.setStrokeMiter(f11);
        this.f82156k = c38396d.mo86574a();
        this.f82155j = c38394b.mo86574a();
        if (c38394b2 == null) {
            this.f82158m = null;
        } else {
            this.f82158m = c38394b2.mo86574a();
        }
        this.f82157l = new ArrayList(list.size());
        this.f82153h = new float[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f82157l.add(list.get(i11).mo86574a());
        }
        abstractC5095a.m5791i(this.f82156k);
        abstractC5095a.m5791i(this.f82155j);
        for (int i12 = 0; i12 < this.f82157l.size(); i12++) {
            abstractC5095a.m5791i(this.f82157l.get(i12));
        }
        AbstractC37305a<?, Float> abstractC37305a = this.f82158m;
        if (abstractC37305a != null) {
            abstractC5095a.m5791i(abstractC37305a);
        }
        this.f82156k.m83824a(this);
        this.f82155j.m83824a(this);
        for (int i13 = 0; i13 < list.size(); i13++) {
            this.f82157l.get(i13).m83824a(this);
        }
        AbstractC37305a<?, Float> abstractC37305a2 = this.f82158m;
        if (abstractC37305a2 != null) {
            abstractC37305a2.m83824a(this);
        }
        if (abstractC5095a.mo5804w() != null) {
            AbstractC37305a<Float, Float> abstractC37305aMo86574a = abstractC5095a.mo5804w().m88551a().mo86574a();
            this.f82160o = abstractC37305aMo86574a;
            abstractC37305aMo86574a.m83824a(this);
            abstractC5095a.m5791i(this.f82160o);
        }
        if (abstractC5095a.mo5806y() != null) {
            this.f82162q = new C37307c(this, abstractC5095a, abstractC5095a.mo5806y());
        }
    }

    @Override // p218e1.InterfaceC37025e
    /* JADX INFO: renamed from: b */
    public void mo5786b(RectF rectF, Matrix matrix, boolean z11) {
        if (C5072d.m5647g()) {
            C5072d.m5642b("StrokeContent#getBounds");
        }
        this.f82147b.reset();
        for (int i11 = 0; i11 < this.f82152g.size(); i11++) {
            b bVar = this.f82152g.get(i11);
            for (int i12 = 0; i12 < bVar.f82163a.size(); i12++) {
                this.f82147b.addPath(((InterfaceC37033m) bVar.f82163a.get(i12)).getPath(), matrix);
            }
        }
        this.f82147b.computeBounds(this.f82149d, false);
        float fM83855q = ((C37308d) this.f82155j).m83855q();
        RectF rectF2 = this.f82149d;
        float f11 = fM83855q / 2.0f;
        rectF2.set(rectF2.left - f11, rectF2.top - f11, rectF2.right + f11, rectF2.bottom + f11);
        rectF.set(this.f82149d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (C5072d.m5647g()) {
            C5072d.m5643c("StrokeContent#getBounds");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m82850c(Matrix matrix) {
        float fFloatValue;
        if (C5072d.m5647g()) {
            C5072d.m5642b("StrokeContent#applyDashPattern");
        }
        if (this.f82157l.isEmpty()) {
            if (C5072d.m5647g()) {
                C5072d.m5643c("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        float fM94204g = C42930l.m94204g(matrix);
        for (int i11 = 0; i11 < this.f82157l.size(); i11++) {
            this.f82153h[i11] = this.f82157l.get(i11).mo83831h().floatValue();
            if (i11 % 2 == 0) {
                float[] fArr = this.f82153h;
                if (fArr[i11] < 1.0f) {
                    fArr[i11] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f82153h;
                if (fArr2[i11] < 0.1f) {
                    fArr2[i11] = 0.1f;
                }
            }
            float[] fArr3 = this.f82153h;
            fArr3[i11] = fArr3[i11] * fM94204g;
        }
        AbstractC37305a<?, Float> abstractC37305a = this.f82158m;
        if (abstractC37305a == null) {
            fFloatValue = 0.0f;
        } else {
            fFloatValue = fM94204g * abstractC37305a.mo83831h().floatValue();
        }
        this.f82154i.setPathEffect(new DashPathEffect(this.f82153h, fFloatValue));
        if (C5072d.m5647g()) {
            C5072d.m5643c("StrokeContent#applyDashPattern");
        }
    }

    @Override // p218e1.InterfaceC37025e
    /* JADX INFO: renamed from: d */
    public void mo5787d(Canvas canvas, Matrix matrix, int i11) {
        if (C5072d.m5647g()) {
            C5072d.m5642b("StrokeContent#draw");
        }
        if (C42930l.m94205h(matrix)) {
            if (C5072d.m5647g()) {
                C5072d.m5643c("StrokeContent#draw");
                return;
            }
            return;
        }
        this.f82154i.setAlpha(C42929k.m94189c((int) ((((i11 / 255.0f) * ((C37310f) this.f82156k).m83859q()) / 100.0f) * 255.0f), 0, 255));
        this.f82154i.setStrokeWidth(((C37308d) this.f82155j).m83855q() * C42930l.m94204g(matrix));
        if (this.f82154i.getStrokeWidth() <= 0.0f) {
            if (C5072d.m5647g()) {
                C5072d.m5643c("StrokeContent#draw");
                return;
            }
            return;
        }
        m82850c(matrix);
        AbstractC37305a<ColorFilter, ColorFilter> abstractC37305a = this.f82159n;
        if (abstractC37305a != null) {
            this.f82154i.setColorFilter(abstractC37305a.mo83831h());
        }
        AbstractC37305a<Float, Float> abstractC37305a2 = this.f82160o;
        if (abstractC37305a2 != null) {
            float fFloatValue = abstractC37305a2.mo83831h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f82154i.setMaskFilter(null);
            } else if (fFloatValue != this.f82161p) {
                this.f82154i.setMaskFilter(this.f82151f.m5805x(fFloatValue));
            }
            this.f82161p = fFloatValue;
        }
        C37307c c37307c = this.f82162q;
        if (c37307c != null) {
            c37307c.m83848a(this.f82154i);
        }
        for (int i12 = 0; i12 < this.f82152g.size(); i12++) {
            b bVar = this.f82152g.get(i12);
            if (bVar.f82164b != null) {
                m82851i(canvas, bVar, matrix);
            } else {
                if (C5072d.m5647g()) {
                    C5072d.m5642b("StrokeContent#buildPath");
                }
                this.f82147b.reset();
                for (int size = bVar.f82163a.size() - 1; size >= 0; size--) {
                    this.f82147b.addPath(((InterfaceC37033m) bVar.f82163a.get(size)).getPath(), matrix);
                }
                if (C5072d.m5647g()) {
                    C5072d.m5643c("StrokeContent#buildPath");
                    C5072d.m5642b("StrokeContent#drawPath");
                }
                canvas.drawPath(this.f82147b, this.f82154i);
                if (C5072d.m5647g()) {
                    C5072d.m5643c("StrokeContent#drawPath");
                }
            }
        }
        if (C5072d.m5647g()) {
            C5072d.m5643c("StrokeContent#draw");
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // p218e1.InterfaceC37023c
    /* JADX INFO: renamed from: f */
    public void mo5789f(List<InterfaceC37023c> list, List<InterfaceC37023c> list2) {
        C37041u c37041u = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC37023c interfaceC37023c = list.get(size);
            if (interfaceC37023c instanceof C37041u) {
                C37041u c37041u2 = (C37041u) interfaceC37023c;
                if (c37041u2.m82888j() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    c37041u = c37041u2;
                }
            }
        }
        if (c37041u != null) {
            c37041u.m82884a(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            InterfaceC37023c interfaceC37023c2 = list2.get(size2);
            if (interfaceC37023c2 instanceof C37041u) {
                C37041u c37041u3 = (C37041u) interfaceC37023c2;
                if (c37041u3.m82888j() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f82152g.add(bVar);
                    }
                    bVar = new b(c37041u3);
                    c37041u3.m82884a(this);
                } else if (!(interfaceC37023c2 instanceof InterfaceC37033m)) {
                    if (bVar == null) {
                        bVar = new b(c37041u);
                    }
                    bVar.f82163a.add((InterfaceC37033m) interfaceC37023c2);
                }
            } else if (!(interfaceC37023c2 instanceof InterfaceC37033m)) {
                if (bVar == null) {
                    bVar = new b(c37041u);
                }
                bVar.f82163a.add((InterfaceC37033m) interfaceC37023c2);
            }
        }
        if (bVar != null) {
            this.f82152g.add(bVar);
        }
    }

    @Override // p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: g */
    public void mo5790g(C38074d c38074d, int i11, List<C38074d> list, C38074d c38074d2) {
        C42929k.m94197k(c38074d, i11, list, c38074d2, this);
    }
}
