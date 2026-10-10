package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzmi implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcu zzb;
    final /* synthetic */ zznk zzc;

    public zzmi(zznk zznkVar, zzr zzrVar, com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        this.zza = zzrVar;
        this.zzb = zzcuVar;
        Objects.requireNonNull(zznkVar);
        this.zzc = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzcu zzcuVar;
        zzpo zzpoVarZzk;
        String strZzm = null;
        try {
            try {
                zznk zznkVar = this.zzc;
                zzib zzibVar = zznkVar.zzu;
                if (zzibVar.zzd().zzl().zzo(zzjj.ANALYTICS_STORAGE)) {
                    zzga zzgaVarZzZ = zznkVar.zzZ();
                    if (zzgaVarZzZ != null) {
                        zzr zzrVar = this.zza;
                        Preconditions.checkNotNull(zzrVar);
                        strZzm = zzgaVarZzZ.zzm(zzrVar);
                        if (strZzm != null) {
                            zznkVar.zzu.zzj().zzR(strZzm);
                            zzibVar.zzd().zze.zzb(strZzm);
                        }
                        zznkVar.zzV();
                        zznk zznkVar2 = this.zzc;
                        zzcuVar = this.zzb;
                        zzpoVarZzk = zznkVar2.zzu.zzk();
                        zzpoVarZzk.zzal(zzcuVar, strZzm);
                    }
                    zzibVar.zzaV().zzb().zza("Failed to get app instance id");
                } else {
                    zzibVar.zzaV().zzh().zza("Analytics storage consent denied; will not get app instance id");
                    zznkVar.zzu.zzj().zzR(null);
                    zzibVar.zzd().zze.zzb(null);
                }
                zzpoVarZzk = zzibVar.zzk();
                zzcuVar = this.zzb;
            } catch (RemoteException e11) {
                this.zzc.zzu.zzaV().zzb().zzb("Failed to get app instance id", e11);
            }
            zzpoVarZzk.zzal(zzcuVar, strZzm);
        } catch (Throwable th2) {
            zznk zznkVar3 = this.zzc;
            zznkVar3.zzu.zzk().zzal(this.zzb, null);
            throw th2;
        }
    }
}
