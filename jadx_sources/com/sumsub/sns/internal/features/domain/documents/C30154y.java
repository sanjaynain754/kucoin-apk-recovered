package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30154y extends AbstractC30108B {

    @NotNull
    public static final Parcelable.Creator<C30154y> CREATOR = new C30153x();

    /* JADX INFO: renamed from: a */
    public final C30119M f60596a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30154y) && Intrinsics.areEqual(this.f60596a, ((C30154y) obj).f60596a);
    }

    public final int hashCode() {
        return this.f60596a.hashCode();
    }

    public final String toString() {
        return "PhotoPickerRequestAction(pickerRequest=" + this.f60596a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f60596a.writeToParcel(parcel, i11);
    }

    public C30154y(C30119M c30119m) {
        this.f60596a = c30119m;
    }
}
