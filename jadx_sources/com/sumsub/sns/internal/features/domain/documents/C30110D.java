package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sentry.android.AbstractC27920h;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30110D implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C30110D> CREATOR = new C30109C();

    /* JADX INFO: renamed from: a */
    public final File f60542a;

    /* JADX INFO: renamed from: b */
    public final boolean f60543b;

    /* JADX INFO: renamed from: c */
    public final Integer f60544c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30110D)) {
            return false;
        }
        C30110D c30110d = (C30110D) obj;
        return Intrinsics.areEqual(this.f60542a, c30110d.f60542a) && this.f60543b == c30110d.f60543b && Intrinsics.areEqual(this.f60544c, c30110d.f60544c);
    }

    public final int hashCode() {
        File file = this.f60542a;
        int iM69001a = AbstractC27920h.m69001a(this.f60543b, (file == null ? 0 : file.hashCode()) * 31, 31);
        Integer num = this.f60544c;
        return iM69001a + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "PhotoPreview(file=" + this.f60542a + ", fromGallery=" + this.f60543b + ", rotation=" + this.f60544c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeSerializable(this.f60542a);
        parcel.writeInt(this.f60543b ? 1 : 0);
        Integer num = this.f60544c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public C30110D(File file, boolean z11, Integer num) {
        this.f60542a = file;
        this.f60543b = z11;
        this.f60544c = num;
    }
}
