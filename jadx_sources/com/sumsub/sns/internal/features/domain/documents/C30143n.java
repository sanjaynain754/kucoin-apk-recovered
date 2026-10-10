package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30143n extends AbstractC30146q {

    @NotNull
    public static final Parcelable.Creator<C30143n> CREATOR = new C30142m();

    /* JADX INFO: renamed from: a */
    public final DocumentSideness f60578a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30143n) && this.f60578a == ((C30143n) obj).f60578a;
    }

    public final int hashCode() {
        return this.f60578a.hashCode();
    }

    public final String toString() {
        return "UploadFailed(sideness=" + this.f60578a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f60578a.name());
    }

    public C30143n(DocumentSideness documentSideness) {
        this.f60578a = documentSideness;
    }
}
