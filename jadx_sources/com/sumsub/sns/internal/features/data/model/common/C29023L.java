package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29023L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C29027M[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C29164n3 c29164n3CreateFromParcel;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap = null;
        if (parcel.readInt() == 0) {
            c29164n3CreateFromParcel = null;
        } else {
            c29164n3CreateFromParcel = C29164n3.CREATOR.createFromParcel(parcel);
        }
        C29164n3 c29164n3 = c29164n3CreateFromParcel;
        String string = parcel.readString();
        String string2 = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int i11 = parcel.readInt();
            arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
        }
        if (parcel.readInt() != 0) {
            int i13 = parcel.readInt();
            linkedHashMap = new LinkedHashMap(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                linkedHashMap.put(Integer.valueOf(parcel.readInt()), C29164n3.CREATOR.createFromParcel(parcel));
            }
        }
        return new C29027M(c29164n3, string, string2, arrayList, linkedHashMap);
    }
}
