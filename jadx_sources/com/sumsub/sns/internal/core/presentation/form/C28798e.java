package com.sumsub.sns.internal.core.presentation.form;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28798e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C28799f[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C28803j c28803jCreateFromParcel;
        int i11 = parcel.readInt();
        int i12 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i12);
        for (int i13 = 0; i13 != i12; i13++) {
            arrayList.add(C28801h.CREATOR.createFromParcel(parcel));
        }
        String string = parcel.readString();
        if (parcel.readInt() == 0) {
            c28803jCreateFromParcel = null;
        } else {
            c28803jCreateFromParcel = C28803j.CREATOR.createFromParcel(parcel);
        }
        return new C28799f(i11, arrayList, string, c28803jCreateFromParcel);
    }
}
