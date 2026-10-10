package com.sumsub.sns.internal.core.domain.facedetector;

import com.sumsub.sentry.android.AbstractC27920h;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.facedetector.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28559e {

    /* JADX INFO: renamed from: a */
    public final boolean f58116a;

    /* JADX INFO: renamed from: b */
    public final boolean f58117b;

    /* JADX INFO: renamed from: c */
    public final long f58118c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28559e)) {
            return false;
        }
        C28559e c28559e = (C28559e) obj;
        return this.f58116a == c28559e.f58116a && this.f58117b == c28559e.f58117b && this.f58118c == c28559e.f58118c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f58118c) + AbstractC27920h.m69001a(this.f58117b, Boolean.hashCode(this.f58116a) * 31, 31);
    }

    public final String toString() {
        return "FaceDetectorConfig(mlKit=" + this.f58116a + ", tflow=" + this.f58117b + ", frameDelay=" + this.f58118c + ")";
    }

    public C28559e(boolean z11, boolean z12, long j11) {
        this.f58116a = z11;
        this.f58117b = z12;
        this.f58118c = j11;
    }
}
