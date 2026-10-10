package com.sumsub.sns.internal.features.presentation.camera.photo.selfie;

import java.io.File;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30721q extends AbstractC30723s {

    /* JADX INFO: renamed from: a */
    public final File f62068a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30721q) && Intrinsics.areEqual(this.f62068a, ((C30721q) obj).f62068a);
    }

    public final int hashCode() {
        File file = this.f62068a;
        if (file == null) {
            return 0;
        }
        return file.hashCode();
    }

    public final String toString() {
        return "PictureTaken(file=" + this.f62068a + ")";
    }

    public C30721q(File file) {
        this.f62068a = file;
    }
}
