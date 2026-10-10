package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32006I implements InterfaceC32009J {

    /* JADX INFO: renamed from: a */
    public final CharSequence f65064a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f65065b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32006I)) {
            return false;
        }
        C32006I c32006i = (C32006I) obj;
        return Intrinsics.areEqual(this.f65064a, c32006i.f65064a) && Intrinsics.areEqual(this.f65065b, c32006i.f65065b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f65064a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f65065b;
        return iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return "Tips(title=" + ((Object) this.f65064a) + ", text=" + ((Object) this.f65065b) + ")";
    }

    public C32006I(CharSequence charSequence, String str) {
        this.f65064a = charSequence;
        this.f65065b = str;
    }
}
