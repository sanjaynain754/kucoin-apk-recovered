package com.google.android.play.integrity.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.b */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public class BinderC7820b extends Binder implements IInterface {
    /* JADX INFO: renamed from: a */
    public boolean mo13306a(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        throw null;
    }

    public BinderC7820b(String str) {
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
        return mo13306a(i11, parcel, parcel2, i12);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
