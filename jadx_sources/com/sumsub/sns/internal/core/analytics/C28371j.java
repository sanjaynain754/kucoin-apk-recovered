package com.sumsub.sns.internal.core.analytics;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.analytics.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28371j implements InterfaceC28380s {

    /* JADX INFO: renamed from: a */
    public final String f57850a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28371j) && Intrinsics.areEqual(this.f57850a, ((C28371j) obj).f57850a);
    }

    public final int hashCode() {
        return this.f57850a.hashCode();
    }

    public final String toString() {
        return "IdDocSetTypeContainer(text=" + this.f57850a + ")";
    }

    public C28371j(String str) {
        this.f57850a = str;
    }
}
