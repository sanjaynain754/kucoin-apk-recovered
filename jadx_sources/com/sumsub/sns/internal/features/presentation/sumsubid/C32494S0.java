package com.sumsub.sns.internal.features.presentation.sumsubid;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.S0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32494S0 extends AbstractC32498U0 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f66319a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66320b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f66321c;

    /* JADX INFO: renamed from: d */
    public final C32520f f66322d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32494S0)) {
            return false;
        }
        C32494S0 c32494s0 = (C32494S0) obj;
        return Intrinsics.areEqual(this.f66319a, c32494s0.f66319a) && Intrinsics.areEqual(this.f66320b, c32494s0.f66320b) && Intrinsics.areEqual(this.f66321c, c32494s0.f66321c) && Intrinsics.areEqual(this.f66322d, c32494s0.f66322d);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f66319a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f66320b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f66321c;
        return this.f66322d.hashCode() + ((iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f66319a;
        CharSequence charSequence2 = this.f66320b;
        CharSequence charSequence3 = this.f66321c;
        return "NoData(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", buttonText=" + ((Object) charSequence3) + ", confirmAction=" + this.f66322d + ")";
    }

    public C32494S0(String str, String str2, String str3, C32520f c32520f) {
        this.f66319a = str;
        this.f66320b = str2;
        this.f66321c = str3;
        this.f66322d = c32520f;
    }
}
