package com.geetest.gtc4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.geetest.gtc4.r0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6861r0 implements InterfaceC6777h6 {
    @Override // com.geetest.gtc4.InterfaceC6777h6
    /* JADX INFO: renamed from: a */
    public final String mo12656a(IBinder iBinder) {
        InterfaceC6910w4 c6892u4;
        int i11 = AbstractBinderC6901v4.f11538a;
        if (iBinder == null) {
            c6892u4 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
            c6892u4 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6910w4)) ? new C6892u4(iBinder) : (InterfaceC6910w4) iInterfaceQueryLocalInterface;
        }
        if (c6892u4 == null) {
            throw new C6750e6("IDidAidlInterface is null");
        }
        C6892u4 c6892u5 = (C6892u4) c6892u4;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
            c6892u5.f11524a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            boolean z11 = parcelObtain2.readInt() != 0;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            if (!z11) {
                throw new C6750e6("IDidAidlInterface#isSupport return false");
            }
            Parcel parcelObtain3 = Parcel.obtain();
            Parcel parcelObtain4 = Parcel.obtain();
            try {
                parcelObtain3.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                c6892u5.f11524a.transact(3, parcelObtain3, parcelObtain4, 0);
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
