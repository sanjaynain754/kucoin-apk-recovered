package com.sumsub.sns.internal.features.data.model.esign;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29782r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        Boolean boolValueOf2 = null;
        if (parcel.readInt() == 0) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
        }
        Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
        Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
        if (parcel.readInt() != 0) {
            boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
        }
        return new C29783s(boolValueOf, numValueOf, numValueOf2, boolValueOf2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C29783s[i11];
    }
}
