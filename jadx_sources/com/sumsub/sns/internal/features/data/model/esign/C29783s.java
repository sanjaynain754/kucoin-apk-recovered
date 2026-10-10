package com.sumsub.sns.internal.features.data.model.esign;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29783s implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final Boolean f59852a;

    /* JADX INFO: renamed from: b */
    public final Integer f59853b;

    /* JADX INFO: renamed from: c */
    public final Integer f59854c;

    /* JADX INFO: renamed from: d */
    public final Boolean f59855d;

    @NotNull
    public static final C29781q Companion = new C29781q();

    @NotNull
    public static final Parcelable.Creator<C29783s> CREATOR = new C29782r();

    public /* synthetic */ C29783s(int i11, Boolean bool, Integer num, Integer num2, Boolean bool2) {
        if ((i11 & 1) == 0) {
            this.f59852a = null;
        } else {
            this.f59852a = bool;
        }
        if ((i11 & 2) == 0) {
            this.f59853b = null;
        } else {
            this.f59853b = num;
        }
        if ((i11 & 4) == 0) {
            this.f59854c = null;
        } else {
            this.f59854c = num2;
        }
        if ((i11 & 8) == 0) {
            this.f59855d = null;
        } else {
            this.f59855d = bool2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29783s)) {
            return false;
        }
        C29783s c29783s = (C29783s) obj;
        return Intrinsics.areEqual(this.f59852a, c29783s.f59852a) && Intrinsics.areEqual(this.f59853b, c29783s.f59853b) && Intrinsics.areEqual(this.f59854c, c29783s.f59854c) && Intrinsics.areEqual(this.f59855d, c29783s.f59855d);
    }

    public C29783s(Boolean bool, Integer num, Integer num2, Boolean bool2) {
        this.f59852a = bool;
        this.f59853b = num;
        this.f59854c = num2;
        this.f59855d = bool2;
    }

    public final int hashCode() {
        Boolean bool = this.f59852a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f59853b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f59854c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.f59855d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "ESignOtp(sent=" + this.f59852a + ", codeLength=" + this.f59853b + ", resendTtl=" + this.f59854c + ", confirmed=" + this.f59855d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Boolean bool = this.f59852a;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.f59853b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f59854c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool2 = this.f59855d;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }
}
