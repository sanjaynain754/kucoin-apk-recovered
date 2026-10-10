package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhv implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzhy zza;
    private final String zzb;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.zza.zzu.zzaV().zzb().zzb(this.zzb, th2);
    }

    public zzhv(zzhy zzhyVar, String str) {
        Objects.requireNonNull(zzhyVar);
        this.zza = zzhyVar;
        Preconditions.checkNotNull(str);
        this.zzb = str;
    }
}
