package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzbt extends com.google.android.gms.internal.maps.zzb implements zzbu {
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 == 1) {
            zzb((Bitmap) com.google.android.gms.internal.maps.zzc.zza(parcel, Bitmap.CREATOR));
        } else {
            if (i11 != 2) {
                return false;
            }
            zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }

    public zzbt() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }
}
