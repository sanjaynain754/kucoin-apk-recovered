package com.sumsub.sns.internal.features.presentation.error;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.error.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30937p extends AbstractC30939r {

    /* JADX INFO: renamed from: a */
    public final CharSequence f62484a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f62485b;

    /* JADX INFO: renamed from: c */
    public final String f62486c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30937p)) {
            return false;
        }
        C30937p c30937p = (C30937p) obj;
        return Intrinsics.areEqual(this.f62484a, c30937p.f62484a) && Intrinsics.areEqual(this.f62485b, c30937p.f62485b) && Intrinsics.areEqual(this.f62486c, c30937p.f62486c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f62484a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f62485b;
        return this.f62486c.hashCode() + ((iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Normal(title=" + ((Object) this.f62484a) + ", subtitle=" + ((Object) this.f62485b) + ", button=" + ((Object) this.f62486c) + ")";
    }

    public C30937p(CharSequence charSequence, CharSequence charSequence2, String str) {
        this.f62484a = charSequence;
        this.f62485b = charSequence2;
        this.f62486c = str;
    }
}
