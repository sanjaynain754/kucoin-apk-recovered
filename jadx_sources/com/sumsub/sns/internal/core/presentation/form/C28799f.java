package com.sumsub.sns.internal.core.presentation.form;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28799f implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C28799f> CREATOR = new C28798e();

    /* JADX INFO: renamed from: e */
    public static final C28799f f58565e = new C28799f(0, CollectionsKt.emptyList(), null, new C28803j());

    /* JADX INFO: renamed from: a */
    public final int f58566a;

    /* JADX INFO: renamed from: b */
    public final List f58567b;

    /* JADX INFO: renamed from: c */
    public final String f58568c;

    /* JADX INFO: renamed from: d */
    public final C28803j f58569d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28799f)) {
            return false;
        }
        C28799f c28799f = (C28799f) obj;
        return this.f58566a == c28799f.f58566a && Intrinsics.areEqual(this.f58567b, c28799f.f58567b) && Intrinsics.areEqual(this.f58568c, c28799f.f58568c) && Intrinsics.areEqual(this.f58569d, c28799f.f58569d);
    }

    /* JADX INFO: renamed from: a */
    public static C28799f m69615a(C28799f c28799f, int i11, List list, String str, C28803j c28803j, int i12) {
        if ((i12 & 1) != 0) {
            i11 = c28799f.f58566a;
        }
        if ((i12 & 2) != 0) {
            list = c28799f.f58567b;
        }
        if ((i12 & 4) != 0) {
            str = c28799f.f58568c;
        }
        if ((i12 & 8) != 0) {
            c28803j = c28799f.f58569d;
        }
        c28799f.getClass();
        return new C28799f(i11, list, str, c28803j);
    }

    public final int hashCode() {
        int iHashCode = (this.f58567b.hashCode() + (Integer.hashCode(this.f58566a) * 31)) * 31;
        String str = this.f58568c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C28803j c28803j = this.f58569d;
        return iHashCode2 + (c28803j != null ? c28803j.hashCode() : 0);
    }

    public final String toString() {
        return "FormViewState(currentPageIndex=" + this.f58566a + ", pages=" + this.f58567b + ", mimeTypes=" + this.f58568c + ", validationStrings=" + this.f58569d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f58566a);
        List list = this.f58567b;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C28801h) it.next()).writeToParcel(parcel, i11);
        }
        parcel.writeString(this.f58568c);
        C28803j c28803j = this.f58569d;
        if (c28803j == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(c28803j.f58574a);
        parcel.writeString(c28803j.f58575b);
    }

    public C28799f(int i11, List list, String str, C28803j c28803j) {
        this.f58566a = i11;
        this.f58567b = list;
        this.f58568c = str;
        this.f58569d = c28803j;
    }
}
