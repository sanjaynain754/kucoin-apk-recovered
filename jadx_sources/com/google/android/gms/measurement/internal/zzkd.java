package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzkd implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzli zzb;

    public zzkd(zzli zzliVar, AtomicReference atomicReference) {
        this.zza = atomicReference;
        Objects.requireNonNull(zzliVar);
        this.zzb = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            try {
                try {
                    zzli zzliVar = this.zzb;
                    atomicReference.set(Boolean.valueOf(zzliVar.zzu.zzc().zzp(zzliVar.zzu.zzv().zzj(), zzfx.zzaa)));
                    this.zza.notify();
                } catch (Throwable th2) {
                    this.zza.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
