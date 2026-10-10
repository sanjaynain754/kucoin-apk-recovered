package com.google.android.play.core.review.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzj implements Runnable {

    @Nullable
    private final TaskCompletionSource zza;

    public zzj() {
        this.zza = null;
    }

    public abstract void zza();

    public zzj(@Nullable TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Nullable
    public final TaskCompletionSource zzb() {
        return this.zza;
    }

    public final void zzc(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zza();
        } catch (Exception e11) {
            zzc(e11);
        }
    }
}
