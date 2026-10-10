package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.P2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29042P2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C29046Q2[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C29053S2 c29053s2CreateFromParcel;
        ArrayList arrayList;
        Boolean boolValueOf = null;
        if (parcel.readInt() == 0) {
            c29053s2CreateFromParcel = null;
        } else {
            c29053s2CreateFromParcel = C29053S2.CREATOR.createFromParcel(parcel);
        }
        C29053S2 c29053s2 = c29053s2CreateFromParcel;
        boolean z11 = false;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int i11 = parcel.readInt();
            arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(C29106e.CREATOR.createFromParcel(parcel));
            }
        }
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            boolValueOf = Boolean.valueOf(z11);
        }
        return new C29046Q2(c29053s2, arrayList, boolValueOf);
    }
}
