package com.sumsub.sns.internal.features.domain.navigation.model;

import com.sumsub.sns.internal.features.data.model.common.C29070X;
import java.util.Locale;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.navigation.model.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30286k implements InterfaceC30290o {

    /* JADX INFO: renamed from: a */
    public final String f60883a;

    /* JADX INFO: renamed from: b */
    public final String f60884b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30286k)) {
            return false;
        }
        C30286k c30286k = (C30286k) obj;
        return Intrinsics.areEqual(this.f60883a, c30286k.f60883a) && Intrinsics.areEqual(this.f60884b, c30286k.f60884b);
    }

    @Override // com.sumsub.sns.internal.features.domain.navigation.model.InterfaceC30290o
    /* JADX INFO: renamed from: a */
    public final C29070X mo70172a() {
        return new C29070X(getType());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m70173b() {
        String str = this.f60884b;
        return Intrinsics.areEqual(str != null ? str.toLowerCase(Locale.ROOT) : null, "manualandauto");
    }

    @Override // com.sumsub.sns.internal.features.domain.navigation.model.InterfaceC30290o
    public final String getType() {
        return this.f60883a;
    }

    public final int hashCode() {
        int iHashCode = this.f60883a.hashCode() * 31;
        String str = this.f60884b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ProofOfResidence(type=" + this.f60883a + ", captureMode=" + this.f60884b + ")";
    }

    public C30286k(String str, String str2) {
        this.f60883a = str;
        this.f60884b = str2;
    }
}
