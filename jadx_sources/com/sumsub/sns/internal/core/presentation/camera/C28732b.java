package com.sumsub.sns.internal.core.presentation.camera;

import androidx.camera.video.Quality;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.camera.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28732b {

    /* JADX INFO: renamed from: a */
    public final int f58427a;

    /* JADX INFO: renamed from: b */
    public final Quality f58428b;

    /* JADX INFO: renamed from: c */
    public final Quality f58429c;

    /* JADX INFO: renamed from: d */
    public final long f58430d;

    /* JADX INFO: renamed from: e */
    public final long f58431e;

    public C28732b(int i11, Quality quality, Quality quality2, long j11, long j12) {
        this.f58427a = i11;
        this.f58428b = quality;
        this.f58429c = quality2;
        this.f58430d = j11;
        this.f58431e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28732b)) {
            return false;
        }
        C28732b c28732b = (C28732b) obj;
        return this.f58427a == c28732b.f58427a && Intrinsics.areEqual(this.f58428b, c28732b.f58428b) && Intrinsics.areEqual(this.f58429c, c28732b.f58429c) && this.f58430d == c28732b.f58430d && this.f58431e == c28732b.f58431e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f58431e) + ((Long.hashCode(this.f58430d) + ((this.f58429c.hashCode() + ((this.f58428b.hashCode() + (Integer.hashCode(this.f58427a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VideoParams(bitRate=" + this.f58427a + ", quality=" + this.f58428b + ", fallbackQuality=" + this.f58429c + ", durationLimitMs=" + this.f58430d + ", fileSizeLimitBytes=" + this.f58431e + ")";
    }

    public /* synthetic */ C28732b() {
        this(0, Quality.f1930HD, Quality.f1931SD, 0L, 0L);
    }
}
