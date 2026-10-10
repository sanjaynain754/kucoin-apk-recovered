package com.sumsub.sns.internal.features.data.model.sumsubid;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.sumsubid.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29848F implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59935a;

    /* JADX INFO: renamed from: b */
    public final Integer f59936b;

    @NotNull
    public static final C29846D Companion = new C29846D();

    @NotNull
    public static final Parcelable.Creator<C29848F> CREATOR = new C29847E();

    public /* synthetic */ C29848F(int i11, String str, Integer num) {
        if ((i11 & 1) == 0) {
            this.f59935a = null;
        } else {
            this.f59935a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59936b = null;
        } else {
            this.f59936b = num;
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
        if (!(obj instanceof C29848F)) {
            return false;
        }
        C29848F c29848f = (C29848F) obj;
        return Intrinsics.areEqual(this.f59935a, c29848f.f59935a) && Intrinsics.areEqual(this.f59936b, c29848f.f59936b);
    }

    public C29848F(String str, Integer num) {
        this.f59935a = str;
        this.f59936b = num;
    }

    public final int hashCode() {
        String str = this.f59935a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f59936b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "SNSSumsubIdLoginResponse(icId=" + this.f59935a + ", verificationCodeLength=" + this.f59936b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59935a);
        Integer num = this.f59936b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }
}
