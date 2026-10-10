package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzmb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzr zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcu zze;
    final /* synthetic */ zznk zzf;

    public zzmb(zznk zznkVar, String str, String str2, zzr zzrVar, boolean z11, com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzrVar;
        this.zzd = z11;
        this.zze = zzcuVar;
        Objects.requireNonNull(zznkVar);
        this.zzf = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e11;
        Bundle bundle2 = new Bundle();
        try {
            zznk zznkVar = this.zzf;
            zzga zzgaVarZzZ = zznkVar.zzZ();
            if (zzgaVarZzZ == null) {
                zzib zzibVar = zznkVar.zzu;
                zzibVar.zzaV().zzb().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                zzibVar.zzk().zzaq(this.zze, bundle2);
                return;
            }
            zzr zzrVar = this.zzc;
            Preconditions.checkNotNull(zzrVar);
            List<zzpk> listZzp = zzgaVarZzZ.zzp(this.zza, this.zzb, this.zzd, zzrVar);
            int i11 = zzpo.zza;
            bundle = new Bundle();
            if (listZzp != null) {
                for (zzpk zzpkVar : listZzp) {
                    String str = zzpkVar.zze;
                    if (str != null) {
                        bundle.putString(zzpkVar.zzb, str);
                    } else {
                        Long l11 = zzpkVar.zzd;
                        if (l11 != null) {
                            bundle.putLong(zzpkVar.zzb, l11.longValue());
                        } else {
                            Double d11 = zzpkVar.zzg;
                            if (d11 != null) {
                                bundle.putDouble(zzpkVar.zzb, d11.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    zznkVar.zzV();
                    zzib zzibVar2 = zznkVar.zzu;
                    zzibVar2.zzk().zzaq(this.zze, bundle);
                } catch (RemoteException e12) {
                    e11 = e12;
                    this.zzf.zzu.zzaV().zzb().zzc("Failed to get user properties; remote exception", this.zza, e11);
                    zznk zznkVar2 = this.zzf;
                    zznkVar2.zzu.zzk().zzaq(this.zze, bundle);
                }
            } catch (Throwable th2) {
                th = th2;
                bundle2 = bundle;
                zznk zznkVar3 = this.zzf;
                zznkVar3.zzu.zzk().zzaq(this.zze, bundle2);
                throw th;
            }
        } catch (RemoteException e13) {
            bundle = bundle2;
            e11 = e13;
        } catch (Throwable th3) {
            th = th3;
            zznk zznkVar4 = this.zzf;
            zznkVar4.zzu.zzk().zzaq(this.zze, bundle2);
            throw th;
        }
    }
}
