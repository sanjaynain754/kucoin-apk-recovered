package com.sumsub.sns.internal.features.data.model.common.remote;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.Q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29267Q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C29276S(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C29276S[i11];
    }
}
