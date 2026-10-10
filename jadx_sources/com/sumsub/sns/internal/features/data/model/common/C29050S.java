package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.S */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29050S implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C29050S> CREATOR = new C29043Q();

    /* JADX INFO: renamed from: a */
    public final int f58987a;

    /* JADX INFO: renamed from: b */
    public final long f58988b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29050S)) {
            return false;
        }
        C29050S c29050s = (C29050S) obj;
        return this.f58987a == c29050s.f58987a && this.f58988b == c29050s.f58988b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f58988b) + (Integer.hashCode(this.f58987a) * 31);
    }

    public final String toString() {
        return "VideoStats(duration=" + this.f58987a + ", fileSize=" + this.f58988b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f58987a);
        parcel.writeLong(this.f58988b);
    }

    public C29050S(int i11, long j11) {
        this.f58987a = i11;
        this.f58988b = j11;
    }
}
