package com.google.android.gms.maps.model;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class BitmapDescriptor {
    private final IObjectWrapper zza;

    @NonNull
    public final IObjectWrapper zza() {
        return this.zza;
    }

    public BitmapDescriptor(@NonNull IObjectWrapper iObjectWrapper) {
        this.zza = (IObjectWrapper) Preconditions.checkNotNull(iObjectWrapper);
    }
}
