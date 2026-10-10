package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzju implements Executor {
    final /* synthetic */ zzli zza;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.zzu.zzaW().zzj(runnable);
    }

    public zzju(zzli zzliVar) {
        Objects.requireNonNull(zzliVar);
        this.zza = zzliVar;
    }
}
