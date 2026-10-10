package com.sumsub.sns.internal.features.presentation.esign;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31004r implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final C31004r f62665a = new C31004r();

    @NotNull
    public static final Parcelable.Creator<C31004r> CREATOR = new C31002q();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C31004r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(1);
    }

    public final String toString() {
        return "InitError";
    }

    public final int hashCode() {
        return 1940668838;
    }
}
