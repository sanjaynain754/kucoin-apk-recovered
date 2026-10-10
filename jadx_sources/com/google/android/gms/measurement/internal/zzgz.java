package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzgz implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzha zzb;

    public zzgz(zzha zzhaVar, boolean z11) {
        this.zza = z11;
        Objects.requireNonNull(zzhaVar);
        this.zzb = zzhaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc().zzar(this.zza);
    }
}
