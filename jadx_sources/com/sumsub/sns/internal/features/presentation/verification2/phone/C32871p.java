package com.sumsub.sns.internal.features.presentation.verification2.phone;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32871p implements InterfaceC32872q {

    /* JADX INFO: renamed from: a */
    public final CharSequence f67252a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32871p) && Intrinsics.areEqual(this.f67252a, ((C32871p) obj).f67252a);
    }

    public final int hashCode() {
        return this.f67252a.hashCode();
    }

    public final String toString() {
        return "Informational(message=" + ((Object) this.f67252a) + ")";
    }

    public C32871p(CharSequence charSequence) {
        this.f67252a = charSequence;
    }
}
