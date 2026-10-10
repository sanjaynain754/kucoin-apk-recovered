package p355j1;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import p218e1.C37027g;
import p218e1.InterfaceC37023c;
import p328i1.C38393a;
import p328i1.C38396d;

/* JADX INFO: renamed from: j1.j */
/* JADX INFO: compiled from: ShapeFill.java */
/* JADX INFO: loaded from: classes.dex */
public class C40207j implements InterfaceC40200c {

    /* JADX INFO: renamed from: a */
    public final boolean f89362a;

    /* JADX INFO: renamed from: b */
    public final Path.FillType f89363b;

    /* JADX INFO: renamed from: c */
    public final String f89364c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final C38393a f89365d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final C38396d f89366e;

    /* JADX INFO: renamed from: f */
    public final boolean f89367f;

    @Override // p355j1.InterfaceC40200c
    /* JADX INFO: renamed from: a */
    public InterfaceC37023c mo5692a(LottieDrawable lottieDrawable, C5080h c5080h, AbstractC5095a abstractC5095a) {
        return new C37027g(lottieDrawable, abstractC5095a, this);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public C38393a m88590b() {
        return this.f89365d;
    }

    /* JADX INFO: renamed from: c */
    public Path.FillType m88591c() {
        return this.f89363b;
    }

    /* JADX INFO: renamed from: d */
    public String m88592d() {
        return this.f89364c;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public C38396d m88593e() {
        return this.f89366e;
    }

    /* JADX INFO: renamed from: f */
    public boolean m88594f() {
        return this.f89367f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f89362a + '}';
    }

    public C40207j(String str, boolean z11, Path.FillType fillType, @Nullable C38393a c38393a, @Nullable C38396d c38396d, boolean z12) {
        this.f89364c = str;
        this.f89362a = z11;
        this.f89363b = fillType;
        this.f89365d = c38393a;
        this.f89366e = c38396d;
        this.f89367f = z12;
    }
}
