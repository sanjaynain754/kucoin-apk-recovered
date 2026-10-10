package com.sumsub.sns.internal.features.data.model.common.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29458B implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59455a;

    /* JADX INFO: renamed from: b */
    public final String f59456b;

    /* JADX INFO: renamed from: c */
    public final String f59457c;

    @NotNull
    public static final C29629z Companion = new C29629z();

    @NotNull
    public static final Parcelable.Creator<C29458B> CREATOR = new C29455A();

    public /* synthetic */ C29458B(int i11, String str, String str2, String str3) {
        if ((i11 & 1) == 0) {
            this.f59455a = null;
        } else {
            this.f59455a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59456b = null;
        } else {
            this.f59456b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59457c = null;
        } else {
            this.f59457c = str3;
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
        if (!(obj instanceof C29458B)) {
            return false;
        }
        C29458B c29458b = (C29458B) obj;
        return Intrinsics.areEqual(this.f59455a, c29458b.f59455a) && Intrinsics.areEqual(this.f59456b, c29458b.f59456b) && Intrinsics.areEqual(this.f59457c, c29458b.f59457c);
    }

    public C29458B(String str, String str2, String str3) {
        this.f59455a = str;
        this.f59456b = str2;
        this.f59457c = str3;
    }

    public final int hashCode() {
        String str = this.f59455a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59456b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59457c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "EidConfirmation(mobileToken=" + this.f59455a + ", url=" + this.f59456b + ", certificate=***)";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59455a);
        parcel.writeString(this.f59456b);
        parcel.writeString(this.f59457c);
    }
}
