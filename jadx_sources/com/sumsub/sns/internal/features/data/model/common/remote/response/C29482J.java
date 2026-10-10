package com.sumsub.sns.internal.features.data.model.common.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29482J implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59489a;

    /* JADX INFO: renamed from: b */
    public final String f59490b;

    /* JADX INFO: renamed from: c */
    public final Boolean f59491c;

    @NotNull
    public static final C29476H Companion = new C29476H();

    @NotNull
    public static final Parcelable.Creator<C29482J> CREATOR = new C29479I();

    public /* synthetic */ C29482J(int i11, String str, String str2, Boolean bool) {
        if ((i11 & 1) == 0) {
            this.f59489a = null;
        } else {
            this.f59489a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59490b = null;
        } else {
            this.f59490b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59491c = null;
        } else {
            this.f59491c = bool;
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
        if (!(obj instanceof C29482J)) {
            return false;
        }
        C29482J c29482j = (C29482J) obj;
        return Intrinsics.areEqual(this.f59489a, c29482j.f59489a) && Intrinsics.areEqual(this.f59490b, c29482j.f59490b) && Intrinsics.areEqual(this.f59491c, c29482j.f59491c);
    }

    public C29482J(String str, String str2, Boolean bool) {
        this.f59489a = str;
        this.f59490b = str2;
        this.f59491c = bool;
    }

    public final int hashCode() {
        String str = this.f59489a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59490b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f59491c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "OAuthConfirmation(url=" + this.f59489a + ", redirectUrl=" + this.f59490b + ", externalBrowserRequired=" + this.f59491c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59489a);
        parcel.writeString(this.f59490b);
        Boolean bool = this.f59491c;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }
}
