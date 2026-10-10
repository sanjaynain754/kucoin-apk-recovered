package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29714x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        AbstractC29103d2 abstractC29103d2 = (AbstractC29103d2) parcel.readParcelable(C29719y.class.getClassLoader());
        boolean z11 = parcel.readInt() != 0;
        FieldType fieldTypeValueOf = parcel.readInt() == 0 ? null : FieldType.valueOf(parcel.readString());
        boolean z12 = false;
        String string = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        AbstractC29028M0 abstractC29028M0 = (AbstractC29028M0) parcel.readParcelable(C29719y.class.getClassLoader());
        String string2 = parcel.readString();
        if (parcel.readInt() == 0) {
            boolValueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z12 = true;
            }
            boolValueOf = Boolean.valueOf(z12);
        }
        return new C29719y(abstractC29103d2, z11, fieldTypeValueOf, string, arrayListCreateStringArrayList, abstractC29028M0, string2, boolValueOf, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C29719y[i11];
    }
}
