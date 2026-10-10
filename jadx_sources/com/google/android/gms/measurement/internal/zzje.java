package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzje extends zzjd {
    private boolean zza;

    public abstract boolean zza();

    public final boolean zzv() {
        return this.zza;
    }

    public final void zzx() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zza()) {
            return;
        }
        this.zzu.zzG();
        this.zza = true;
    }

    public final void zzy() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzba();
        this.zzu.zzG();
        this.zza = true;
    }

    public zzje(zzib zzibVar) {
        super(zzibVar);
        this.zzu.zzF();
    }

    public final void zzw() {
        if (zzv()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public void zzba() {
    }
}
