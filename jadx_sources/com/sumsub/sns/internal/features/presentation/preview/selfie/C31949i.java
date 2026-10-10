package com.sumsub.sns.internal.features.presentation.preview.selfie;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.selfie.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31949i {

    /* JADX INFO: renamed from: a */
    public final String f64962a;

    /* JADX INFO: renamed from: b */
    public final String f64963b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31949i)) {
            return false;
        }
        C31949i c31949i = (C31949i) obj;
        return Intrinsics.areEqual(this.f64962a, c31949i.f64962a) && Intrinsics.areEqual(this.f64963b, c31949i.f64963b);
    }

    public final int hashCode() {
        int iHashCode = this.f64962a.hashCode() * 31;
        String str = this.f64963b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "VideoParams(idDocSetType=" + this.f64962a + ", type=" + this.f64963b + ")";
    }

    public C31949i(String str, String str2) {
        this.f64962a = str;
        this.f64963b = str2;
    }
}
