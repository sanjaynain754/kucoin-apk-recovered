package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzmo implements Runnable {
    final /* synthetic */ zzbg zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcu zzc;
    final /* synthetic */ zznk zzd;

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzcu zzcuVar;
        zzpo zzpoVarZzk;
        byte[] bArrZzk = null;
        try {
            try {
                zznk zznkVar = this.zzd;
                zzga zzgaVarZzZ = zznkVar.zzZ();
                if (zzgaVarZzZ == null) {
                    zzib zzibVar = zznkVar.zzu;
                    zzibVar.zzaV().zzb().zza("Discarding data. Failed to send event to service to bundle");
                    zzpoVarZzk = zzibVar.zzk();
                    zzcuVar = this.zzc;
                } else {
                    bArrZzk = zzgaVarZzZ.zzk(this.zza, this.zzb);
                    zznkVar.zzV();
                    zznk zznkVar2 = this.zzd;
                    zzcuVar = this.zzc;
                    zzpoVarZzk = zznkVar2.zzu.zzk();
                }
            } catch (RemoteException e11) {
                this.zzd.zzu.zzaV().zzb().zzb("Failed to send event to the service to bundle", e11);
            }
            zzpoVarZzk.zzao(zzcuVar, bArrZzk);
        } catch (Throwable th2) {
            zznk zznkVar3 = this.zzd;
            zznkVar3.zzu.zzk().zzao(this.zzc, null);
            throw th2;
        }
    }

    public zzmo(zznk zznkVar, zzbg zzbgVar, String str, com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        this.zza = zzbgVar;
        this.zzb = str;
        this.zzc = zzcuVar;
        Objects.requireNonNull(zznkVar);
        this.zzd = zznkVar;
    }
}
