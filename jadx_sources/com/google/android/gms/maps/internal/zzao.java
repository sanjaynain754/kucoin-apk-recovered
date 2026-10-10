package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzao extends com.google.android.gms.internal.maps.zzb implements zzap {
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 1) {
            return false;
        }
        zzb((LatLng) com.google.android.gms.internal.maps.zzc.zza(parcel, LatLng.CREATOR));
        parcel2.writeNoException();
        return true;
    }

    public zzao() {
        super("com.google.android.gms.maps.internal.IOnMapLongClickListener");
    }
}
