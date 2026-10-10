package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.W0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29067W0 extends AbstractC29103d2 {

    /* JADX INFO: renamed from: b */
    public static final C29067W0 f59009b = new C29067W0();

    @NotNull
    public static final Parcelable.Creator<C29067W0> CREATOR = new C29063V0();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C29067W0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(1);
    }

    public C29067W0() {
        super("countryOfBirth");
    }

    public final String toString() {
        return "CountryOfBirth";
    }

    public final int hashCode() {
        return 1853402519;
    }
}
