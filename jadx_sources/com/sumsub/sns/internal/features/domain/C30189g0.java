package com.sumsub.sns.internal.features.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.g0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30189g0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C30217h0(parcel.readString(), parcel.readInt() == 0 ? null : C29307Y0.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C30217h0[i11];
    }
}
