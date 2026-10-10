package com.sumsub.sns.internal.features.data.model.common;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.K2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29022K2 {

    /* JADX INFO: renamed from: a */
    public final C29018J2 f58965a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29022K2) && Intrinsics.areEqual(this.f58965a, ((C29022K2) obj).f58965a);
    }

    public final int hashCode() {
        C29018J2 c29018j2 = this.f58965a;
        if (c29018j2 == null) {
            return 0;
        }
        return c29018j2.hashCode();
    }

    public final String toString() {
        return "PaymentSourceLevelSettings(typeSettings=" + this.f58965a + ")";
    }

    public C29022K2(C29018J2 c29018j2) {
        this.f58965a = c29018j2;
    }
}
