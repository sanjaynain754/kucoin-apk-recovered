package com.sumsub.sns.internal.features.data.model.common.remote;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29237K implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C29237K> CREATOR = new C29232J();

    /* JADX INFO: renamed from: a */
    public final double f59229a;

    /* JADX INFO: renamed from: b */
    public final double f59230b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29237K)) {
            return false;
        }
        C29237K c29237k = (C29237K) obj;
        return Double.compare(this.f59229a, c29237k.f59229a) == 0 && Double.compare(this.f59230b, c29237k.f59230b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f59230b) + (Double.hashCode(this.f59229a) * 31);
    }

    public final String toString() {
        return "DoubleRange(min=" + this.f59229a + ", max=" + this.f59230b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeDouble(this.f59229a);
        parcel.writeDouble(this.f59230b);
    }

    public C29237K(double d11, double d12) {
        this.f59229a = d11;
        this.f59230b = d12;
    }
}
