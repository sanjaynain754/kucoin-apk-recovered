package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31855b {

    /* JADX INFO: renamed from: a */
    public final String f64738a;

    /* JADX INFO: renamed from: b */
    public final String f64739b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31855b)) {
            return false;
        }
        C31855b c31855b = (C31855b) obj;
        return Intrinsics.areEqual(this.f64738a, c31855b.f64738a) && Intrinsics.areEqual(this.f64739b, c31855b.f64739b);
    }

    public final int hashCode() {
        return this.f64739b.hashCode() + (this.f64738a.hashCode() * 31);
    }

    public final String toString() {
        return "Config(idDocType=" + this.f64738a + ", country=" + this.f64739b + ")";
    }

    public C31855b(String str, String str2) {
        this.f64738a = str;
        this.f64739b = str2;
    }
}
