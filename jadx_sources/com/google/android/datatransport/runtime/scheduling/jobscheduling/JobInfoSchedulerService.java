package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.util.PriorityMapping;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i11 = jobParameters.getExtras().getInt("priority");
        int i12 = jobParameters.getExtras().getInt("attemptNumber");
        TransportRuntime.initialize(getApplicationContext());
        TransportContext.Builder priority = TransportContext.builder().setBackendName(string).setPriority(PriorityMapping.valueOf(i11));
        if (string2 != null) {
            priority.setExtras(Base64.decode(string2, 0));
        }
        TransportRuntime.getInstance().getUploader().upload(priority.build(), i12, new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f11616b.jobFinished(jobParameters, false);
            }
        });
        return true;
    }
}
