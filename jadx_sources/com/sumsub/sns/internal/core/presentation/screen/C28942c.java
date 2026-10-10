package com.sumsub.sns.internal.core.presentation.screen;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28942c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C28942c> CREATOR = new C28916b();

    /* JADX INFO: renamed from: a */
    public final Integer f58842a;

    /* JADX INFO: renamed from: b */
    public final Integer f58843b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28942c)) {
            return false;
        }
        C28942c c28942c = (C28942c) obj;
        return Intrinsics.areEqual(this.f58842a, c28942c.f58842a) && Intrinsics.areEqual(this.f58843b, c28942c.f58843b);
    }

    public final int hashCode() {
        Integer num = this.f58842a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f58843b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "Otp(codeLength=" + this.f58842a + ", resendTtl=" + this.f58843b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Integer num = this.f58842a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f58843b;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public C28942c(Integer num, Integer num2) {
        this.f58842a = num;
        this.f58843b = num2;
    }
}
