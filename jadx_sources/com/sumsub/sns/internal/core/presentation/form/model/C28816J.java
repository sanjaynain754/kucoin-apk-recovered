package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28816J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        C29470F c29470fCreateFromParcel = C29470F.CREATOR.createFromParcel(parcel);
        String string = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        String string2 = parcel.readString();
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        boolean z11 = parcel.readInt() != 0;
        int i11 = parcel.readInt();
        ArrayList arrayList2 = new ArrayList(i11);
        for (int i12 = 0; i12 != i11; i12++) {
            arrayList2.add(FormItem$ItemState.valueOf(parcel.readString()));
        }
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int i13 = parcel.readInt();
            arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(C28807A.CREATOR.createFromParcel(parcel));
            }
        }
        FormItem$ItemState formItem$ItemStateValueOf = FormItem$ItemState.valueOf(parcel.readString());
        if (parcel.readInt() == 0) {
            linkedHashMap = null;
        } else {
            int i15 = parcel.readInt();
            linkedHashMap = new LinkedHashMap(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
        }
        return new C28817K(c29470fCreateFromParcel, string, arrayListCreateStringArrayList, string2, charSequence, z11, arrayList2, arrayList, formItem$ItemStateValueOf, linkedHashMap, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C28817K[i11];
    }
}
