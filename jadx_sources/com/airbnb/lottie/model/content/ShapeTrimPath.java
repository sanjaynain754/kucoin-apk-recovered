package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import p218e1.C37041u;
import p218e1.InterfaceC37023c;
import p328i1.C38394b;
import p355j1.InterfaceC40200c;

/* JADX INFO: loaded from: classes34.dex */
public class ShapeTrimPath implements InterfaceC40200c {

    /* JADX INFO: renamed from: a */
    public final String f6085a;

    /* JADX INFO: renamed from: b */
    public final Type f6086b;

    /* JADX INFO: renamed from: c */
    public final C38394b f6087c;

    /* JADX INFO: renamed from: d */
    public final C38394b f6088d;

    /* JADX INFO: renamed from: e */
    public final C38394b f6089e;

    /* JADX INFO: renamed from: f */
    public final boolean f6090f;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i11) {
            if (i11 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i11 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i11);
        }
    }

    @Override // p355j1.InterfaceC40200c
    /* JADX INFO: renamed from: a */
    public InterfaceC37023c mo5692a(LottieDrawable lottieDrawable, C5080h c5080h, AbstractC5095a abstractC5095a) {
        return new C37041u(abstractC5095a, this);
    }

    /* JADX INFO: renamed from: b */
    public C38394b m5721b() {
        return this.f6088d;
    }

    /* JADX INFO: renamed from: c */
    public String m5722c() {
        return this.f6085a;
    }

    /* JADX INFO: renamed from: d */
    public C38394b m5723d() {
        return this.f6089e;
    }

    /* JADX INFO: renamed from: e */
    public C38394b m5724e() {
        return this.f6087c;
    }

    /* JADX INFO: renamed from: f */
    public Type m5725f() {
        return this.f6086b;
    }

    /* JADX INFO: renamed from: g */
    public boolean m5726g() {
        return this.f6090f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f6087c + ", end: " + this.f6088d + ", offset: " + this.f6089e + "}";
    }

    public ShapeTrimPath(String str, Type type, C38394b c38394b, C38394b c38394b2, C38394b c38394b3, boolean z11) {
        this.f6085a = str;
        this.f6086b = type;
        this.f6087c = c38394b;
        this.f6088d = c38394b2;
        this.f6089e = c38394b3;
        this.f6090f = z11;
    }
}
