package com.sumsub.sns.internal.features.presentation.sumsubid;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32541m extends AbstractC32550p {

    @NotNull
    public static final Parcelable.Creator<C32541m> CREATOR = new C32538l();

    /* JADX INFO: renamed from: a */
    public final String f66379a;

    /* JADX INFO: renamed from: b */
    public final String f66380b;

    /* JADX INFO: renamed from: c */
    public final String f66381c;

    /* JADX INFO: renamed from: d */
    public final String f66382d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f66383e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f66384f;

    /* JADX INFO: renamed from: g */
    public boolean f66385g;

    public /* synthetic */ C32541m(int i11, String str, String str2, String str3, String str4, boolean z11) {
        this(str, str2, null, null, (i11 & 16) != 0 ? null : str3, str4, (i11 & 64) != 0 ? false : z11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32541m)) {
            return false;
        }
        C32541m c32541m = (C32541m) obj;
        return Intrinsics.areEqual(this.f66379a, c32541m.f66379a) && Intrinsics.areEqual(this.f66380b, c32541m.f66380b) && Intrinsics.areEqual(this.f66381c, c32541m.f66381c) && Intrinsics.areEqual(this.f66382d, c32541m.f66382d) && Intrinsics.areEqual(this.f66383e, c32541m.f66383e) && Intrinsics.areEqual(this.f66384f, c32541m.f66384f) && this.f66385g == c32541m.f66385g;
    }

    public C32541m(String str, String str2, String str3, String str4, CharSequence charSequence, CharSequence charSequence2, boolean z11) {
        this.f66379a = str;
        this.f66380b = str2;
        this.f66381c = str3;
        this.f66382d = str4;
        this.f66383e = charSequence;
        this.f66384f = charSequence2;
        this.f66385g = z11;
    }

    public final int hashCode() {
        String str = this.f66379a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f66380b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f66381c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f66382d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CharSequence charSequence = this.f66383e;
        int iHashCode5 = (iHashCode4 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f66384f;
        return Boolean.hashCode(this.f66385g) + ((iHashCode5 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f66379a;
        String str2 = this.f66380b;
        String str3 = this.f66381c;
        String str4 = this.f66382d;
        CharSequence charSequence = this.f66383e;
        CharSequence charSequence2 = this.f66384f;
        return "RadioButton(docId=" + str + ", group=" + str2 + ", image=" + str3 + ", smallImage=" + str4 + ", title=" + ((Object) charSequence) + ", text=" + ((Object) charSequence2) + ", checked=" + this.f66385g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f66379a);
        parcel.writeString(this.f66380b);
        parcel.writeString(this.f66381c);
        parcel.writeString(this.f66382d);
        TextUtils.writeToParcel(this.f66383e, parcel, i11);
        TextUtils.writeToParcel(this.f66384f, parcel, i11);
        parcel.writeInt(this.f66385g ? 1 : 0);
    }
}
