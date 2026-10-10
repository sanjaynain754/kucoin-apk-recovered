package com.sumsub.sns.internal.features.presentation.sumsubid;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32529i extends AbstractC32550p {

    @NotNull
    public static final Parcelable.Creator<C32529i> CREATOR = new C32526h();

    /* JADX INFO: renamed from: a */
    public final String f66353a;

    /* JADX INFO: renamed from: b */
    public final String f66354b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f66355c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f66356d;

    /* JADX INFO: renamed from: e */
    public boolean f66357e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32529i)) {
            return false;
        }
        C32529i c32529i = (C32529i) obj;
        return Intrinsics.areEqual(this.f66353a, c32529i.f66353a) && Intrinsics.areEqual(this.f66354b, c32529i.f66354b) && Intrinsics.areEqual(this.f66355c, c32529i.f66355c) && Intrinsics.areEqual(this.f66356d, c32529i.f66356d) && this.f66357e == c32529i.f66357e;
    }

    public final int hashCode() {
        String str = this.f66353a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f66354b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence = this.f66355c;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f66356d;
        return Boolean.hashCode(this.f66357e) + ((iHashCode3 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f66353a;
        String str2 = this.f66354b;
        CharSequence charSequence = this.f66355c;
        CharSequence charSequence2 = this.f66356d;
        return "CheckBox(name=" + str + ", smallImage=" + str2 + ", title=" + ((Object) charSequence) + ", text=" + ((Object) charSequence2) + ", checked=" + this.f66357e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f66353a);
        parcel.writeString(this.f66354b);
        TextUtils.writeToParcel(this.f66355c, parcel, i11);
        TextUtils.writeToParcel(this.f66356d, parcel, i11);
        parcel.writeInt(this.f66357e ? 1 : 0);
    }

    public C32529i(String str, String str2, CharSequence charSequence, CharSequence charSequence2, boolean z11) {
        this.f66353a = str;
        this.f66354b = str2;
        this.f66355c = charSequence;
        this.f66356d = charSequence2;
        this.f66357e = z11;
    }
}
