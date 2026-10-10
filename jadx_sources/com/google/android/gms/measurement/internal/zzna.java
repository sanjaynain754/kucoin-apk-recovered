package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzna implements Runnable {
    final /* synthetic */ zzne zza;

    @Override // java.lang.Runnable
    public final void run() {
        zznk zznkVar = this.zza.zza;
        zzib zzibVar = zznkVar.zzu;
        Context contextZzaY = zzibVar.zzaY();
        zzibVar.zzaU();
        zznkVar.zzW(new ComponentName(contextZzaY, "com.google.android.gms.measurement.AppMeasurementService"));
    }

    public zzna(zzne zzneVar) {
        Objects.requireNonNull(zzneVar);
        this.zza = zzneVar;
    }
}
