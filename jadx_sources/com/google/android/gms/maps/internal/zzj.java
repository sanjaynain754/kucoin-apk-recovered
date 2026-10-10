package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzj extends com.google.android.gms.internal.maps.zzb implements ILocationSourceDelegate {
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        zzaj zzaiVar;
        if (i11 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzaiVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                zzaiVar = iInterfaceQueryLocalInterface instanceof zzaj ? (zzaj) iInterfaceQueryLocalInterface : new zzai(strongBinder);
            }
            activate(zzaiVar);
        } else {
            if (i11 != 2) {
                return false;
            }
            deactivate();
        }
        parcel2.writeNoException();
        return true;
    }

    public zzj() {
        super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
    }
}
