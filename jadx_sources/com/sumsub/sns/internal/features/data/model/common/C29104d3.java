package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.d3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29104d3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C29110e3[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i11 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
        for (int i12 = 0; i12 != i11; i12++) {
            linkedHashMap.put(parcel.readString(), C29086a3.CREATOR.createFromParcel(parcel));
        }
        return new C29110e3(linkedHashMap);
    }
}
