package com.sumsub.sns.internal.features.presentation.camera.video;

import java.io.File;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.video.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30784q {

    /* JADX INFO: renamed from: a */
    public final File f62192a;

    /* JADX INFO: renamed from: b */
    public final String f62193b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30784q)) {
            return false;
        }
        C30784q c30784q = (C30784q) obj;
        return Intrinsics.areEqual(this.f62192a, c30784q.f62192a) && Intrinsics.areEqual(this.f62193b, c30784q.f62193b);
    }

    public final int hashCode() {
        return this.f62193b.hashCode() + (this.f62192a.hashCode() * 31);
    }

    public final String toString() {
        return "Result(file=" + this.f62192a + ", phrase=" + this.f62193b + ")";
    }

    public C30784q(File file, String str) {
        this.f62192a = file;
        this.f62193b = str;
    }
}
