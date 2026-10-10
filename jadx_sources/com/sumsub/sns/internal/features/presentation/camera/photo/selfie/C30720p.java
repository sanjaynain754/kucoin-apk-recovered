package com.sumsub.sns.internal.features.presentation.camera.photo.selfie;

import com.sumsub.sns.internal.features.data.model.common.C29054T;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30720p extends AbstractC30723s {

    /* JADX INFO: renamed from: a */
    public final C29054T f62067a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30720p) && Intrinsics.areEqual(this.f62067a, ((C30720p) obj).f62067a);
    }

    public final int hashCode() {
        return this.f62067a.hashCode();
    }

    public final String toString() {
        return "GalleryResult(result=" + this.f62067a + ")";
    }

    public C30720p(C29054T c29054t) {
        this.f62067a = c29054t;
    }
}
