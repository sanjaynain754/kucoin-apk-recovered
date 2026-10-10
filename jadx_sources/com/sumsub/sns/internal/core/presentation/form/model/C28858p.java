package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28858p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C28859q[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        C29470F c29470fCreateFromParcel = C29470F.CREATOR.createFromParcel(parcel);
        int i11 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
        boolean z11 = false;
        for (int i12 = 0; i12 != i11; i12++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        String string2 = parcel.readString();
        if (parcel.readInt() != 0) {
            z11 = true;
        }
        return new C28859q(string, c29470fCreateFromParcel, linkedHashMap, string2, z11, (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readString());
    }
}
