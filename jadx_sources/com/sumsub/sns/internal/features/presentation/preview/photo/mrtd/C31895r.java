package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31895r extends AbstractC31897s {

    /* JADX INFO: renamed from: a */
    public final CharSequence f64825a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f64826b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f64827c;

    /* JADX INFO: renamed from: d */
    public final int f64828d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31895r)) {
            return false;
        }
        C31895r c31895r = (C31895r) obj;
        return Intrinsics.areEqual(this.f64825a, c31895r.f64825a) && Intrinsics.areEqual(this.f64826b, c31895r.f64826b) && Intrinsics.areEqual(this.f64827c, c31895r.f64827c) && this.f64828d == c31895r.f64828d;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64825a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f64826b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f64827c;
        return Integer.hashCode(this.f64828d) + ((iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f64825a;
        CharSequence charSequence2 = this.f64826b;
        CharSequence charSequence3 = this.f64827c;
        return "Reading(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", actionCancel=" + ((Object) charSequence3) + ", progress=" + this.f64828d + ")";
    }

    public C31895r(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11) {
        this.f64825a = charSequence;
        this.f64826b = charSequence2;
        this.f64827c = charSequence3;
        this.f64828d = i11;
    }
}
