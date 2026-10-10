package com.sumsub.sns.internal.core.presentation.screen.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.ValidationIdentifierType;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.navigation.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28953j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C28954k(parcel.readInt() != 0, ValidationIdentifierType.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C28954k[i11];
    }
}
