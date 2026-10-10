package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.zacp;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class ResultTransform<R extends Result, S extends Result> {
    @Nullable
    @WorkerThread
    public abstract PendingResult<S> onSuccess(@NonNull R r11);

    @NonNull
    public final PendingResult<S> createFailedResult(@NonNull Status status) {
        return new zacp(status);
    }

    @NonNull
    public Status onFailure(@NonNull Status status) {
        return status;
    }
}
