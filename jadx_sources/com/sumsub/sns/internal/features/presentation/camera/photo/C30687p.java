package com.sumsub.sns.internal.features.presentation.camera.photo;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29180q2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30687p implements InterfaceC30399D {

    /* JADX INFO: renamed from: a */
    public final String f62011a;

    /* JADX INFO: renamed from: b */
    public final AbstractC29180q2 f62012b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30687p)) {
            return false;
        }
        C30687p c30687p = (C30687p) obj;
        return Intrinsics.areEqual(this.f62011a, c30687p.f62011a) && Intrinsics.areEqual(this.f62012b, c30687p.f62012b);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.photo.InterfaceC30399D
    /* JADX INFO: renamed from: a */
    public final String mo70271a() {
        return this.f62011a;
    }

    public final int hashCode() {
        return this.f62012b.hashCode() + (this.f62011a.hashCode() * 31);
    }

    public final String toString() {
        return "DocumentOptionIdentifier(countryCode=" + this.f62011a + ", identityType=" + this.f62012b + ")";
    }

    public C30687p(String str, AbstractC29180q2 abstractC29180q2) {
        this.f62011a = str;
        this.f62012b = abstractC29180q2;
    }
}
