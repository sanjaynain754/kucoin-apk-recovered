package p218e1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import androidx.core.graphics.PaintCompat;
import com.airbnb.lottie.C5072d;
import com.airbnb.lottie.InterfaceC5091m0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import java.util.ArrayList;
import java.util.List;
import p187d1.C36592a;
import p248f1.AbstractC37305a;
import p248f1.C37306b;
import p248f1.C37307c;
import p248f1.C37321q;
import p297h1.C38074d;
import p355j1.C40207j;
import p484o1.C42929k;
import p522p1.C43350c;

/* JADX INFO: renamed from: e1.g */
/* JADX INFO: compiled from: FillContent.java */
/* JADX INFO: loaded from: classes.dex */
public class C37027g implements InterfaceC37025e, AbstractC37305a.b, InterfaceC37031k {

    /* JADX INFO: renamed from: a */
    public final Path f82185a;

    /* JADX INFO: renamed from: b */
    public final Paint f82186b;

    /* JADX INFO: renamed from: c */
    public final AbstractC5095a f82187c;

    /* JADX INFO: renamed from: d */
    public final String f82188d;

    /* JADX INFO: renamed from: e */
    public final boolean f82189e;

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC37033m> f82190f;

    /* JADX INFO: renamed from: g */
    public final AbstractC37305a<Integer, Integer> f82191g;

    /* JADX INFO: renamed from: h */
    public final AbstractC37305a<Integer, Integer> f82192h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public AbstractC37305a<ColorFilter, ColorFilter> f82193i;

    /* JADX INFO: renamed from: j */
    public final LottieDrawable f82194j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public AbstractC37305a<Float, Float> f82195k;

    /* JADX INFO: renamed from: l */
    public float f82196l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public C37307c f82197m;

    @Override // p218e1.InterfaceC37023c
    /* JADX INFO: renamed from: f */
    public void mo5789f(List<InterfaceC37023c> list, List<InterfaceC37023c> list2) {
        for (int i11 = 0; i11 < list2.size(); i11++) {
            InterfaceC37023c interfaceC37023c = list2.get(i11);
            if (interfaceC37023c instanceof InterfaceC37033m) {
                this.f82190f.add((InterfaceC37033m) interfaceC37023c);
            }
        }
    }

