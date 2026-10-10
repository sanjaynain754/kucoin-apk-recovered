package com.sumsub.sns.internal.features.presentation.esign;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31013w implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final C31013w f62677a = new C31013w();

    @NotNull
    public static final Parcelable.Creator<C31013w> CREATOR = new C31012v();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C31013w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(1);
    }

    public final String toString() {
        return "RequestOtpError";
    }

    public final int hashCode() {
        return 1659278746;
    }
}
