package com.google.android.gms.wallet.contract;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Objects;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public class ApiTaskResult<T> {

    @Nullable
    private final Object zza;
    private final Status zzb;

    public ApiTaskResult(@Nullable T t11, @NonNull Status status) {
        this.zza = t11;
        this.zzb = status;
    }

    public ApiTaskResult(@NonNull Status status) {
        this(null, status);
    }

    @Nullable
    public T getResult() {
        return (T) this.zza;
    }

    @NonNull
    public Status getStatus() {
        return this.zzb;
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add("status", this.zzb).add(DbParams.KEY_CHANNEL_RESULT, this.zza).toString();
    }
}
