package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.S */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31593S extends AbstractC31595T {

    /* JADX INFO: renamed from: a */
    public static final C31593S f64183a = new C31593S();

    @NotNull
    public static final Parcelable.Creator<C31593S> CREATOR = new C31590Q();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C31593S);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(1);
    }

    public final String toString() {
        return "StartOver";
    }

    public final int hashCode() {
        return -344883066;
    }
}
