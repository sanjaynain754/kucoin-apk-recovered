package com.google.android.gms.internal.identity_credentials;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
public class zza implements IInterface {
    private final String mDescriptor;
    private final IBinder mRemote;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.mRemote;
    }

    public void transactOneway(int i11, Parcel parcel) throws RemoteException {
        try {
            this.mRemote.transact(i11, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public zza(IBinder iBinder, String str) {
        this.mRemote = iBinder;
        this.mDescriptor = str;
    }

    public Parcel obtainAndWriteInterfaceToken() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.mDescriptor);
        return parcelObtain;
    }

    public void transactAndReadExceptionReturnVoid(int i11, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.mRemote.transact(i11, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
