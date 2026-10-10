package com.sumsub.sns.internal.core.presentation.form;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28801h implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C28801h> CREATOR = new C28800g();

    /* JADX INFO: renamed from: a */
    public final int f58570a;

    /* JADX INFO: renamed from: b */
    public final String f58571b;

    /* JADX INFO: renamed from: c */
    public final String f58572c;

    /* JADX INFO: renamed from: d */
    public final List f58573d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28801h)) {
            return false;
        }
        C28801h c28801h = (C28801h) obj;
        return this.f58570a == c28801h.f58570a && Intrinsics.areEqual(this.f58571b, c28801h.f58571b) && Intrinsics.areEqual(this.f58572c, c28801h.f58572c) && Intrinsics.areEqual(this.f58573d, c28801h.f58573d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f58570a) * 31;
        String str = this.f58571b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f58572c;
        return this.f58573d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Page(index=" + this.f58570a + ", title=" + this.f58571b + ", subtitle=" + this.f58572c + ", items=" + this.f58573d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f58570a);
        parcel.writeString(this.f58571b);
        parcel.writeString(this.f58572c);
        List list = this.f58573d;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i11);
        }
    }

    public C28801h(int i11, String str, String str2, List list) {
        this.f58570a = i11;
        this.f58571b = str;
        this.f58572c = str2;
        this.f58573d = list;
    }
}
