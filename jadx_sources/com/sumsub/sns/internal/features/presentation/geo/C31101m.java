package com.sumsub.sns.internal.features.presentation.geo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31101m implements InterfaceC31109q {

    /* JADX INFO: renamed from: a */
    public final Throwable f62885a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31101m) && Intrinsics.areEqual(this.f62885a, ((C31101m) obj).f62885a);
    }

    public final int hashCode() {
        return this.f62885a.hashCode();
    }

    public final String toString() {
        return "Fatal(exception=" + this.f62885a + ")";
    }

    public C31101m(Throwable th2) {
        this.f62885a = th2;
    }
}
