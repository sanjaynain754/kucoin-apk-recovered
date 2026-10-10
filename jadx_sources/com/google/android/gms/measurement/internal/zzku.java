package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzku implements Runnable {
    final /* synthetic */ zzjk zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzli zzd;

    public zzku(zzli zzliVar, zzjk zzjkVar, long j11, boolean z11) {
        this.zza = zzjkVar;
        this.zzb = j11;
        this.zzc = z11;
        Objects.requireNonNull(zzliVar);
        this.zzd = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzli zzliVar = this.zzd;
        zzjk zzjkVar = this.zza;
        zzliVar.zzA(zzjkVar);
        zzliVar.zzaj(zzjkVar, this.zzb, false, this.zzc);
    }
}
