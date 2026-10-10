package com.geetest.gtc4.soter.com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;
import com.geetest.gtc4.C6715a7;

/* JADX INFO: loaded from: classes45.dex */
public class SoterExtraParam implements Parcelable {
    public static final Parcelable.Creator<SoterExtraParam> CREATOR = new C6715a7();

    /* JADX INFO: renamed from: a */
    public final Object f11499a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeValue(this.f11499a);
    }

    public SoterExtraParam(Parcel parcel) {
        this.f11499a = parcel.readValue(getClass().getClassLoader());
    }
}
