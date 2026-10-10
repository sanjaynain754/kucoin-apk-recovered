package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzij implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzjc zzd;

    public zzij(zzjc zzjcVar, String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        Objects.requireNonNull(zzjcVar);
        this.zzd = zzjcVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzjc zzjcVar = this.zzd;
        zzjcVar.zzL().zzY();
        return zzjcVar.zzL().zzj().zzo(this.zza, this.zzb, this.zzc);
    }
}
