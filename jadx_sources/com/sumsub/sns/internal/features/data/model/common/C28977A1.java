package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.A1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28977A1 extends AbstractC29103d2 {

    @NotNull
    public static final Parcelable.Creator<C28977A1> CREATOR = new C29726z1();

    /* JADX INFO: renamed from: b */
    public final String f58901b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28977A1) && Intrinsics.areEqual(this.f58901b, ((C28977A1) obj).f58901b);
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29103d2
    /* JADX INFO: renamed from: b */
    public final String mo69715b() {
        return this.f58901b;
    }

    public final int hashCode() {
        return this.f58901b.hashCode();
    }

    public final String toString() {
        return "Other(value=" + this.f58901b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f58901b);
    }

    public C28977A1(String str) {
        super(str);
        this.f58901b = str;
    }
}
