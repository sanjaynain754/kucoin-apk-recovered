package com.sumsub.sns.internal.features.presentation.prooface.session;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.z0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32255z0 implements InterfaceC32148C0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f65711a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32255z0) && Intrinsics.areEqual(this.f65711a, ((C32255z0) obj).f65711a);
    }

    public final int hashCode() {
        return this.f65711a.hashCode();
    }

    public final String toString() {
        return "Error(exception=" + this.f65711a + ")";
    }

    public C32255z0(Throwable th2) {
        this.f65711a = th2;
    }
}
