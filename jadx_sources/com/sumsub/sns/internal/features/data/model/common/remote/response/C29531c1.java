package com.sumsub.sns.internal.features.data.model.common.remote.response;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.c1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29531c1 {

    @NotNull
    public static final C29526b1 Companion = new C29526b1();

    /* JADX INFO: renamed from: a */
    public final Boolean f59548a;

    /* JADX INFO: renamed from: b */
    public final Boolean f59549b;

    /* JADX INFO: renamed from: c */
    public final Boolean f59550c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29531c1)) {
            return false;
        }
        C29531c1 c29531c1 = (C29531c1) obj;
        return Intrinsics.areEqual(this.f59548a, c29531c1.f59548a) && Intrinsics.areEqual(this.f59549b, c29531c1.f59549b) && Intrinsics.areEqual(this.f59550c, c29531c1.f59550c);
    }

    public final int hashCode() {
        Boolean bool = this.f59548a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f59549b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f59550c;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "BankAccount(allowed=" + this.f59548a + ", allowExternalSourcesCheck=" + this.f59549b + ", allowBankStatementUpload=" + this.f59550c + ")";
    }

    public /* synthetic */ C29531c1(int i11, Boolean bool, Boolean bool2, Boolean bool3) {
        if ((i11 & 1) == 0) {
            this.f59548a = null;
        } else {
            this.f59548a = bool;
        }
        if ((i11 & 2) == 0) {
            this.f59549b = null;
        } else {
            this.f59549b = bool2;
        }
        if ((i11 & 4) == 0) {
            this.f59550c = null;
        } else {
            this.f59550c = bool3;
        }
    }
}
