package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import java.io.File;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.c0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30531c0 {

    /* JADX INFO: renamed from: a */
    public final File f61653a;

    /* JADX INFO: renamed from: b */
    public final boolean f61654b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30531c0)) {
            return false;
        }
        C30531c0 c30531c0 = (C30531c0) obj;
        return Intrinsics.areEqual(this.f61653a, c30531c0.f61653a) && this.f61654b == c30531c0.f61654b;
    }

    public final int hashCode() {
        File file = this.f61653a;
        return Boolean.hashCode(this.f61654b) + ((file == null ? 0 : file.hashCode()) * 31);
    }

    public final String toString() {
        return "VideoCapture(file=" + this.f61653a + ", started=" + this.f61654b + ")";
    }

    public C30531c0(File file, boolean z11) {
        this.f61653a = file;
        this.f61654b = z11;
    }
}
