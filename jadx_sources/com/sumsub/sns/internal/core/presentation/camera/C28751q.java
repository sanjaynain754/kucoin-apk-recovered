package com.sumsub.sns.internal.core.presentation.camera;

import java.io.File;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.camera.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28751q implements InterfaceC28752r {

    /* JADX INFO: renamed from: a */
    public final File f58483a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28751q) && Intrinsics.areEqual(this.f58483a, ((C28751q) obj).f58483a);
    }

    public final int hashCode() {
        return this.f58483a.hashCode();
    }

    public final String toString() {
        return "VideoRecordingStarted(file=" + this.f58483a + ")";
    }

    public C28751q(File file) {
        this.f58483a = file;
    }
}
