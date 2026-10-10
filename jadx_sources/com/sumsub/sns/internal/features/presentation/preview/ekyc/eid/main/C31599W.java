package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.W */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31599W implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final CharSequence f64195a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f64196b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31599W)) {
            return false;
        }
        C31599W c31599w = (C31599W) obj;
        return Intrinsics.areEqual(this.f64195a, c31599w.f64195a) && Intrinsics.areEqual(this.f64196b, c31599w.f64196b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64195a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f64196b;
        return iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return "PinExplainEvent(text=" + ((Object) this.f64195a) + ", buttonText=" + ((Object) this.f64196b) + ")";
    }

    public C31599W(CharSequence charSequence, CharSequence charSequence2) {
        this.f64195a = charSequence;
        this.f64196b = charSequence2;
    }
}
