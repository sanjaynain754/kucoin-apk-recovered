package com.sumsub.sns.internal.features.presentation.sumsubid;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32547o extends AbstractC32550p {

    @NotNull
    public static final Parcelable.Creator<C32547o> CREATOR = new C32544n();

    /* JADX INFO: renamed from: a */
    public final String f66393a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66394b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32547o)) {
            return false;
        }
        C32547o c32547o = (C32547o) obj;
        return Intrinsics.areEqual(this.f66393a, c32547o.f66393a) && Intrinsics.areEqual(this.f66394b, c32547o.f66394b);
    }

    public final int hashCode() {
        String str = this.f66393a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CharSequence charSequence = this.f66394b;
        return iHashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "Section(image=" + this.f66393a + ", title=" + ((Object) this.f66394b) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f66393a);
        TextUtils.writeToParcel(this.f66394b, parcel, i11);
    }

    public C32547o(CharSequence charSequence, String str) {
        this.f66393a = str;
        this.f66394b = charSequence;
    }
}
