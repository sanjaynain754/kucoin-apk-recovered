package com.sumsub.sns.internal.p126ml.core;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.core.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33331j extends AbstractC33335n {

    /* JADX INFO: renamed from: a */
    public final Throwable f67966a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33331j) && Intrinsics.areEqual(this.f67966a, ((C33331j) obj).f67966a);
    }

    public final int hashCode() {
        return this.f67966a.hashCode();
    }

    public final String toString() {
        return "Error(throwable=" + this.f67966a + ")";
    }

    public C33331j(Throwable th2) {
        this.f67966a = th2;
    }
}
