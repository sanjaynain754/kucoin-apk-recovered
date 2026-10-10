package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzlu implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzlt zzb;
    final /* synthetic */ zzlt zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzma zze;

    public zzlu(zzma zzmaVar, Bundle bundle, zzlt zzltVar, zzlt zzltVar2, long j11) {
        this.zza = bundle;
        this.zzb = zzltVar;
        this.zzc = zzltVar2;
        this.zzd = j11;
        Objects.requireNonNull(zzmaVar);
        this.zze = zzmaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzt(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
