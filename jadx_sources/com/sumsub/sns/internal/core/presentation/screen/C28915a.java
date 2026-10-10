package com.sumsub.sns.internal.core.presentation.screen;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28915a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C28943d(parcel.readString(), parcel.readInt() == 0 ? null : C28942c.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C28943d[i11];
    }
}
