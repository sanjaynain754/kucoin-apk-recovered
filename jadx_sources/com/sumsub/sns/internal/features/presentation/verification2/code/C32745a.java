package com.sumsub.sns.internal.features.presentation.verification2.code;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.code.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32745a implements InterfaceC32749e {

    /* JADX INFO: renamed from: a */
    public final Throwable f67004a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32745a) && Intrinsics.areEqual(this.f67004a, ((C32745a) obj).f67004a);
    }

    public final int hashCode() {
        return this.f67004a.hashCode();
    }

    public final String toString() {
        return "Failed(error=" + this.f67004a + ")";
    }

    public C32745a(Throwable th2) {
        this.f67004a = th2;
    }
}
