package com.sumsub.sns.internal.features.data.model.prooface;

import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.prooface.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29798A {

    @NotNull
    public static final C29842z Companion = new C29842z();

    /* JADX INFO: renamed from: a */
    public final String f59871a;

    /* JADX INFO: renamed from: b */
    public final C29813P f59872b;

    /* JADX INFO: renamed from: c */
    public final C29837u f59873c;

    /* JADX INFO: renamed from: d */
    public final C29834r f59874d;

    /* JADX INFO: renamed from: e */
    public final C29810M f59875e;

    public /* synthetic */ C29798A(int i11, String str, C29813P c29813p, C29837u c29837u, C29834r c29834r, C29810M c29810m) {
        if ((i11 & 1) == 0) {
            this.f59871a = null;
        } else {
            this.f59871a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59872b = null;
        } else {
            this.f59872b = c29813p;
        }
        if ((i11 & 4) == 0) {
            this.f59873c = null;
        } else {
            this.f59873c = c29837u;
        }
        if ((i11 & 8) == 0) {
            this.f59874d = null;
        } else {
            this.f59874d = c29834r;
        }
        if ((i11 & 16) == 0) {
            this.f59875e = null;
        } else {
            this.f59875e = c29810m;
        }
    }

    public C29798A(String str, C29813P c29813p, C29837u c29837u, int i11) {
        c29813p = (i11 & 2) != 0 ? null : c29813p;
        c29837u = (i11 & 4) != 0 ? null : c29837u;
        this.f59871a = str;
        this.f59872b = c29813p;
        this.f59873c = c29837u;
        this.f59874d = null;
        this.f59875e = null;
    }
}
