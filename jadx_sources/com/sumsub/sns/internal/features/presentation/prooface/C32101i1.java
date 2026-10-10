package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.i1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32101i1 implements InterfaceC32110k1 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f65331a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f65332b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32101i1)) {
            return false;
        }
        C32101i1 c32101i1 = (C32101i1) obj;
        return Intrinsics.areEqual(this.f65331a, c32101i1.f65331a) && Intrinsics.areEqual(this.f65332b, c32101i1.f65332b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f65331a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f65332b;
        return iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return "Text(title=" + ((Object) this.f65331a) + ", text=" + ((Object) this.f65332b) + ")";
    }

    public C32101i1(String str, String str2) {
        this.f65331a = str;
        this.f65332b = str2;
    }
}
