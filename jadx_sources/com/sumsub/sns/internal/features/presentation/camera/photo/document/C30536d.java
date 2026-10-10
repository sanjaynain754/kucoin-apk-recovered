package com.sumsub.sns.internal.features.presentation.camera.photo.document;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30536d {

    /* JADX INFO: renamed from: a */
    public final boolean f61660a;

    /* JADX INFO: renamed from: b */
    public final CheckDetectionResult$SizeCheckResult f61661b;

    /* JADX INFO: renamed from: c */
    public final boolean f61662c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30536d)) {
            return false;
        }
        C30536d c30536d = (C30536d) obj;
        return this.f61660a == c30536d.f61660a && this.f61661b == c30536d.f61661b && this.f61662c == c30536d.f61662c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61662c) + ((this.f61661b.hashCode() + (Boolean.hashCode(this.f61660a) * 31)) * 31);
    }

    public final String toString() {
        return "CheckDetectionResult(frameHit=" + this.f61660a + ", sizeCheck=" + this.f61661b + ", aspectRatio=" + this.f61662c + ")";
    }

    public C30536d(boolean z11, CheckDetectionResult$SizeCheckResult checkDetectionResult$SizeCheckResult, boolean z12) {
        this.f61660a = z11;
        this.f61661b = checkDetectionResult$SizeCheckResult;
        this.f61662c = z12;
    }
}
