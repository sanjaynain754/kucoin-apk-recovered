package com.sumsub.sns.internal.features.data.model.common.remote;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.n3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29424n3 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59421a;

    /* JADX INFO: renamed from: b */
    public final String f59422b;

    /* JADX INFO: renamed from: c */
    public final String f59423c;

    /* JADX INFO: renamed from: d */
    public final String f59424d;

    /* JADX INFO: renamed from: e */
    public final String f59425e;

    @NotNull
    public static final C29400k3 Companion = new C29400k3();

    @NotNull
    public static final Parcelable.Creator<C29424n3> CREATOR = new C29408l3();

    public /* synthetic */ C29424n3(int i11, String str, String str2, String str3, String str4, String str5) {
        if ((i11 & 1) == 0) {
            this.f59421a = "";
        } else {
            this.f59421a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59422b = "";
        } else {
            this.f59422b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59423c = "";
        } else {
            this.f59423c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f59424d = "";
        } else {
            this.f59424d = str4;
        }
        if ((i11 & 16) == 0) {
            this.f59425e = "";
        } else {
            this.f59425e = str5;
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
        if (!(obj instanceof C29424n3)) {
            return false;
        }
        C29424n3 c29424n3 = (C29424n3) obj;
        return Intrinsics.areEqual(this.f59421a, c29424n3.f59421a) && Intrinsics.areEqual(this.f59422b, c29424n3.f59422b) && Intrinsics.areEqual(this.f59423c, c29424n3.f59423c) && Intrinsics.areEqual(this.f59424d, c29424n3.f59424d) && Intrinsics.areEqual(this.f59425e, c29424n3.f59425e);
    }

    public C29424n3(String str, String str2, String str3, String str4, String str5) {
        this.f59421a = str;
        this.f59422b = str2;
        this.f59423c = str3;
        this.f59424d = str4;
        this.f59425e = str5;
    }

    public final int hashCode() {
        String str = this.f59421a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59422b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59423c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59424d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f59425e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "ScreenShotPayload(type=" + this.f59421a + ", idDocSubType=" + this.f59422b + ", country=" + this.f59423c + ", idDocSetType=" + this.f59424d + ", variant=" + this.f59425e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59421a);
        parcel.writeString(this.f59422b);
        parcel.writeString(this.f59423c);
        parcel.writeString(this.f59424d);
        parcel.writeString(this.f59425e);
    }
}
