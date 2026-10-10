package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public class CustomSignals {
    final Map<String, String> customSignals;

    public static class Builder {
        private Map<String, String> customSignals = new HashMap();

        @NonNull
        public Builder put(@NonNull String str, @Nullable String str2) {
            this.customSignals.put(str, str2);
            return this;
        }

        @NonNull
        public CustomSignals build() {
            return new CustomSignals(this);
        }

        @NonNull
        public Builder put(@NonNull String str, long j11) {
            this.customSignals.put(str, Long.toString(j11));
            return this;
        }

        @NonNull
        public Builder put(@NonNull String str, double d11) {
            this.customSignals.put(str, Double.toString(d11));
            return this;
        }
    }

    public CustomSignals(@NonNull Builder builder) {
        this.customSignals = builder.customSignals;
    }
}
