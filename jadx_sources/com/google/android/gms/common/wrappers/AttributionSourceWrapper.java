package com.google.android.gms.common.wrappers;

import android.content.AttributionSource;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@KeepForSdk
public final class AttributionSourceWrapper {

    @Nullable
    private final AttributionSource zza;

    @Nullable
    @KeepForSdk
    public AttributionSource getAttributionSource() {
        return this.zza;
    }

    @KeepForSdk
    public AttributionSourceWrapper(@Nullable AttributionSource attributionSource) {
        this.zza = attributionSource;
    }
}
