package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public class zzbm extends Binder implements IInterface {
    public boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        throw null;
    }

    public zzbm(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 > 16777215) {
            if (super.onTransact(i11, parcel, parcel2, i12)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return zza(i11, parcel, parcel2, i12);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
