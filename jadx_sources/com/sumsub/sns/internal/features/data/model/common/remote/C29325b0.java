package com.sumsub.sns.internal.features.data.model.common.remote;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.b0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29325b0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59334a;

    /* JADX INFO: renamed from: b */
    public final Long f59335b;

    /* JADX INFO: renamed from: c */
    public final Long f59336c;

    @NotNull
    public static final C29311Z Companion = new C29311Z();

    @NotNull
    public static final Parcelable.Creator<C29325b0> CREATOR = new C29317a0();

    public /* synthetic */ C29325b0(int i11, String str, Long l11, Long l12) {
        this.f59334a = (i11 & 1) == 0 ? null : str;
        if ((i11 & 2) == 0) {
            this.f59335b = 0L;
        } else {
            this.f59335b = l11;
        }
        if ((i11 & 4) == 0) {
            this.f59336c = 0L;
        } else {
            this.f59336c = l12;
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
        if (!(obj instanceof C29325b0)) {
            return false;
        }
        C29325b0 c29325b0 = (C29325b0) obj;
        return Intrinsics.areEqual(this.f59334a, c29325b0.f59334a) && Intrinsics.areEqual(this.f59335b, c29325b0.f59335b) && Intrinsics.areEqual(this.f59336c, c29325b0.f59336c);
    }

    public final int hashCode() {
        String str = this.f59334a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.f59335b;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f59336c;
        return iHashCode2 + (l12 != null ? l12.hashCode() : 0);
    }

    public final String toString() {
        return "LanguageInfo(language=" + this.f59334a + ", queuePlace=" + this.f59335b + ", waitTimeSec=" + this.f59336c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59334a);
        Long l11 = this.f59335b;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        Long l12 = this.f59336c;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l12.longValue());
        }
    }

    public C29325b0(String str, Long l11, Long l12) {
        this.f59334a = str;
        this.f59335b = l11;
        this.f59336c = l12;
    }
}
