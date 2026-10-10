package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30116J extends AbstractC30117K {

    @NotNull
    public static final Parcelable.Creator<C30116J> CREATOR = new C30115I();

    /* JADX INFO: renamed from: a */
    public final File f60548a;

    /* JADX INFO: renamed from: b */
    public final Integer f60549b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30116J)) {
            return false;
        }
        C30116J c30116j = (C30116J) obj;
        return Intrinsics.areEqual(this.f60548a, c30116j.f60548a) && Intrinsics.areEqual(this.f60549b, c30116j.f60549b);
    }

    public final int hashCode() {
        File file = this.f60548a;
        int iHashCode = (file == null ? 0 : file.hashCode()) * 31;
        Integer num = this.f60549b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Success(file=" + this.f60548a + ", rotation=" + this.f60549b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeSerializable(this.f60548a);
        Integer num = this.f60549b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public C30116J(File file, Integer num) {
        this.f60548a = file;
        this.f60549b = num;
    }
}
