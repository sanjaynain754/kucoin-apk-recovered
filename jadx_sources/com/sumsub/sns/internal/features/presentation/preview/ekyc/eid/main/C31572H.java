package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sentry.AbstractC27897U;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31572H extends AbstractC31595T {

    @NotNull
    public static final Parcelable.Creator<C31572H> CREATOR = new C31570G();

    /* JADX INFO: renamed from: a */
    public final String f64106a;

    /* JADX INFO: renamed from: b */
    public final String f64107b;

    /* JADX INFO: renamed from: c */
    public final String f64108c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31572H)) {
            return false;
        }
        C31572H c31572h = (C31572H) obj;
        return Intrinsics.areEqual(this.f64106a, c31572h.f64106a) && Intrinsics.areEqual(this.f64107b, c31572h.f64107b) && Intrinsics.areEqual(this.f64108c, c31572h.f64108c);
    }

    public final int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.f64107b, this.f64106a.hashCode() * 31, 31);
        String str = this.f64108c;
        return iM68983a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "RequestCanForTransportPin(pin=" + this.f64106a + ", newPin=" + this.f64107b + ", lastPinDigit=" + this.f64108c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f64106a);
        parcel.writeString(this.f64107b);
        parcel.writeString(this.f64108c);
    }

    public C31572H(String str, String str2, String str3) {
        this.f64106a = str;
        this.f64107b = str2;
        this.f64108c = str3;
    }
}
