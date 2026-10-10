package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31688m implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C31688m> CREATOR = new C31687l();

    /* JADX INFO: renamed from: a */
    public final AbstractC31686k f64305a;

    /* JADX INFO: renamed from: b */
    public final String f64306b;

    /* JADX INFO: renamed from: c */
    public final String f64307c;

    /* JADX INFO: renamed from: d */
    public final String f64308d;

    /* JADX INFO: renamed from: e */
    public final String f64309e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31688m)) {
            return false;
        }
        C31688m c31688m = (C31688m) obj;
        return Intrinsics.areEqual(this.f64305a, c31688m.f64305a) && Intrinsics.areEqual(this.f64306b, c31688m.f64306b) && Intrinsics.areEqual(this.f64307c, c31688m.f64307c) && Intrinsics.areEqual(this.f64308d, c31688m.f64308d) && Intrinsics.areEqual(this.f64309e, c31688m.f64309e);
    }

    public final int hashCode() {
        int iHashCode = this.f64305a.hashCode() * 31;
        String str = this.f64306b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f64307c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f64308d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f64309e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "PinResult(pinMode=" + this.f64305a + ", secret=" + this.f64306b + ", oldPin=" + this.f64307c + ", can=" + this.f64308d + ", lastPinDigit=" + this.f64309e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f64305a, i11);
        parcel.writeString(this.f64306b);
        parcel.writeString(this.f64307c);
        parcel.writeString(this.f64308d);
        parcel.writeString(this.f64309e);
    }

    public C31688m(AbstractC31686k abstractC31686k, String str, String str2, String str3, String str4) {
        this.f64305a = abstractC31686k;
        this.f64306b = str;
        this.f64307c = str2;
        this.f64308d = str3;
        this.f64309e = str4;
    }
}
