package com.sumsub.sns.internal.features.data.repository.sumsubid;

import com.sumsub.sentry.android.AbstractC27920h;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.sumsubid.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30052a {

    /* JADX INFO: renamed from: a */
    public final String f60383a;

    /* JADX INFO: renamed from: b */
    public final boolean f60384b;

    /* JADX INFO: renamed from: c */
    public final boolean f60385c;

    /* JADX INFO: renamed from: d */
    public final String f60386d;

    public /* synthetic */ C30052a(String str, int i11) {
        this((i11 & 1) != 0 ? null : str, false, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30052a)) {
            return false;
        }
        C30052a c30052a = (C30052a) obj;
        return Intrinsics.areEqual(this.f60383a, c30052a.f60383a) && this.f60384b == c30052a.f60384b && this.f60385c == c30052a.f60385c && Intrinsics.areEqual(this.f60386d, c30052a.f60386d);
    }

    public C30052a(String str, boolean z11, boolean z12, String str2) {
        this.f60383a = str;
        this.f60384b = z11;
        this.f60385c = z12;
        this.f60386d = str2;
    }

    /* JADX INFO: renamed from: a */
    public static C30052a m70080a(C30052a c30052a, String str, boolean z11, boolean z12, String str2, int i11) {
        if ((i11 & 1) != 0) {
            str = c30052a.f60383a;
        }
        if ((i11 & 2) != 0) {
            z11 = c30052a.f60384b;
        }
        if ((i11 & 4) != 0) {
            z12 = c30052a.f60385c;
        }
        if ((i11 & 8) != 0) {
            str2 = c30052a.f60386d;
        }
        c30052a.getClass();
        return new C30052a(str, z11, z12, str2);
    }

    public final int hashCode() {
        String str = this.f60383a;
        int iM69001a = AbstractC27920h.m69001a(this.f60385c, AbstractC27920h.m69001a(this.f60384b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f60386d;
        return iM69001a + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "LoginData(email=" + this.f60383a + ", isLoggedIn=" + this.f60384b + ", hasDocs=" + this.f60385c + ", token=" + this.f60386d + ")";
    }
}
