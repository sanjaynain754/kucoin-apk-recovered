package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.Document;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30141l extends AbstractC30146q {

    @NotNull
    public static final Parcelable.Creator<C30141l> CREATOR = new C30140k();

    /* JADX INFO: renamed from: a */
    public final Document f60577a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30141l) && Intrinsics.areEqual(this.f60577a, ((C30141l) obj).f60577a);
    }

    public final int hashCode() {
        return this.f60577a.hashCode();
    }

    public final String toString() {
        return "Success(document=" + this.f60577a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f60577a.writeToParcel(parcel, i11);
    }

    public C30141l(Document document) {
        this.f60577a = document;
    }
}
