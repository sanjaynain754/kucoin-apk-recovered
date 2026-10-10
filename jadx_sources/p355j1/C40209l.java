package p355j1;

import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import p218e1.C37038r;
import p218e1.InterfaceC37023c;
import p328i1.C38400h;

/* JADX INFO: renamed from: j1.l */
/* JADX INFO: compiled from: ShapePath.java */
/* JADX INFO: loaded from: classes.dex */
public class C40209l implements InterfaceC40200c {

    /* JADX INFO: renamed from: a */
    public final String f89371a;

    /* JADX INFO: renamed from: b */
    public final int f89372b;

    /* JADX INFO: renamed from: c */
    public final C38400h f89373c;

    /* JADX INFO: renamed from: d */
    public final boolean f89374d;

    @Override // p355j1.InterfaceC40200c
    /* JADX INFO: renamed from: a */
    public InterfaceC37023c mo5692a(LottieDrawable lottieDrawable, C5080h c5080h, AbstractC5095a abstractC5095a) {
        return new C37038r(lottieDrawable, abstractC5095a, this);
    }

    /* JADX INFO: renamed from: b */
    public String m88598b() {
        return this.f89371a;
    }

    /* JADX INFO: renamed from: c */
    public C38400h m88599c() {
        return this.f89373c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m88600d() {
        return this.f89374d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f89371a + ", index=" + this.f89372b + '}';
    }

    public C40209l(String str, int i11, C38400h c38400h, boolean z11) {
        this.f89371a = str;
        this.f89372b = i11;
        this.f89373c = c38400h;
        this.f89374d = z11;
    }
}
