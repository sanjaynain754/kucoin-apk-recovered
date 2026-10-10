package com.sumsub.sns.internal.features.data.model.common;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.D3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28994D3 {

    /* JADX INFO: renamed from: a */
    public final Boolean f58921a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28994D3) && Intrinsics.areEqual(this.f58921a, ((C28994D3) obj).f58921a);
    }

    public final int hashCode() {
        Boolean bool = this.f58921a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "WorkflowStatus(levelChangePossible=" + this.f58921a + ")";
    }

    public C28994D3(Boolean bool) {
        this.f58921a = bool;
    }
}
