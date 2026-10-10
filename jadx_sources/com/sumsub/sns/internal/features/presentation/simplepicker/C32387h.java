package com.sumsub.sns.internal.features.presentation.simplepicker;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.simplepicker.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32387h implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C32387h> CREATOR = new C32386g();

    /* JADX INFO: renamed from: a */
    public final String f65972a;

    /* JADX INFO: renamed from: b */
    public final String f65973b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32387h)) {
            return false;
        }
        C32387h c32387h = (C32387h) obj;
        return Intrinsics.areEqual(this.f65972a, c32387h.f65972a) && Intrinsics.areEqual(this.f65973b, c32387h.f65973b);
    }

    public final int hashCode() {
        return this.f65973b.hashCode() + (this.f65972a.hashCode() * 31);
    }

    public final String toString() {
        return "SimplePickerItem(id=" + this.f65972a + ", label=" + this.f65973b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f65972a);
        parcel.writeString(this.f65973b);
    }

    public C32387h(String str, String str2) {
        this.f65972a = str;
        this.f65973b = str2;
    }
}
