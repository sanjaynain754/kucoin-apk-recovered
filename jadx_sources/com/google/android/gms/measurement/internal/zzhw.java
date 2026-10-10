package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhw extends FutureTask implements Comparable {
    final boolean zza;
    final /* synthetic */ zzhy zzb;
    private final long zzc;
    private final String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhw(zzhy zzhyVar, Runnable runnable, boolean z11, String str) {
        super(runnable, null);
        Objects.requireNonNull(zzhyVar);
        this.zzb = zzhyVar;
        Preconditions.checkNotNull(str);
        long andIncrement = zzhy.zzj.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z11;
        if (andIncrement == Long.MAX_VALUE) {
            zzhyVar.zzu.zzaV().zzb().zza("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        zzhw zzhwVar = (zzhw) obj;
        boolean z11 = zzhwVar.zza;
        boolean z12 = this.zza;
        if (z12 != z11) {
            return !z12 ? 1 : -1;
        }
        long j11 = this.zzc;
        long j12 = zzhwVar.zzc;
        if (j11 < j12) {
            return -1;
        }
        if (j11 > j12) {
            return 1;
        }
        this.zzb.zzu.zzaV().zzc().zzb("Two tasks share the same index. index", Long.valueOf(j11));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzu.zzaV().zzb().zzb(this.zzd, th2);
        if ((th2 instanceof zzhu) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
        }
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhw(zzhy zzhyVar, Callable callable, boolean z11, String str) {
        super(callable);
        Objects.requireNonNull(zzhyVar);
        this.zzb = zzhyVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = zzhy.zzj.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z11;
        if (andIncrement == Long.MAX_VALUE) {
            zzhyVar.zzu.zzaV().zzb().zza("Tasks index overflow");
        }
    }
}
