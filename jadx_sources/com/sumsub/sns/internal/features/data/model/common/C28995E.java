package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.remote.response.ConfirmationType;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28995E implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C28999F[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ConfirmationType confirmationTypeValueOf;
        ArrayList arrayList;
        String string = parcel.readString();
        String string2 = parcel.readString();
        if (parcel.readInt() == 0) {
            confirmationTypeValueOf = null;
        } else {
            confirmationTypeValueOf = ConfirmationType.valueOf(parcel.readString());
        }
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int i11 = parcel.readInt();
            arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(C29719y.CREATOR.createFromParcel(parcel));
            }
        }
        return new C28999F(string, string2, confirmationTypeValueOf, arrayList, parcel.readString());
    }
}
