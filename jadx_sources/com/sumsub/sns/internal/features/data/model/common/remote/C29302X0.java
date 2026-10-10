package com.sumsub.sns.internal.features.data.model.common.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.X0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29302X0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        IdentitySide identitySideValueOf;
        C29655v0 c29655v0;
        String string = parcel.readString();
        String string2 = parcel.readString();
        if (parcel.readInt() == 0) {
            identitySideValueOf = null;
            c29655v0 = null;
        } else {
            identitySideValueOf = IdentitySide.valueOf(parcel.readString());
            c29655v0 = null;
        }
        return new C29307Y0(string, string2, identitySideValueOf, parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? c29655v0 : C29655v0.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C29307Y0[i11];
    }
}
