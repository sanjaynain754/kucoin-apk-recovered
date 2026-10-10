package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzmh implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzr zzb;
    final /* synthetic */ zznk zzc;

    public zzmh(zznk zznkVar, AtomicReference atomicReference, zzr zzrVar) {
        this.zza = atomicReference;
        this.zzb = zzrVar;
        Objects.requireNonNull(zznkVar);
        this.zzc = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.zza;
        synchronized (atomicReference2) {
            try {
                try {
                    zznk zznkVar = this.zzc;
                    zzib zzibVar = zznkVar.zzu;
                    if (zzibVar.zzd().zzl().zzo(zzjj.ANALYTICS_STORAGE)) {
                        zzga zzgaVarZzZ = zznkVar.zzZ();
                        if (zzgaVarZzZ != null) {
                            zzr zzrVar = this.zzb;
                            Preconditions.checkNotNull(zzrVar);
                            atomicReference2.set(zzgaVarZzZ.zzm(zzrVar));
                            String str = (String) atomicReference2.get();
                            if (str != null) {
                                zznkVar.zzu.zzj().zzR(str);
                                zzibVar.zzd().zze.zzb(str);
                            }
                            zznkVar.zzV();
                            atomicReference = this.zza;
                            atomicReference.notify();
                            return;
                        }
                        zzibVar.zzaV().zzb().zza("Failed to get app instance id");
                        atomicReference2.notify();
                    } else {
                        zzibVar.zzaV().zzh().zza("Analytics storage consent denied; will not get app instance id");
                        zznkVar.zzu.zzj().zzR(null);
                        zzibVar.zzd().zze.zzb(null);
                        atomicReference2.set(null);
                        atomicReference2.notify();
                    }
                } catch (RemoteException e11) {
                    this.zzc.zzu.zzaV().zzb().zzb("Failed to get app instance id", e11);
                    atomicReference = this.zza;
                }
            } catch (Throwable th2) {
                this.zza.notify();
                throw th2;
            }
        }
    }
}
