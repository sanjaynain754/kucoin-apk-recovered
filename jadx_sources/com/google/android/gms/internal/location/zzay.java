package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationSettingsResult;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzay extends zzan {
    private BaseImplementation.ResultHolder<LocationSettingsResult> zza;

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(LocationSettingsResult locationSettingsResult) throws RemoteException {
        this.zza.setResult(locationSettingsResult);
        this.zza = null;
    }

    public zzay(BaseImplementation.ResultHolder<LocationSettingsResult> resultHolder) {
        boolean z11;
        if (resultHolder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "listener can't be null.");
        this.zza = resultHolder;
    }
}
