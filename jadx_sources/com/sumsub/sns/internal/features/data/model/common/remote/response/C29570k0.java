package com.sumsub.sns.internal.features.data.model.common.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.k0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29570k0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59586a;

    /* JADX INFO: renamed from: b */
    public final String f59587b;

    /* JADX INFO: renamed from: c */
    public final String f59588c;

    /* JADX INFO: renamed from: d */
    public final String f59589d;

    /* JADX INFO: renamed from: e */
    public final String f59590e;

    /* JADX INFO: renamed from: f */
    public final String f59591f;

    /* JADX INFO: renamed from: g */
    public final String f59592g;

    /* JADX INFO: renamed from: h */
    public final Integer f59593h;

    /* JADX INFO: renamed from: i */
    public final Long f59594i;

    @NotNull
    public static final C29560i0 Companion = new C29560i0();

    @NotNull
    public static final Parcelable.Creator<C29570k0> CREATOR = new C29565j0();

    public /* synthetic */ C29570k0(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Long l11) {
        if ((i11 & 1) == 0) {
            this.f59586a = null;
        } else {
            this.f59586a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59587b = null;
        } else {
            this.f59587b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59588c = null;
        } else {
            this.f59588c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f59589d = null;
        } else {
            this.f59589d = str4;
        }
        if ((i11 & 16) == 0) {
            this.f59590e = null;
        } else {
            this.f59590e = str5;
        }
        if ((i11 & 32) == 0) {
            this.f59591f = null;
        } else {
            this.f59591f = str6;
        }
        if ((i11 & 64) == 0) {
            this.f59592g = null;
        } else {
            this.f59592g = str7;
        }
        if ((i11 & 128) == 0) {
            this.f59593h = null;
        } else {
            this.f59593h = num;
        }
        if ((i11 & 256) == 0) {
            this.f59594i = null;
        } else {
            this.f59594i = l11;
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
        if (!(obj instanceof C29570k0)) {
            return false;
        }
        C29570k0 c29570k0 = (C29570k0) obj;
        return Intrinsics.areEqual(this.f59586a, c29570k0.f59586a) && Intrinsics.areEqual(this.f59587b, c29570k0.f59587b) && Intrinsics.areEqual(this.f59588c, c29570k0.f59588c) && Intrinsics.areEqual(this.f59589d, c29570k0.f59589d) && Intrinsics.areEqual(this.f59590e, c29570k0.f59590e) && Intrinsics.areEqual(this.f59591f, c29570k0.f59591f) && Intrinsics.areEqual(this.f59592g, c29570k0.f59592g) && Intrinsics.areEqual(this.f59593h, c29570k0.f59593h) && Intrinsics.areEqual(this.f59594i, c29570k0.f59594i);
    }

    public C29570k0(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Long l11) {
        this.f59586a = str;
        this.f59587b = str2;
        this.f59588c = str3;
        this.f59589d = str4;
        this.f59590e = str5;
        this.f59591f = str6;
        this.f59592g = str7;
        this.f59593h = num;
        this.f59594i = l11;
    }

    public final int hashCode() {
        String str = this.f59586a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59587b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59588c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59589d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f59590e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f59591f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f59592g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.f59593h;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Long l11 = this.f59594i;
        return iHashCode8 + (l11 != null ? l11.hashCode() : 0);
    }

    public final String toString() {
        return "RequestCodeResponse(id=" + this.f59586a + ", createdAt=" + this.f59587b + ", identifier=" + this.f59588c + ", identifierType=" + this.f59589d + ", targetType=" + this.f59590e + ", status=" + this.f59591f + ", targetId=" + this.f59592g + ", verificationCodeLength=" + this.f59593h + ", timeToResendInSec=" + this.f59594i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59586a);
        parcel.writeString(this.f59587b);
        parcel.writeString(this.f59588c);
        parcel.writeString(this.f59589d);
        parcel.writeString(this.f59590e);
        parcel.writeString(this.f59591f);
        parcel.writeString(this.f59592g);
        Integer num = this.f59593h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l11 = this.f59594i;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
    }
}
