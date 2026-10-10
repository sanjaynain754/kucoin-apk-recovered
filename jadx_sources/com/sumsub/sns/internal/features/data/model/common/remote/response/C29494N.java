package com.sumsub.sns.internal.features.data.model.common.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.N */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29494N implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59517a;

    /* JADX INFO: renamed from: b */
    public final String f59518b;

    /* JADX INFO: renamed from: c */
    public final String f59519c;

    @NotNull
    public static final C29488L Companion = new C29488L();

    @NotNull
    public static final Parcelable.Creator<C29494N> CREATOR = new C29491M();

    public /* synthetic */ C29494N(int i11, String str, String str2, String str3) {
        if ((i11 & 1) == 0) {
            this.f59517a = null;
        } else {
            this.f59517a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59518b = null;
        } else {
            this.f59518b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59519c = null;
        } else {
            this.f59519c = str3;
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
        if (!(obj instanceof C29494N)) {
            return false;
        }
        C29494N c29494n = (C29494N) obj;
        return Intrinsics.areEqual(this.f59517a, c29494n.f59517a) && Intrinsics.areEqual(this.f59518b, c29494n.f59518b) && Intrinsics.areEqual(this.f59519c, c29494n.f59519c);
    }

    public C29494N(String str, String str2) {
        this.f59517a = str;
        this.f59518b = str2;
        this.f59519c = null;
    }

    public final int hashCode() {
        String str = this.f59517a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59518b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59519c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f59518b;
        return str == null ? "" : str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59517a);
        parcel.writeString(this.f59518b);
        parcel.writeString(this.f59519c);
    }

    public C29494N(String str, String str2, String str3) {
        this.f59517a = str;
        this.f59518b = str2;
        this.f59519c = str3;
    }
}
