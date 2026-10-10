package com.sumsub.sns.internal.features.presentation.main.instructions;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.instructions.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31281f implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C31281f> CREATOR = new C31280e();

    /* JADX INFO: renamed from: a */
    public final C29697t2 f63374a;

    /* JADX INFO: renamed from: b */
    public final Parcelable f63375b;

    /* JADX INFO: renamed from: c */
    public final String f63376c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31281f)) {
            return false;
        }
        C31281f c31281f = (C31281f) obj;
        return Intrinsics.areEqual(this.f63374a, c31281f.f63374a) && Intrinsics.areEqual(this.f63375b, c31281f.f63375b) && Intrinsics.areEqual(this.f63376c, c31281f.f63376c);
    }

    public final int hashCode() {
        int iHashCode = (this.f63375b.hashCode() + (this.f63374a.hashCode() * 31)) * 31;
        String str = this.f63376c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PendingInstructionsData(introParams=" + this.f63374a + ", payload=" + this.f63375b + ", instructionsRequestKey=" + this.f63376c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f63374a.writeToParcel(parcel, i11);
        parcel.writeParcelable(this.f63375b, i11);
        parcel.writeString(this.f63376c);
    }

    public C31281f(C29697t2 c29697t2, Parcelable parcelable, String str) {
        this.f63374a = c29697t2;
        this.f63375b = parcelable;
        this.f63376c = str;
    }
}
