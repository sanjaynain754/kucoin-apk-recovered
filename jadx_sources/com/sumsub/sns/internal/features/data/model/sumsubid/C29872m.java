package com.sumsub.sns.internal.features.data.model.sumsubid;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.sumsubid.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29872m implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59952a;

    /* JADX INFO: renamed from: b */
    public final Boolean f59953b;

    /* JADX INFO: renamed from: c */
    public final String f59954c;

    /* JADX INFO: renamed from: d */
    public final C29871l f59955d;

    @NotNull
    public static final C29864g Companion = new C29864g();

    @NotNull
    public static final Parcelable.Creator<C29872m> CREATOR = new C29866h();

    public /* synthetic */ C29872m(int i11, String str, Boolean bool, String str2, C29871l c29871l) {
        if ((i11 & 1) == 0) {
            this.f59952a = null;
        } else {
            this.f59952a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59953b = null;
        } else {
            this.f59953b = bool;
        }
        if ((i11 & 4) == 0) {
            this.f59954c = null;
        } else {
            this.f59954c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f59955d = null;
        } else {
            this.f59955d = c29871l;
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
        if (!(obj instanceof C29872m)) {
            return false;
        }
        C29872m c29872m = (C29872m) obj;
        return Intrinsics.areEqual(this.f59952a, c29872m.f59952a) && Intrinsics.areEqual(this.f59953b, c29872m.f59953b) && Intrinsics.areEqual(this.f59954c, c29872m.f59954c) && Intrinsics.areEqual(this.f59955d, c29872m.f59955d);
    }

    public C29872m(String str, Boolean bool, String str2, C29871l c29871l) {
        this.f59952a = str;
        this.f59953b = bool;
        this.f59954c = str2;
        this.f59955d = c29871l;
    }

    public final int hashCode() {
        String str = this.f59952a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f59953b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f59954c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C29871l c29871l = this.f59955d;
        return iHashCode3 + (c29871l != null ? c29871l.hashCode() : 0);
    }

    public final String toString() {
        return "SNSSumsubIdCheckCodeResponse(status=" + this.f59952a + ", blocked=" + this.f59953b + ", token=" + this.f59954c + ", profileInfo=" + this.f59955d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59952a);
        Boolean bool = this.f59953b;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.f59954c);
        C29871l c29871l = this.f59955d;
        if (c29871l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            c29871l.writeToParcel(parcel, i11);
        }
    }
}
