package com.geetest.gtc4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.geetest.gtc4.x3 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6918x3 implements InterfaceC6777h6 {
    @Override // com.geetest.gtc4.InterfaceC6777h6
    /* JADX INFO: renamed from: a */
    public final String mo12656a(IBinder iBinder) {
        InterfaceC6802k4 c6784i4;
        int i11 = AbstractBinderC6793j4.f11408a;
        if (iBinder == null) {
            c6784i4 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            c6784i4 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6802k4)) ? new C6784i4(iBinder) : (InterfaceC6802k4) iInterfaceQueryLocalInterface;
        }
        C6784i4 c6784i5 = (C6784i4) c6784i4;
        c6784i5.getClass();
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            parcelObtain.writeInt(1);
            c6784i5.f11393a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.readInt();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            Parcel parcelObtain3 = Parcel.obtain();
            Parcel parcelObtain4 = Parcel.obtain();
            try {
                parcelObtain3.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                c6784i5.f11393a.transact(1, parcelObtain3, parcelObtain4, 0);
                parcelObtain4.readException();
                return parcelObtain4.readString();
            } finally {
                parcelObtain4.recycle();
                parcelObtain3.recycle();
            }
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }
}
