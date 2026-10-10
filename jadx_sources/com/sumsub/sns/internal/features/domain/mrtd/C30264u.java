package com.sumsub.sns.internal.features.domain.mrtd;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30264u implements InterfaceC30263t {

    /* JADX INFO: renamed from: a */
    public final Throwable f60847a;

    /* JADX INFO: renamed from: b */
    public final String f60848b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30264u) && Intrinsics.areEqual(this.f60847a, ((C30264u) obj).f60847a);
    }

    @Override // com.sumsub.sns.internal.features.domain.mrtd.InterfaceC30263t
    /* JADX INFO: renamed from: a */
    public final String mo70169a() {
        return this.f60848b;
    }

    public final int hashCode() {
        Throwable th2 = this.f60847a;
        if (th2 == null) {
            return 0;
        }
        return th2.hashCode();
    }

    public final String toString() {
        return "MRTDReadFailed(t=" + this.f60847a + ")";
    }

    public C30264u(Exception exc) {
        String message;
        this.f60847a = exc;
        this.f60848b = (exc == null || (message = exc.getMessage()) == null) ? "Unknown error" : message;
    }
}
