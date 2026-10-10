package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zzns;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class AppMeasurementService extends Service implements zzno {
    private zzns zza;

    private final zzns zzd() {
        if (this.zza == null) {
            this.zza = new zzns(this);
        }
        return this.zza;
    }

    @Override // com.google.android.gms.measurement.internal.zzno
    public final void zzb(@NonNull JobParameters jobParameters, boolean z11) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    @Nullable
    @MainThread
    public IBinder onBind(@NonNull Intent intent) {
        return zzd().zzd(intent);
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

    @Override // android.app.Service
    @MainThread
    public int onStartCommand(@NonNull Intent intent, int i11, int i12) {
        zzd().zzc(intent, i11, i12);
        return 2;
    }

    @Override // android.app.Service
    @MainThread
    public boolean onUnbind(@NonNull Intent intent) {
        zzd();
        zzns.zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzno
    public final boolean zza(int i11) {
        return stopSelfResult(i11);
    }

    @Override // com.google.android.gms.measurement.internal.zzno
    public final void zzc(@NonNull Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }
}
