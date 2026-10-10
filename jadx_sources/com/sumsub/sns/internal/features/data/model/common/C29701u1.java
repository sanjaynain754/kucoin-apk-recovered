package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.kubi.kyc.KycKey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.u1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29701u1 extends AbstractC29103d2 {

    /* JADX INFO: renamed from: b */
    public static final C29701u1 f59766b = new C29701u1();

    @NotNull
    public static final Parcelable.Creator<C29701u1> CREATOR = new C29696t1();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C29701u1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(1);
    }

    public final String toString() {
        return "Nationality";
    }

    public C29701u1() {
        super(KycKey.nationality);
    }

    public final int hashCode() {
        return -1815481609;
    }
}
