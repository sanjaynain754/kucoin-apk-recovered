package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzbb extends com.google.android.gms.internal.location.zza implements zzbd {
    @Override // com.google.android.gms.location.zzbd
    public final void zzd(Location location) throws RemoteException {
        throw null;
    }

    public zzbb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }
}
