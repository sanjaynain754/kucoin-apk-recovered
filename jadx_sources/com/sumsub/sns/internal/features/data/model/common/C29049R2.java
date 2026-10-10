package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.R2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29049R2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C29053S2[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z11;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Double dValueOf;
        boolean z12 = true;
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            boolValueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolValueOf = Boolean.valueOf(z11);
        }
        if (parcel.readInt() == 0) {
            boolValueOf2 = null;
        } else {
            if (parcel.readInt() == 0) {
                z12 = false;
            }
            boolValueOf2 = Boolean.valueOf(z12);
        }
        if (parcel.readInt() == 0) {
            dValueOf = null;
        } else {
            dValueOf = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readInt() != 0) {
            int i11 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList2.add(C29070X.CREATOR.createFromParcel(parcel));
            }
            arrayList = arrayList2;
        }
        return new C29053S2(boolValueOf, boolValueOf2, dValueOf, arrayList);
    }
}
