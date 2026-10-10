package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sentry.AbstractC27897U;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31679d extends AbstractC31686k {

    @NotNull
    public static final Parcelable.Creator<C31679d> CREATOR = new C31678c();

    /* JADX INFO: renamed from: a */
    public final String f64299a;

    /* JADX INFO: renamed from: b */
    public final String f64300b;

    /* JADX INFO: renamed from: c */
    public final String f64301c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31679d)) {
            return false;
        }
        C31679d c31679d = (C31679d) obj;
        return Intrinsics.areEqual(this.f64299a, c31679d.f64299a) && Intrinsics.areEqual(this.f64300b, c31679d.f64300b) && Intrinsics.areEqual(this.f64301c, c31679d.f64301c);
    }

    public final int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.f64300b, this.f64299a.hashCode() * 31, 31);
        String str = this.f64301c;
        return iM68983a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CanEnterForTransportPin(pin=" + this.f64299a + ", newPin=" + this.f64300b + ", lastPinDigit=" + this.f64301c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f64299a);
        parcel.writeString(this.f64300b);
        parcel.writeString(this.f64301c);
    }

    public C31679d(String str, String str2, String str3) {
        this.f64299a = str;
        this.f64300b = str2;
        this.f64301c = str3;
    }
}
