package com.geetest.gtc4;

import android.os.Parcel;
import android.os.Parcelable;
import com.geetest.gtc4.soter.com.tencent.soter.soterserver.SoterDeviceResult;

/* JADX INFO: renamed from: com.geetest.gtc4.y6 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6930y6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new SoterDeviceResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new SoterDeviceResult[i11];
    }
}
