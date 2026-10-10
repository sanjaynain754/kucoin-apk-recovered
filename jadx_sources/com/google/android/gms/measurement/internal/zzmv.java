package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzmv implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzr zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcu zzd;
    final /* synthetic */ zznk zze;

    public zzmv(zznk zznkVar, String str, String str2, zzr zzrVar, com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzrVar;
        this.zzd = zzcuVar;
        Objects.requireNonNull(zznkVar);
        this.zze = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzcu zzcuVar;
        zzpo zzpoVarZzk;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zznk zznkVar = this.zze;
                zzga zzgaVarZzZ = zznkVar.zzZ();
                if (zzgaVarZzZ == null) {
                    zzib zzibVar = zznkVar.zzu;
                    zzibVar.zzaV().zzb().zzc("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                    zzpoVarZzk = zzibVar.zzk();
                    zzcuVar = this.zzd;
                } else {
                    zzr zzrVar = this.zzc;
                    Preconditions.checkNotNull(zzrVar);
                    arrayList = zzpo.zzas(zzgaVarZzZ.zzr(this.zza, this.zzb, zzrVar));
                    zznkVar.zzV();
                    zznk zznkVar2 = this.zze;
                    zzcuVar = this.zzd;
                    zzpoVarZzk = zznkVar2.zzu.zzk();
                }
            } catch (RemoteException e11) {
                this.zze.zzu.zzaV().zzb().zzd("Failed to get conditional properties; remote exception", this.zza, this.zzb, e11);
            }
            zzpoVarZzk.zzar(zzcuVar, arrayList);
        } catch (Throwable th2) {
            zznk zznkVar3 = this.zze;
            zznkVar3.zzu.zzk().zzar(this.zzd, arrayList);
            throw th2;
        }
    }
}
