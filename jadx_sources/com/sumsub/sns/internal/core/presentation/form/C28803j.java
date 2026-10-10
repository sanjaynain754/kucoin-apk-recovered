package com.sumsub.sns.internal.core.presentation.form;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28803j implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C28803j> CREATOR = new C28802i();

    /* JADX INFO: renamed from: a */
    public final String f58574a;

    /* JADX INFO: renamed from: b */
    public final String f58575b;

    public C28803j() {
        this.f58574a = null;
        this.f58575b = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28803j)) {
            return false;
        }
        C28803j c28803j = (C28803j) obj;
        return Intrinsics.areEqual(this.f58574a, c28803j.f58574a) && Intrinsics.areEqual(this.f58575b, c28803j.f58575b);
    }

    public final int hashCode() {
        String str = this.f58574a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f58575b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ValidationStrings(isRequired=" + this.f58574a + ", isNotValid=" + this.f58575b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f58574a);
        parcel.writeString(this.f58575b);
    }

    public C28803j(String str, String str2) {
        this.f58574a = str;
        this.f58575b = str2;
    }
}
