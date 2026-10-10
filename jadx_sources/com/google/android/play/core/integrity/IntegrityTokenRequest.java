package com.google.android.play.core.integrity;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class IntegrityTokenRequest {

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
    public static abstract class Builder {
        public abstract IntegrityTokenRequest build();

        public abstract Builder setCloudProjectNumber(long j11);

        public abstract Builder setNonce(String str);
    }

    @Nullable
    public abstract Long cloudProjectNumber();

    public abstract String nonce();

    public static Builder builder() {
        return new C7738am();
    }
}
