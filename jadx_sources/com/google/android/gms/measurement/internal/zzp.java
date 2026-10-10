package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzp implements zzjo {
    public final com.google.android.gms.internal.measurement.zzda zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    @Override // com.google.android.gms.measurement.internal.zzjo
    public final void interceptEvent(String str, String str2, Bundle bundle, long j11) {
        try {
            this.zza.zze(str, str2, bundle, j11);
        } catch (RemoteException e11) {
            zzib zzibVar = this.zzb.zza;
            if (zzibVar != null) {
                zzibVar.zzaV().zze().zzb("Event interceptor threw exception", e11);
            }
        }
    }

    public zzp(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzda zzdaVar) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzdaVar;
    }
}
