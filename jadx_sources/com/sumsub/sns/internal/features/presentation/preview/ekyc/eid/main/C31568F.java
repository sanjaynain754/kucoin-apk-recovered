package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31568F extends AbstractC31595T {

    @NotNull
    public static final Parcelable.Creator<C31568F> CREATOR = new C31567E();

    /* JADX INFO: renamed from: a */
    public final String f64097a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31568F) && Intrinsics.areEqual(this.f64097a, ((C31568F) obj).f64097a);
    }

    public final int hashCode() {
        return this.f64097a.hashCode();
    }

    public final String toString() {
        return "RequestCan(pin=" + this.f64097a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f64097a);
    }

    public C31568F(String str) {
        this.f64097a = str;
    }
}
