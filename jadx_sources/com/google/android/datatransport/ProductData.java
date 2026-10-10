package com.google.android.datatransport;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class ProductData {
    @Nullable
    public abstract Integer getProductId();

    public static ProductData withProductId(@Nullable Integer num) {
        return new AutoValue_ProductData(num);
    }
}
