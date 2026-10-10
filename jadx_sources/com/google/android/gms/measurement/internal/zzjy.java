package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzjy implements Runnable {
    final /* synthetic */ zzli zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zza();
    }

    public zzjy(zzli zzliVar) {
        Objects.requireNonNull(zzliVar);
        this.zza = zzliVar;
    }
}
