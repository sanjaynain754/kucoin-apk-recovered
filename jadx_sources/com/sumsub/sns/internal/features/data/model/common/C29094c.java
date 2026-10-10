package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29094c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C29094c> CREATOR = new C29088b();

    /* JADX INFO: renamed from: a */
    public final C29719y f59041a;

    /* JADX INFO: renamed from: b */
    public final String f59042b;

    /* JADX INFO: renamed from: c */
    public final boolean f59043c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29094c)) {
            return false;
        }
        C29094c c29094c = (C29094c) obj;
        return Intrinsics.areEqual(this.f59041a, c29094c.f59041a) && Intrinsics.areEqual(this.f59042b, c29094c.f59042b) && this.f59043c == c29094c.f59043c;
    }

    public final int hashCode() {
        int iHashCode = this.f59041a.hashCode() * 31;
        String str = this.f59042b;
        return Boolean.hashCode(this.f59043c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "AddressItem(field=" + this.f59041a + ", value=" + this.f59042b + ", isBackendProvided=" + this.f59043c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f59041a.writeToParcel(parcel, i11);
        parcel.writeString(this.f59042b);
        parcel.writeInt(this.f59043c ? 1 : 0);
    }

    public C29094c(C29719y c29719y, String str, boolean z11) {
        this.f59041a = c29719y;
        this.f59042b = str;
        this.f59043c = z11;
    }
}
