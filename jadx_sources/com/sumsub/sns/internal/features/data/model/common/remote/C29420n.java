package com.sumsub.sns.internal.features.data.model.common.remote;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29420n implements InterfaceC29434p {

    /* JADX INFO: renamed from: a */
    public final String f59418a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29420n) && Intrinsics.areEqual(this.f59418a, ((C29420n) obj).f59418a);
    }

    public final int hashCode() {
        return this.f59418a.hashCode();
    }

    public final String toString() {
        return "StringValue(value=" + this.f59418a + ")";
    }

    public C29420n(String str) {
        this.f59418a = str;
    }
}
