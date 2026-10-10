package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.Y1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29076Y1 extends AbstractC29103d2 {

    @NotNull
    public static final Parcelable.Creator<C29076Y1> CREATOR = new C29072X1();

    /* JADX INFO: renamed from: b */
    public final int f59018b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29076Y1) && this.f59018b == ((C29076Y1) obj).f59018b;
    }

    public C29076Y1(int i11) {
        super("local_tins_tin_" + i11);
        this.f59018b = i11;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59018b);
    }

    public final String toString() {
        return "TinsTin(groupIndex=" + this.f59018b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f59018b);
    }
}
