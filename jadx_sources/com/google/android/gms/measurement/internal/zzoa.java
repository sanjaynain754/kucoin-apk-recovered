package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzoa {
    final /* synthetic */ zzob zza;

    @WorkerThread
    public final void zza() {
        zzob zzobVar = this.zza;
        zzobVar.zzg();
        zzib zzibVar = zzobVar.zzu;
        if (zzibVar.zzd().zzp(zzibVar.zzaZ().currentTimeMillis())) {
            zzibVar.zzd().zzg.zzb(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                zzibVar.zzaV().zzk().zza("Detected application was in foreground");
                zzc(zzibVar.zzaZ().currentTimeMillis(), false);
            }
        }
    }

    @WorkerThread
    public final void zzb(long j11, boolean z11) {
        zzob zzobVar = this.zza;
        zzobVar.zzg();
        zzobVar.zzj();
        zzib zzibVar = zzobVar.zzu;
        if (zzibVar.zzd().zzp(j11)) {
            zzibVar.zzd().zzg.zzb(true);
            zzobVar.zzu.zzv().zzi();
        }
        zzibVar.zzd().zzk.zzb(j11);
        if (zzibVar.zzd().zzg.zza()) {
            zzc(j11, z11);
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzc(long j11, boolean z11) {
        zzob zzobVar = this.zza;
        zzobVar.zzg();
        if (zzobVar.zzu.zzB()) {
            zzib zzibVar = zzobVar.zzu;
            zzibVar.zzd().zzk.zzb(j11);
            zzibVar.zzaV().zzk().zzb("Session started, time", Long.valueOf(zzibVar.zzaZ().elapsedRealtime()));
            long j12 = j11 / 1000;
            zzib zzibVar2 = zzobVar.zzu;
            zzibVar2.zzj().zzN("auto", "_sid", Long.valueOf(j12), j11);
            zzibVar.zzd().zzl.zzb(j12);
            zzibVar.zzd().zzg.zzb(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j12);
            zzibVar2.zzj().zzG("auto", "_s", j11, bundle);
            String strZza = zzibVar.zzd().zzq.zza();
            if (TextUtils.isEmpty(strZza)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strZza);
            zzibVar2.zzj().zzG("auto", "_ssr", j11, bundle2);
        }
    }

    public zzoa(zzob zzobVar) {
        Objects.requireNonNull(zzobVar);
        this.zza = zzobVar;
    }
}
