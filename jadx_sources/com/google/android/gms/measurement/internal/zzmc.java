package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzmc implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzr zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zznk zzd;

    public zzmc(zznk zznkVar, AtomicReference atomicReference, zzr zzrVar, boolean z11) {
        this.zza = atomicReference;
        this.zzb = zzrVar;
        this.zzc = z11;
        Objects.requireNonNull(zznkVar);
        this.zzd = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.zza;
        synchronized (atomicReference2) {
            try {
                try {
                    zznk zznkVar = this.zzd;
                    zzga zzgaVarZzZ = zznkVar.zzZ();
                    if (zzgaVarZzZ == null) {
                        zznkVar.zzu.zzaV().zzb().zza("Failed to get all user properties; not connected to service");
                        atomicReference2.notify();
                        return;
                    }
                    zzr zzrVar = this.zzb;
                    Preconditions.checkNotNull(zzrVar);
                    atomicReference2.set(zzgaVarZzZ.zzj(zzrVar, this.zzc));
                    zznkVar.zzV();
                    atomicReference = this.zza;
                    atomicReference.notify();
                } catch (RemoteException e11) {
                    this.zzd.zzu.zzaV().zzb().zzb("Failed to get all user properties; remote exception", e11);
                    atomicReference = this.zza;
                }
            } catch (Throwable th2) {
                this.zza.notify();
                throw th2;
            }
        }
    }
}
