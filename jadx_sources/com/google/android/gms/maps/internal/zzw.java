package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzw extends com.google.android.gms.internal.maps.zzb implements zzx {
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 1) {
            return false;
        }
        zzb(com.google.android.gms.internal.maps.zzk.zzb(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }

    public zzw() {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener");
    }
}
