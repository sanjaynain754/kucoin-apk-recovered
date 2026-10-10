package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzba extends com.google.android.gms.internal.maps.zzb implements zzbb {
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 1) {
            return false;
        }
        zzb((Location) com.google.android.gms.internal.maps.zzc.zza(parcel, Location.CREATOR));
        parcel2.writeNoException();
        return true;
    }

    public zzba() {
        super("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
    }
}
