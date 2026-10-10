package com.geetest.gtc4.soter.com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;
import com.geetest.gtc4.C6769g7;

/* JADX INFO: loaded from: classes45.dex */
public class SoterSignResult implements Parcelable {
    public static final Parcelable.Creator<SoterSignResult> CREATOR = new C6769g7();

    /* JADX INFO: renamed from: a */
    public final int f11502a;

    /* JADX INFO: renamed from: b */
    public final byte[] f11503b;

    /* JADX INFO: renamed from: c */
    public final int f11504c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f11502a);
        parcel.writeByteArray(this.f11503b);
        parcel.writeInt(this.f11504c);
    }

    public SoterSignResult(Parcel parcel) {
        this.f11502a = parcel.readInt();
        this.f11503b = parcel.createByteArray();
        this.f11504c = parcel.readInt();
    }
}
