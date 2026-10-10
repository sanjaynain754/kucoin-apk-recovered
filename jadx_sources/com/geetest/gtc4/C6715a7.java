package com.geetest.gtc4;

import android.os.Parcel;
import android.os.Parcelable;
import com.geetest.gtc4.soter.com.tencent.soter.soterserver.SoterExtraParam;

/* JADX INFO: renamed from: com.geetest.gtc4.a7 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6715a7 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new SoterExtraParam(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new SoterExtraParam[i11];
    }
}
