package com.sumsub.sns.internal.features.domain;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30226m implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C30226m> CREATOR = new C30224l();

    /* JADX INFO: renamed from: a */
    public final String f60756a;

    /* JADX INFO: renamed from: b */
    public final String f60757b;

    /* JADX INFO: renamed from: c */
    public final String f60758c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30226m)) {
            return false;
        }
        C30226m c30226m = (C30226m) obj;
        return Intrinsics.areEqual(this.f60756a, c30226m.f60756a) && Intrinsics.areEqual(this.f60757b, c30226m.f60757b) && Intrinsics.areEqual(this.f60758c, c30226m.f60758c);
    }

    public final int hashCode() {
        String str = this.f60756a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f60757b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f60758c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "UserCountryResultData(infoCountry=" + this.f60756a + ", fixedInfoCountry=" + this.f60757b + ", geoIpCountry=" + this.f60758c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f60756a);
        parcel.writeString(this.f60757b);
        parcel.writeString(this.f60758c);
    }

    public C30226m(String str, String str2, String str3) {
        this.f60756a = str;
        this.f60757b = str2;
        this.f60758c = str3;
    }
}
