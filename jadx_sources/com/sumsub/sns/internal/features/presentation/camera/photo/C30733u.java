package com.sumsub.sns.internal.features.presentation.camera.photo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30733u implements InterfaceC30399D {

    /* JADX INFO: renamed from: a */
    public final String f62082a;

    /* JADX INFO: renamed from: b */
    public final String f62083b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30733u)) {
            return false;
        }
        C30733u c30733u = (C30733u) obj;
        return Intrinsics.areEqual(this.f62082a, c30733u.f62082a) && Intrinsics.areEqual(this.f62083b, c30733u.f62083b);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.photo.InterfaceC30399D
    /* JADX INFO: renamed from: a */
    public final String mo70271a() {
        return this.f62082a;
    }

    public final int hashCode() {
        return this.f62083b.hashCode() + (this.f62082a.hashCode() * 31);
    }

    public final String toString() {
        return "EkycOptionIdentifier(countryCode=" + this.f62082a + ", sourceId=" + this.f62083b + ")";
    }

    public C30733u(String str, String str2) {
        this.f62082a = str;
        this.f62083b = str2;
    }
}
