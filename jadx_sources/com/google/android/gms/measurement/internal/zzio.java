package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzio implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zzjc zzb;

    public zzio(zzjc zzjcVar, zzr zzrVar) {
        this.zza = zzrVar;
        Objects.requireNonNull(zzjcVar);
        this.zzb = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjc zzjcVar = this.zzb;
        zzjcVar.zzL().zzY();
        zzpf zzpfVarZzL = zzjcVar.zzL();
        zzpfVarZzL.zzaW().zzg();
        zzpfVarZzL.zzu();
        zzr zzrVar = this.zza;
        Preconditions.checkNotEmpty(zzrVar.zza);
        zzpfVarZzL.zzv(zzrVar);
        zzpfVarZzL.zzw(zzrVar);
    }
}
