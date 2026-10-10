package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.presentation.preview.C31511d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31493k extends C31511d {

    /* JADX INFO: renamed from: a */
    public static final C31493k f63891a = new C31493k();

    @NotNull
    public static final Parcelable.Creator<C31493k> CREATOR = new C31492j();

    @Override // com.sumsub.sns.internal.features.presentation.preview.C31511d, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C31493k);
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.C31511d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(1);
    }

    public final String toString() {
        return "ErrorPayloadSubmit";
    }

    public final int hashCode() {
        return 1403807985;
    }
}
