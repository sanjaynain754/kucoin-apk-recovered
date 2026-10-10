package com.sumsub.sns.internal.features.presentation.verification2.host;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.host.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32817a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C32818b((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C32818b[i11];
    }
}
