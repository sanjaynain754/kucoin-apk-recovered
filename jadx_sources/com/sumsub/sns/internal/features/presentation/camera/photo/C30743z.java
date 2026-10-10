package com.sumsub.sns.internal.features.presentation.camera.photo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30743z extends AbstractC30397B {

    /* JADX INFO: renamed from: a */
    public final C30400E f62114a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30743z) && Intrinsics.areEqual(this.f62114a, ((C30743z) obj).f62114a);
    }

    public final int hashCode() {
        return this.f62114a.hashCode();
    }

    public final String toString() {
        return "OnItemSelected(item=" + this.f62114a + ")";
    }

    public C30743z(C30400E c30400e) {
        this.f62114a = c30400e;
    }
}
