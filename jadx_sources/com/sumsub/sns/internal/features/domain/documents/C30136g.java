package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30136g extends AbstractC30139j {

    @NotNull
    public static final Parcelable.Creator<C30136g> CREATOR = new C30135f();

    /* JADX INFO: renamed from: a */
    public final Exception f60575a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30136g) && Intrinsics.areEqual(this.f60575a, ((C30136g) obj).f60575a);
    }

    public final int hashCode() {
        return this.f60575a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.f60575a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeSerializable(this.f60575a);
    }

    public C30136g(Exception exc) {
        this.f60575a = exc;
    }
}
