package com.sumsub.sns.internal.fingerprint.infoproviders;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.infoproviders.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33220i {

    /* JADX INFO: renamed from: a */
    public final String f67767a;

    /* JADX INFO: renamed from: b */
    public final String f67768b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33220i)) {
            return false;
        }
        C33220i c33220i = (C33220i) obj;
        return Intrinsics.areEqual(this.f67767a, c33220i.f67767a) && Intrinsics.areEqual(this.f67768b, c33220i.f67768b);
    }

    public final int hashCode() {
        return this.f67768b.hashCode() + (this.f67767a.hashCode() * 31);
    }

    public final String toString() {
        return "InputDeviceData(name=" + this.f67767a + ", vendor=" + this.f67768b + ")";
    }

    public C33220i(String str, String str2) {
        this.f67767a = str;
        this.f67768b = str2;
    }
}
