package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.n3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29164n3 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C29164n3> CREATOR = new C29158m3();

    /* JADX INFO: renamed from: a */
    public final String f59159a;

    /* JADX INFO: renamed from: b */
    public final String f59160b;

    /* JADX INFO: renamed from: c */
    public final ReviewAnswerType f59161c;

    /* JADX INFO: renamed from: d */
    public final List f59162d;

    /* JADX INFO: renamed from: e */
    public final ReviewRejectType f59163e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29164n3)) {
            return false;
        }
        C29164n3 c29164n3 = (C29164n3) obj;
        return Intrinsics.areEqual(this.f59159a, c29164n3.f59159a) && Intrinsics.areEqual(this.f59160b, c29164n3.f59160b) && this.f59161c == c29164n3.f59161c && Intrinsics.areEqual(this.f59162d, c29164n3.f59162d) && this.f59163e == c29164n3.f59163e;
    }

    public final int hashCode() {
        String str = this.f59159a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59160b;
        return this.f59163e.hashCode() + ((this.f59162d.hashCode() + ((this.f59161c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ReviewResult(moderationComment=" + this.f59159a + ", clientComment=" + this.f59160b + ", answer=" + this.f59161c + ", rejectLabels=" + this.f59162d + ", reviewRejectType=" + this.f59163e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59159a);
        parcel.writeString(this.f59160b);
        parcel.writeString(this.f59161c.name());
        parcel.writeStringList(this.f59162d);
        parcel.writeString(this.f59163e.name());
    }

    public C29164n3(String str, String str2, ReviewAnswerType reviewAnswerType, List list, ReviewRejectType reviewRejectType) {
        this.f59159a = str;
        this.f59160b = str2;
        this.f59161c = reviewAnswerType;
        this.f59162d = list;
        this.f59163e = reviewRejectType;
    }
}
