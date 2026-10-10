package com.geetest.gtc4.soter.com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;
import com.geetest.gtc4.C6760f7;

/* JADX INFO: loaded from: classes45.dex */
public class SoterSessionResult implements Parcelable {
    public static final Parcelable.Creator<SoterSessionResult> CREATOR = new C6760f7();

    /* JADX INFO: renamed from: a */
    public final long f11500a;

    /* JADX INFO: renamed from: b */
    public final int f11501b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f11500a);
        parcel.writeInt(this.f11501b);
    }

    public SoterSessionResult(Parcel parcel) {
        this.f11500a = parcel.readLong();
        this.f11501b = parcel.readInt();
    }
}
