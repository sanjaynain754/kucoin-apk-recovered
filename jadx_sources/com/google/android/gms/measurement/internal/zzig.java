package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzig implements Runnable {
    final /* synthetic */ zzah zza;
    final /* synthetic */ zzr zzb;
    final /* synthetic */ zzjc zzc;

    public zzig(zzjc zzjcVar, zzah zzahVar, zzr zzrVar) {
        this.zza = zzahVar;
        this.zzb = zzrVar;
        Objects.requireNonNull(zzjcVar);
        this.zzc = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjc zzjcVar = this.zzc;
        zzjcVar.zzL().zzY();
        zzah zzahVar = this.zza;
        if (zzahVar.zzc.zza() == null) {
            zzjcVar.zzL().zzal(zzahVar, this.zzb);
        } else {
            zzjcVar.zzL().zzaj(zzahVar, this.zzb);
        }
    }
}
