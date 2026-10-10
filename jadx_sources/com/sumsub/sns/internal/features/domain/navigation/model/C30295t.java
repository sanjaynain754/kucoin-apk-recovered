package com.sumsub.sns.internal.features.domain.navigation.model;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.navigation.model.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30295t implements InterfaceC30301z {

    /* JADX INFO: renamed from: a */
    public final String f60894a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30295t) && Intrinsics.areEqual(this.f60894a, ((C30295t) obj).f60894a);
    }

    public final int hashCode() {
        return this.f60894a.hashCode();
    }

    public final String toString() {
        return "Unknown(stepType=" + this.f60894a + ")";
    }

    public C30295t(String str) {
        this.f60894a = str;
    }
}
