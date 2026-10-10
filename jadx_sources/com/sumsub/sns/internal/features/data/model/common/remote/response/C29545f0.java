package com.sumsub.sns.internal.features.data.model.common.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.f0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29545f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C29550g0[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z11;
        Boolean boolValueOf;
        ArrayList arrayList;
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        if (parcel.readInt() == 0) {
            boolValueOf = null;
            arrayList = null;
        } else {
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolValueOf = Boolean.valueOf(z11);
            arrayList = null;
        }
        String string4 = parcel.readString();
        ArrayList arrayList2 = arrayList;
        String string5 = parcel.readString();
        ArrayList arrayList3 = arrayList2;
        String string6 = parcel.readString();
        if (parcel.readInt() != 0) {
            int i11 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList4.add(C29602s0.CREATOR.createFromParcel(parcel));
            }
            arrayList3 = arrayList4;
        }
        return new C29550g0(string, string2, string3, boolValueOf, string4, string5, string6, arrayList3);
    }
}
