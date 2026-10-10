package com.sumsub.sns.internal.features.presentation.verification;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32739u {

    /* JADX INFO: renamed from: a */
    public final String f66990a;

    /* JADX INFO: renamed from: b */
    public final boolean f66991b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32739u)) {
            return false;
        }
        C32739u c32739u = (C32739u) obj;
        return Intrinsics.areEqual(this.f66990a, c32739u.f66990a) && this.f66991b == c32739u.f66991b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66991b) + (this.f66990a.hashCode() * 31);
    }

    public final String toString() {
        return "PhoneInput(phone=" + this.f66990a + ", isValid=" + this.f66991b + ")";
    }

    public C32739u(String str, boolean z11) {
        this.f66990a = str;
        this.f66991b = z11;
    }
}
