package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzh extends com.google.android.gms.internal.maps.zzb implements zzi {
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 == 1) {
            IObjectWrapper iObjectWrapperZzc = zzc(com.google.android.gms.internal.maps.zzw.zzb(parcel.readStrongBinder()));
            parcel2.writeNoException();
            com.google.android.gms.internal.maps.zzc.zzf(parcel2, iObjectWrapperZzc);
        } else {
            if (i11 != 2) {
                return false;
            }
            IObjectWrapper iObjectWrapperZzb = zzb(com.google.android.gms.internal.maps.zzw.zzb(parcel.readStrongBinder()));
            parcel2.writeNoException();
            com.google.android.gms.internal.maps.zzc.zzf(parcel2, iObjectWrapperZzb);
        }
        return true;
    }

    public zzh() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }
}
