package com.google.android.gms.measurement.internal;

import androidx.annotation.BinderThread;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzme extends zzgf {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zznk zzb;

    public zzme(zznk zznkVar, AtomicReference atomicReference) {
        this.zza = atomicReference;
        Objects.requireNonNull(zznkVar);
        this.zzb = zznkVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgg
    @BinderThread
    public final void zze(zzop zzopVar) {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            this.zzb.zzu.zzaV().zzk().zzb("[sgtm] Got upload batches from service. count", Integer.valueOf(zzopVar.zza.size()));
            atomicReference.set(zzopVar);
            atomicReference.notifyAll();
        }
    }
}
