package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.v2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29707v2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C29707v2> CREATOR = new C29702u2();

    /* JADX INFO: renamed from: a */
    public final C29719y f59769a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f59770b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f59771c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f59772d;

    /* JADX INFO: renamed from: e */
    public final boolean f59773e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29707v2)) {
            return false;
        }
        C29707v2 c29707v2 = (C29707v2) obj;
        return Intrinsics.areEqual(this.f59769a, c29707v2.f59769a) && Intrinsics.areEqual(this.f59770b, c29707v2.f59770b) && Intrinsics.areEqual(this.f59771c, c29707v2.f59771c) && Intrinsics.areEqual(this.f59772d, c29707v2.f59772d) && this.f59773e == c29707v2.f59773e;
    }

    public final int hashCode() {
        int iHashCode = this.f59769a.hashCode() * 31;
        CharSequence charSequence = this.f59770b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f59771c;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f59772d;
        return Boolean.hashCode(this.f59773e) + ((iHashCode3 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        C29719y c29719y = this.f59769a;
        CharSequence charSequence = this.f59770b;
        CharSequence charSequence2 = this.f59771c;
        CharSequence charSequence3 = this.f59772d;
        return "LocationItem(field=" + c29719y + ", title=" + ((Object) charSequence) + ", hint=" + ((Object) charSequence2) + ", error=" + ((Object) charSequence3) + ", isBackendProvided=" + this.f59773e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f59769a.writeToParcel(parcel, i11);
        TextUtils.writeToParcel(this.f59770b, parcel, i11);
        TextUtils.writeToParcel(this.f59771c, parcel, i11);
        TextUtils.writeToParcel(this.f59772d, parcel, i11);
        parcel.writeInt(this.f59773e ? 1 : 0);
    }

    public C29707v2(C29719y c29719y, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z11) {
        this.f59769a = c29719y;
        this.f59770b = charSequence;
        this.f59771c = charSequence2;
        this.f59772d = charSequence3;
        this.f59773e = z11;
    }
}
