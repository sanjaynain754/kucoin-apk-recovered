package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zznu implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzob zzb;

    public zznu(zzob zzobVar, long j11) {
        this.zza = j11;
        Objects.requireNonNull(zzobVar);
        this.zzb = zzobVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzl(this.zza);
    }
}
