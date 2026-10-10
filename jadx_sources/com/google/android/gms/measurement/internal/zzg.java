package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzg extends zzf {
    private boolean zza;

    public abstract boolean zze();

    public final boolean zza() {
        return this.zza;
    }

    public final void zzc() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zze()) {
            return;
        }
        this.zzu.zzG();
        this.zza = true;
    }

    public final void zzd() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzf();
        this.zzu.zzG();
        this.zza = true;
    }

    public zzg(zzib zzibVar) {
        super(zzibVar);
        this.zzu.zzF();
    }

    public final void zzb() {
        if (zza()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    @WorkerThread
    public void zzf() {
    }
}
