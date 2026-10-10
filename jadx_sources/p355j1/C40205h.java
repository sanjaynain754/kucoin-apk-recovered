package p355j1;

import androidx.annotation.Nullable;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import p218e1.C37037q;
import p218e1.InterfaceC37023c;
import p328i1.InterfaceC38405m;

/* JADX INFO: renamed from: j1.h */
/* JADX INFO: compiled from: RoundedCorners.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40205h implements InterfaceC40200c {

    /* JADX INFO: renamed from: a */
    public final String f89357a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC38405m<Float, Float> f89358b;

    @Override // p355j1.InterfaceC40200c
    @Nullable
    /* JADX INFO: renamed from: a */
    public InterfaceC37023c mo5692a(LottieDrawable lottieDrawable, C5080h c5080h, AbstractC5095a abstractC5095a) {
        return new C37037q(lottieDrawable, abstractC5095a, this);
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC38405m<Float, Float> m88582b() {
        return this.f89358b;
    }

    /* JADX INFO: renamed from: c */
    public String m88583c() {
        return this.f89357a;
    }

    public C40205h(String str, InterfaceC38405m<Float, Float> interfaceC38405m) {
        this.f89357a = str;
        this.f89358b = interfaceC38405m;
    }
}
