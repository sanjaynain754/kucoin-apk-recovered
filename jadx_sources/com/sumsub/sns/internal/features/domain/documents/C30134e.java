package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30134e extends AbstractC30146q {

    @NotNull
    public static final Parcelable.Creator<C30134e> CREATOR = new C30133d();

    /* JADX INFO: renamed from: a */
    public final String f60572a;

    /* JADX INFO: renamed from: b */
    public final String f60573b;

    /* JADX INFO: renamed from: c */
    public final DocumentSideness f60574c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30134e)) {
            return false;
        }
        C30134e c30134e = (C30134e) obj;
        return Intrinsics.areEqual(this.f60572a, c30134e.f60572a) && Intrinsics.areEqual(this.f60573b, c30134e.f60573b) && this.f60574c == c30134e.f60574c;
    }

    public final int hashCode() {
        String str = this.f60572a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f60573b;
        return this.f60574c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CountryOrIdDocTypeChanged(country=" + this.f60572a + ", idDocType=" + this.f60573b + ", sideness=" + this.f60574c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f60572a);
        parcel.writeString(this.f60573b);
        parcel.writeString(this.f60574c.name());
    }

    public C30134e(String str, String str2, DocumentSideness documentSideness) {
        this.f60572a = str;
        this.f60573b = str2;
        this.f60574c = documentSideness;
    }
}
