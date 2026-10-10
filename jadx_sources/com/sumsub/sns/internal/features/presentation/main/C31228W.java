package com.sumsub.sns.internal.features.presentation.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.Document;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.W */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31228W implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C31231X[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i11 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 != i11; i12++) {
            arrayList.add(Document.CREATOR.createFromParcel(parcel));
        }
        return new C31231X(arrayList);
    }
}
