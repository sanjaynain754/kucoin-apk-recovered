package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31681f extends AbstractC31686k {

    @NotNull
    public static final Parcelable.Creator<C31681f> CREATOR = new C31680e();

    /* JADX INFO: renamed from: a */
    public final boolean f64302a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31681f) && this.f64302a == ((C31681f) obj).f64302a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64302a);
    }

    public final String toString() {
        return "PinEnter(needCan=" + this.f64302a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f64302a ? 1 : 0);
    }

    public C31681f(boolean z11) {
        this.f64302a = z11;
    }
}
