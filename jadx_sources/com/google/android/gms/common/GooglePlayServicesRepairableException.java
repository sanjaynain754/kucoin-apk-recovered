package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {
    private final int zza;

    public int getConnectionStatusCode() {
        return this.zza;
    }

    public GooglePlayServicesRepairableException(int i11, @NonNull String str, @NonNull Intent intent) {
        super(str, intent);
        this.zza = i11;
    }
}
