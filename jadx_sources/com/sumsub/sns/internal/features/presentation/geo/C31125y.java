package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.internal.features.data.model.geo.C29795e;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31125y implements InterfaceC31041C {

    /* JADX INFO: renamed from: a */
    public final C29795e f62943a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31125y) && Intrinsics.areEqual(this.f62943a, ((C31125y) obj).f62943a);
    }

    public final int hashCode() {
        return this.f62943a.hashCode();
    }

    public final String toString() {
        return "Acquired(location=" + this.f62943a + ")";
    }

    public C31125y(C29795e c29795e) {
        this.f62943a = c29795e;
    }
}
