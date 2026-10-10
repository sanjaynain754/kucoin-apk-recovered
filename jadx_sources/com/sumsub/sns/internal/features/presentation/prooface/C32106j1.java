package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.j1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32106j1 implements InterfaceC32110k1 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f65338a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f65339b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32106j1)) {
            return false;
        }
        C32106j1 c32106j1 = (C32106j1) obj;
        return Intrinsics.areEqual(this.f65338a, c32106j1.f65338a) && Intrinsics.areEqual(this.f65339b, c32106j1.f65339b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f65338a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f65339b;
        return iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return "Tips(title=" + ((Object) this.f65338a) + ", text=" + ((Object) this.f65339b) + ")";
    }

    public C32106j1(CharSequence charSequence, String str) {
        this.f65338a = charSequence;
        this.f65339b = str;
    }
}
