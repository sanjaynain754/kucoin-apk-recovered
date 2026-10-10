package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzou implements Runnable {
    final /* synthetic */ zzpg zza;
    final /* synthetic */ zzpf zzb;

    public zzou(zzpf zzpfVar, zzpg zzpgVar) {
        this.zza = zzpgVar;
        Objects.requireNonNull(zzpfVar);
        this.zzb = zzpfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpf zzpfVar = this.zzb;
        zzpfVar.zzat(this.zza);
        zzpfVar.zzc();
    }
}
