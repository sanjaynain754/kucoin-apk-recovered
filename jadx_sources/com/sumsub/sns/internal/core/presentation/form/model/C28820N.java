package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sns.internal.features.data.model.common.remote.C29405l0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.N */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28820N implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C28821O[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z11;
        boolean z12;
        String string = parcel.readString();
        C29470F c29470fCreateFromParcel = C29470F.CREATOR.createFromParcel(parcel);
        int i11 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
        for (int i12 = 0; i12 != i11; i12++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        int i13 = parcel.readInt();
        boolean z13 = false;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
        for (int i14 = 0; i14 != i13; i14++) {
            linkedHashMap2.put(parcel.readString(), C29405l0.CREATOR.createFromParcel(parcel));
        }
        String string2 = parcel.readString();
        if (parcel.readInt() != 0) {
            z11 = true;
            z12 = true;
        } else {
            z11 = false;
            z12 = true;
        }
        String string3 = parcel.readString();
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        if (parcel.readInt() != 0) {
            z13 = z12;
        }
        return new C28821O(string, c29470fCreateFromParcel, linkedHashMap, linkedHashMap2, string2, z11, string3, charSequence, z13);
    }
}
