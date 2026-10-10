package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzas extends com.google.android.gms.internal.maps.zzb implements zzat {
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 1) {
            return false;
        }
        boolean zZzb = zzb(com.google.android.gms.internal.maps.zzw.zzb(parcel.readStrongBinder()));
        parcel2.writeNoException();
        com.google.android.gms.internal.maps.zzc.zzc(parcel2, zZzb);
        return true;
    }

    public zzas() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }
}
