package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zznz {

    @VisibleForTesting
    protected long zza;

    @VisibleForTesting
    protected long zzb;
    final /* synthetic */ zzob zzc;
    private final zzay zzd;

    @WorkerThread
    public final void zza(long j11) {
        this.zzc.zzg();
        this.zzd.zzd();
        this.zza = j11;
        this.zzb = j11;
    }

    @WorkerThread
    public final void zzb(long j11) {
        this.zzd.zzd();
    }

    public final void zzc() {
        this.zzd.zzd();
        long jElapsedRealtime = this.zzc.zzu.zzaZ().elapsedRealtime();
        this.zza = jElapsedRealtime;
        this.zzb = jElapsedRealtime;
    }

    @WorkerThread
    public final boolean zzd(boolean z11, boolean z12, long j11) {
        zzob zzobVar = this.zzc;
        zzobVar.zzg();
        zzobVar.zzb();
        if (zzobVar.zzu.zzB()) {
            zzib zzibVar = zzobVar.zzu;
            zzibVar.zzd().zzk.zzb(zzibVar.zzaZ().currentTimeMillis());
        }
        long j12 = j11 - this.zza;
        if (!z11 && j12 < 1000) {
            zzobVar.zzu.zzaV().zzk().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j12));
            return false;
        }
        if (!z12) {
            j12 = j11 - this.zzb;
            this.zzb = j11;
        }
        zzib zzibVar2 = zzobVar.zzu;
        zzibVar2.zzaV().zzk().zzb("Recording user engagement, ms", Long.valueOf(j12));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j12);
        boolean z13 = !zzibVar2.zzc().zzv();
        zzib zzibVar3 = zzobVar.zzu;
        zzpo.zzav(zzibVar3.zzs().zzh(z13), bundle, true);
        if (!z12) {
            zzibVar3.zzj().zzF("auto", "_e", bundle);
        }
        this.zza = j11;
        zzay zzayVar = this.zzd;
        zzayVar.zzd();
        zzayVar.zzb(((Long) zzfx.zzaq.zzb(null)).longValue());
        return true;
    }

    public zznz(zzob zzobVar) {
        Objects.requireNonNull(zzobVar);
        this.zzc = zzobVar;
        this.zzd = new zzny(this, zzobVar.zzu);
        long jElapsedRealtime = zzobVar.zzu.zzaZ().elapsedRealtime();
        this.zza = jElapsedRealtime;
        this.zzb = jElapsedRealtime;
    }
}
