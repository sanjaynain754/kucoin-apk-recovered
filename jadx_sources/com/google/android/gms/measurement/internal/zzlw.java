package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzlw implements Runnable {
    final /* synthetic */ zzma zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzma zzmaVar = this.zza;
        zzmaVar.zza = zzmaVar.zzw();
    }

    public zzlw(zzma zzmaVar) {
        Objects.requireNonNull(zzmaVar);
        this.zza = zzmaVar;
    }
}
