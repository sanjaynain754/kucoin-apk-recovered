package com.geetest.gtc4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.geetest.gtc4.m5 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6821m5 implements InterfaceC6777h6 {
    @Override // com.geetest.gtc4.InterfaceC6777h6
    /* JADX INFO: renamed from: a */
    public final String mo12656a(IBinder iBinder) {
        InterfaceC6883t4 c6865r4;
        int i11 = AbstractBinderC6874s4.f11491a;
        if (iBinder == null) {
            c6865r4 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.zui.deviceidservice.IDeviceidInterface");
            c6865r4 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6883t4)) ? new C6865r4(iBinder) : (InterfaceC6883t4) iInterfaceQueryLocalInterface;
        }
        if (c6865r4 == null) {
            throw new C6750e6("IDeviceidInterface is null");
        }
        C6865r4 c6865r5 = (C6865r4) c6865r4;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
            c6865r5.f11479a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            boolean z11 = parcelObtain2.readInt() != 0;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            if (!z11) {
                throw new C6750e6("IDeviceidInterface#isSupport return false");
            }
            Parcel parcelObtain3 = Parcel.obtain();
            Parcel parcelObtain4 = Parcel.obtain();
            try {
                parcelObtain3.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                c6865r5.f11479a.transact(1, parcelObtain3, parcelObtain4, 0);
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
