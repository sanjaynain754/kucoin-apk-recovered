package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzh;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@KeepForSdk
public class HandlerExecutor implements Executor {
    private final Handler zza;

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.zza.post(runnable);
    }

    @KeepForSdk
    public HandlerExecutor(@NonNull Looper looper) {
        this.zza = new zzh(looper);
    }
}
