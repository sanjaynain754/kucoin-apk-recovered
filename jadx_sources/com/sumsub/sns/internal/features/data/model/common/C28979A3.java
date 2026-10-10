package com.sumsub.sns.internal.features.data.model.common;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.A3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28979A3 {

    /* JADX INFO: renamed from: a */
    public final C29728z3 f58902a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28979A3) && Intrinsics.areEqual(this.f58902a, ((C28979A3) obj).f58902a);
    }

    public final int hashCode() {
        C29728z3 c29728z3 = this.f58902a;
        if (c29728z3 == null) {
            return 0;
        }
        return c29728z3.hashCode();
    }

    public final String toString() {
        return "VideoIdentConfig(backgroundAspectRatio=" + this.f58902a + ")";
    }

    public C28979A3(C29728z3 c29728z3) {
        this.f58902a = c29728z3;
    }
}
