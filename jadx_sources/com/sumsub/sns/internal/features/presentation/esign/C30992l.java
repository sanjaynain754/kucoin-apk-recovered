package com.sumsub.sns.internal.features.presentation.esign;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30992l implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C30992l> CREATOR = new C30990k();

    /* JADX INFO: renamed from: a */
    public final String f62629a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30992l) && Intrinsics.areEqual(this.f62629a, ((C30992l) obj).f62629a);
    }

    public final int hashCode() {
        return this.f62629a.hashCode();
    }

    public final String toString() {
        return "ConfirmErrorWithRetry(code=" + this.f62629a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f62629a);
    }

    public C30992l(String str) {
        this.f62629a = str;
    }
}
