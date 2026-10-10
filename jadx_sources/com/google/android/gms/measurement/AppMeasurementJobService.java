package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zzns;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements zzno {
    private zzns zza;

    @Override // android.app.job.JobService
    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzno
    @TargetApi(24)
    public final void zzb(@NonNull JobParameters jobParameters, boolean z11) {
        jobFinished(jobParameters, false);
    }

    private final zzns zzd() {
        if (this.zza == null) {
            this.zza = new zzns(this);
        }
        return this.zza;
    }

    @Override // com.google.android.gms.measurement.internal.zzno
    public final boolean zza(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    @MainThread
    public void onCreate() {
        super.onCreate();
        zzd().zza();
    }

    @Override // android.app.Service
    @MainThread
    public void onDestroy() {
        zzd().zzb();
        super.onDestroy();
    }

    @Override // android.app.Service
    @MainThread
    public void onRebind(@NonNull Intent intent) {
        zzd();
        zzns.zzi(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@NonNull JobParameters jobParameters) {
        zzd().zze(jobParameters);
        return true;
    }

    @Override // android.app.Service
    @MainThread
    public boolean onUnbind(@NonNull Intent intent) {
        zzd();
        zzns.zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzno
    public final void zzc(@NonNull Intent intent) {
    }
}
