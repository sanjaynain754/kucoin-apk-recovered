package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.N2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29034N2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C29038O2[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C29046Q2 c29046q2CreateFromParcel;
        LinkedHashMap linkedHashMap = null;
        if (parcel.readInt() == 0) {
            c29046q2CreateFromParcel = null;
        } else {
            c29046q2CreateFromParcel = C29046Q2.CREATOR.createFromParcel(parcel);
        }
        C29046Q2 c29046q2 = c29046q2CreateFromParcel;
        if (parcel.readInt() != 0) {
            int i11 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                linkedHashMap2.put(parcel.readString(), C29046Q2.CREATOR.createFromParcel(parcel));
            }
            linkedHashMap = linkedHashMap2;
        }
        return new C29038O2(c29046q2, linkedHashMap);
    }
}
