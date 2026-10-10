package p355j1;

import androidx.annotation.Nullable;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import p218e1.C37036p;
import p218e1.InterfaceC37023c;
import p328i1.C38394b;
import p328i1.C38404l;

/* JADX INFO: renamed from: j1.g */
/* JADX INFO: compiled from: Repeater.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40204g implements InterfaceC40200c {

    /* JADX INFO: renamed from: a */
    public final String f89352a;

    /* JADX INFO: renamed from: b */
    public final C38394b f89353b;

    /* JADX INFO: renamed from: c */
    public final C38394b f89354c;

    /* JADX INFO: renamed from: d */
    public final C38404l f89355d;

    /* JADX INFO: renamed from: e */
    public final boolean f89356e;

    @Override // p355j1.InterfaceC40200c
    @Nullable
    /* JADX INFO: renamed from: a */
    public InterfaceC37023c mo5692a(LottieDrawable lottieDrawable, C5080h c5080h, AbstractC5095a abstractC5095a) {
        return new C37036p(lottieDrawable, abstractC5095a, this);
    }

    /* JADX INFO: renamed from: b */
    public C38394b m88577b() {
        return this.f89353b;
    }

    /* JADX INFO: renamed from: c */
    public String m88578c() {
        return this.f89352a;
    }

    /* JADX INFO: renamed from: d */
    public C38394b m88579d() {
        return this.f89354c;
    }

    /* JADX INFO: renamed from: e */
    public C38404l m88580e() {
        return this.f89355d;
    }

    /* JADX INFO: renamed from: f */
    public boolean m88581f() {
        return this.f89356e;
    }

    public C40204g(String str, C38394b c38394b, C38394b c38394b2, C38404l c38404l, boolean z11) {
        this.f89352a = str;
        this.f89353b = c38394b;
        this.f89354c = c38394b2;
        this.f89355d = c38404l;
        this.f89356e = z11;
    }
}