    @Override // p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: a */
    public <T> void mo5785a(T t11, @Nullable C43350c<T> c43350c) {
        C37307c c37307c;
        C37307c c37307c2;
        C37307c c37307c3;
        C37307c c37307c4;
        C37307c c37307c5;
        if (t11 == InterfaceC5091m0.f6007a) {
            this.f82191g.m83838o(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f6010d) {
            this.f82192h.m83838o(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f6001K) {
            AbstractC37305a<ColorFilter, ColorFilter> abstractC37305a = this.f82193i;
            if (abstractC37305a != null) {
                this.f82187c.m5777G(abstractC37305a);
            }
            if (c43350c == null) {
                this.f82193i = null;
                return;
            }
            C37321q c37321q = new C37321q(c43350c);
            this.f82193i = c37321q;
            c37321q.m83824a(this);
            this.f82187c.m5791i(this.f82193i);
            return;
        }
        if (t11 == InterfaceC5091m0.f6016j) {
            AbstractC37305a<Float, Float> abstractC37305a2 = this.f82195k;
            if (abstractC37305a2 != null) {
                abstractC37305a2.m83838o(c43350c);
                return;
            }
            C37321q c37321q2 = new C37321q(c43350c);
            this.f82195k = c37321q2;
            c37321q2.m83824a(this);
            this.f82187c.m5791i(this.f82195k);
            return;
        }
        if (t11 == InterfaceC5091m0.f6011e && (c37307c5 = this.f82197m) != null) {
            c37307c5.m83849b(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f5997G && (c37307c4 = this.f82197m) != null) {
            c37307c4.m83852f(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f5998H && (c37307c3 = this.f82197m) != null) {
            c37307c3.m83850c(c43350c);
            return;
        }
        if (t11 == InterfaceC5091m0.f5999I && (c37307c2 = this.f82197m) != null) {
            c37307c2.m83851d(c43350c);
        } else {
            if (t11 != InterfaceC5091m0.f6000J || (c37307c = this.f82197m) == null) {
                return;
            }
            c37307c.m83853g(c43350c);
        }
    }

    @Override // p218e1.InterfaceC37025e
    /* JADX INFO: renamed from: b */
    public void mo5786b(RectF rectF, Matrix matrix, boolean z11) {
        this.f82185a.reset();
        for (int i11 = 0; i11 < this.f82190f.size(); i11++) {
            this.f82185a.addPath(this.f82190f.get(i11).getPath(), matrix);
        }
        this.f82185a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p218e1.InterfaceC37025e
    /* JADX INFO: renamed from: d */
    public void mo5787d(Canvas canvas, Matrix matrix, int i11) {
        if (this.f82189e) {
            return;
        }
        if (C5072d.m5647g()) {
            C5072d.m5642b("FillContent#draw");
        }
        this.f82186b.setColor((C42929k.m94189c((int) ((((i11 / 255.0f) * this.f82192h.mo83831h().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((C37306b) this.f82191g).m83845q() & 16777215));
        AbstractC37305a<ColorFilter, ColorFilter> abstractC37305a = this.f82193i;
        if (abstractC37305a != null) {
            this.f82186b.setColorFilter(abstractC37305a.mo83831h());
        }
        AbstractC37305a<Float, Float> abstractC37305a2 = this.f82195k;
        if (abstractC37305a2 != null) {
            float fFloatValue = abstractC37305a2.mo83831h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f82186b.setMaskFilter(null);
            } else if (fFloatValue != this.f82196l) {
                this.f82186b.setMaskFilter(this.f82187c.m5805x(fFloatValue));
            }
            this.f82196l = fFloatValue;
        }
        C37307c c37307c = this.f82197m;
        if (c37307c != null) {
            c37307c.m83848a(this.f82186b);
        }
        this.f82185a.reset();
        for (int i12 = 0; i12 < this.f82190f.size(); i12++) {
            this.f82185a.addPath(this.f82190f.get(i12).getPath(), matrix);
        }
        canvas.drawPath(this.f82185a, this.f82186b);
        if (C5072d.m5647g()) {
            C5072d.m5643c("FillContent#draw");
        }
    }

    @Override // p248f1.AbstractC37305a.b
    /* JADX INFO: renamed from: e */
    public void mo5788e() {
        this.f82194j.invalidateSelf();
    }

    @Override // p218e1.InterfaceC37023c
    public String getName() {
        return this.f82188d;
    }

    public C37027g(LottieDrawable lottieDrawable, AbstractC5095a abstractC5095a, C40207j c40207j) {
        Path path = new Path();
        this.f82185a = path;
        C36592a c36592a = new C36592a(1);
        this.f82186b = c36592a;
        this.f82190f = new ArrayList();
        this.f82187c = abstractC5095a;
        this.f82188d = c40207j.m88592d();
        this.f82189e = c40207j.m88594f();
        this.f82194j = lottieDrawable;
        if (abstractC5095a.mo5804w() != null) {
            AbstractC37305a<Float, Float> abstractC37305aMo86574a = abstractC5095a.mo5804w().m88551a().mo86574a();
            this.f82195k = abstractC37305aMo86574a;
            abstractC37305aMo86574a.m83824a(this);
            abstractC5095a.m5791i(this.f82195k);
        }
        if (abstractC5095a.mo5806y() != null) {
            this.f82197m = new C37307c(this, abstractC5095a, abstractC5095a.mo5806y());
        }
        if (c40207j.m88590b() != null && c40207j.m88593e() != null) {
            PaintCompat.setBlendMode(c36592a, abstractC5095a.m5803v().toNativeBlendMode());
            path.setFillType(c40207j.m88591c());
            AbstractC37305a<Integer, Integer> abstractC37305aMo86574a2 = c40207j.m88590b().mo86574a();
            this.f82191g = abstractC37305aMo86574a2;
            abstractC37305aMo86574a2.m83824a(this);
            abstractC5095a.m5791i(abstractC37305aMo86574a2);
            AbstractC37305a<Integer, Integer> abstractC37305aMo86574a3 = c40207j.m88593e().mo86574a();
            this.f82192h = abstractC37305aMo86574a3;
            abstractC37305aMo86574a3.m83824a(this);
            abstractC5095a.m5791i(abstractC37305aMo86574a3);
            return;
        }
        this.f82191g = null;
        this.f82192h = null;
    }

    @Override // p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: g */
    public void mo5790g(C38074d c38074d, int i11, List<C38074d> list, C38074d c38074d2) {
        C42929k.m94197k(c38074d, i11, list, c38074d2, this);
    }
}
