package com.sumsub.sns.internal.core.presentation.camera;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.camera.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28747m implements InterfaceC28752r {

    /* JADX INFO: renamed from: a */
    public final Exception f58479a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28747m) && Intrinsics.areEqual(this.f58479a, ((C28747m) obj).f58479a);
    }

    public final int hashCode() {
        return this.f58479a.hashCode();
    }

    public final String toString() {
        return "Error(exception=" + this.f58479a + ")";
    }

    public C28747m(Exception exc) {
        this.f58479a = exc;
    }
}
