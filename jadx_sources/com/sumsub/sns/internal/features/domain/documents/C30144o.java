package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.domain.C30217h0;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30144o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C30145p[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z11;
        C30217h0 c30217h0CreateFromParcel;
        if (parcel.readInt() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
        int i11 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 != i11; i12++) {
            if (parcel.readInt() == 0) {
                c30217h0CreateFromParcel = null;
            } else {
                c30217h0CreateFromParcel = C30217h0.CREATOR.createFromParcel(parcel);
            }
            arrayList.add(c30217h0CreateFromParcel);
        }
        return new C30145p(z11, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayList, parcel.readString());
    }
}
