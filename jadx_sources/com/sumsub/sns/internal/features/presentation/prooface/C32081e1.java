package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.e1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32081e1 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f65290a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32081e1) && Intrinsics.areEqual(this.f65290a, ((C32081e1) obj).f65290a);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f65290a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "TryAgainButtonState(text=" + ((Object) this.f65290a) + ")";
    }

    public C32081e1(String str) {
        this.f65290a = str;
    }
}
