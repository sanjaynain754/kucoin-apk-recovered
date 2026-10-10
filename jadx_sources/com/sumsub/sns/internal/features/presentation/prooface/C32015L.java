package com.sumsub.sns.internal.features.presentation.prooface;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32015L extends AbstractC32018M {

    /* JADX INFO: renamed from: a */
    public final boolean f65080a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f65081b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32015L)) {
            return false;
        }
        C32015L c32015l = (C32015L) obj;
        return this.f65080a == c32015l.f65080a && Intrinsics.areEqual(this.f65081b, c32015l.f65081b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f65080a) * 31;
        CharSequence charSequence = this.f65081b;
        return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "Started(calibrationEnabled=" + this.f65080a + ", hint=" + ((Object) this.f65081b) + ")";
    }

    public C32015L(CharSequence charSequence, boolean z11) {
        this.f65080a = z11;
        this.f65081b = charSequence;
    }
}
