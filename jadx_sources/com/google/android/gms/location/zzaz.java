package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzaz extends com.google.android.gms.internal.location.zzb implements zzba {
    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 == 1) {
            zzd((LocationResult) com.google.android.gms.internal.location.zzc.zzb(parcel, LocationResult.CREATOR));
        } else {
            if (i11 != 2) {
                return false;
            }
            zze((LocationAvailability) com.google.android.gms.internal.location.zzc.zzb(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }

    public zzaz() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static zzba zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof zzba ? (zzba) iInterfaceQueryLocalInterface : new zzay(iBinder);
    }
}
