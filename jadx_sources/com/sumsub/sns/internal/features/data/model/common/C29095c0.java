package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.core.theme.SNSColorElement;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.c0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29095c0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C29095c0> CREATOR = new C29089b0();

    /* JADX INFO: renamed from: a */
    public final String f59044a;

    /* JADX INFO: renamed from: b */
    public final String f59045b;

    /* JADX INFO: renamed from: c */
    public final String f59046c;

    /* JADX INFO: renamed from: d */
    public final String f59047d;

    /* JADX INFO: renamed from: e */
    public final SNSColorElement f59048e;

    public /* synthetic */ C29095c0(int i11, String str, String str2, String str3) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29095c0)) {
            return false;
        }
        C29095c0 c29095c0 = (C29095c0) obj;
        return Intrinsics.areEqual(this.f59044a, c29095c0.f59044a) && Intrinsics.areEqual(this.f59045b, c29095c0.f59045b) && Intrinsics.areEqual(this.f59046c, c29095c0.f59046c) && Intrinsics.areEqual(this.f59047d, c29095c0.f59047d) && this.f59048e == c29095c0.f59048e;
    }

    public C29095c0(String str, String str2, String str3, String str4, SNSColorElement sNSColorElement) {
        this.f59044a = str;
        this.f59045b = str2;
        this.f59046c = str3;
        this.f59047d = str4;
        this.f59048e = sNSColorElement;
    }

    public final int hashCode() {
        String str = this.f59044a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59045b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59046c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59047d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SNSColorElement sNSColorElement = this.f59048e;
        return iHashCode4 + (sNSColorElement != null ? sNSColorElement.hashCode() : 0);
    }

    public final String toString() {
        return "Appearance(title=" + this.f59044a + ", text=" + this.f59045b + ", buttonText=" + this.f59046c + ", icon=" + this.f59047d + ", iconBackground=" + this.f59048e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59044a);
        parcel.writeString(this.f59045b);
        parcel.writeString(this.f59046c);
        parcel.writeString(this.f59047d);
        SNSColorElement sNSColorElement = this.f59048e;
        if (sNSColorElement == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sNSColorElement.name());
        }
    }
}
