package com.sumsub.sns.internal.features.data.model.prooface;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.prooface.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29803F extends AbstractC29807J {

    /* JADX INFO: renamed from: a */
    public final Exception f59879a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29803F) && Intrinsics.areEqual(this.f59879a, ((C29803F) obj).f59879a);
    }

    public final int hashCode() {
        return this.f59879a.hashCode();
    }

    public final String toString() {
        return "NetworkError(exception=" + this.f59879a + ")";
    }

    public C29803F(Exception exc) {
        this.f59879a = exc;
    }
}
