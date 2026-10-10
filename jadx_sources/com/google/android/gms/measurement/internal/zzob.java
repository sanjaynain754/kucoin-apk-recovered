package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzob extends zzg {
    protected final zzoa zza;
    protected final zznz zzb;
    protected final zznx zzc;
    private Handler zzd;
    private boolean zze;

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final /* synthetic */ Handler zzm() {
        return this.zzd;
    }

    public zzob(zzib zzibVar) {
        super(zzibVar);
        this.zze = true;
        this.zza = new zzoa(this);
        this.zzb = new zznz(this);
        this.zzc = new zznx(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzj() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzcn(Looper.getMainLooper());
        }
    }

    @WorkerThread
    public final void zzh(boolean z11) {
        zzg();
        this.zze = z11;
    }

    @WorkerThread
    public final boolean zzi() {
        zzg();
        return this.zze;
    }

    public final /* synthetic */ void zzk(long j11) {
        zzg();
        zzj();
        zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzk().zzb("Activity resumed, time", Long.valueOf(j11));
        if (zzibVar.zzc().zzp(null, zzfx.zzaU)) {
            if (zzibVar.zzc().zzv() || this.zze) {
                this.zzb.zza(j11);
            }
        } else if (zzibVar.zzc().zzv() || zzibVar.zzd().zzn.zza()) {
            this.zzb.zza(j11);
        }
        this.zzc.zza();
        zzoa zzoaVar = this.zza;
        zzob zzobVar = zzoaVar.zza;
        zzobVar.zzg();
        if (!zzobVar.zzu.zzB()) {
            return;
        }
        zzoaVar.zzb(zzobVar.zzu.zzaZ().currentTimeMillis(), false);
    }

    public final /* synthetic */ void zzl(long j11) {
        zzg();
        zzj();
        zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzk().zzb("Activity paused, time", Long.valueOf(j11));
        this.zzc.zzb(j11);
        if (zzibVar.zzc().zzv()) {
            this.zzb.zzb(j11);
        }
    }
}
