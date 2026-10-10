package com.google.android.play.core.integrity;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.f */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7778f extends StandardIntegrityManager.StandardIntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a */
    private String f12057a;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest build() {
        return new C7780h(this.f12057a, null);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(@Nullable String str) {
        this.f12057a = str;
        return this;
    }
}
