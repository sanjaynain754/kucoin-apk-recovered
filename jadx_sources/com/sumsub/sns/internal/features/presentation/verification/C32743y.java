package com.sumsub.sns.internal.features.presentation.verification;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32743y {

    /* JADX INFO: renamed from: a */
    public final String f67001a;

    /* JADX INFO: renamed from: b */
    public final SNSVerificationStepViewModel$ViewState$ButtonSpec$Action f67002b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32743y)) {
            return false;
        }
        C32743y c32743y = (C32743y) obj;
        return Intrinsics.areEqual(this.f67001a, c32743y.f67001a) && this.f67002b == c32743y.f67002b;
    }

    public final int hashCode() {
        int iHashCode = this.f67001a.hashCode() * 31;
        SNSVerificationStepViewModel$ViewState$ButtonSpec$Action sNSVerificationStepViewModel$ViewState$ButtonSpec$Action = this.f67002b;
        return iHashCode + (sNSVerificationStepViewModel$ViewState$ButtonSpec$Action == null ? 0 : sNSVerificationStepViewModel$ViewState$ButtonSpec$Action.hashCode());
    }

    public final String toString() {
        String str = this.f67001a;
        return "ButtonSpec(text=" + ((Object) str) + ", action=" + this.f67002b + ")";
    }

    public C32743y(String str, SNSVerificationStepViewModel$ViewState$ButtonSpec$Action sNSVerificationStepViewModel$ViewState$ButtonSpec$Action) {
        this.f67001a = str;
        this.f67002b = sNSVerificationStepViewModel$ViewState$ButtonSpec$Action;
    }
}
