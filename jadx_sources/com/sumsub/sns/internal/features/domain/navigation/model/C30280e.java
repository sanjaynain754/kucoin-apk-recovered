package com.sumsub.sns.internal.features.domain.navigation.model;

import com.sumsub.sns.internal.features.data.model.common.C29070X;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.navigation.model.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30280e implements InterfaceC30290o {

    /* JADX INFO: renamed from: a */
    public final String f60877a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30280e) && Intrinsics.areEqual(this.f60877a, ((C30280e) obj).f60877a);
    }

    @Override // com.sumsub.sns.internal.features.domain.navigation.model.InterfaceC30290o
    /* JADX INFO: renamed from: a */
    public final C29070X mo70172a() {
        return new C29070X(getType());
    }

    @Override // com.sumsub.sns.internal.features.domain.navigation.model.InterfaceC30290o
    public final String getType() {
        return this.f60877a;
    }

    public final int hashCode() {
        return this.f60877a.hashCode();
    }

    public final String toString() {
        return "ApplicantData(type=" + this.f60877a + ")";
    }

    public C30280e(String str) {
        this.f60877a = str;
    }
}
