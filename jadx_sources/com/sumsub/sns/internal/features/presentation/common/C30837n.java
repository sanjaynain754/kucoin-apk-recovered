package com.sumsub.sns.internal.features.presentation.common;

import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import com.sumsub.sns.internal.features.data.model.common.C29015J;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30837n implements InterfaceC28077Q {

    /* JADX INFO: renamed from: a */
    public final C29054T f62280a;

    /* JADX INFO: renamed from: b */
    public final C29015J f62281b;

    /* JADX INFO: renamed from: c */
    public final int f62282c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30837n)) {
            return false;
        }
        C30837n c30837n = (C30837n) obj;
        return Intrinsics.areEqual(this.f62280a, c30837n.f62280a) && Intrinsics.areEqual(this.f62281b, c30837n.f62281b) && this.f62282c == c30837n.f62282c;
    }

    public final int hashCode() {
        C29054T c29054t = this.f62280a;
        int iHashCode = (c29054t == null ? 0 : c29054t.hashCode()) * 31;
        C29015J c29015j = this.f62281b;
        return Integer.hashCode(this.f62282c) + ((iHashCode + (c29015j != null ? c29015j.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OnImagePicked(result=" + this.f62280a + ", compositeResult=" + this.f62281b + ", resultCode=" + this.f62282c + ")";
    }

    public C30837n(C29054T c29054t, C29015J c29015j, int i11) {
        this.f62280a = c29054t;
        this.f62281b = c29015j;
        this.f62282c = i11;
    }
}
