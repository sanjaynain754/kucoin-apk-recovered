package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.U */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30126U implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C30127V[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i11 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 != i11; i12++) {
            arrayList.add(C29054T.CREATOR.createFromParcel(parcel));
        }
        return new C30127V(arrayList, (AbstractC30146q) parcel.readParcelable(C30127V.class.getClassLoader()));
    }
}
