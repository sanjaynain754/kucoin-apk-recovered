package com.geetest.gtc4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.geetest.gtc4.s6 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6876s6 implements InterfaceC6777h6 {
    @Override // com.geetest.gtc4.InterfaceC6777h6
    /* JADX INFO: renamed from: a */
    public final String mo12656a(IBinder iBinder) {
        InterfaceC6856q4 c6838o4;
        int i11 = AbstractBinderC6847p4.f11466a;
        if (iBinder == null) {
            c6838o4 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            c6838o4 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6856q4)) ? new C6838o4(iBinder) : (InterfaceC6856q4) iInterfaceQueryLocalInterface;
        }
        if (c6838o4 == null) {
            throw new C6750e6("IDeviceIdService is null");
        }
        C6838o4 c6838o5 = (C6838o4) c6838o4;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
            c6838o5.f11449a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
