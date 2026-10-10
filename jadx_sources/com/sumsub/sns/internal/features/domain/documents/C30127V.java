package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.V */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30127V implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C30127V> CREATOR = new C30126U();

    /* JADX INFO: renamed from: a */
    public final List f60565a;

    /* JADX INFO: renamed from: b */
    public final AbstractC30146q f60566b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30127V)) {
            return false;
        }
        C30127V c30127v = (C30127V) obj;
        return Intrinsics.areEqual(this.f60565a, c30127v.f60565a) && Intrinsics.areEqual(this.f60566b, c30127v.f60566b);
    }

    public final int hashCode() {
        return this.f60566b.hashCode() + (this.f60565a.hashCode() * 31);
    }

    public final String toString() {
        return "UploadedDocumentResult(results=" + this.f60565a + ", outcome=" + this.f60566b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        List list = this.f60565a;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C29054T) it.next()).writeToParcel(parcel, i11);
        }
        parcel.writeParcelable(this.f60566b, i11);
    }

    public C30127V(List list, AbstractC30146q abstractC30146q) {
        this.f60565a = list;
        this.f60566b = abstractC30146q;
    }
}
