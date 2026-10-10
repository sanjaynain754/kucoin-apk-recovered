package com.sumsub.sns.internal.features.presentation.sumsubid;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32535k extends AbstractC32550p {

    @NotNull
    public static final Parcelable.Creator<C32535k> CREATOR = new C32532j();

    /* JADX INFO: renamed from: a */
    public final CharSequence f66366a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66367b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32535k)) {
            return false;
        }
        C32535k c32535k = (C32535k) obj;
        return Intrinsics.areEqual(this.f66366a, c32535k.f66366a) && Intrinsics.areEqual(this.f66367b, c32535k.f66367b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f66366a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f66367b;
        return iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return "Header(title=" + ((Object) this.f66366a) + ", subtitle=" + ((Object) this.f66367b) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        TextUtils.writeToParcel(this.f66366a, parcel, i11);
        TextUtils.writeToParcel(this.f66367b, parcel, i11);
    }

    public C32535k(CharSequence charSequence, CharSequence charSequence2) {
        this.f66366a = charSequence;
        this.f66367b = charSequence2;
    }
}
