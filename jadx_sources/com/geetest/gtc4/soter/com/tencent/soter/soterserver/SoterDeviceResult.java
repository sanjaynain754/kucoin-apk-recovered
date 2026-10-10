package com.geetest.gtc4.soter.com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;
import com.geetest.gtc4.C6930y6;

/* JADX INFO: loaded from: classes45.dex */
public class SoterDeviceResult implements Parcelable {
    public static final Parcelable.Creator<SoterDeviceResult> CREATOR = new C6930y6();

    /* JADX INFO: renamed from: a */
    public final int f11493a;

    /* JADX INFO: renamed from: b */
    public final byte[] f11494b;

    /* JADX INFO: renamed from: c */
    public final int f11495c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f11493a);
        parcel.writeByteArray(this.f11494b);
        parcel.writeInt(this.f11495c);
    }

    public SoterDeviceResult(Parcel parcel) {
        this.f11493a = parcel.readInt();
        this.f11494b = parcel.createByteArray();
        this.f11495c = parcel.readInt();
    }
}
