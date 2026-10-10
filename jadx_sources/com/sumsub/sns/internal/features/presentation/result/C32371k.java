package com.sumsub.sns.internal.features.presentation.result;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.result.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32371k implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C32371k> CREATOR = new C32370j();

    /* JADX INFO: renamed from: a */
    public final String f65948a;

    /* JADX INFO: renamed from: b */
    public final String f65949b;

    public C32371k(String str) {
        this.f65948a = str;
        this.f65949b = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32371k)) {
            return false;
        }
        C32371k c32371k = (C32371k) obj;
        return Intrinsics.areEqual(this.f65948a, c32371k.f65948a) && Intrinsics.areEqual(this.f65949b, c32371k.f65949b);
    }

    public final int hashCode() {
        String str = this.f65948a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f65949b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "SNSFinishResultUIText(title=" + this.f65948a + ", subtitle=" + this.f65949b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f65948a);
        parcel.writeString(this.f65949b);
    }

    public C32371k(String str, String str2) {
        this.f65948a = str;
        this.f65949b = str2;
    }
}
