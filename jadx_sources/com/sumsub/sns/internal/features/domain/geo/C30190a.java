package com.sumsub.sns.internal.features.domain.geo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30190a implements InterfaceC30194e {

    /* JADX INFO: renamed from: a */
    public final Throwable f60680a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30190a) && Intrinsics.areEqual(this.f60680a, ((C30190a) obj).f60680a);
    }

    public final int hashCode() {
        return this.f60680a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.f60680a + ")";
    }

    public C30190a(Throwable th2) {
        this.f60680a = th2;
    }
}
