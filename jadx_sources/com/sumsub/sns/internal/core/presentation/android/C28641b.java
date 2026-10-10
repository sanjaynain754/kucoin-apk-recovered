package com.sumsub.sns.internal.core.presentation.android;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28641b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C28643c[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z11;
        int i11 = parcel.readInt();
        LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
        boolean z12 = false;
        for (int i12 = 0; i12 != i11; i12++) {
            linkedHashSet.add(parcel.readParcelable(C28643c.class.getClassLoader()));
        }
        if (parcel.readInt() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (parcel.readInt() != 0) {
            z12 = true;
        }
        return new C28643c(linkedHashSet, z11, z12, parcel.readInt());
    }
}
