package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzf implements AppMeasurementSdk.OnEventListener {
    final /* synthetic */ zzg zza;

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjp
    public final void onEvent(String str, String str2, Bundle bundle, long j11) {
        if (str == null || !zzc.zzc(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j11);
        bundle2.putBundle(ReportDataTable.COLUMN_PARAMS, bundle);
        this.zza.zzd().onMessageTriggered(3, bundle2);
    }

    public zzf(zzg zzgVar) {
        Objects.requireNonNull(zzgVar);
        this.zza = zzgVar;
    }
}
