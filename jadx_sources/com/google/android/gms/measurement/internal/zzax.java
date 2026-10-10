package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzax implements Runnable {
    final /* synthetic */ zzjf zza;
    final /* synthetic */ zzay zzb;

    public zzax(zzay zzayVar, zzjf zzjfVar) {
        this.zza = zzjfVar;
        Objects.requireNonNull(zzayVar);
        this.zzb = zzayVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjf zzjfVar = this.zza;
        zzjfVar.zzaU();
        if (zzae.zza()) {
            zzjfVar.zzaW().zzj(this);
            return;
        }
        zzay zzayVar = this.zzb;
        boolean zZzc = zzayVar.zzc();
        zzayVar.zze(0L);
        if (zZzc) {
            zzayVar.zza();
        }
    }
}
