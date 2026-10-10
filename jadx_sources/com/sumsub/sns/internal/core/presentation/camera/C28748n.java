package com.sumsub.sns.internal.core.presentation.camera;

import java.io.File;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.camera.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28748n implements InterfaceC28752r {

    /* JADX INFO: renamed from: a */
    public final File f58480a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28748n) && Intrinsics.areEqual(this.f58480a, ((C28748n) obj).f58480a);
    }

    public final int hashCode() {
        return this.f58480a.hashCode();
    }

    public final String toString() {
        return "PictureTaken(file=" + this.f58480a + ")";
    }

    public C28748n(File file) {
        this.f58480a = file;
    }
}
