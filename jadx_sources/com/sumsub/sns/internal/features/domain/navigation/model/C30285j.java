package com.sumsub.sns.internal.features.domain.navigation.model;

import com.sumsub.sns.internal.features.data.model.common.C29070X;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.navigation.model.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30285j implements InterfaceC30290o {

    /* JADX INFO: renamed from: a */
    public final String f60882a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30285j) && Intrinsics.areEqual(this.f60882a, ((C30285j) obj).f60882a);
    }

    @Override // com.sumsub.sns.internal.features.domain.navigation.model.InterfaceC30290o
    /* JADX INFO: renamed from: a */
    public final C29070X mo70172a() {
        return new C29070X(getType());
    }

    @Override // com.sumsub.sns.internal.features.domain.navigation.model.InterfaceC30290o
    public final String getType() {
        return this.f60882a;
    }

    public final int hashCode() {
        return this.f60882a.hashCode();
    }

    public final String toString() {
        return "PhoneVerification(type=" + this.f60882a + ")";
    }

    public C30285j(String str) {
        this.f60882a = str;
    }
}
