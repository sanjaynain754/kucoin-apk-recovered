package com.sumsub.sns.internal.features.domain.navigation.model;

import com.sumsub.sentry.android.AbstractC27920h;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.navigation.model.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30277b {

    /* JADX INFO: renamed from: a */
    public final boolean f60870a;

    /* JADX INFO: renamed from: b */
    public final boolean f60871b;

    /* JADX INFO: renamed from: c */
    public final boolean f60872c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30277b)) {
            return false;
        }
        C30277b c30277b = (C30277b) obj;
        return this.f60870a == c30277b.f60870a && this.f60871b == c30277b.f60871b && this.f60872c == c30277b.f60872c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60872c) + AbstractC27920h.m69001a(this.f60871b, Boolean.hashCode(this.f60870a) * 31, 31);
    }

    public final String toString() {
        return "SdkNavigation(canGoBack=" + this.f60870a + ", canGoForward=" + this.f60871b + ", canSkip=" + this.f60872c + ")";
    }

    public C30277b(boolean z11, boolean z12, boolean z13) {
        this.f60870a = z11;
        this.f60871b = z12;
        this.f60872c = z13;
    }
}
