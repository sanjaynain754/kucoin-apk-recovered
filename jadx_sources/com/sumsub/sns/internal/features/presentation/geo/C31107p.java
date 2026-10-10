package com.sumsub.sns.internal.features.presentation.geo;

import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31107p implements InterfaceC31109q {

    /* JADX INFO: renamed from: a */
    public final List f62895a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31107p) && Intrinsics.areEqual(this.f62895a, ((C31107p) obj).f62895a);
    }

    public final int hashCode() {
        return this.f62895a.hashCode();
    }

    public final String toString() {
        return "ConfirmationRequired(items=" + this.f62895a + ")";
    }

    public C31107p(List list) {
        this.f62895a = list;
    }
}
