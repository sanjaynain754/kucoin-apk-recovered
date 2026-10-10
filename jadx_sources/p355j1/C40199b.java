package p355j1;

import android.graphics.PointF;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import p218e1.C37026f;
import p218e1.InterfaceC37023c;
import p328i1.C38398f;
import p328i1.InterfaceC38405m;

/* JADX INFO: renamed from: j1.b */
/* JADX INFO: compiled from: CircleShape.java */
/* JADX INFO: loaded from: classes.dex */
public class C40199b implements InterfaceC40200c {

    /* JADX INFO: renamed from: a */
    public final String f89330a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC38405m<PointF, PointF> f89331b;

    /* JADX INFO: renamed from: c */
    public final C38398f f89332c;

    /* JADX INFO: renamed from: d */
    public final boolean f89333d;

    /* JADX INFO: renamed from: e */
    public final boolean f89334e;

    @Override // p355j1.InterfaceC40200c
    /* JADX INFO: renamed from: a */
    public InterfaceC37023c mo5692a(LottieDrawable lottieDrawable, C5080h c5080h, AbstractC5095a abstractC5095a) {
        return new C37026f(lottieDrawable, abstractC5095a, this);
    }

    /* JADX INFO: renamed from: b */
    public String m88552b() {
        return this.f89330a;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC38405m<PointF, PointF> m88553c() {
        return this.f89331b;
    }

    /* JADX INFO: renamed from: d */
    public C38398f m88554d() {
        return this.f89332c;
    }

    /* JADX INFO: renamed from: e */
    public boolean m88555e() {
        return this.f89334e;
    }

    /* JADX INFO: renamed from: f */
    public boolean m88556f() {
        return this.f89333d;
    }

    public C40199b(String str, InterfaceC38405m<PointF, PointF> interfaceC38405m, C38398f c38398f, boolean z11, boolean z12) {
        this.f89330a = str;
        this.f89331b = interfaceC38405m;
        this.f89332c = c38398f;
        this.f89333d = z11;
        this.f89334e = z12;
    }
}
