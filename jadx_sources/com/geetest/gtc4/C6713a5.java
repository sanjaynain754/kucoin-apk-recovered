package com.geetest.gtc4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.geetest.gtc4.soter.com.tencent.soter.soterserver.SoterDeviceResult;

/* JADX INFO: renamed from: com.geetest.gtc4.a5 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6713a5 implements InterfaceC6731c5 {

    /* JADX INFO: renamed from: a */
    public final IBinder f11306a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11306a;
    }

    public C6713a5(IBinder iBinder) {
        this.f11306a = iBinder;
    }

    /* JADX INFO: renamed from: a */
    public final SoterDeviceResult m12603a() {
        SoterDeviceResult soterDeviceResultCreateFromParcel;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
            this.f11306a.transact(11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            Parcelable.Creator<SoterDeviceResult> creator = SoterDeviceResult.CREATOR;
            if (parcelObtain2.readInt() != 0) {
                soterDeviceResultCreateFromParcel = creator.createFromParcel(parcelObtain2);
            } else {
                soterDeviceResultCreateFromParcel = null;
            }
            return soterDeviceResultCreateFromParcel;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
