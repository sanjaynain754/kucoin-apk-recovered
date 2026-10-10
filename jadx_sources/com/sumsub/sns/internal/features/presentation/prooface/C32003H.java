package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32003H implements InterfaceC32009J {

    /* JADX INFO: renamed from: a */
    public final CharSequence f65057a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f65058b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32003H)) {
            return false;
        }
        C32003H c32003h = (C32003H) obj;
        return Intrinsics.areEqual(this.f65057a, c32003h.f65057a) && Intrinsics.areEqual(this.f65058b, c32003h.f65058b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f65057a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f65058b;
        return iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return "Text(title=" + ((Object) this.f65057a) + ", text=" + ((Object) this.f65058b) + ")";
    }

    public C32003H(String str, String str2) {
        this.f65057a = str;
        this.f65058b = str2;
    }
}
