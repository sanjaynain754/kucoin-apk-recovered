package com.sumsub.sns.internal.features.presentation.geo;

import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.z0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31128z0 extends AbstractC31052H0 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f62947a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f62948b;

    /* JADX INFO: renamed from: c */
    public final List f62949c;

    /* JADX INFO: renamed from: d */
    public final C31126y0 f62950d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31128z0)) {
            return false;
        }
        C31128z0 c31128z0 = (C31128z0) obj;
        return Intrinsics.areEqual(this.f62947a, c31128z0.f62947a) && Intrinsics.areEqual(this.f62948b, c31128z0.f62948b) && Intrinsics.areEqual(this.f62949c, c31128z0.f62949c) && Intrinsics.areEqual(this.f62950d, c31128z0.f62950d);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f62947a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f62948b;
        return this.f62950d.hashCode() + ((this.f62949c.hashCode() + ((iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f62947a;
        CharSequence charSequence2 = this.f62948b;
        return "ConfirmAddressForm(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", formItems=" + this.f62949c + ", buttonsPanel=" + this.f62950d + ")";
    }

    public C31128z0(CharSequence charSequence, CharSequence charSequence2, List list, C31126y0 c31126y0) {
        this.f62947a = charSequence;
        this.f62948b = charSequence2;
        this.f62949c = list;
        this.f62950d = c31126y0;
    }
}
