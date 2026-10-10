package com.sumsub.sns.internal.features.domain;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30068B {

    /* JADX INFO: renamed from: a */
    public final String f60406a;

    /* JADX INFO: renamed from: b */
    public final boolean f60407b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30068B)) {
            return false;
        }
        C30068B c30068b = (C30068B) obj;
        return Intrinsics.areEqual(this.f60406a, c30068b.f60406a) && this.f60407b == c30068b.f60407b;
    }

    public final int hashCode() {
        String str = this.f60406a;
        return Boolean.hashCode(this.f60407b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "PhoneNumber(phone=" + this.f60406a + ", isLocked=" + this.f60407b + ")";
    }

    public C30068B(String str, boolean z11) {
        this.f60406a = str;
        this.f60407b = z11;
    }
}
