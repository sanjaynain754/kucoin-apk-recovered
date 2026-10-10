package com.sumsub.sns.internal.features.presentation.status.model;

import com.sumsub.sns.internal.features.presentation.status.C32411U;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.model.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32437a {

    /* JADX INFO: renamed from: a */
    public final C32411U f66125a;

    /* JADX INFO: renamed from: b */
    public final boolean f66126b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32437a)) {
            return false;
        }
        C32437a c32437a = (C32437a) obj;
        return Intrinsics.areEqual(this.f66125a, c32437a.f66125a) && this.f66126b == c32437a.f66126b;
    }

    public final int hashCode() {
        C32411U c32411u = this.f66125a;
        return Boolean.hashCode(this.f66126b) + ((c32411u == null ? 0 : c32411u.hashCode()) * 31);
    }

    public final String toString() {
        return "SNSApplicantStatusSumsubIdBannerState(banner=" + this.f66125a + ", isGlobalProgressVisible=" + this.f66126b + ")";
    }

    public C32437a(C32411U c32411u, boolean z11) {
        this.f66125a = c32411u;
        this.f66126b = z11;
    }
}
