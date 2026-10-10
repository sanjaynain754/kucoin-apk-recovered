package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30138i extends AbstractC30139j {

    @NotNull
    public static final Parcelable.Creator<C30138i> CREATOR = new C30137h();

    /* JADX INFO: renamed from: a */
    public final AbstractC28978A2 f60576a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30138i) && Intrinsics.areEqual(this.f60576a, ((C30138i) obj).f60576a);
    }

    public final int hashCode() {
        return this.f60576a.hashCode();
    }

    public final String toString() {
        return "Success(mrtd=" + this.f60576a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f60576a, i11);
    }

    public C30138i(AbstractC28978A2 abstractC28978A2) {
        this.f60576a = abstractC28978A2;
    }
}
