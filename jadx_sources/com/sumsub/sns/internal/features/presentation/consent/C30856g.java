package com.sumsub.sns.internal.features.presentation.consent;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.consent.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30856g implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final String f62318a;

    /* JADX INFO: renamed from: b */
    public final String f62319b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30856g)) {
            return false;
        }
        C30856g c30856g = (C30856g) obj;
        return Intrinsics.areEqual(this.f62318a, c30856g.f62318a) && Intrinsics.areEqual(this.f62319b, c30856g.f62319b);
    }

    public final int hashCode() {
        return this.f62319b.hashCode() + (this.f62318a.hashCode() * 31);
    }

    public final String toString() {
        return "AgreeAnalyticsEvent(country=" + this.f62318a + ", titleKey=" + this.f62319b + ")";
    }

    public C30856g(String str, String str2) {
        this.f62318a = str;
        this.f62319b = str2;
    }
}
