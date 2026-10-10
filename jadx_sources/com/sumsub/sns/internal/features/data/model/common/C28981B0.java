package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.B0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28981B0 extends AbstractC29028M0 {

    @NotNull
    public static final Parcelable.Creator<C28981B0> CREATOR = new C28976A0();

    /* JADX INFO: renamed from: a */
    public final double f58904a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeDouble(this.f58904a);
    }

    public C28981B0(double d11) {
        this.f58904a = d11;
    }
}
