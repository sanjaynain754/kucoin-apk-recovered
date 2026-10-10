package com.sumsub.sns.internal.features.data.model.sumsubid;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.sumsubid.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29871l implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final Boolean f59950a;

    /* JADX INFO: renamed from: b */
    public final Boolean f59951b;

    @NotNull
    public static final C29869j Companion = new C29869j();

    @NotNull
    public static final Parcelable.Creator<C29871l> CREATOR = new C29870k();

    public /* synthetic */ C29871l(int i11, Boolean bool, Boolean bool2) {
        if ((i11 & 1) == 0) {
            this.f59950a = null;
        } else {
            this.f59950a = bool;
        }
        if ((i11 & 2) == 0) {
            this.f59951b = null;
        } else {
            this.f59951b = bool2;
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
        if (!(obj instanceof C29871l)) {
            return false;
        }
        C29871l c29871l = (C29871l) obj;
        return Intrinsics.areEqual(this.f59950a, c29871l.f59950a) && Intrinsics.areEqual(this.f59951b, c29871l.f59951b);
    }

    public C29871l(Boolean bool, Boolean bool2) {
        this.f59950a = bool;
        this.f59951b = bool2;
    }

    public final int hashCode() {
        Boolean bool = this.f59950a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f59951b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "ProfileInfo(currentAgreementAccepted=" + this.f59950a + ", hasDocs=" + this.f59951b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Boolean bool = this.f59950a;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.f59951b;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }
}
