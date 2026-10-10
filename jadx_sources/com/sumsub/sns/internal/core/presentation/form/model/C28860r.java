package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28860r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z11;
        boolean z12;
        C29470F c29470fCreateFromParcel = C29470F.CREATOR.createFromParcel(parcel);
        String string = parcel.readString();
        if (parcel.readInt() != 0) {
            z12 = false;
            z11 = true;
        } else {
            z11 = false;
            z12 = false;
        }
        String string2 = parcel.readString();
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        if (parcel.readInt() != 0) {
            z12 = true;
        }
        return new C28861s(c29470fCreateFromParcel, string, z11, string2, charSequence, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C28861s[i11];
    }
}
