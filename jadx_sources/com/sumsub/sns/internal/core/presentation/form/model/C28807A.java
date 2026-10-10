package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28807A implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C28807A> CREATOR = new C28868z();

    /* JADX INFO: renamed from: a */
    public final String f58576a;

    /* JADX INFO: renamed from: b */
    public final String f58577b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28807A)) {
            return false;
        }
        C28807A c28807a = (C28807A) obj;
        return Intrinsics.areEqual(this.f58576a, c28807a.f58576a) && Intrinsics.areEqual(this.f58577b, c28807a.f58577b);
    }

    public final int hashCode() {
        int iHashCode = this.f58576a.hashCode() * 31;
        String str = this.f58577b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "FailedFile(fileId=" + this.f58576a + ", moderationComment=" + this.f58577b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f58576a);
        parcel.writeString(this.f58577b);
    }

    public C28807A(String str, String str2) {
        this.f58576a = str;
        this.f58577b = str2;
    }
}
