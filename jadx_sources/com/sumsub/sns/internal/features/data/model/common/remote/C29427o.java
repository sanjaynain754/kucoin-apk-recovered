package com.sumsub.sns.internal.features.data.model.common.remote;

import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29427o implements InterfaceC29434p {

    /* JADX INFO: renamed from: a */
    public final List f59426a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29427o) && Intrinsics.areEqual(this.f59426a, ((C29427o) obj).f59426a);
    }

    public final int hashCode() {
        return this.f59426a.hashCode();
    }

    public final String toString() {
        return "TinsValue(value=" + this.f59426a + ")";
    }

    public C29427o(List list) {
        this.f59426a = list;
    }
}
