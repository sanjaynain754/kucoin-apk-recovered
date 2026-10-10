package com.sumsub.sns.internal.features.presentation.sumsubid;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32480L extends AbstractC32484N {

    /* JADX INFO: renamed from: a */
    public final String f66239a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32480L) && Intrinsics.areEqual(this.f66239a, ((C32480L) obj).f66239a);
    }

    public final int hashCode() {
        return this.f66239a.hashCode();
    }

    public final String toString() {
        return "OpenUrl(url=" + this.f66239a + ")";
    }

    public C32480L(String str) {
        this.f66239a = str;
    }
}
