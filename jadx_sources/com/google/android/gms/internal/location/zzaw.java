package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.location.LocationStatusCodes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzaw extends zzaj {
    private BaseImplementation.ResultHolder<Status> zza;

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i11, String[] strArr) {
        if (this.zza == null) {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times", new Exception());
            return;
        }
        this.zza.setResult(LocationStatusCodes.zzb(LocationStatusCodes.zza(i11)));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i11, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult", new Exception());
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i11, PendingIntent pendingIntent) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult", new Exception());
    }

    public zzaw(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.zza = resultHolder;
    }
}
