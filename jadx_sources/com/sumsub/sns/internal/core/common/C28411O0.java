package com.sumsub.sns.internal.core.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.O0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28411O0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new SNSSession(parcel.readString(), parcel.readString(), (Locale) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new SNSSession[i11];
    }
}
