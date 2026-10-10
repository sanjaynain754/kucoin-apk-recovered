package p218e1;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.InterfaceC5091m0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import java.util.List;
import p248f1.AbstractC37305a;
import p248f1.C37308d;
import p297h1.C38074d;
import p355j1.C40203f;
import p484o1.C42929k;
import p522p1.C43350c;

/* JADX INFO: renamed from: e1.o */
/* JADX INFO: compiled from: RectangleContent.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37035o implements AbstractC37305a.b, InterfaceC37031k, InterfaceC37033m {

    /* JADX INFO: renamed from: c */
    public final String f82258c;

    /* JADX INFO: renamed from: d */
    public final boolean f82259d;

    /* JADX INFO: renamed from: e */
    public final LottieDrawable f82260e;

    /* JADX INFO: renamed from: f */
    public final AbstractC37305a<?, PointF> f82261f;

    /* JADX INFO: renamed from: g */
    public final AbstractC37305a<?, PointF> f82262g;

    /* JADX INFO: renamed from: h */
    public final AbstractC37305a<?, Float> f82263h;

    /* JADX INFO: renamed from: k */
    public boolean f82266k;

    /* JADX INFO: renamed from: a */
    public final Path f82256a = new Path();

    /* JADX INFO: renamed from: b */
    public final RectF f82257b = new RectF();

    /* JADX INFO: renamed from: i */
    public final C37022b f82264i = new C37022b();

    /* JADX INFO: renamed from: j */
    @Nullable
    public AbstractC37305a<Float, Float> f82265j = null;

    /* JADX INFO: renamed from: c */
    private void m82877c() {
        this.f82266k = false;
        this.f82260e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // p218e1.InterfaceC37023c
    /* JADX INFO: renamed from: f */
    public void mo5789f(List<InterfaceC37023c> list, List<InterfaceC37023c> list2) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            InterfaceC37023c interfaceC37023c = list.get(i11);
            if (interfaceC37023c instanceof C37041u) {
                C37041u c37041u = (C37041u) interfaceC37023c;
                if (c37041u.m82888j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f82264i.m82854a(c37041u);
                    c37041u.m82884a(this);
                } else if (interfaceC37023c instanceof C37037q) {
                    this.f82265j = ((C37037q) interfaceC37023c).m82880g();
                }
            } else if (interfaceC37023c instanceof C37037q) {
                this.f82265j = ((C37037q) interfaceC37023c).m82880g();
            }
        }
    }

    @Override // p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: a */
    public <T> void mo5785a(T t11, @Nullable C43350c<T> c43350c) {
        if (t11 == InterfaceC5091m0.f6018l) {
            this.f82262g.m83838o(c43350c);
        } else if (t11 == InterfaceC5091m0.f6020n) {
            this.f82261f.m83838o(c43350c);
        } else if (t11 == InterfaceC5091m0.f6019m) {
            this.f82263h.m83838o(c43350c);
        }
    }

    @Override // p218e1.InterfaceC37023c
    public String getName() {
        return this.f82258c;
    }

    @Override // p218e1.InterfaceC37033m
    public Path getPath() {
        AbstractC37305a<Float, Float> abstractC37305a;
        if (this.f82266k) {
            return this.f82256a;
        }
        this.f82256a.reset();
        if (this.f82259d) {
            this.f82266k = true;
            return this.f82256a;
        }
        PointF pointFMo83831h = this.f82262g.mo83831h();
        float f11 = pointFMo83831h.x / 2.0f;
        float f12 = pointFMo83831h.y / 2.0f;
        AbstractC37305a<?, Float> abstractC37305a2 = this.f82263h;
        float fM83855q = abstractC37305a2 == null ? 0.0f : ((C37308d) abstractC37305a2).m83855q();
        if (fM83855q == 0.0f && (abstractC37305a = this.f82265j) != null) {
            fM83855q = Math.min(abstractC37305a.mo83831h().floatValue(), Math.min(f11, f12));
        }
        float fMin = Math.min(f11, f12);
        if (fM83855q > fMin) {
            fM83855q = fMin;
        }
        PointF pointFMo83831h2 = this.f82261f.mo83831h();
        this.f82256a.moveTo(pointFMo83831h2.x + f11, (pointFMo83831h2.y - f12) + fM83855q);
        this.f82256a.lineTo(pointFMo83831h2.x + f11, (pointFMo83831h2.y + f12) - fM83855q);
        if (fM83855q > 0.0f) {
            RectF rectF = this.f82257b;
            float f13 = pointFMo83831h2.x;
            float f14 = fM83855q * 2.0f;
            float f15 = pointFMo83831h2.y;
            rectF.set((f13 + f11) - f14, (f15 + f12) - f14, f13 + f11, f15 + f12);
            this.f82256a.arcTo(this.f82257b, 0.0f, 90.0f, false);
        }
        this.f82256a.lineTo((pointFMo83831h2.x - f11) + fM83855q, pointFMo83831h2.y + f12);
        if (fM83855q > 0.0f) {
            RectF rectF2 = this.f82257b;
            float f16 = pointFMo83831h2.x;
            float f17 = pointFMo83831h2.y;
            float f18 = fM83855q * 2.0f;
            rectF2.set(f16 - f11, (f17 + f12) - f18, (f16 - f11) + f18, f17 + f12);
            this.f82256a.arcTo(this.f82257b, 90.0f, 90.0f, false);
        }
        this.f82256a.lineTo(pointFMo83831h2.x - f11, (pointFMo83831h2.y - f12) + fM83855q);
        if (fM83855q > 0.0f) {
            RectF rectF3 = this.f82257b;
            float f19 = pointFMo83831h2.x;
            float f21 = pointFMo83831h2.y;
            float f22 = fM83855q * 2.0f;
            rectF3.set(f19 - f11, f21 - f12, (f19 - f11) + f22, (f21 - f12) + f22);
            this.f82256a.arcTo(this.f82257b, 180.0f, 90.0f, false);
        }
        this.f82256a.lineTo((pointFMo83831h2.x + f11) - fM83855q, pointFMo83831h2.y - f12);
        if (fM83855q > 0.0f) {
            RectF rectF4 = this.f82257b;
            float f23 = pointFMo83831h2.x;
            float f24 = fM83855q * 2.0f;
            float f25 = pointFMo83831h2.y;
            rectF4.set((f23 + f11) - f24, f25 - f12, f23 + f11, (f25 - f12) + f24);
            this.f82256a.arcTo(this.f82257b, 270.0f, 90.0f, false);
        }
        this.f82256a.close();
        this.f82264i.m82855b(this.f82256a);
        this.f82266k = true;
        return this.f82256a;
    }

    public C37035o(LottieDrawable lottieDrawable, AbstractC5095a abstractC5095a, C40203f c40203f) {
        this.f82258c = c40203f.m88573c();
        this.f82259d = c40203f.m88576f();
        this.f82260e = lottieDrawable;
        AbstractC37305a<PointF, PointF> abstractC37305aMo86574a = c40203f.m88574d().mo86574a();
        this.f82261f = abstractC37305aMo86574a;
        AbstractC37305a<PointF, PointF> abstractC37305aMo86574a2 = c40203f.m88575e().mo86574a();
        this.f82262g = abstractC37305aMo86574a2;
        AbstractC37305a<Float, Float> abstractC37305aMo86574a3 = c40203f.m88572b().mo86574a();
        this.f82263h = abstractC37305aMo86574a3;
        abstractC5095a.m5791i(abstractC37305aMo86574a);
        abstractC5095a.m5791i(abstractC37305aMo86574a2);
        abstractC5095a.m5791i(abstractC37305aMo86574a3);
        abstractC37305aMo86574a.m83824a(this);
        abstractC37305aMo86574a2.m83824a(this);
        abstractC37305aMo86574a3.m83824a(this);
    }

    @Override // p248f1.AbstractC37305a.b
    /* JADX INFO: renamed from: e */
    public void mo5788e() {
        m82877c();
    }

    @Override // p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: g */
    public void mo5790g(C38074d c38074d, int i11, List<C38074d> list, C38074d c38074d2) {
        C42929k.m94197k(c38074d, i11, list, c38074d2, this);
    }
}
