package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjl;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.5.0 */
/* JADX INFO: loaded from: classes56.dex */
final class zzd implements AppMeasurementSdk.OnEventListener {
    final /* synthetic */ zze zza;

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjp
    public final void onEvent(String str, String str2, Bundle bundle, long j11) {
        zze zzeVar = this.zza;
        if (zzeVar.zza.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i11 = zzc.zza;
            String strZza = zzjl.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString(DbParams.TABLE_EVENTS, str2);
            zzeVar.zzd().onMessageTriggered(2, bundle2);
        }
    }

    public zzd(zze zzeVar) {
        Objects.requireNonNull(zzeVar);
        this.zza = zzeVar;
    }
}
