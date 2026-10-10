package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.U */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31597U implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final CharSequence f64191a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f64192b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f64193c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31597U)) {
            return false;
        }
        C31597U c31597u = (C31597U) obj;
        return Intrinsics.areEqual(this.f64191a, c31597u.f64191a) && Intrinsics.areEqual(this.f64192b, c31597u.f64192b) && Intrinsics.areEqual(this.f64193c, c31597u.f64193c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f64191a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f64192b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f64193c;
        return iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public final String toString() {
        return "LegalInfoExplainEvent(title=" + ((Object) this.f64191a) + ", text=" + ((Object) this.f64192b) + ", buttonText=" + ((Object) this.f64193c) + ")";
    }

    public C31597U(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.f64191a = charSequence;
        this.f64192b = charSequence2;
        this.f64193c = charSequence3;
    }
}
