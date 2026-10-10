package com.sumsub.sns.internal.features.data.model.common.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.S */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29503S implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final Integer f59523a;

    @NotNull
    public static final C29498P Companion = new C29498P();

    @NotNull
    public static final Parcelable.Creator<C29503S> CREATOR = new C29500Q();

    public /* synthetic */ C29503S(int i11, Integer num) {
        if ((i11 & 1) == 0) {
            this.f59523a = null;
        } else {
            this.f59523a = num;
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
        return (obj instanceof C29503S) && Intrinsics.areEqual(this.f59523a, ((C29503S) obj).f59523a);
    }

    public C29503S(Integer num) {
        this.f59523a = num;
    }

    public final int hashCode() {
        Integer num = this.f59523a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "OtpConfirmation(codeLength=" + this.f59523a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Integer num = this.f59523a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }
}
