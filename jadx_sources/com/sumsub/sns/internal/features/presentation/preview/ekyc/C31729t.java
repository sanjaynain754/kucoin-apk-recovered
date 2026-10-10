package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31729t {

    /* JADX INFO: renamed from: a */
    public final String f64441a;

    /* JADX INFO: renamed from: b */
    public final String f64442b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31729t)) {
            return false;
        }
        C31729t c31729t = (C31729t) obj;
        return Intrinsics.areEqual(this.f64441a, c31729t.f64441a) && Intrinsics.areEqual(this.f64442b, c31729t.f64442b);
    }

    public final int hashCode() {
        return this.f64442b.hashCode() + (this.f64441a.hashCode() * 31);
    }

    public final String toString() {
        return "PredefinedParams(countryKey=" + this.f64441a + ", sourceId=" + this.f64442b + ")";
    }

    public C31729t(String str, String str2) {
        this.f64441a = str;
        this.f64442b = str2;
    }
}
