package p355j1;

import android.graphics.PointF;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import p218e1.C37035o;
import p218e1.InterfaceC37023c;
import p328i1.C38394b;
import p328i1.InterfaceC38405m;

/* JADX INFO: renamed from: j1.f */
/* JADX INFO: compiled from: RectangleShape.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40203f implements InterfaceC40200c {

    /* JADX INFO: renamed from: a */
    public final String f89347a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC38405m<PointF, PointF> f89348b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC38405m<PointF, PointF> f89349c;

    /* JADX INFO: renamed from: d */
    public final C38394b f89350d;

    /* JADX INFO: renamed from: e */
    public final boolean f89351e;

    @Override // p355j1.InterfaceC40200c
    /* JADX INFO: renamed from: a */
    public InterfaceC37023c mo5692a(LottieDrawable lottieDrawable, C5080h c5080h, AbstractC5095a abstractC5095a) {
        return new C37035o(lottieDrawable, abstractC5095a, this);
    }

    /* JADX INFO: renamed from: b */
    public C38394b m88572b() {
        return this.f89350d;
    }

    /* JADX INFO: renamed from: c */
    public String m88573c() {
        return this.f89347a;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC38405m<PointF, PointF> m88574d() {
        return this.f89348b;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC38405m<PointF, PointF> m88575e() {
        return this.f89349c;
    }

    /* JADX INFO: renamed from: f */
    public boolean m88576f() {
        return this.f89351e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f89348b + ", size=" + this.f89349c + '}';
    }

    public C40203f(String str, InterfaceC38405m<PointF, PointF> interfaceC38405m, InterfaceC38405m<PointF, PointF> interfaceC38405m2, C38394b c38394b, boolean z11) {
        this.f89347a = str;
        this.f89348b = interfaceC38405m;
        this.f89349c = interfaceC38405m2;
        this.f89350d = c38394b;
        this.f89351e = z11;
    }
}
