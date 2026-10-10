package com.sumsub.sns.internal.core.presentation.screen;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28943d implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C28943d> CREATOR = new C28915a();

    /* JADX INFO: renamed from: a */
    public final String f58844a;

    /* JADX INFO: renamed from: b */
    public final C28942c f58845b;

    /* JADX INFO: renamed from: c */
    public final String f58846c;

    /* JADX INFO: renamed from: d */
    public final Long f58847d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28943d)) {
            return false;
        }
        C28943d c28943d = (C28943d) obj;
        return Intrinsics.areEqual(this.f58844a, c28943d.f58844a) && Intrinsics.areEqual(this.f58845b, c28943d.f58845b) && Intrinsics.areEqual(this.f58846c, c28943d.f58846c) && Intrinsics.areEqual(this.f58847d, c28943d.f58847d);
    }

    public final int hashCode() {
        String str = this.f58844a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C28942c c28942c = this.f58845b;
        int iHashCode2 = (iHashCode + (c28942c == null ? 0 : c28942c.hashCode())) * 31;
        String str2 = this.f58846c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.f58847d;
        return iHashCode3 + (l11 != null ? l11.hashCode() : 0);
    }

    public final String toString() {
        return "OtpInputParams(phoneOrEmail=" + this.f58844a + ", otp=" + this.f58845b + ", error=" + this.f58846c + ", lastTimeStamp=" + this.f58847d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f58844a);
        C28942c c28942c = this.f58845b;
        if (c28942c == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            c28942c.writeToParcel(parcel, i11);
        }
        parcel.writeString(this.f58846c);
        Long l11 = this.f58847d;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
    }

    public C28943d(String str, C28942c c28942c, String str2, Long l11) {
        this.f58844a = str;
        this.f58845b = c28942c;
        this.f58846c = str2;
        this.f58847d = l11;
    }
}
