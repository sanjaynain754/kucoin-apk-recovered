package com.sumsub.sns.internal.features.presentation.verification2.email;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.email.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32793o {

    /* JADX INFO: renamed from: a */
    public final CharSequence f67098a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f67099b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f67100c;

    /* JADX INFO: renamed from: d */
    public final boolean f67101d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32793o)) {
            return false;
        }
        C32793o c32793o = (C32793o) obj;
        return Intrinsics.areEqual(this.f67098a, c32793o.f67098a) && Intrinsics.areEqual(this.f67099b, c32793o.f67099b) && Intrinsics.areEqual(this.f67100c, c32793o.f67100c) && this.f67101d == c32793o.f67101d;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f67098a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f67099b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f67100c;
        return Boolean.hashCode(this.f67101d) + ((iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f67098a;
        CharSequence charSequence2 = this.f67099b;
        CharSequence charSequence3 = this.f67100c;
        return "InputState(initialValue=" + ((Object) charSequence) + ", hint=" + ((Object) charSequence2) + ", error=" + ((Object) charSequence3) + ", inputDisabled=" + this.f67101d + ")";
    }

    public C32793o(String str, String str2, CharSequence charSequence, boolean z11) {
        this.f67098a = str;
        this.f67099b = str2;
        this.f67100c = charSequence;
        this.f67101d = z11;
    }
}
