package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.inject.Provider;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class ExecutorSelector {
    private final Provider zza;

    @NonNull
    @KeepForSdk
    public Executor getExecutorToUse(@Nullable Executor executor) {
        return executor != null ? executor : (Executor) this.zza.get();
    }

    public ExecutorSelector(@NonNull Provider provider) {
        this.zza = provider;
    }
}
