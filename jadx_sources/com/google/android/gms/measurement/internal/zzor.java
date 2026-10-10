package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
abstract class zzor extends zzok {
    private boolean zza;

    public abstract boolean zzbb();

    public final boolean zzax() {
        return this.zza;
    }

    public final void zzaz() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzbb();
        this.zzg.zzae();
        this.zza = true;
    }

    public zzor(zzpf zzpfVar) {
        super(zzpfVar);
        this.zzg.zzad();
    }

    public final void zzay() {
        if (zzax()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }
}
