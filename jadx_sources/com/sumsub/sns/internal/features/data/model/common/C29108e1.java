package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.e1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29108e1 extends AbstractC29103d2 {

    /* JADX INFO: renamed from: b */
    public static final C29108e1 f59058b = new C29108e1();

    @NotNull
    public static final Parcelable.Creator<C29108e1> CREATOR = new C29102d1();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C29108e1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(1);
    }

    public C29108e1() {
        super("flatNumber");
    }

    public final String toString() {
        return "FlatNumber";
    }

    public final int hashCode() {
        return 1123696519;
    }
}
