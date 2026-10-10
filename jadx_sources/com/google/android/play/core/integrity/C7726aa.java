package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.aa */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7726aa implements IntegrityManager {

    /* JADX INFO: renamed from: a */
    private final C7735aj f11955a;

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f11955a.m13230c(integrityTokenRequest);
    }

    public C7726aa(C7735aj c7735aj) {
        this.f11955a = c7735aj;
    }
}
