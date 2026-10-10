package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzah extends zzb implements zzai {
    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 == 1) {
            zzb((zzaa) zzc.zzb(parcel, zzaa.CREATOR));
        } else {
            if (i11 != 2) {
                return false;
            }
            zzc();
        }
        return true;
    }

    public zzah() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }
}
