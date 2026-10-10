package com.google.android.p066a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.a.b */
/* JADX INFO: compiled from: BaseStub.java */
/* JADX INFO: loaded from: classes45.dex */
public class BinderC6958b extends Binder implements IInterface {
    /* JADX INFO: renamed from: a */
    public boolean mo12808a(int i11, Parcel parcel, Parcel parcel2) throws RemoteException {
        throw null;
    }

    public BinderC6958b() {
        attachInterface(this, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
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
        return mo12808a(i11, parcel, parcel2);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
