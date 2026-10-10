package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class ExternalPRequestContext {

    /* JADX INFO: loaded from: classes45.dex */
    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract ExternalPRequestContext build();

        @NonNull
        public abstract Builder setOriginAssociatedProductId(@Nullable Integer num);
    }

    @Nullable
    public abstract Integer getOriginAssociatedProductId();

    @NonNull
    public static Builder builder() {
        return new AutoValue_ExternalPRequestContext.Builder();
    }
}
