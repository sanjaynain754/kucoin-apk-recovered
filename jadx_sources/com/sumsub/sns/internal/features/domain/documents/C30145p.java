package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.domain.C30217h0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30145p extends AbstractC30146q {

    @NotNull
    public static final Parcelable.Creator<C30145p> CREATOR = new C30144o();

    /* JADX INFO: renamed from: a */
    public final boolean f60579a;

    /* JADX INFO: renamed from: b */
    public final List f60580b;

    /* JADX INFO: renamed from: c */
    public final List f60581c;

    /* JADX INFO: renamed from: d */
    public final List f60582d;

    /* JADX INFO: renamed from: e */
    public final String f60583e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30145p)) {
            return false;
        }
        C30145p c30145p = (C30145p) obj;
        return this.f60579a == c30145p.f60579a && Intrinsics.areEqual(this.f60580b, c30145p.f60580b) && Intrinsics.areEqual(this.f60581c, c30145p.f60581c) && Intrinsics.areEqual(this.f60582d, c30145p.f60582d) && Intrinsics.areEqual(this.f60583e, c30145p.f60583e);
    }

    public final int hashCode() {
        return this.f60583e.hashCode() + ((this.f60582d.hashCode() + ((this.f60581c.hashCode() + ((this.f60580b.hashCode() + (Boolean.hashCode(this.f60579a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Warning(isFatal=" + this.f60579a + ", errors=" + this.f60580b + ", availableDocs=" + this.f60581c + ", idDocs=" + this.f60582d + ", idDocType=" + this.f60583e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f60579a ? 1 : 0);
        parcel.writeStringList(this.f60580b);
        parcel.writeStringList(this.f60581c);
        List<C30217h0> list = this.f60582d;
        parcel.writeInt(list.size());
        for (C30217h0 c30217h0 : list) {
            if (c30217h0 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                c30217h0.writeToParcel(parcel, i11);
            }
        }
        parcel.writeString(this.f60583e);
    }

    public C30145p(boolean z11, List list, List list2, List list3, String str) {
        this.f60579a = z11;
        this.f60580b = list;
        this.f60581c = list2;
        this.f60582d = list3;
        this.f60583e = str;
    }
}
