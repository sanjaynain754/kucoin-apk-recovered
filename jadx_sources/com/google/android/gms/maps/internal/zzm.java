package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzm extends com.google.android.gms.internal.maps.zzb implements zzn {
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 1) {
            return false;
        }
        zzb((CameraPosition) com.google.android.gms.internal.maps.zzc.zza(parcel, CameraPosition.CREATOR));
        parcel2.writeNoException();
        return true;
    }

    public zzm() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }
}
