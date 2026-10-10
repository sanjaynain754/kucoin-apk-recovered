package p355j1;

import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import java.util.Arrays;
import java.util.List;
import p218e1.C37024d;
import p218e1.InterfaceC37023c;

/* JADX INFO: renamed from: j1.k */
/* JADX INFO: compiled from: ShapeGroup.java */
/* JADX INFO: loaded from: classes.dex */
public class C40208k implements InterfaceC40200c {

    /* JADX INFO: renamed from: a */
    public final String f89368a;

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC40200c> f89369b;

    /* JADX INFO: renamed from: c */
    public final boolean f89370c;

    @Override // p355j1.InterfaceC40200c
    /* JADX INFO: renamed from: a */
    public InterfaceC37023c mo5692a(LottieDrawable lottieDrawable, C5080h c5080h, AbstractC5095a abstractC5095a) {
        return new C37024d(lottieDrawable, abstractC5095a, this, c5080h);
    }

    /* JADX INFO: renamed from: b */
    public List<InterfaceC40200c> m88595b() {
        return this.f89369b;
    }

    /* JADX INFO: renamed from: c */
    public String m88596c() {
        return this.f89368a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m88597d() {
        return this.f89370c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f89368a + "' Shapes: " + Arrays.toString(this.f89369b.toArray()) + '}';
    }

    public C40208k(String str, List<InterfaceC40200c> list, boolean z11) {
        this.f89368a = str;
        this.f89369b = list;
        this.f89370c = z11;
    }
}
