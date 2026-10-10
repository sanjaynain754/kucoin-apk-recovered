package com.sumsub.sns.internal.features.domain.navigation.model;

import com.sumsub.sns.internal.features.data.model.common.C29070X;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.navigation.model.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30288m implements InterfaceC30290o {

    /* JADX INFO: renamed from: a */
    public final String f60887a;

    /* JADX INFO: renamed from: b */
    public final String f60888b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30288m)) {
            return false;
        }
        C30288m c30288m = (C30288m) obj;
        return Intrinsics.areEqual(this.f60887a, c30288m.f60887a) && Intrinsics.areEqual(this.f60888b, c30288m.f60888b);
    }

    @Override // com.sumsub.sns.internal.features.domain.navigation.model.InterfaceC30290o
    /* JADX INFO: renamed from: a */
    public final C29070X mo70172a() {
        return new C29070X(getType());
    }

    @Override // com.sumsub.sns.internal.features.domain.navigation.model.InterfaceC30290o
    public final String getType() {
        return this.f60887a;
    }

    public final int hashCode() {
        int iHashCode = this.f60887a.hashCode() * 31;
        String str = this.f60888b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Selfie(type=" + this.f60887a + ", videoRequired=" + this.f60888b + ")";
    }

    public C30288m(String str, String str2) {
        this.f60887a = str;
        this.f60888b = str2;
    }
}
