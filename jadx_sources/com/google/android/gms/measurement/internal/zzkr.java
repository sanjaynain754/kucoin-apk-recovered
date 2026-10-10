package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzkr implements Runnable {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzli zzb;

    public zzkr(zzli zzliVar, Boolean bool) {
        this.zza = bool;
        Objects.requireNonNull(zzliVar);
        this.zzb = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzai(this.zza, true);
    }
}
