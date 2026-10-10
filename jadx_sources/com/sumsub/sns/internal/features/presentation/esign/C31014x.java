package com.sumsub.sns.internal.features.presentation.esign;

import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31014x implements InterfaceC28147s {

    /* JADX INFO: renamed from: a */
    public final AbstractC31000p f62678a;

    /* JADX INFO: renamed from: b */
    public final String f62679b;

    /* JADX INFO: renamed from: c */
    public final boolean f62680c;

    /* JADX INFO: renamed from: d */
    public final C30988j f62681d;

    /* JADX INFO: renamed from: e */
    public final boolean f62682e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31014x)) {
            return false;
        }
        C31014x c31014x = (C31014x) obj;
        return Intrinsics.areEqual(this.f62678a, c31014x.f62678a) && Intrinsics.areEqual(this.f62679b, c31014x.f62679b) && this.f62680c == c31014x.f62680c && Intrinsics.areEqual(this.f62681d, c31014x.f62681d) && this.f62682e == c31014x.f62682e;
    }

    /* JADX INFO: renamed from: a */
    public static C31014x m70560a(C31014x c31014x, AbstractC31000p abstractC31000p, boolean z11, C30988j c30988j, boolean z12, int i11) {
        if ((i11 & 1) != 0) {
            abstractC31000p = c31014x.f62678a;
        }
        AbstractC31000p abstractC31000p2 = abstractC31000p;
        String str = c31014x.f62679b;
        if ((i11 & 4) != 0) {
            z11 = c31014x.f62680c;
        }
        boolean z13 = z11;
        if ((i11 & 8) != 0) {
            c30988j = c31014x.f62681d;
        }
        C30988j c30988j2 = c30988j;
        if ((i11 & 16) != 0) {
            z12 = c31014x.f62682e;
        }
        return new C31014x(abstractC31000p2, str, z13, c30988j2, z12);
    }

    public final int hashCode() {
        int iHashCode = this.f62678a.hashCode() * 31;
        String str = this.f62679b;
        int iM69001a = AbstractC27920h.m69001a(this.f62680c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        C30988j c30988j = this.f62681d;
        return Boolean.hashCode(this.f62682e) + ((iM69001a + (c30988j != null ? c30988j.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SNSESignViewState(view=" + this.f62678a + ", button=" + this.f62679b + ", buttonEnabled=" + this.f62680c + ", analytics=" + this.f62681d + ", isLoading=" + this.f62682e + ")";
    }

    public C31014x(AbstractC31000p abstractC31000p, String str, boolean z11, C30988j c30988j, boolean z12) {
        this.f62678a = abstractC31000p;
        this.f62679b = str;
        this.f62680c = z11;
        this.f62681d = c30988j;
        this.f62682e = z12;
    }
}
