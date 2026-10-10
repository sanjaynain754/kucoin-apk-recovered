package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.E1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28997E1 extends AbstractC29103d2 {

    /* JADX INFO: renamed from: b */
    public static final C28997E1 f58922b = new C28997E1();

    @NotNull
    public static final Parcelable.Creator<C28997E1> CREATOR = new C28992D1();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C28997E1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(1);
    }

    public final String toString() {
        return "PlaceOfBirth";
    }

    public C28997E1() {
        super("placeOfBirth");
    }

    public final int hashCode() {
        return 1328074822;
    }
}
