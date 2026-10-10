package com.sumsub.sns.internal.features.domain.navigation.model;

import com.sumsub.sns.internal.features.data.model.common.C29070X;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.navigation.model.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30287l implements InterfaceC30290o {

    /* JADX INFO: renamed from: a */
    public final String f60885a;

    /* JADX INFO: renamed from: b */
    public final String f60886b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30287l)) {
            return false;
        }
        C30287l c30287l = (C30287l) obj;
        return Intrinsics.areEqual(this.f60885a, c30287l.f60885a) && Intrinsics.areEqual(this.f60886b, c30287l.f60886b);
    }

    @Override // com.sumsub.sns.internal.features.domain.navigation.model.InterfaceC30290o
    /* JADX INFO: renamed from: a */
    public final C29070X mo70172a() {
        return new C29070X(getType());
    }

    @Override // com.sumsub.sns.internal.features.domain.navigation.model.InterfaceC30290o
    public final String getType() {
        return this.f60885a;
    }

    public final int hashCode() {
        int iHashCode = this.f60885a.hashCode() * 31;
        String str = this.f60886b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Questionnaire(type=" + this.f60885a + ", questionnaireDefId=" + this.f60886b + ")";
    }

    public C30287l(String str, String str2) {
        this.f60885a = str;
        this.f60886b = str2;
    }
}
