package com.sumsub.sns.internal.features.presentation.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.analytics.Screen;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.result.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32362b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C32363c(SNSFinishResultType.valueOf(parcel.readString()), Screen.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : C32371k.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C32363c[i11];
    }
}
