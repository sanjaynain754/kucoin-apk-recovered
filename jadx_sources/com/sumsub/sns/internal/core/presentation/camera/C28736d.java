package com.sumsub.sns.internal.core.presentation.camera;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.camera.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28736d extends AbstractC28738e {

    /* JADX INFO: renamed from: a */
    public final int f58439a;

    /* JADX INFO: renamed from: b */
    public final long f58440b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28736d)) {
            return false;
        }
        C28736d c28736d = (C28736d) obj;
        return this.f58439a == c28736d.f58439a && this.f58440b == c28736d.f58440b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f58440b) + (Integer.hashCode(this.f58439a) * 31);
    }

    public final String toString() {
        return "Ok(durationsSec=" + this.f58439a + ", fileSizeBytes=" + this.f58440b + ")";
    }

    public C28736d(int i11, long j11) {
        this.f58439a = i11;
        this.f58440b = j11;
    }
}
