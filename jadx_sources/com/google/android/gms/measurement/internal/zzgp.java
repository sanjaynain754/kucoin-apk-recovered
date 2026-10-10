package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.tencent.bugly.proguard.C33536a4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgp {
    private static zzgp zza;
    private final zzib zzb;
    private final TelemetryLoggingClient zzc;
    private final AtomicLong zzd = new AtomicLong(-1);

    public static zzgp zza(zzib zzibVar) {
        if (zza == null) {
            zza = new zzgp(zzibVar.zzaY(), zzibVar);
        }
        return zza;
    }

    public final synchronized void zzb(int i11, int i12, long j11, long j12, int i13) {
        final long jElapsedRealtime = this.zzb.zzaZ().elapsedRealtime();
        AtomicLong atomicLong = this.zzd;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= C33536a4.f68797g) {
            return;
        }
        this.zzc.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i12, 0, j11, j12, null, null, 0, i13)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.measurement.internal.zzgo
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(Exception exc) {
                this.zza.zzc(jElapsedRealtime, exc);
            }
        });
    }

    public final /* synthetic */ void zzc(long j11, Exception exc) {
        this.zzd.set(j11);
    }

    private zzgp(Context context, zzib zzibVar) {
        this.zzc = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("measurement:api").build());
        this.zzb = zzibVar;
    }
}
