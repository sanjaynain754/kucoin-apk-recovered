package com.sumsub.sns.internal.features.presentation.imageviewer;

import java.io.File;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.imageviewer.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31136h extends AbstractC31137i {

    /* JADX INFO: renamed from: a */
    public final File f62961a;

    /* JADX INFO: renamed from: b */
    public final int f62962b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31136h)) {
            return false;
        }
        C31136h c31136h = (C31136h) obj;
        return Intrinsics.areEqual(this.f62961a, c31136h.f62961a) && this.f62962b == c31136h.f62962b;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(1920) * 31;
        File file = this.f62961a;
        return Integer.hashCode(this.f62962b) + ((iHashCode + (file == null ? 0 : file.hashCode())) * 31);
    }

    public final String toString() {
        return "Pdf(maxPhotoDimension=1920, bitmapFile=" + this.f62961a + ", totalPages=" + this.f62962b + ")";
    }

    public C31136h(int i11, File file) {
        this.f62961a = file;
        this.f62962b = i11;
    }
}
