package com.sumsub.sns.core.presentation.base;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28141p implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final String f57377a;

    /* JADX INFO: renamed from: b */
    public final boolean f57378b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28141p)) {
            return false;
        }
        C28141p c28141p = (C28141p) obj;
        return Intrinsics.areEqual(this.f57377a, c28141p.f57377a) && this.f57378b == c28141p.f57378b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57378b) + (this.f57377a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenUrlEvent(uri=" + this.f57377a + ", callExternalUrlHandler=" + this.f57378b + ")";
    }

    public C28141p(String str, boolean z11) {
        this.f57377a = str;
        this.f57378b = z11;
    }
}
