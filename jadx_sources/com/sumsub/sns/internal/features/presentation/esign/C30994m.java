package com.sumsub.sns.internal.features.presentation.esign;

import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30994m extends AbstractC31000p {

    /* JADX INFO: renamed from: b */
    public final List f62633b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30994m) && Intrinsics.areEqual(this.f62633b, ((C30994m) obj).f62633b);
    }

    public final int hashCode() {
        return this.f62633b.hashCode();
    }

    public final String toString() {
        return "DataView(fields=" + this.f62633b + ")";
    }

    public C30994m(List list) {
        this.f62633b = list;
    }
}
