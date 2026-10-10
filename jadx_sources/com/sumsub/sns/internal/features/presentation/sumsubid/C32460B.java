package com.sumsub.sns.internal.features.presentation.sumsubid;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32460B extends AbstractC32484N {

    /* JADX INFO: renamed from: a */
    public final boolean f66179a = true;

    public C32460B() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32460B) && this.f66179a == ((C32460B) obj).f66179a;
    }

    public C32460B(int i11) {
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66179a);
    }

    public final String toString() {
        return "FinishAndStartVerification(shouldLogout=" + this.f66179a + ")";
    }
}
