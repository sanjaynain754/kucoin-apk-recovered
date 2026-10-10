package com.sumsub.sns.internal.core.presentation.screen.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sentry.AbstractC27897U;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.navigation.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28949f implements InterfaceC28952i {

    @NotNull
    public static final Parcelable.Creator<C28949f> CREATOR = new C28948e();

    /* JADX INFO: renamed from: a */
    public final String f58851a;

    /* JADX INFO: renamed from: b */
    public final String f58852b;

    /* JADX INFO: renamed from: c */
    public final String f58853c;

    /* JADX INFO: renamed from: d */
    public final String f58854d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28949f)) {
            return false;
        }
        C28949f c28949f = (C28949f) obj;
        return Intrinsics.areEqual(this.f58851a, c28949f.f58851a) && Intrinsics.areEqual(this.f58852b, c28949f.f58852b) && Intrinsics.areEqual(this.f58853c, c28949f.f58853c) && Intrinsics.areEqual(this.f58854d, c28949f.f58854d);
    }

    public final int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.f58852b, this.f58851a.hashCode() * 31, 31);
        String str = this.f58853c;
        int iHashCode = (iM68983a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f58854d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Instructions(step=" + this.f58851a + ", scene=" + this.f58852b + ", documentType=" + this.f58853c + ", countryCode=" + this.f58854d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f58851a);
        parcel.writeString(this.f58852b);
        parcel.writeString(this.f58853c);
        parcel.writeString(this.f58854d);
    }

    public C28949f(String str, String str2, String str3, String str4) {
        this.f58851a = str;
        this.f58852b = str2;
        this.f58853c = str3;
        this.f58854d = str4;
    }
}
