package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31997F extends AbstractC32018M {

    /* JADX INFO: renamed from: a */
    public final CharSequence f65046a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31997F) && Intrinsics.areEqual(this.f65046a, ((C31997F) obj).f65046a);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f65046a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "LowConnection(hint=" + ((Object) this.f65046a) + ")";
    }

    public C31997F(CharSequence charSequence) {
        this.f65046a = charSequence;
    }
}
