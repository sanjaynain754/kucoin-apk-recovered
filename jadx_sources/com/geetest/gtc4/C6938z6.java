package com.geetest.gtc4;

import android.os.Parcel;
import android.os.Parcelable;
import com.geetest.gtc4.soter.com.tencent.soter.soterserver.SoterExportResult;

/* JADX INFO: renamed from: com.geetest.gtc4.z6 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6938z6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new SoterExportResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new SoterExportResult[i11];
    }
}
