package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzin implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zzjc zzb;

    public zzin(zzjc zzjcVar, zzr zzrVar) {
        this.zza = zzrVar;
        Objects.requireNonNull(zzjcVar);
        this.zzb = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjc zzjcVar = this.zzb;
        zzjcVar.zzL().zzY();
        zzjcVar.zzL().zzaa(this.zza);
    }
}
