package com.google.android.gms.internal.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes.dex */
public class zab extends Binder implements IInterface {
    public boolean zaa(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        throw null;
    }

    public zab(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 > 16777215) {
            if (super.onTransact(i11, parcel, parcel2, i12)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return zaa(i11, parcel, parcel2, i12);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
