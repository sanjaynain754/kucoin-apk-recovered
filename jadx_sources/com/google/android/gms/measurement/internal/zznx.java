package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zznx {
    final /* synthetic */ zzob zza;
    private zznw zzb;

    @WorkerThread
    public final void zza() {
        zzob zzobVar = this.zza;
        zzobVar.zzg();
        zznw zznwVar = this.zzb;
        if (zznwVar != null) {
            zzobVar.zzm().removeCallbacks(zznwVar);
        }
        zzib zzibVar = zzobVar.zzu;
        zzibVar.zzd().zzn.zzb(false);
        zzobVar.zzh(false);
        if (zzibVar.zzc().zzp(null, zzfx.zzaT)) {
            zzib zzibVar2 = zzobVar.zzu;
            if (zzibVar2.zzj().zzx()) {
                zzibVar.zzaV().zzk().zza("Retrying trigger URI registration in foreground");
                zzibVar2.zzj().zzz();
            }
        }
    }

    @WorkerThread
    public final void zzb(long j11) {
        zzob zzobVar = this.zza;
        this.zzb = new zznw(this, zzobVar.zzu.zzaZ().currentTimeMillis(), j11);
        zzobVar.zzm().postDelayed(this.zzb, 2000L);
    }

    public zznx(zzob zzobVar) {
        Objects.requireNonNull(zzobVar);
        this.zza = zzobVar;
    }
}
