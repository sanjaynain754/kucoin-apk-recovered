package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30114H extends AbstractC30117K {

    @NotNull
    public static final Parcelable.Creator<C30114H> CREATOR = new C30113G();

    /* JADX INFO: renamed from: a */
    public final File f60546a;

    /* JADX INFO: renamed from: b */
    public final boolean f60547b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30114H)) {
            return false;
        }
        C30114H c30114h = (C30114H) obj;
        return Intrinsics.areEqual(this.f60546a, c30114h.f60546a) && this.f60547b == c30114h.f60547b;
    }

    public final int hashCode() {
        File file = this.f60546a;
        return Boolean.hashCode(this.f60547b) + ((file == null ? 0 : file.hashCode()) * 31);
    }

    public final String toString() {
        return "Retake(file=" + this.f60546a + ", fromGallery=" + this.f60547b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeSerializable(this.f60546a);
        parcel.writeInt(this.f60547b ? 1 : 0);
    }

    public C30114H(File file, boolean z11) {
        this.f60546a = file;
        this.f60547b = z11;
    }
}
