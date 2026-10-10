package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzay {
    private static volatile Handler zzb;
    private final zzjf zza;
    private final Runnable zzc;
    private volatile long zzd;

    public abstract void zza();

    private final Handler zzf() {
        Handler handler;
        if (zzb != null) {
            return zzb;
        }
        synchronized (zzay.class) {
            try {
                if (zzb == null) {
                    zzb = new com.google.android.gms.internal.measurement.zzcn(this.zza.zzaY().getMainLooper());
                }
                handler = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final boolean zzc() {
        return this.zzd != 0;
    }

    public final void zzd() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    public final /* synthetic */ void zze(long j11) {
        this.zzd = 0L;
    }

    public zzay(zzjf zzjfVar) {
        Preconditions.checkNotNull(zzjfVar);
        this.zza = zzjfVar;
        this.zzc = new zzax(this, zzjfVar);
    }

    public final void zzb(long j11) {
        zzd();
        if (j11 >= 0) {
            zzjf zzjfVar = this.zza;
            this.zzd = zzjfVar.zzaZ().currentTimeMillis();
            if (!zzf().postDelayed(this.zzc, j11)) {
                zzjfVar.zzaV().zzb().zzb("Failed to schedule delayed post. time", Long.valueOf(j11));
            }
        }
    }
}
