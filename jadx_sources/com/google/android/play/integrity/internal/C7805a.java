package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.a */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public class C7805a implements IInterface {

    /* JADX INFO: renamed from: a */
    private final IBinder f12086a;

    /* JADX INFO: renamed from: b */
    private final String f12087b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12086a;
    }

    /* JADX INFO: renamed from: b */
    public final void m13273b(int i11, Parcel parcel) throws RemoteException {
        try {
            this.f12086a.transact(i11, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public C7805a(IBinder iBinder, String str) {
        this.f12086a = iBinder;
        this.f12087b = str;
    }

    /* JADX INFO: renamed from: a */
    public final Parcel m13272a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f12087b);
        return parcelObtain;
    }
}
