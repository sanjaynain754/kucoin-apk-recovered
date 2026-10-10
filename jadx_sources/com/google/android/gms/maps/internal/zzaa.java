package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzaa extends com.google.android.gms.internal.maps.zzb implements zzab {
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 == 1) {
            zzb();
        } else {
            if (i11 != 2) {
                return false;
            }
            zzc(com.google.android.gms.internal.maps.zzq.zzb(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }

    public zzaa() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }
}
