package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30148s implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C30148s> CREATOR = new C30147r();

    /* JADX INFO: renamed from: a */
    public final C29070X f60584a;

    /* JADX INFO: renamed from: b */
    public final String f60585b;

    /* JADX INFO: renamed from: c */
    public final String[] f60586c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30148s)) {
            return false;
        }
        C30148s c30148s = (C30148s) obj;
        return Intrinsics.areEqual(this.f60584a, c30148s.f60584a) && Intrinsics.areEqual(this.f60585b, c30148s.f60585b) && Intrinsics.areEqual(this.f60586c, c30148s.f60586c);
    }

    public final int hashCode() {
        int iHashCode = this.f60584a.f59014a.hashCode() * 31;
        String str = this.f60585b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Arrays.hashCode(this.f60586c);
    }

    public final String toString() {
        return "GalleryRequest(type=" + this.f60584a + ", countryCode=" + this.f60585b + ", mimeTypes=" + Arrays.toString(this.f60586c) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f60584a.f59014a);
        parcel.writeString(this.f60585b);
        parcel.writeStringArray(this.f60586c);
    }

    public C30148s(C29070X c29070x, String str, String[] strArr) {
        this.f60584a = c29070x;
        this.f60585b = str;
        this.f60586c = strArr;
    }
}
