package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.sensorsdata.abtest.entity.AppConstants;
import com.tencent.qcloud.tuicore.TUIConstants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzlp extends zzg {
    private JobScheduler zza;

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    @TargetApi(24)
    @WorkerThread
    public final void zzf() {
        this.zza = (JobScheduler) this.zzu.zzaY().getSystemService("jobscheduler");
    }

    @VisibleForTesting
    public final int zzi() {
        return "measurement-client".concat(String.valueOf(this.zzu.zzaY().getPackageName())).hashCode();
    }

    public zzlp(zzib zzibVar) {
        super(zzibVar);
    }

    @TargetApi(24)
    @WorkerThread
    public final void zzh(long j11) {
        String str;
        zzb();
        zzg();
        JobScheduler jobScheduler = this.zza;
        if (jobScheduler != null && jobScheduler.getPendingJob(zzi()) != null) {
            this.zzu.zzaV().zzk().zza("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        com.google.android.gms.internal.measurement.zzin zzinVarZzj = zzj();
        if (zzinVarZzj == com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE) {
            zzib zzibVar = this.zzu;
            zzibVar.zzaV().zzk().zzb("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j11));
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString(TUIConstants.TIMPush.NOTIFICATION.ACTION, "com.google.android.gms.measurement.SCION_UPLOAD");
            int iSchedule = ((JobScheduler) Preconditions.checkNotNull(this.zza)).schedule(new JobInfo.Builder(zzi(), new ComponentName(zzibVar.zzaY(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j11).setOverrideDeadline(j11 + j11).setExtras(persistableBundle).build());
            zzgr zzgrVarZzk = zzibVar.zzaV().zzk();
            if (iSchedule == 1) {
                str = AppConstants.AB_TEST_SUCCESS;
            } else {
                str = "FAILURE";
            }
            zzgrVarZzk.zzb("[sgtm] Scion upload job scheduled with result", str);
            return;
        }
        this.zzu.zzaV().zzk().zzb("[sgtm] Not eligible for Scion upload", zzinVarZzj.name());
    }

    @WorkerThread
    public final com.google.android.gms.internal.measurement.zzin zzj() {
        zzb();
        zzg();
        if (this.zza != null) {
            zzib zzibVar = this.zzu;
            if (zzibVar.zzc().zzx()) {
                zzib zzibVar2 = this.zzu;
                if (zzibVar2.zzv().zzn() >= 119000) {
                    if (!zzpo.zzR(zzibVar.zzaY(), "com.google.android.gms.measurement.AppMeasurementJobService")) {
                        return com.google.android.gms.internal.measurement.zzin.MEASUREMENT_SERVICE_NOT_ENABLED;
                    }
                    if (!zzibVar2.zzt().zzK()) {
                        return com.google.android.gms.internal.measurement.zzin.NON_PLAY_MODE;
                    }
                    return com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE;
                }
                return com.google.android.gms.internal.measurement.zzin.SDK_TOO_OLD;
            }
            return com.google.android.gms.internal.measurement.zzin.NOT_ENABLED_IN_MANIFEST;
        }
        return com.google.android.gms.internal.measurement.zzin.MISSING_JOB_SCHEDULER;
    }
}
