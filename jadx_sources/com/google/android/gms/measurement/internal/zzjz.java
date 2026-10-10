package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzjz implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzli zzb;

    public zzjz(zzli zzliVar, long j11) {
        this.zza = j11;
        Objects.requireNonNull(zzliVar);
        this.zzb = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzib zzibVar = this.zzb.zzu;
        zzhd zzhdVar = zzibVar.zzd().zzf;
        long j11 = this.zza;
        zzhdVar.zzb(j11);
        zzibVar.zzaV().zzj().zzb("Session timeout duration set", Long.valueOf(j11));
    }
}
