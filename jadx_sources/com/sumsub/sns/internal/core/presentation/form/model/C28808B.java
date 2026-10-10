package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28808B implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C28809C(C29470F.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), FormItem$ItemState.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : C28807A.CREATOR.createFromParcel(parcel), FormItem$ItemState.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C28809C[i11];
    }
}
