package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30112F extends AbstractC30117K {

    @NotNull
    public static final Parcelable.Creator<C30112F> CREATOR = new C30111E();

    /* JADX INFO: renamed from: a */
    public final File f60545a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30112F) && Intrinsics.areEqual(this.f60545a, ((C30112F) obj).f60545a);
    }

    public final int hashCode() {
        File file = this.f60545a;
        if (file == null) {
            return 0;
        }
        return file.hashCode();
    }

    public final String toString() {
        return "Cancelled(file=" + this.f60545a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeSerializable(this.f60545a);
    }

    public C30112F(File file) {
        this.f60545a = file;
    }
}
