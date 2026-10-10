package com.geetest.gtc4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.geetest.gtc4.v1 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6898v1 implements InterfaceC6777h6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6907w1 f11534a;

    public C6898v1(C6907w1 c6907w1) {
        this.f11534a = c6907w1;
    }

    @Override // com.geetest.gtc4.InterfaceC6777h6
    /* JADX INFO: renamed from: a */
    public final String mo12656a(IBinder iBinder) {
        InterfaceC6829n4 c6811l4;
        int i11 = AbstractBinderC6820m4.f11436a;
        if (iBinder == null) {
            c6811l4 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.coolpad.deviceidsupport.IDeviceIdManager");
            c6811l4 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6829n4)) ? new C6811l4(iBinder) : (InterfaceC6829n4) iInterfaceQueryLocalInterface;
        }
        if (c6811l4 == null) {
            throw new C6750e6("IDeviceIdManager is null");
        }
        String packageName = this.f11534a.f11541a.getPackageName();
        C6811l4 c6811l5 = (C6811l4) c6811l4;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.coolpad.deviceidsupport.IDeviceIdManager");
            parcelObtain.writeString(packageName);
            c6811l5.f11428a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
