package com.sumsub.sns.internal.features.presentation.verification2.phone;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32849a {

    /* JADX INFO: renamed from: a */
    public final String f67214a;

    /* JADX INFO: renamed from: b */
    public final boolean f67215b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32849a)) {
            return false;
        }
        C32849a c32849a = (C32849a) obj;
        return Intrinsics.areEqual(this.f67214a, c32849a.f67214a) && this.f67215b == c32849a.f67215b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67215b) + (this.f67214a.hashCode() * 31);
    }

    public final String toString() {
        return "PhoneInput(phone=" + this.f67214a + ", isValid=" + this.f67215b + ")";
    }

    public C32849a(String str, boolean z11) {
        this.f67214a = str;
        this.f67215b = z11;
    }
}
