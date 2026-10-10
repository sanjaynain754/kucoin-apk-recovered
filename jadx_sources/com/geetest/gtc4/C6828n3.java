package com.geetest.gtc4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.geetest.gtc4.n3 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6828n3 implements InterfaceC6777h6 {
    @Override // com.geetest.gtc4.InterfaceC6777h6
    /* JADX INFO: renamed from: a */
    public final String mo12656a(IBinder iBinder) {
        InterfaceC6776h5 c6758f5;
        int i11 = AbstractBinderC6767g5.f11374a;
        if (iBinder == null) {
            c6758f5 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.creator.IdsSupplier");
            c6758f5 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6776h5)) ? new C6758f5(iBinder) : (InterfaceC6776h5) iInterfaceQueryLocalInterface;
        }
        if (c6758f5 == null) {
            throw new C6750e6("IdsSupplier is null");
        }
        C6758f5 c6758f6 = (C6758f5) c6758f5;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.android.creator.IdsSupplier");
            c6758f6.f11361a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
