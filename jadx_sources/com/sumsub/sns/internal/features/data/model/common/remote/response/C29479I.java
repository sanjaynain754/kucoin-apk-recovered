package com.sumsub.sns.internal.features.data.model.common.remote.response;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29479I implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        String string = parcel.readString();
        String string2 = parcel.readString();
        if (parcel.readInt() == 0) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
        }
        return new C29482J(string, string2, boolValueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C29482J[i11];
    }
}
