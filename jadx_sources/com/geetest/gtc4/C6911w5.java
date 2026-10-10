package com.geetest.gtc4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.geetest.gtc4.w5 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6911w5 implements InterfaceC6777h6 {
    @Override // com.geetest.gtc4.InterfaceC6777h6
    /* JADX INFO: renamed from: a */
    public final String mo12656a(IBinder iBinder) {
        InterfaceC6902v5 c6884t5;
        int i11 = AbstractBinderC6893u5.f11525a;
        if (iBinder == null) {
            c6884t5 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bun.lib.MsaIdInterface");
            c6884t5 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6902v5)) ? new C6884t5(iBinder) : (InterfaceC6902v5) iInterfaceQueryLocalInterface;
        }
        if (c6884t5 == null) {
            throw new C6750e6("MsaIdInterface is null");
        }
        C6884t5 c6884t6 = (C6884t5) c6884t5;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
            c6884t6.f11518a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            boolean z11 = parcelObtain2.readInt() != 0;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            if (!z11) {
                throw new C6750e6("MsaIdInterface#isSupported return false");
            }
            Parcel parcelObtain3 = Parcel.obtain();
            Parcel parcelObtain4 = Parcel.obtain();
            try {
                parcelObtain3.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                c6884t6.f11518a.transact(3, parcelObtain3, parcelObtain4, 0);
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
