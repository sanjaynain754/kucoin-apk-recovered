package com.sumsub.sns.internal.features.data.model.prooface;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.prooface.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29802E extends AbstractC29807J {

    /* JADX INFO: renamed from: a */
    public final Exception f59878a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29802E) && Intrinsics.areEqual(this.f59878a, ((C29802E) obj).f59878a);
    }

    public final int hashCode() {
        return this.f59878a.hashCode();
    }

    public final String toString() {
        return "InitializationError(exception=" + this.f59878a + ")";
    }

    public C29802E(Exception exc) {
        this.f59878a = exc;
    }
}
