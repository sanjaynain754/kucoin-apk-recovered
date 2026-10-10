package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public interface RemoteCall<T, U> {
    @KeepForSdk
    void accept(@NonNull T t11, @NonNull U u11) throws RemoteException;
}
