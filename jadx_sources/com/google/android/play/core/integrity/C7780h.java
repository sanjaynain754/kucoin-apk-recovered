package com.google.android.play.core.integrity;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.h */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7780h extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* JADX INFO: renamed from: a */
    @Nullable
    private final String f12058a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
        String str = this.f12058a;
        if (str == null) {
            return standardIntegrityTokenRequest.mo13213a() == null;
        }
        return str.equals(standardIntegrityTokenRequest.mo13213a());
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    @Nullable
    /* JADX INFO: renamed from: a */
    public final String mo13213a() {
        return this.f12058a;
    }

    public final int hashCode() {
        String str = this.f12058a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f12058a + "}";
    }

    public /* synthetic */ C7780h(String str, C7779g c7779g) {
        this.f12058a = str;
    }
}
