package com.sumsub.sns.internal.features.domain.mrtd;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30230C implements InterfaceC30231D {

    /* JADX INFO: renamed from: a */
    public final Throwable f60763a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30230C) && Intrinsics.areEqual(this.f60763a, ((C30230C) obj).f60763a);
    }

    @Override // com.sumsub.sns.internal.features.domain.mrtd.InterfaceC30231D
    public final Throwable getThrowable() {
        return this.f60763a;
    }

    public final int hashCode() {
        Throwable th2 = this.f60763a;
        if (th2 == null) {
            return 0;
        }
        return th2.hashCode();
    }

    public final String toString() {
        return "Unknown(throwable=" + this.f60763a + ")";
    }

    public C30230C(Throwable th2) {
        this.f60763a = th2;
    }
}
