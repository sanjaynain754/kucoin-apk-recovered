package com.sumsub.sns.internal.features.data.model.common.remote;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.z0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29683z0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59734a;

    @NotNull
    public static final C29669x0 Companion = new C29669x0();

    @NotNull
    public static final Parcelable.Creator<C29683z0> CREATOR = new C29676y0();

    public /* synthetic */ C29683z0(int i11, String str) {
        if ((i11 & 1) == 0) {
            this.f59734a = null;
        } else {
            this.f59734a = str;
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
        return (obj instanceof C29683z0) && Intrinsics.areEqual(this.f59734a, ((C29683z0) obj).f59734a);
    }

    public C29683z0() {
        this.f59734a = null;
    }

    public final int hashCode() {
        String str = this.f59734a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "OAuthConfirmationData(completeUrl=" + this.f59734a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59734a);
    }

    public C29683z0(String str) {
        this.f59734a = str;
    }
}
