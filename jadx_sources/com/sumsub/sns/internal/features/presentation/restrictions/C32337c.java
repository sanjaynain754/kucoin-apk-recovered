package com.sumsub.sns.internal.features.presentation.restrictions;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.restrictions.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32337c implements InterfaceC32338d {

    /* JADX INFO: renamed from: a */
    public final Throwable f65894a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32337c) && Intrinsics.areEqual(this.f65894a, ((C32337c) obj).f65894a);
    }

    public final int hashCode() {
        return this.f65894a.hashCode();
    }

    public final String toString() {
        return "UpdateFailed(throwable=" + this.f65894a + ")";
    }

    public C32337c(Throwable th2) {
        this.f65894a = th2;
    }
}
