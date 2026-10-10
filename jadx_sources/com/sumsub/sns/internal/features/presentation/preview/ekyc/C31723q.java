package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31723q implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final CharSequence f64434a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f64435b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31723q)) {
            return false;
        }
        C31723q c31723q = (C31723q) obj;
        return Intrinsics.areEqual(this.f64434a, c31723q.f64434a) && Intrinsics.areEqual(this.f64435b, c31723q.f64435b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64434a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f64435b;
        return iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return "ErrorEvent(errorText=" + ((Object) this.f64434a) + ", buttonText=" + ((Object) this.f64435b) + ")";
    }

    public C31723q(CharSequence charSequence, CharSequence charSequence2) {
        this.f64434a = charSequence;
        this.f64435b = charSequence2;
    }
}
