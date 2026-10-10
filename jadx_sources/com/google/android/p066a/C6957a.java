package com.google.android.p066a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.a.a */
/* JADX INFO: compiled from: BaseProxy.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6957a implements IInterface {

    /* JADX INFO: renamed from: a */
    private final IBinder f11612a;

    /* JADX INFO: renamed from: b */
    private final String f11613b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11612a;
    }

    public C6957a(IBinder iBinder) {
        this.f11612a = iBinder;
    }

    /* JADX INFO: renamed from: a */
    public final Parcel m12806a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f11613b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: b */
    public final Parcel m12807b(Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f11612a.transact(1, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e11) {
                parcelObtain.recycle();
                throw e11;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }
}
