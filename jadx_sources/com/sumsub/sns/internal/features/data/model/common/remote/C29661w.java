package com.sumsub.sns.internal.features.data.model.common.remote;

import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sentry.android.AbstractC27920h;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o(with = C29640t.class)
public final class C29661w {

    @NotNull
    public static final C29654v Companion = new C29654v();

    /* JADX INFO: renamed from: a */
    public final String f59717a;

    /* JADX INFO: renamed from: b */
    public final String f59718b;

    /* JADX INFO: renamed from: c */
    public final boolean f59719c;

    /* JADX INFO: renamed from: d */
    public final boolean f59720d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC29434p f59721e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29661w)) {
            return false;
        }
        C29661w c29661w = (C29661w) obj;
        return Intrinsics.areEqual(this.f59717a, c29661w.f59717a) && Intrinsics.areEqual(this.f59718b, c29661w.f59718b) && this.f59719c == c29661w.f59719c && this.f59720d == c29661w.f59720d && Intrinsics.areEqual(this.f59721e, c29661w.f59721e);
    }

    public final int hashCode() {
        String str = this.f59717a;
        int iM69001a = AbstractC27920h.m69001a(this.f59720d, AbstractC27920h.m69001a(this.f59719c, AbstractC27897U.m68983a(this.f59718b, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31);
        InterfaceC29434p interfaceC29434p = this.f59721e;
        return iM69001a + (interfaceC29434p != null ? interfaceC29434p.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicantDataFormField(displayName=" + this.f59717a + ", name=" + this.f59718b + ", required=" + this.f59719c + ", isImmutableIfPresent=" + this.f59720d + ", value=" + this.f59721e + ")";
    }

    public C29661w(String str, String str2, boolean z11, boolean z12, InterfaceC29434p interfaceC29434p) {
        this.f59717a = str;
        this.f59718b = str2;
        this.f59719c = z11;
        this.f59720d = z12;
        this.f59721e = interfaceC29434p;
    }
}
