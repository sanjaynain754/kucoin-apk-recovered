package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.b1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30526b1 extends AbstractC30532c1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30526b1) && Intrinsics.areEqual("manual_", "manual_");
    }

    public final String toString() {
        return "TakePicture(filePrefix=manual_)";
    }

    public final int hashCode() {
        return 835850585;
    }
}
