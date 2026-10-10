package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30107A extends AbstractC30108B {

    @NotNull
    public static final Parcelable.Creator<C30107A> CREATOR = new C30155z();

    /* JADX INFO: renamed from: a */
    public final C30119M f60541a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30107A) && Intrinsics.areEqual(this.f60541a, ((C30107A) obj).f60541a);
    }

    public final int hashCode() {
        return this.f60541a.hashCode();
    }

    public final String toString() {
        return "SelfieRequestAction(pickerRequest=" + this.f60541a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f60541a.writeToParcel(parcel, i11);
    }

    public C30107A(C30119M c30119m) {
        this.f60541a = c30119m;
    }
}
