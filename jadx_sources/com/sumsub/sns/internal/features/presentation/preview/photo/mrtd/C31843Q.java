package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.Q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31843Q extends AbstractC31844S {

    /* JADX INFO: renamed from: a */
    public final CharSequence f64714a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f64715b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f64716c;

    /* JADX INFO: renamed from: d */
    public final int f64717d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31843Q)) {
            return false;
        }
        C31843Q c31843q = (C31843Q) obj;
        return Intrinsics.areEqual(this.f64714a, c31843q.f64714a) && Intrinsics.areEqual(this.f64715b, c31843q.f64715b) && Intrinsics.areEqual(this.f64716c, c31843q.f64716c) && this.f64717d == c31843q.f64717d;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64714a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f64715b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f64716c;
        return Integer.hashCode(this.f64717d) + ((iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f64714a;
        CharSequence charSequence2 = this.f64715b;
        CharSequence charSequence3 = this.f64716c;
        return "Reading(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", actionCancel=" + ((Object) charSequence3) + ", progress=" + this.f64717d + ")";
    }

    public C31843Q(String str, CharSequence charSequence, CharSequence charSequence2, int i11) {
        this.f64714a = str;
        this.f64715b = charSequence;
        this.f64716c = charSequence2;
        this.f64717d = i11;
    }
}
