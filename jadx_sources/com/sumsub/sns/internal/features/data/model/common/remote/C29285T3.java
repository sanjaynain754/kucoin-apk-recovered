package com.sumsub.sns.internal.features.data.model.common.remote;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.T3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29285T3 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C29285T3> CREATOR = new C29280S3();

    /* JADX INFO: renamed from: a */
    public final List f59299a;

    /* JADX INFO: renamed from: b */
    public final String f59300b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29285T3)) {
            return false;
        }
        C29285T3 c29285t3 = (C29285T3) obj;
        return Intrinsics.areEqual(this.f59299a, c29285t3.f59299a) && Intrinsics.areEqual(this.f59300b, c29285t3.f59300b);
    }

    public final int hashCode() {
        List list = this.f59299a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f59300b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TinInfo(placeHolders=" + this.f59299a + ", regex=" + this.f59300b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeStringList(this.f59299a);
        parcel.writeString(this.f59300b);
    }

    public C29285T3(String str, List list) {
        this.f59299a = list;
        this.f59300b = str;
    }
}
