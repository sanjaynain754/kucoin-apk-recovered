package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class ComplianceData {

    /* JADX INFO: loaded from: classes45.dex */
    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract ComplianceData build();

        @NonNull
        public abstract Builder setPrivacyContext(@Nullable ExternalPrivacyContext externalPrivacyContext);

        @NonNull
        public abstract Builder setProductIdOrigin(@Nullable ProductIdOrigin productIdOrigin);
    }

    /* JADX INFO: loaded from: classes45.dex */
    public enum ProductIdOrigin {
        NOT_SET(0),
        EVENT_OVERRIDE(5);

        private static final SparseArray<ProductIdOrigin> valueMap;
        private final int value;

        static {
            ProductIdOrigin productIdOrigin = NOT_SET;
            ProductIdOrigin productIdOrigin2 = EVENT_OVERRIDE;
            SparseArray<ProductIdOrigin> sparseArray = new SparseArray<>();
            valueMap = sparseArray;
            sparseArray.put(0, productIdOrigin);
            sparseArray.put(5, productIdOrigin2);
        }

        @Nullable
        public static ProductIdOrigin forNumber(int i11) {
            return valueMap.get(i11);
        }

        public int getValue() {
            return this.value;
        }

        ProductIdOrigin(int i11) {
            this.value = i11;
        }
    }

    @Nullable
    public abstract ExternalPrivacyContext getPrivacyContext();

    @Nullable
    public abstract ProductIdOrigin getProductIdOrigin();

    @NonNull
    public static Builder builder() {
        return new AutoValue_ComplianceData.Builder();
    }
}
