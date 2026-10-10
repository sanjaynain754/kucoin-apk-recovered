package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import java.io.File;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.q1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30616q1 {

    /* JADX INFO: renamed from: a */
    public final File f61857a;

    /* JADX INFO: renamed from: b */
    public final boolean f61858b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30616q1)) {
            return false;
        }
        C30616q1 c30616q1 = (C30616q1) obj;
        return Intrinsics.areEqual(this.f61857a, c30616q1.f61857a) && this.f61858b == c30616q1.f61858b;
    }

    public final int hashCode() {
        File file = this.f61857a;
        return Boolean.hashCode(this.f61858b) + ((file == null ? 0 : file.hashCode()) * 31);
    }

    public final String toString() {
        return "VideoCapture(file=" + this.f61857a + ", started=" + this.f61858b + ")";
    }

    public C30616q1(File file, boolean z11) {
        this.f61857a = file;
        this.f61858b = z11;
    }
}
