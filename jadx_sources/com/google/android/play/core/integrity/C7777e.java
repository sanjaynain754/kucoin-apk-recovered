package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.e */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7777e extends StandardIntegrityManager.PrepareIntegrityTokenRequest {

    /* JADX INFO: renamed from: a */
    private final long f12056a;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    /* JADX INFO: renamed from: a */
    public final int mo13211a() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) {
            StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest = (StandardIntegrityManager.PrepareIntegrityTokenRequest) obj;
            if (this.f12056a == prepareIntegrityTokenRequest.mo13212b()) {
                prepareIntegrityTokenRequest.mo13211a();
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    /* JADX INFO: renamed from: b */
    public final long mo13212b() {
        return this.f12056a;
    }

    public final int hashCode() {
        long j11 = this.f12056a;
        return (((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f12056a + ", webViewRequestMode=0}";
    }

    public /* synthetic */ C7777e(long j11, int i11, C7776d c7776d) {
        this.f12056a = j11;
    }
}
