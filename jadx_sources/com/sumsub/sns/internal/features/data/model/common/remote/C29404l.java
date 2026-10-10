package com.sumsub.sns.internal.features.data.model.common.remote;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29404l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C29412m(parcel.readInt() == 0 ? null : C29203D0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C29683z0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? C29276S.CREATOR.createFromParcel(parcel) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C29412m[i11];
    }
}
