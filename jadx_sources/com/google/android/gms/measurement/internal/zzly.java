package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzly implements Runnable {
    final /* synthetic */ zzlt zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzma zzc;

    public zzly(zzma zzmaVar, zzlt zzltVar, long j11) {
        this.zza = zzltVar;
        this.zzb = j11;
        Objects.requireNonNull(zzmaVar);
        this.zzc = zzmaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzma zzmaVar = this.zzc;
        zzmaVar.zzv(this.zza, false, this.zzb);
        zzmaVar.zza = null;
        zzmaVar.zzu.zzt().zzG(null);
    }
}
