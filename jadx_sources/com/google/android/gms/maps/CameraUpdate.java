package com.google.android.gms.maps;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class CameraUpdate {
    private final IObjectWrapper zza;

    @NonNull
    public final IObjectWrapper zza() {
        return this.zza;
    }

    public CameraUpdate(IObjectWrapper iObjectWrapper) {
        this.zza = (IObjectWrapper) Preconditions.checkNotNull(iObjectWrapper);
    }
}
