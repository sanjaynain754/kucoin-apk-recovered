package com.sumsub.sns.internal.features.domain.mrtd;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30229B implements InterfaceC30231D {

    /* JADX INFO: renamed from: a */
    public final Throwable f60762a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30229B) && Intrinsics.areEqual(this.f60762a, ((C30229B) obj).f60762a);
    }

    @Override // com.sumsub.sns.internal.features.domain.mrtd.InterfaceC30231D
    public final Throwable getThrowable() {
        return this.f60762a;
    }

    public final int hashCode() {
        Throwable th2 = this.f60762a;
        if (th2 == null) {
            return 0;
        }
        return th2.hashCode();
    }

    public final String toString() {
        return "NfcMisconfigured(throwable=" + this.f60762a + ")";
    }

    public C30229B(Throwable th2) {
        this.f60762a = th2;
    }
}
