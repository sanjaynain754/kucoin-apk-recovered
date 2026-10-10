package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.z0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29725z0 extends AbstractC29028M0 {

    @NotNull
    public static final Parcelable.Creator<C29725z0> CREATOR = new C29720y0();

    /* JADX INFO: renamed from: a */
    public final int f59794a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f59794a);
    }

    public C29725z0(int i11) {
        this.f59794a = i11;
    }
}
