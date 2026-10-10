package com.sumsub.sns.internal.features.presentation.camera.video;

import java.io.File;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.video.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30778k extends AbstractC30783p {

    /* JADX INFO: renamed from: a */
    public final File f62188a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30778k) && Intrinsics.areEqual(this.f62188a, ((C30778k) obj).f62188a);
    }

    public final int hashCode() {
        return this.f62188a.hashCode();
    }

    public final String toString() {
        return "StartRecording(file=" + this.f62188a + ")";
    }

    public C30778k(File file) {
        this.f62188a = file;
    }
}
