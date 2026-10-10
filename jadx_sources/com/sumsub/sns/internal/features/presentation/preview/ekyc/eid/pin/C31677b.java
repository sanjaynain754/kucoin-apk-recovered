package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31677b extends AbstractC31686k {

    @NotNull
    public static final Parcelable.Creator<C31677b> CREATOR = new C31676a();

    /* JADX INFO: renamed from: a */
    public final String f64298a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31677b) && Intrinsics.areEqual(this.f64298a, ((C31677b) obj).f64298a);
    }

    public final int hashCode() {
        return this.f64298a.hashCode();
    }

    public final String toString() {
        return "CanEnter(pin=" + this.f64298a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f64298a);
    }

    public C31677b(String str) {
        this.f64298a = str;
    }
}
