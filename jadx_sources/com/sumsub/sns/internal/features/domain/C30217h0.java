package com.sumsub.sns.internal.features.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.h0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30217h0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C30217h0> CREATOR = new C30189g0();

    /* JADX INFO: renamed from: a */
    public final String f60734a;

    /* JADX INFO: renamed from: b */
    public final C29307Y0 f60735b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30217h0)) {
            return false;
        }
        C30217h0 c30217h0 = (C30217h0) obj;
        return Intrinsics.areEqual(this.f60734a, c30217h0.f60734a) && Intrinsics.areEqual(this.f60735b, c30217h0.f60735b);
    }

    public final int hashCode() {
        String str = this.f60734a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C29307Y0 c29307y0 = this.f60735b;
        return iHashCode + (c29307y0 != null ? c29307y0.hashCode() : 0);
    }

    public final String toString() {
        return "UploadResult(key=" + this.f60734a + ", doc=" + this.f60735b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f60734a);
        C29307Y0 c29307y0 = this.f60735b;
        if (c29307y0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            c29307y0.writeToParcel(parcel, i11);
        }
    }

    public C30217h0(String str, C29307Y0 c29307y0) {
        this.f60734a = str;
        this.f60735b = c29307y0;
    }
}
