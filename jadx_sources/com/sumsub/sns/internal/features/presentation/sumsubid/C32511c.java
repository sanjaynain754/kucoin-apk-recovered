package com.sumsub.sns.internal.features.presentation.sumsubid;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sentry.AbstractC27897U;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32511c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C32511c> CREATOR = new C32508b();

    /* JADX INFO: renamed from: a */
    public final String f66338a;

    /* JADX INFO: renamed from: b */
    public final String f66339b;

    /* JADX INFO: renamed from: c */
    public final String f66340c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32511c)) {
            return false;
        }
        C32511c c32511c = (C32511c) obj;
        return Intrinsics.areEqual(this.f66338a, c32511c.f66338a) && Intrinsics.areEqual(this.f66339b, c32511c.f66339b) && Intrinsics.areEqual(this.f66340c, c32511c.f66340c);
    }

    public final int hashCode() {
        return this.f66340c.hashCode() + AbstractC27897U.m68983a(this.f66339b, this.f66338a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SNSSumsubIdAccountInfoHolder(url=" + this.f66338a + ", baseUrl=" + this.f66339b + ", cookie=" + this.f66340c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f66338a);
        parcel.writeString(this.f66339b);
        parcel.writeString(this.f66340c);
    }

    public C32511c(String str, String str2, String str3) {
        this.f66338a = str;
        this.f66339b = str2;
        this.f66340c = str3;
    }
}
