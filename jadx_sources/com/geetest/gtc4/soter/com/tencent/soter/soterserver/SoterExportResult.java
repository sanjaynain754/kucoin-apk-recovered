package com.geetest.gtc4.soter.com.tencent.soter.soterserver;

import android.os.Parcel;
import android.os.Parcelable;
import com.geetest.gtc4.C6938z6;

/* JADX INFO: loaded from: classes45.dex */
public class SoterExportResult implements Parcelable {
    public static final Parcelable.Creator<SoterExportResult> CREATOR = new C6938z6();

    /* JADX INFO: renamed from: a */
    public final int f11496a;

    /* JADX INFO: renamed from: b */
    public final byte[] f11497b;

    /* JADX INFO: renamed from: c */
    public final int f11498c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f11496a);
        parcel.writeByteArray(this.f11497b);
        parcel.writeInt(this.f11498c);
    }

    public SoterExportResult(Parcel parcel) {
        this.f11496a = parcel.readInt();
        this.f11497b = parcel.createByteArray();
        this.f11498c = parcel.readInt();
    }
}
