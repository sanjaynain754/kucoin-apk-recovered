package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzmt implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzah zzc;
    final /* synthetic */ zznk zzd;

    public zzmt(zznk zznkVar, boolean z11, zzr zzrVar, boolean z12, zzah zzahVar, zzah zzahVar2) {
        this.zza = zzrVar;
        this.zzb = z12;
        this.zzc = zzahVar;
        Objects.requireNonNull(zznkVar);
        this.zzd = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznk zznkVar = this.zzd;
        zzga zzgaVarZzZ = zznkVar.zzZ();
        if (zzgaVarZzZ == null) {
            zznkVar.zzu.zzaV().zzb().zza("Discarding data. Failed to send conditional user property to service");
            return;
        }
        zzr zzrVar = this.zza;
        Preconditions.checkNotNull(zzrVar);
        zznkVar.zzm(zzgaVarZzZ, this.zzb ? null : this.zzc, zzrVar);
        zznkVar.zzV();
    }
}
