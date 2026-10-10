package com.sumsub.sns.internal.features.domain.geo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30200k implements InterfaceC30204o {

    /* JADX INFO: renamed from: a */
    public final Throwable f60691a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30200k) && Intrinsics.areEqual(this.f60691a, ((C30200k) obj).f60691a);
    }

    public final int hashCode() {
        return this.f60691a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.f60691a + ")";
    }

    public C30200k(Exception exc) {
        this.f60691a = exc;
    }
}
