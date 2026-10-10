package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31893q extends AbstractC31897s {

    /* JADX INFO: renamed from: a */
    public final CharSequence f64821a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f64822b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f64823c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31893q)) {
            return false;
        }
        C31893q c31893q = (C31893q) obj;
        return Intrinsics.areEqual(this.f64821a, c31893q.f64821a) && Intrinsics.areEqual(this.f64822b, c31893q.f64822b) && Intrinsics.areEqual(this.f64823c, c31893q.f64823c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64821a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f64822b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f64823c;
        return iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public final String toString() {
        return "Listening(title=" + ((Object) this.f64821a) + ", subtitle=" + ((Object) this.f64822b) + ", actionCancel=" + ((Object) this.f64823c) + ")";
    }

    public C31893q(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.f64821a = charSequence;
        this.f64822b = charSequence2;
        this.f64823c = charSequence3;
    }
}
