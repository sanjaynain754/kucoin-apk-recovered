package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28856n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C29470F c29470fCreateFromParcel = C29470F.CREATOR.createFromParcel(parcel);
        String string = parcel.readString();
        int i11 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
        for (int i12 = 0; i12 != i11; i12++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        return new C28857o(c29470fCreateFromParcel, string, linkedHashMap, parcel.createStringArrayList(), parcel.readInt() != 0, (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C28857o[i11];
    }
}
