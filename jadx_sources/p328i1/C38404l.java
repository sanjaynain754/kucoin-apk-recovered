package p328i1;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import p218e1.InterfaceC37023c;
import p248f1.C37320p;
import p355j1.InterfaceC40200c;

/* JADX INFO: renamed from: i1.l */
/* JADX INFO: compiled from: AnimatableTransform.java */
/* JADX INFO: loaded from: classes.dex */
public class C38404l implements InterfaceC40200c {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final C38397e f86177a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final InterfaceC38405m<PointF, PointF> f86178b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final C38399g f86179c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final C38394b f86180d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final C38396d f86181e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final C38394b f86182f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final C38394b f86183g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final C38394b f86184h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final C38394b f86185i;

    /* JADX INFO: renamed from: j */
    public boolean f86186j;

    public C38404l() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // p355j1.InterfaceC40200c
    @Nullable
    /* JADX INFO: renamed from: a */
    public InterfaceC37023c mo5692a(LottieDrawable lottieDrawable, C5080h c5080h, AbstractC5095a abstractC5095a) {
        return null;
    }

    public C38404l(@Nullable C38397e c38397e, @Nullable InterfaceC38405m<PointF, PointF> interfaceC38405m, @Nullable C38399g c38399g, @Nullable C38394b c38394b, @Nullable C38396d c38396d, @Nullable C38394b c38394b2, @Nullable C38394b c38394b3, @Nullable C38394b c38394b4, @Nullable C38394b c38394b5) {
        this.f86186j = false;
        this.f86177a = c38397e;
        this.f86178b = interfaceC38405m;
        this.f86179c = c38399g;
        this.f86180d = c38394b;
        this.f86181e = c38396d;
        this.f86184h = c38394b2;
        this.f86185i = c38394b3;
        this.f86182f = c38394b4;
        this.f86183g = c38394b5;
    }

    /* JADX INFO: renamed from: b */
    public C37320p m86581b() {
        return new C37320p(this);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public C38397e m86582c() {
        return this.f86177a;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public C38394b m86583d() {
        return this.f86185i;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public C38396d m86584e() {
        return this.f86181e;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public InterfaceC38405m<PointF, PointF> m86585f() {
        return this.f86178b;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public C38394b m86586g() {
        return this.f86180d;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public C38399g m86587h() {
        return this.f86179c;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public C38394b m86588i() {
        return this.f86182f;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public C38394b m86589j() {
        return this.f86183g;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public C38394b m86590k() {
        return this.f86184h;
    }

    /* JADX INFO: renamed from: l */
    public boolean m86591l() {
        return this.f86186j;
    }

    /* JADX INFO: renamed from: m */
    public void m86592m(boolean z11) {
        this.f86186j = z11;
    }
}
