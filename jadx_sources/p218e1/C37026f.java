package p218e1;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.InterfaceC5091m0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import java.util.List;
import p248f1.AbstractC37305a;
import p297h1.C38074d;
import p355j1.C40199b;
import p484o1.C42929k;
import p522p1.C43350c;

/* JADX INFO: renamed from: e1.f */
/* JADX INFO: compiled from: EllipseContent.java */
/* JADX INFO: loaded from: classes.dex */
public class C37026f implements InterfaceC37033m, AbstractC37305a.b, InterfaceC37031k {

    /* JADX INFO: renamed from: b */
    public final String f82178b;

    /* JADX INFO: renamed from: c */
    public final LottieDrawable f82179c;

    /* JADX INFO: renamed from: d */
    public final AbstractC37305a<?, PointF> f82180d;

    /* JADX INFO: renamed from: e */
    public final AbstractC37305a<?, PointF> f82181e;

    /* JADX INFO: renamed from: f */
    public final C40199b f82182f;

    /* JADX INFO: renamed from: h */
    public boolean f82184h;

    /* JADX INFO: renamed from: a */
    public final Path f82177a = new Path();

    /* JADX INFO: renamed from: g */
    public final C37022b f82183g = new C37022b();

    /* JADX INFO: renamed from: c */
    public final void m82862c() {
        this.f82184h = false;
        this.f82179c.invalidateSelf();
    }

    @Override // p218e1.InterfaceC37023c
    /* JADX INFO: renamed from: f */
    public void mo5789f(List<InterfaceC37023c> list, List<InterfaceC37023c> list2) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            InterfaceC37023c interfaceC37023c = list.get(i11);
            if (interfaceC37023c instanceof C37041u) {
                C37041u c37041u = (C37041u) interfaceC37023c;
                if (c37041u.m82888j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f82183g.m82854a(c37041u);
                    c37041u.m82884a(this);
                }
            }
        }
    }

    @Override // p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: a */
    public <T> void mo5785a(T t11, @Nullable C43350c<T> c43350c) {
        if (t11 == InterfaceC5091m0.f6017k) {
            this.f82180d.m83838o(c43350c);
        } else if (t11 == InterfaceC5091m0.f6020n) {
            this.f82181e.m83838o(c43350c);
        }
    }

    @Override // p218e1.InterfaceC37023c
    public String getName() {
        return this.f82178b;
    }

    @Override // p218e1.InterfaceC37033m
    public Path getPath() {
        if (this.f82184h) {
            return this.f82177a;
        }
        this.f82177a.reset();
        if (this.f82182f.m88555e()) {
            this.f82184h = true;
            return this.f82177a;
        }
        PointF pointFMo83831h = this.f82180d.mo83831h();
        float f11 = pointFMo83831h.x / 2.0f;
        float f12 = pointFMo83831h.y / 2.0f;
        float f13 = f11 * 0.55228f;
        float f14 = 0.55228f * f12;
        this.f82177a.reset();
        if (this.f82182f.m88556f()) {
            float f15 = -f12;
            this.f82177a.moveTo(0.0f, f15);
            float f16 = 0.0f - f13;
            float f17 = -f11;
            float f18 = 0.0f - f14;
            this.f82177a.cubicTo(f16, f15, f17, f18, f17, 0.0f);
            float f19 = f14 + 0.0f;
            this.f82177a.cubicTo(f17, f19, f16, f12, 0.0f, f12);
            float f21 = f13 + 0.0f;
            this.f82177a.cubicTo(f21, f12, f11, f19, f11, 0.0f);
            this.f82177a.cubicTo(f11, f18, f21, f15, 0.0f, f15);
        } else {
            float f22 = -f12;
            this.f82177a.moveTo(0.0f, f22);
            float f23 = f13 + 0.0f;
            float f24 = 0.0f - f14;
            this.f82177a.cubicTo(f23, f22, f11, f24, f11, 0.0f);
            float f25 = f14 + 0.0f;
            this.f82177a.cubicTo(f11, f25, f23, f12, 0.0f, f12);
            float f26 = 0.0f - f13;
            float f27 = -f11;
            this.f82177a.cubicTo(f26, f12, f27, f25, f27, 0.0f);
            this.f82177a.cubicTo(f27, f24, f26, f22, 0.0f, f22);
        }
        PointF pointFMo83831h2 = this.f82181e.mo83831h();
        this.f82177a.offset(pointFMo83831h2.x, pointFMo83831h2.y);
        this.f82177a.close();
        this.f82183g.m82855b(this.f82177a);
        this.f82184h = true;
        return this.f82177a;
    }

    public C37026f(LottieDrawable lottieDrawable, AbstractC5095a abstractC5095a, C40199b c40199b) {
        this.f82178b = c40199b.m88552b();
        this.f82179c = lottieDrawable;
        AbstractC37305a<PointF, PointF> abstractC37305aMo86574a = c40199b.m88554d().mo86574a();
        this.f82180d = abstractC37305aMo86574a;
        AbstractC37305a<PointF, PointF> abstractC37305aMo86574a2 = c40199b.m88553c().mo86574a();
        this.f82181e = abstractC37305aMo86574a2;
        this.f82182f = c40199b;
        abstractC5095a.m5791i(abstractC37305aMo86574a);
        abstractC5095a.m5791i(abstractC37305aMo86574a2);
        abstractC37305aMo86574a.m83824a(this);
        abstractC37305aMo86574a2.m83824a(this);
    }

    @Override // p248f1.AbstractC37305a.b
    /* JADX INFO: renamed from: e */
    public void mo5788e() {
        m82862c();
    }

    @Override // p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: g */
    public void mo5790g(C38074d c38074d, int i11, List<C38074d> list, C38074d c38074d2) {
        C42929k.m94197k(c38074d, i11, list, c38074d2, this);
    }
}
