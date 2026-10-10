package com.sumsub.sns.internal.features.presentation.status;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.U */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32411U {

    /* JADX INFO: renamed from: a */
    public final CharSequence f66072a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66073b;

    /* JADX INFO: renamed from: c */
    public final boolean f66074c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32411U)) {
            return false;
        }
        C32411U c32411u = (C32411U) obj;
        return Intrinsics.areEqual(this.f66072a, c32411u.f66072a) && Intrinsics.areEqual(this.f66073b, c32411u.f66073b) && this.f66074c == c32411u.f66074c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f66072a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f66073b;
        return Boolean.hashCode(this.f66074c) + ((iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f66072a;
        CharSequence charSequence2 = this.f66073b;
        return "SumsubIdBanner(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", isChecked=" + this.f66074c + ")";
    }

    public C32411U(CharSequence charSequence, CharSequence charSequence2, boolean z11) {
        this.f66072a = charSequence;
        this.f66073b = charSequence2;
        this.f66074c = z11;
    }
}
