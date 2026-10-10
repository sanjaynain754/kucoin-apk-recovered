package com.sumsub.sns.internal.features.data.model.common.remote;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.D0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29203D0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59194a;

    @NotNull
    public static final C29193B0 Companion = new C29193B0();

    @NotNull
    public static final Parcelable.Creator<C29203D0> CREATOR = new C29198C0();

    public /* synthetic */ C29203D0(int i11, String str) {
        if ((i11 & 1) == 0) {
            this.f59194a = null;
        } else {
            this.f59194a = str;
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
        return (obj instanceof C29203D0) && Intrinsics.areEqual(this.f59194a, ((C29203D0) obj).f59194a);
    }

    public C29203D0(String str) {
        this.f59194a = str;
    }

    public final int hashCode() {
        String str = this.f59194a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "OtpConfirmationData(code=" + this.f59194a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59194a);
    }
}
