package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30132c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C30132c> CREATOR = new C30130b();

    /* JADX INFO: renamed from: a */
    public final int f60571a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30132c) && this.f60571a == ((C30132c) obj).f60571a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f60571a);
    }

    public final String toString() {
        return "DocumentProperties(rotation=" + this.f60571a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f60571a);
    }

    public C30132c(int i11) {
        this.f60571a = i11;
    }
}
