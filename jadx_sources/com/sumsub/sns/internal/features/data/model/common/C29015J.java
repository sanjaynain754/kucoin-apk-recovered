package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29015J implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C29015J> CREATOR = new C29011I();

    /* JADX INFO: renamed from: a */
    public final List f58957a;

    /* JADX INFO: renamed from: b */
    public final boolean f58958b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29015J)) {
            return false;
        }
        C29015J c29015j = (C29015J) obj;
        return Intrinsics.areEqual(this.f58957a, c29015j.f58957a) && this.f58958b == c29015j.f58958b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58958b) + (this.f58957a.hashCode() * 31);
    }

    public final String toString() {
        return "CompositeDocumentPickerResult(results=" + this.f58957a + ", isSeamless=" + this.f58958b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        List list = this.f58957a;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C29054T) it.next()).writeToParcel(parcel, i11);
        }
        parcel.writeInt(this.f58958b ? 1 : 0);
    }

    public C29015J(List list, boolean z11) {
        this.f58957a = list;
        this.f58958b = z11;
    }
}
