package com.sumsub.sns.internal.features.presentation.main.instructions;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.instructions.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31280e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C31281f(C29697t2.CREATOR.createFromParcel(parcel), parcel.readParcelable(C31281f.class.getClassLoader()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C31281f[i11];
    }
}
