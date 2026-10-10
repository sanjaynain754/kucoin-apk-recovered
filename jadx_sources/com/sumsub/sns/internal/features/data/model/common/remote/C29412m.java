package com.sumsub.sns.internal.features.data.model.common.remote;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29412m implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final C29203D0 f59412a;

    /* JADX INFO: renamed from: b */
    public final C29683z0 f59413b;

    /* JADX INFO: renamed from: c */
    public final C29276S f59414c;

    @NotNull
    public static final C29396k Companion = new C29396k();

    @NotNull
    public static final Parcelable.Creator<C29412m> CREATOR = new C29404l();

    public /* synthetic */ C29412m(int i11, C29203D0 c29203d0, C29683z0 c29683z0, C29276S c29276s) {
        if ((i11 & 1) == 0) {
            this.f59412a = null;
        } else {
            this.f59412a = c29203d0;
        }
        if ((i11 & 2) == 0) {
            this.f59413b = null;
        } else {
            this.f59413b = c29683z0;
        }
        if ((i11 & 4) == 0) {
            this.f59414c = null;
        } else {
            this.f59414c = c29276s;
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
        if (!(obj instanceof C29412m)) {
            return false;
        }
        C29412m c29412m = (C29412m) obj;
        return Intrinsics.areEqual(this.f59412a, c29412m.f59412a) && Intrinsics.areEqual(this.f59413b, c29412m.f59413b) && Intrinsics.areEqual(this.f59414c, c29412m.f59414c);
    }

    public C29412m(C29203D0 c29203d0, C29683z0 c29683z0, C29276S c29276s) {
        this.f59412a = c29203d0;
        this.f59413b = c29683z0;
        this.f59414c = c29276s;
    }

    public final int hashCode() {
        C29203D0 c29203d0 = this.f59412a;
        int iHashCode = (c29203d0 == null ? 0 : c29203d0.hashCode()) * 31;
        C29683z0 c29683z0 = this.f59413b;
        int iHashCode2 = (iHashCode + (c29683z0 == null ? 0 : c29683z0.hashCode())) * 31;
        C29276S c29276s = this.f59414c;
        return iHashCode2 + (c29276s != null ? c29276s.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicantDataConfirmModel(otp=" + this.f59412a + ", oauth=" + this.f59413b + ", eid=" + this.f59414c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        C29203D0 c29203d0 = this.f59412a;
        if (c29203d0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(c29203d0.f59194a);
        }
        C29683z0 c29683z0 = this.f59413b;
        if (c29683z0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(c29683z0.f59734a);
        }
        C29276S c29276s = this.f59414c;
        if (c29276s == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(c29276s.f59266a);
        parcel.writeString(c29276s.f59267b);
    }

    public C29412m(C29203D0 c29203d0, C29683z0 c29683z0, C29276S c29276s, int i11) {
        c29203d0 = (i11 & 1) != 0 ? null : c29203d0;
        c29683z0 = (i11 & 2) != 0 ? null : c29683z0;
        c29276s = (i11 & 4) != 0 ? null : c29276s;
        this.f59412a = c29203d0;
        this.f59413b = c29683z0;
        this.f59414c = c29276s;
    }
}
