package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import java.util.List;
import p218e1.C37029i;
import p218e1.InterfaceC37023c;
import p328i1.C38394b;
import p328i1.C38395c;
import p328i1.C38396d;
import p328i1.C38398f;
import p355j1.InterfaceC40200c;

/* JADX INFO: renamed from: com.airbnb.lottie.model.content.a */
/* JADX INFO: compiled from: GradientStroke.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5094a implements InterfaceC40200c {

    /* JADX INFO: renamed from: a */
    public final String f6092a;

    /* JADX INFO: renamed from: b */
    public final GradientType f6093b;

    /* JADX INFO: renamed from: c */
    public final C38395c f6094c;

    /* JADX INFO: renamed from: d */
    public final C38396d f6095d;

    /* JADX INFO: renamed from: e */
    public final C38398f f6096e;

    /* JADX INFO: renamed from: f */
    public final C38398f f6097f;

    /* JADX INFO: renamed from: g */
    public final C38394b f6098g;

    /* JADX INFO: renamed from: h */
    public final ShapeStroke.LineCapType f6099h;

    /* JADX INFO: renamed from: i */
    public final ShapeStroke.LineJoinType f6100i;

    /* JADX INFO: renamed from: j */
    public final float f6101j;

    /* JADX INFO: renamed from: k */
    public final List<C38394b> f6102k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final C38394b f6103l;

    /* JADX INFO: renamed from: m */
    public final boolean f6104m;

    @Override // p355j1.InterfaceC40200c
    /* JADX INFO: renamed from: a */
    public InterfaceC37023c mo5692a(LottieDrawable lottieDrawable, C5080h c5080h, AbstractC5095a abstractC5095a) {
        return new C37029i(lottieDrawable, abstractC5095a, this);
    }

    /* JADX INFO: renamed from: b */
    public ShapeStroke.LineCapType m5728b() {
        return this.f6099h;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public C38394b m5729c() {
        return this.f6103l;
    }

    /* JADX INFO: renamed from: d */
    public C38398f m5730d() {
        return this.f6097f;
    }

    /* JADX INFO: renamed from: e */
    public C38395c m5731e() {
        return this.f6094c;
    }

    /* JADX INFO: renamed from: f */
    public GradientType m5732f() {
        return this.f6093b;
    }

    /* JADX INFO: renamed from: g */
    public ShapeStroke.LineJoinType m5733g() {
        return this.f6100i;
    }

    /* JADX INFO: renamed from: h */
    public List<C38394b> m5734h() {
        return this.f6102k;
    }

    /* JADX INFO: renamed from: i */
    public float m5735i() {
        return this.f6101j;
    }

    /* JADX INFO: renamed from: j */
    public String m5736j() {
        return this.f6092a;
    }

    /* JADX INFO: renamed from: k */
    public C38396d m5737k() {
        return this.f6095d;
    }

    /* JADX INFO: renamed from: l */
    public C38398f m5738l() {
        return this.f6096e;
    }

    /* JADX INFO: renamed from: m */
    public C38394b m5739m() {
        return this.f6098g;
    }

    /* JADX INFO: renamed from: n */
    public boolean m5740n() {
        return this.f6104m;
    }

    public C5094a(String str, GradientType gradientType, C38395c c38395c, C38396d c38396d, C38398f c38398f, C38398f c38398f2, C38394b c38394b, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f11, List<C38394b> list, @Nullable C38394b c38394b2, boolean z11) {
        this.f6092a = str;
        this.f6093b = gradientType;
        this.f6094c = c38395c;
        this.f6095d = c38396d;
        this.f6096e = c38398f;
        this.f6097f = c38398f2;
        this.f6098g = c38394b;
        this.f6099h = lineCapType;
        this.f6100i = lineJoinType;
        this.f6101j = f11;
        this.f6102k = list;
        this.f6103l = c38394b2;
        this.f6104m = z11;
    }
}
