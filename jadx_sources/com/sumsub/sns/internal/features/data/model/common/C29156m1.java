package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.m1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29156m1 extends AbstractC29103d2 {

    /* JADX INFO: renamed from: b */
    public static final C29156m1 f59149b = new C29156m1();

    @NotNull
    public static final Parcelable.Creator<C29156m1> CREATOR = new C29150l1();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C29156m1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(1);
    }

    public C29156m1() {
        super("issuedDate");
    }

    public final String toString() {
        return "IssuedDate";
    }

    public final int hashCode() {
        return -693223330;
    }
}
