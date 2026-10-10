package com.geetest.gtc4;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.geetest.gtc4.d5 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6740d5 implements InterfaceC6936z4 {

    /* JADX INFO: renamed from: a */
    public final IBinder f11338a;

    @Override // com.geetest.gtc4.InterfaceC6936z4
    /* JADX INFO: renamed from: a */
    public final String mo12626a(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.oplus.stdid.IStdID");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeString("OUID");
            if (!this.f11338a.transact(1, parcelObtain, parcelObtain2, 0)) {
                int i11 = AbstractBinderC6749e5.f11349a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11338a;
    }

    public C6740d5(IBinder iBinder) {
        this.f11338a = iBinder;
    }
}
