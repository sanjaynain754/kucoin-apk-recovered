package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.remote.C29237K;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.t0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29695t0 extends AbstractC29028M0 {

    @NotNull
    public static final Parcelable.Creator<C29695t0> CREATOR = new C29690s0();

    /* JADX INFO: renamed from: a */
    public final C29237K f59741a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        C29237K c29237k = this.f59741a;
        parcel.writeDouble(c29237k.f59229a);
        parcel.writeDouble(c29237k.f59230b);
    }

    public C29695t0(C29237K c29237k) {
        this.f59741a = c29237k;
    }
}
