package com.sumsub.sns.internal.features.presentation.sumsubid;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.d0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32515d0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final C32515d0 f66341a = new C32515d0();

    @NotNull
    public static final Parcelable.Creator<C32515d0> CREATOR = new C32512c0();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C32515d0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(1);
    }

    public final String toString() {
        return "OpenSubmit";
    }

    public final int hashCode() {
        return 401991064;
    }
}
