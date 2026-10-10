package p355j1;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import p218e1.C37028h;
import p218e1.InterfaceC37023c;
import p328i1.C38394b;
import p328i1.C38395c;
import p328i1.C38396d;
import p328i1.C38398f;

/* JADX INFO: renamed from: j1.e */
/* JADX INFO: compiled from: GradientFill.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40202e implements InterfaceC40200c {

    /* JADX INFO: renamed from: a */
    public final GradientType f89337a;

    /* JADX INFO: renamed from: b */
    public final Path.FillType f89338b;

    /* JADX INFO: renamed from: c */
    public final C38395c f89339c;

    /* JADX INFO: renamed from: d */
    public final C38396d f89340d;

    /* JADX INFO: renamed from: e */
    public final C38398f f89341e;

    /* JADX INFO: renamed from: f */
    public final C38398f f89342f;

    /* JADX INFO: renamed from: g */
    public final String f89343g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final C38394b f89344h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final C38394b f89345i;

    /* JADX INFO: renamed from: j */
    public final boolean f89346j;

    @Override // p355j1.InterfaceC40200c
    /* JADX INFO: renamed from: a */
    public InterfaceC37023c mo5692a(LottieDrawable lottieDrawable, C5080h c5080h, AbstractC5095a abstractC5095a) {
        return new C37028h(lottieDrawable, c5080h, abstractC5095a, this);
    }

    /* JADX INFO: renamed from: b */
    public C38398f m88564b() {
        return this.f89342f;
    }

    /* JADX INFO: renamed from: c */
    public Path.FillType m88565c() {
        return this.f89338b;
    }

    /* JADX INFO: renamed from: d */
    public C38395c m88566d() {
        return this.f89339c;
    }

    /* JADX INFO: renamed from: e */
    public GradientType m88567e() {
        return this.f89337a;
    }

    /* JADX INFO: renamed from: f */
    public String m88568f() {
        return this.f89343g;
    }

    /* JADX INFO: renamed from: g */
    public C38396d m88569g() {
        return this.f89340d;
    }

    /* JADX INFO: renamed from: h */
    public C38398f m88570h() {
        return this.f89341e;
    }

    /* JADX INFO: renamed from: i */
    public boolean m88571i() {
        return this.f89346j;
    }

    public C40202e(String str, GradientType gradientType, Path.FillType fillType, C38395c c38395c, C38396d c38396d, C38398f c38398f, C38398f c38398f2, C38394b c38394b, C38394b c38394b2, boolean z11) {
        this.f89337a = gradientType;
        this.f89338b = fillType;
        this.f89339c = c38395c;
        this.f89340d = c38396d;
        this.f89341e = c38398f;
        this.f89342f = c38398f2;
        this.f89343g = str;
        this.f89344h = c38394b;
        this.f89345i = c38394b2;
        this.f89346j = z11;
    }
}
