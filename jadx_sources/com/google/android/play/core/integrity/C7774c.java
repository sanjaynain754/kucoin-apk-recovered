package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.c */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7774c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a */
    private long f12054a;

    /* JADX INFO: renamed from: b */
    private byte f12055b;

    /* JADX INFO: renamed from: a */
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder m13260a(int i11) {
        this.f12055b = (byte) (this.f12055b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f12055b == 3) {
            return new C7777e(this.f12054a, 0, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f12055b & 1) == 0) {
            sb2.append(" cloudProjectNumber");
        }
        if ((this.f12055b & 2) == 0) {
            sb2.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j11) {
        this.f12054a = j11;
        this.f12055b = (byte) (this.f12055b | 1);
        return this;
    }
}
