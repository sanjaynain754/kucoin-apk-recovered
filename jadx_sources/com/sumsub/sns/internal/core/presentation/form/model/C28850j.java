package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28850j implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C28850j> CREATOR = new C28848i();

    /* JADX INFO: renamed from: a */
    public final String f58677a;

    /* JADX INFO: renamed from: b */
    public final String f58678b;

    public C28850j() {
        this.f58677a = "upload_document";
        this.f58678b = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28850j)) {
            return false;
        }
        C28850j c28850j = (C28850j) obj;
        return Intrinsics.areEqual(this.f58677a, c28850j.f58677a) && Intrinsics.areEqual(this.f58678b, c28850j.f58678b);
    }

    public final int hashCode() {
        int iHashCode = this.f58677a.hashCode() * 31;
        String str = this.f58678b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ActionDescriptor(action=" + this.f58677a + ", extra=" + this.f58678b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f58677a);
        parcel.writeString(this.f58678b);
    }

    public C28850j(String str, String str2) {
        this.f58677a = str;
        this.f58678b = str2;
    }
}
