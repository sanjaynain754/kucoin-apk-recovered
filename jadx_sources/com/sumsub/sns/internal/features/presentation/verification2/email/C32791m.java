package com.sumsub.sns.internal.features.presentation.verification2.email;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.email.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32791m implements InterfaceC32792n {

    /* JADX INFO: renamed from: a */
    public final CharSequence f67097a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32791m) && Intrinsics.areEqual(this.f67097a, ((C32791m) obj).f67097a);
    }

    @Override // com.sumsub.sns.internal.features.presentation.verification2.email.InterfaceC32792n
    /* JADX INFO: renamed from: a */
    public final CharSequence mo71345a() {
        return this.f67097a;
    }

    public final int hashCode() {
        return this.f67097a.hashCode();
    }

    public final String toString() {
        return "Informational(message=" + ((Object) this.f67097a) + ")";
    }

    public C32791m(CharSequence charSequence) {
        this.f67097a = charSequence;
    }
}
