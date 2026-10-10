package com.sumsub.sns.internal.features.presentation.main;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31244b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C31244b> CREATOR = new C31240a();

    /* JADX INFO: renamed from: a */
    public final String f63241a;

    /* JADX INFO: renamed from: b */
    public final String f63242b;

    /* JADX INFO: renamed from: c */
    public final String f63243c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31244b)) {
            return false;
        }
        C31244b c31244b = (C31244b) obj;
        return Intrinsics.areEqual(this.f63241a, c31244b.f63241a) && Intrinsics.areEqual(this.f63242b, c31244b.f63242b) && Intrinsics.areEqual(this.f63243c, c31244b.f63243c);
    }

    public final int hashCode() {
        String str = this.f63241a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f63242b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f63243c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "CallbacksLostOopsStrings(title=" + this.f63241a + ", subtitle=" + this.f63242b + ", buttonText=" + this.f63243c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f63241a);
        parcel.writeString(this.f63242b);
        parcel.writeString(this.f63243c);
    }

    public C31244b(String str, String str2, String str3) {
        this.f63241a = str;
        this.f63242b = str2;
        this.f63243c = str3;
    }
}
