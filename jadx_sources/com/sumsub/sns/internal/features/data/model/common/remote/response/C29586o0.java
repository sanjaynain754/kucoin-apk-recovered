package com.sumsub.sns.internal.features.data.model.common.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.o0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29586o0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59609a;

    /* JADX INFO: renamed from: b */
    public final Boolean f59610b;

    @NotNull
    public static final C29578m0 Companion = new C29578m0();

    @NotNull
    public static final Parcelable.Creator<C29586o0> CREATOR = new C29582n0();

    public /* synthetic */ C29586o0(int i11, Boolean bool, String str) {
        if ((i11 & 1) == 0) {
            this.f59609a = null;
        } else {
            this.f59609a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59610b = null;
        } else {
            this.f59610b = bool;
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
        if (!(obj instanceof C29586o0)) {
            return false;
        }
        C29586o0 c29586o0 = (C29586o0) obj;
        return Intrinsics.areEqual(this.f59609a, c29586o0.f59609a) && Intrinsics.areEqual(this.f59610b, c29586o0.f59610b);
    }

    public C29586o0() {
        this.f59609a = null;
        this.f59610b = null;
    }

    public final int hashCode() {
        String str = this.f59609a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f59610b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "Restriction(code=" + this.f59609a + ", reloadEnabled=" + this.f59610b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59609a);
        Boolean bool = this.f59610b;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public C29586o0(String str, Boolean bool) {
        this.f59609a = str;
        this.f59610b = bool;
    }
}
