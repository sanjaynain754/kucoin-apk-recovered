package com.sumsub.sns.internal.features.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.remote.C29405l0;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30222k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C30270n[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i11 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
        int i12 = 0;
        for (int i13 = 0; i13 != i11; i13++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        int i14 = parcel.readInt();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
        for (int i15 = 0; i15 != i14; i15++) {
            linkedHashMap2.put(parcel.readString(), C29405l0.CREATOR.createFromParcel(parcel));
        }
        int i16 = parcel.readInt();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(i16);
        for (int i17 = 0; i17 != i16; i17++) {
            linkedHashMap3.put(parcel.readString(), parcel.readString());
        }
        int i18 = parcel.readInt();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(i18);
        while (true) {
            String string = parcel.readString();
            if (i12 != i18) {
                linkedHashMap4.put(string, parcel.readString());
                i12++;
            } else {
                return new C30270n(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, string, C30226m.CREATOR.createFromParcel(parcel));
            }
        }
    }
}
