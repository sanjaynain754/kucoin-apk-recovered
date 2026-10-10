package com.sumsub.sns.internal.features.presentation.status;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32414b {

    /* JADX INFO: renamed from: a */
    public final CharSequence f66080a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66081b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f66082c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32414b)) {
            return false;
        }
        C32414b c32414b = (C32414b) obj;
        return Intrinsics.areEqual(this.f66080a, c32414b.f66080a) && Intrinsics.areEqual(this.f66081b, c32414b.f66081b) && Intrinsics.areEqual(this.f66082c, c32414b.f66082c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f66080a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f66081b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f66082c;
        return iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public final String toString() {
        return "ExitConfirmationDialog(message=" + ((Object) this.f66080a) + ", buttonPositive=" + ((Object) this.f66081b) + ", buttonNegative=" + ((Object) this.f66082c) + ")";
    }

    public C32414b(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.f66080a = charSequence;
        this.f66081b = charSequence2;
        this.f66082c = charSequence3;
    }
}
