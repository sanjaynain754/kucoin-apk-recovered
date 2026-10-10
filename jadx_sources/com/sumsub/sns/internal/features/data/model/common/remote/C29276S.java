package com.sumsub.sns.internal.features.data.model.common.remote;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.S */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29276S implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59266a;

    /* JADX INFO: renamed from: b */
    public final String f59267b;

    @NotNull
    public static final C29262P Companion = new C29262P();

    @NotNull
    public static final Parcelable.Creator<C29276S> CREATOR = new C29267Q();

    public /* synthetic */ C29276S(int i11, String str, String str2) {
        if ((i11 & 1) == 0) {
            this.f59266a = null;
        } else {
            this.f59266a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59267b = null;
        } else {
            this.f59267b = str2;
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
        if (!(obj instanceof C29276S)) {
            return false;
        }
        C29276S c29276s = (C29276S) obj;
        return Intrinsics.areEqual(this.f59266a, c29276s.f59266a) && Intrinsics.areEqual(this.f59267b, c29276s.f59267b);
    }

    public C29276S(String str, String str2) {
        this.f59266a = str;
        this.f59267b = str2;
    }

    public final int hashCode() {
        String str = this.f59266a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59267b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "EidConfirmationData(resultToken=" + this.f59266a + ", errorCode=" + this.f59267b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59266a);
        parcel.writeString(this.f59267b);
    }

    public C29276S(String str, String str2, int i11) {
        str = (i11 & 1) != 0 ? null : str;
        str2 = (i11 & 2) != 0 ? null : str2;
        this.f59266a = str;
        this.f59267b = str2;
    }
}
