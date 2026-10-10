package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32284y extends AbstractC31985B {

    /* JADX INFO: renamed from: a */
    public final CharSequence f65758a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32284y) && Intrinsics.areEqual(this.f65758a, ((C32284y) obj).f65758a);
    }

    @Override // com.sumsub.sns.internal.features.presentation.prooface.AbstractC31985B
    /* JADX INFO: renamed from: a */
    public final CharSequence mo70973a() {
        return this.f65758a;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f65758a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "NoFace(hint=" + ((Object) this.f65758a) + ")";
    }

    public C32284y(String str) {
        this.f65758a = str;
    }
}
