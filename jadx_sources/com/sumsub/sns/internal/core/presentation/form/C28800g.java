package com.sumsub.sns.internal.core.presentation.form;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28800g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C28801h[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i11 = parcel.readInt();
        String string = parcel.readString();
        String string2 = parcel.readString();
        int i12 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i12);
        for (int i13 = 0; i13 != i12; i13++) {
            arrayList.add(parcel.readParcelable(C28801h.class.getClassLoader()));
        }
        return new C28801h(i11, string, string2, arrayList);
    }
}
