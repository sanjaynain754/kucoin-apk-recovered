package com.geetest.gtc4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.geetest.gtc4.e4 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6748e4 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f11348a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11348a;
    }

    public C6748e4(IBinder iBinder) {
        this.f11348a = iBinder;
    }

    /* JADX INFO: renamed from: a */
    public final String m12629a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                if (!TextUtils.isEmpty(null)) {
                    parcelObtain.writeString(null);
                }
                if (!TextUtils.isEmpty(null)) {
                    parcelObtain.writeString(null);
                }
                if (!TextUtils.isEmpty(null)) {
                    parcelObtain.writeString(null);
                }
                this.f11348a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } catch (Exception unused) {
                return "";
            }
        } catch (Throwable unused2) {
            parcelObtain.recycle();
            parcelObtain2.recycle();
            return "";
        }
    }
}
