package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.h3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29128h3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C29134i3[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        String string = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int i11 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList2.add(C29069W2.CREATOR.createFromParcel(parcel));
            }
            arrayList = arrayList2;
        }
        return new C29134i3(string, arrayList);
    }
}
