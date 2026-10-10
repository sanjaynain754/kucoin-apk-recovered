package com.sumsub.sns.internal.features.data.model.common.remote.response;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.z0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29630z0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C29456A0(parcel.readInt() == 0 ? null : EKycFlowStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ConfirmationType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : ConfirmationStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : C29503S.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C29482J.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? C29458B.CREATOR.createFromParcel(parcel) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C29456A0[i11];
    }
}
