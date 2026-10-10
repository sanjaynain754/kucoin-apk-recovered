package com.sumsub.sns.internal.features.data.model.common;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.Y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29074Y extends AbstractC29083a0 {

    /* JADX INFO: renamed from: a */
    public final Object f59016a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29074Y) && Intrinsics.areEqual(this.f59016a, ((C29074Y) obj).f59016a);
    }

    public final int hashCode() {
        Object obj = this.f59016a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Left(a=" + this.f59016a + ")";
    }

    public C29074Y(Object obj) {
        this.f59016a = obj;
    }
}
