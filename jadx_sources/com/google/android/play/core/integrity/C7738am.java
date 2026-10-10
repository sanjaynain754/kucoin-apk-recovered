package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.am */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7738am extends IntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a */
    private String f11983a;

    /* JADX INFO: renamed from: b */
    private Long f11984b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f11983a;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: nonce");
        }
        C7739an c7739an = null;
        return new C7740ao(str, this.f11984b, c7739an, c7739an);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f11983a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j11) {
        this.f11984b = Long.valueOf(j11);
        return this;
    }
}
