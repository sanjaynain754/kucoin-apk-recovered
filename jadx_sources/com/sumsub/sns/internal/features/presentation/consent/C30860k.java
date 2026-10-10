package com.sumsub.sns.internal.features.presentation.consent;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.consent.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30860k extends AbstractC30861l {

    /* JADX INFO: renamed from: a */
    public final String f62324a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30860k) && Intrinsics.areEqual(this.f62324a, ((C30860k) obj).f62324a);
    }

    public final int hashCode() {
        return this.f62324a.hashCode();
    }

    public final String toString() {
        return "OnTermsLinksClicked(type=" + this.f62324a + ")";
    }

    public C30860k(String str) {
        this.f62324a = str;
    }
}
