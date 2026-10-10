package com.sumsub.sns.internal.features.presentation.status;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32444q implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final CharSequence f66133a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66134b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32444q)) {
            return false;
        }
        C32444q c32444q = (C32444q) obj;
        return Intrinsics.areEqual(this.f66133a, c32444q.f66133a) && Intrinsics.areEqual(this.f66134b, c32444q.f66134b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f66133a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f66134b;
        return iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return "ShowAgreementBottomSheetEvent(agreementText=" + ((Object) this.f66133a) + ", buttonText=" + ((Object) this.f66134b) + ")";
    }

    public C32444q(CharSequence charSequence, String str) {
        this.f66133a = charSequence;
        this.f66134b = str;
    }
}
