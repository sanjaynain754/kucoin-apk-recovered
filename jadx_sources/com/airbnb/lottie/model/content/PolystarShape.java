package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import p218e1.C37034n;
import p218e1.InterfaceC37023c;
import p328i1.C38394b;
import p328i1.InterfaceC38405m;
import p355j1.InterfaceC40200c;

/* JADX INFO: loaded from: classes34.dex */
public class PolystarShape implements InterfaceC40200c {

    /* JADX INFO: renamed from: a */
    public final String f6059a;

    /* JADX INFO: renamed from: b */
    public final Type f6060b;

    /* JADX INFO: renamed from: c */
    public final C38394b f6061c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC38405m<PointF, PointF> f6062d;

    /* JADX INFO: renamed from: e */
    public final C38394b f6063e;

    /* JADX INFO: renamed from: f */
    public final C38394b f6064f;

    /* JADX INFO: renamed from: g */
    public final C38394b f6065g;

    /* JADX INFO: renamed from: h */
    public final C38394b f6066h;

    /* JADX INFO: renamed from: i */
    public final C38394b f6067i;

    /* JADX INFO: renamed from: j */
    public final boolean f6068j;

    /* JADX INFO: renamed from: k */
    public final boolean f6069k;

    public enum Type {
        STAR(1),
        POLYGON(2);

        private final int value;

        Type(int i11) {
            this.value = i11;
        }

        public static Type forValue(int i11) {
            for (Type type : values()) {
                if (type.value == i11) {
                    return type;
                }
            }
            return null;
        }
    }

    @Override // p355j1.InterfaceC40200c
    /* JADX INFO: renamed from: a */
    public InterfaceC37023c mo5692a(LottieDrawable lottieDrawable, C5080h c5080h, AbstractC5095a abstractC5095a) {
        return new C37034n(lottieDrawable, abstractC5095a, this);
    }

    /* JADX INFO: renamed from: b */
    public C38394b m5697b() {
        return this.f6064f;
    }

    /* JADX INFO: renamed from: c */
    public C38394b m5698c() {
        return this.f6066h;
    }

    /* JADX INFO: renamed from: d */
    public String m5699d() {
        return this.f6059a;
    }

    /* JADX INFO: renamed from: e */
    public C38394b m5700e() {
        return this.f6065g;
    }

    /* JADX INFO: renamed from: f */
    public C38394b m5701f() {
        return this.f6067i;
    }

    /* JADX INFO: renamed from: g */
    public C38394b m5702g() {
        return this.f6061c;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC38405m<PointF, PointF> m5703h() {
        return this.f6062d;
    }

    /* JADX INFO: renamed from: i */
    public C38394b m5704i() {
        return this.f6063e;
    }

    /* JADX INFO: renamed from: j */
    public Type m5705j() {
        return this.f6060b;
    }

    /* JADX INFO: renamed from: k */
    public boolean m5706k() {
        return this.f6068j;
    }

    /* JADX INFO: renamed from: l */
    public boolean m5707l() {
        return this.f6069k;
    }

    public PolystarShape(String str, Type type, C38394b c38394b, InterfaceC38405m<PointF, PointF> interfaceC38405m, C38394b c38394b2, C38394b c38394b3, C38394b c38394b4, C38394b c38394b5, C38394b c38394b6, boolean z11, boolean z12) {
        this.f6059a = str;
        this.f6060b = type;
        this.f6061c = c38394b;
        this.f6062d = interfaceC38405m;
        this.f6063e = c38394b2;
        this.f6064f = c38394b3;
        this.f6065g = c38394b4;
        this.f6066h = c38394b5;
        this.f6067i = c38394b6;
        this.f6068j = z11;
        this.f6069k = z12;
    }
}
