package com.sumsub.sns.internal.features.data.model.sumsubid;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.sumsubid.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29858d implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59943a;

    /* JADX INFO: renamed from: b */
    public final String f59944b;

    /* JADX INFO: renamed from: c */
    public final String f59945c;

    @NotNull
    public static final C29854b Companion = new C29854b();

    @NotNull
    public static final Parcelable.Creator<C29858d> CREATOR = new C29856c();

    public /* synthetic */ C29858d(int i11, String str, String str2, String str3) {
        if ((i11 & 1) == 0) {
            this.f59943a = null;
        } else {
            this.f59943a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59944b = null;
        } else {
            this.f59944b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59945c = null;
        } else {
            this.f59945c = str3;
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
        if (!(obj instanceof C29858d)) {
            return false;
        }
        C29858d c29858d = (C29858d) obj;
        return Intrinsics.areEqual(this.f59943a, c29858d.f59943a) && Intrinsics.areEqual(this.f59944b, c29858d.f59944b) && Intrinsics.areEqual(this.f59945c, c29858d.f59945c);
    }

    public C29858d(String str, String str2, String str3) {
        this.f59943a = str;
        this.f59944b = str2;
        this.f59945c = str3;
    }

    public final int hashCode() {
        String str = this.f59943a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59944b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59945c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "SNSSumsubIdAccountDataResponse(code=" + this.f59943a + ", baseUrl=" + this.f59944b + ", cookie=" + this.f59945c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59943a);
        parcel.writeString(this.f59944b);
        parcel.writeString(this.f59945c);
    }
}
