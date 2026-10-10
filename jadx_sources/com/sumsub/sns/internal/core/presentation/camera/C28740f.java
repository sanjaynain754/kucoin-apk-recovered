package com.sumsub.sns.internal.core.presentation.camera;

import java.io.File;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.camera.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28740f {

    /* JADX INFO: renamed from: a */
    public final File f58443a;

    /* JADX INFO: renamed from: b */
    public final AbstractC28738e f58444b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28740f)) {
            return false;
        }
        C28740f c28740f = (C28740f) obj;
        return Intrinsics.areEqual(this.f58443a, c28740f.f58443a) && Intrinsics.areEqual(this.f58444b, c28740f.f58444b);
    }

    public final int hashCode() {
        return this.f58444b.hashCode() + (this.f58443a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoRecordingResult(file=" + this.f58443a + ", status=" + this.f58444b + ")";
    }

    public C28740f(File file, AbstractC28738e abstractC28738e) {
        this.f58443a = file;
        this.f58444b = abstractC28738e;
    }
}
