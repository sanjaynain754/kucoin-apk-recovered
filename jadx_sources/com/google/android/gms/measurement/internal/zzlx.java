package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzlx implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzma zzb;

    public zzlx(zzma zzmaVar, long j11) {
        this.zza = j11;
        Objects.requireNonNull(zzmaVar);
        this.zzb = zzmaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzma zzmaVar = this.zzb;
        zzmaVar.zzu.zzw().zzc(this.zza);
        zzmaVar.zza = null;
    }
}
