package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.s2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29692s2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C29697t2[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z11;
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        if (parcel.readInt() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        String string4 = parcel.readString();
        int i11 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
        for (int i12 = 0; i12 != i11; i12++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        return new C29697t2(string, string2, string3, z11, string4, linkedHashMap);
    }
}
