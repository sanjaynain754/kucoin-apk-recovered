package com.sumsub.sns.internal.features.presentation.esign;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30998o extends AbstractC31000p {

    /* JADX INFO: renamed from: b */
    public final C30996n f62660b;

    public C30998o() {
        super(0);
        this.f62660b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30998o) && Intrinsics.areEqual(this.f62660b, ((C30998o) obj).f62660b);
    }

    public final int hashCode() {
        C30996n c30996n = this.f62660b;
        if (c30996n == null) {
            return 0;
        }
        return c30996n.hashCode();
    }

    public final String toString() {
        return "DocumentsView(bottomSheet=" + this.f62660b + ")";
    }

    public C30998o(C30996n c30996n) {
        super(0);
        this.f62660b = c30996n;
    }
}
