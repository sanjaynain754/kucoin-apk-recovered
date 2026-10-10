package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzmy implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zzne zzb;

    public zzmy(zzne zzneVar, ComponentName componentName) {
        this.zza = componentName;
        Objects.requireNonNull(zzneVar);
        this.zzb = zzneVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzW(this.zza);
    }
}
