package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzke implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzli zzc;

    public zzke(zzli zzliVar, AtomicReference atomicReference, boolean z11) {
        this.zza = atomicReference;
        this.zzb = z11;
        Objects.requireNonNull(zzliVar);
        this.zzc = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzu.zzt().zzv(this.zza, this.zzb);
    }
}
