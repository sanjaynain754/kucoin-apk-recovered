package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31727s implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C31727s> CREATOR = new C31725r();

    /* JADX INFO: renamed from: a */
    public final String f64438a;

    /* JADX INFO: renamed from: b */
    public final String f64439b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31727s)) {
            return false;
        }
        C31727s c31727s = (C31727s) obj;
        return Intrinsics.areEqual(this.f64438a, c31727s.f64438a) && Intrinsics.areEqual(this.f64439b, c31727s.f64439b);
    }

    public final int hashCode() {
        String str = this.f64438a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f64439b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OAuthPostRedirectParams(applicantId=" + this.f64438a + ", confirmationId=" + this.f64439b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f64438a);
        parcel.writeString(this.f64439b);
    }

    public C31727s(String str, String str2) {
        this.f64438a = str;
        this.f64439b = str2;
    }
}
