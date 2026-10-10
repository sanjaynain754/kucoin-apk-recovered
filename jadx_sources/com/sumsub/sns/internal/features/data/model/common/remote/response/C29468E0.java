package com.sumsub.sns.internal.features.data.model.common.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.E0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29468E0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59462a;

    /* JADX INFO: renamed from: b */
    public final C29480I0 f59463b;

    @NotNull
    public static final C29462C0 Companion = new C29462C0();

    @NotNull
    public static final Parcelable.Creator<C29468E0> CREATOR = new C29465D0();

    public /* synthetic */ C29468E0(int i11, String str, C29480I0 c29480i0) {
        if ((i11 & 1) == 0) {
            this.f59462a = null;
        } else {
            this.f59462a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59463b = null;
        } else {
            this.f59463b = c29480i0;
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
        if (!(obj instanceof C29468E0)) {
            return false;
        }
        C29468E0 c29468e0 = (C29468E0) obj;
        return Intrinsics.areEqual(this.f59462a, c29468e0.f59462a) && Intrinsics.areEqual(this.f59463b, c29468e0.f59463b);
    }

    public C29468E0(String str, C29480I0 c29480i0) {
        this.f59462a = str;
        this.f59463b = c29480i0;
    }

    public final int hashCode() {
        String str = this.f59462a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C29480I0 c29480i0 = this.f59463b;
        return iHashCode + (c29480i0 != null ? c29480i0.hashCode() : 0);
    }

    public final String toString() {
        return "VideoIdentApplyResponse(token=" + this.f59462a + ", options=" + this.f59463b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59462a);
        C29480I0 c29480i0 = this.f59463b;
        if (c29480i0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(c29480i0.f59487a);
        }
    }
}
