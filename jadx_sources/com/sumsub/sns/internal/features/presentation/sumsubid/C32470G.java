package com.sumsub.sns.internal.features.presentation.sumsubid;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32470G extends AbstractC32484N {

    /* JADX INFO: renamed from: a */
    public final String f66208a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32470G) && Intrinsics.areEqual(this.f66208a, ((C32470G) obj).f66208a);
    }

    public final int hashCode() {
        return this.f66208a.hashCode();
    }

    public final String toString() {
        return "OnEmailChanged(email=" + this.f66208a + ")";
    }

    public C32470G(String str) {
        this.f66208a = str;
    }
}
