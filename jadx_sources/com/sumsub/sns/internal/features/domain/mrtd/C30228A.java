package com.sumsub.sns.internal.features.domain.mrtd;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30228A implements InterfaceC30231D {

    /* JADX INFO: renamed from: a */
    public final Throwable f60761a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30228A) && Intrinsics.areEqual(this.f60761a, ((C30228A) obj).f60761a);
    }

    @Override // com.sumsub.sns.internal.features.domain.mrtd.InterfaceC30231D
    public final Throwable getThrowable() {
        return this.f60761a;
    }

    public final int hashCode() {
        Throwable th2 = this.f60761a;
        if (th2 == null) {
            return 0;
        }
        return th2.hashCode();
    }

    public final String toString() {
        return "ModuleNotFound(throwable=" + this.f60761a + ")";
    }

    public C30228A(Throwable th2) {
        this.f60761a = th2;
    }
}
