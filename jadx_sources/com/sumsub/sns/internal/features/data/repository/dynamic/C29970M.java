package com.sumsub.sns.internal.features.data.repository.dynamic;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29970M extends AbstractC29971N {

    /* JADX INFO: renamed from: a */
    public final Object f60207a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29970M) && Intrinsics.areEqual(this.f60207a, ((C29970M) obj).f60207a);
    }

    public final int hashCode() {
        Object obj = this.f60207a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.f60207a + ")";
    }

    public C29970M(Object obj) {
        this.f60207a = obj;
    }
}
