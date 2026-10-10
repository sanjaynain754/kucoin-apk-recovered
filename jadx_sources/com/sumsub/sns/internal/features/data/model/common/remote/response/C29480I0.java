package com.sumsub.sns.internal.features.data.model.common.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.I0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29480I0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59487a;

    @NotNull
    public static final C29474G0 Companion = new C29474G0();

    @NotNull
    public static final Parcelable.Creator<C29480I0> CREATOR = new C29477H0();

    public /* synthetic */ C29480I0(int i11, String str) {
        if ((i11 & 1) == 0) {
            this.f59487a = null;
        } else {
            this.f59487a = str;
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
        return (obj instanceof C29480I0) && Intrinsics.areEqual(this.f59487a, ((C29480I0) obj).f59487a);
    }

    public C29480I0(String str) {
        this.f59487a = str;
    }

    public final int hashCode() {
        String str = this.f59487a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "VideoIdentOptions(name=" + this.f59487a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59487a);
    }
}
