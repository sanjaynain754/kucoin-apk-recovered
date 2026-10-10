package com.sumsub.sns.internal.features.presentation.country;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30877b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C30877b> CREATOR = new C30876a();

    /* JADX INFO: renamed from: a */
    public final String f62373a;

    /* JADX INFO: renamed from: b */
    public final String f62374b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30877b)) {
            return false;
        }
        C30877b c30877b = (C30877b) obj;
        return Intrinsics.areEqual(this.f62373a, c30877b.f62373a) && Intrinsics.areEqual(this.f62374b, c30877b.f62374b);
    }

    public final int hashCode() {
        return this.f62374b.hashCode() + (this.f62373a.hashCode() * 31);
    }

    public final String toString() {
        return "CountryItem(code=" + this.f62373a + ", name=" + this.f62374b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f62373a);
        parcel.writeString(this.f62374b);
    }

    public C30877b(String str, String str2) {
        this.f62373a = str;
        this.f62374b = str2;
    }
}
