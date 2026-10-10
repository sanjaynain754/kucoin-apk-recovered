package com.sumsub.sns.internal.features.presentation.sumsubid;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32508b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C32511c(parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C32511c[i11];
    }
}
