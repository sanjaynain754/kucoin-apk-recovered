package com.sumsub.sns.internal.features.presentation.verification;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sentry.AbstractC27897U;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32742x implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C32742x> CREATOR = new C32741w();

    /* JADX INFO: renamed from: a */
    public final CharSequence f66995a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66996b;

    /* JADX INFO: renamed from: c */
    public final Integer f66997c;

    /* JADX INFO: renamed from: d */
    public final String f66998d;

    /* JADX INFO: renamed from: e */
    public final String f66999e;

    /* JADX INFO: renamed from: f */
    public final long f67000f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32742x)) {
            return false;
        }
        C32742x c32742x = (C32742x) obj;
        return Intrinsics.areEqual(this.f66995a, c32742x.f66995a) && Intrinsics.areEqual(this.f66996b, c32742x.f66996b) && Intrinsics.areEqual(this.f66997c, c32742x.f66997c) && Intrinsics.areEqual(this.f66998d, c32742x.f66998d) && Intrinsics.areEqual(this.f66999e, c32742x.f66999e) && this.f67000f == c32742x.f67000f;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f66995a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f66996b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        Integer num = this.f66997c;
        return Long.hashCode(this.f67000f) + AbstractC27897U.m68983a(this.f66999e, AbstractC27897U.m68983a(this.f66998d, (iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f66995a;
        CharSequence charSequence2 = this.f66996b;
        return "VerifyCodeStepData(title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", verificationCodeLength=" + this.f66997c + ", identifier=" + this.f66998d + ", id=" + this.f66999e + ", endTime=" + this.f67000f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iIntValue;
        TextUtils.writeToParcel(this.f66995a, parcel, i11);
        TextUtils.writeToParcel(this.f66996b, parcel, i11);
        Integer num = this.f66997c;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.f66998d);
        parcel.writeString(this.f66999e);
        parcel.writeLong(this.f67000f);
    }

    public C32742x(CharSequence charSequence, CharSequence charSequence2, Integer num, String str, String str2, long j11) {
        this.f66995a = charSequence;
        this.f66996b = charSequence2;
        this.f66997c = num;
        this.f66998d = str;
        this.f66999e = str2;
        this.f67000f = j11;
    }
}
