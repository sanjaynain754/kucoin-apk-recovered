package com.sumsub.sns.internal.features.presentation.sumsubid;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32557s implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C32557s> CREATOR = new C32555r();

    /* JADX INFO: renamed from: a */
    public final String f66411a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66412b;

    public C32557s(CharSequence charSequence, String str) {
        this.f66411a = str;
        this.f66412b = charSequence;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32557s)) {
            return false;
        }
        C32557s c32557s = (C32557s) obj;
        return Intrinsics.areEqual(this.f66411a, c32557s.f66411a) && Intrinsics.areEqual(this.f66412b, c32557s.f66412b);
    }

    public final int hashCode() {
        String str = this.f66411a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CharSequence charSequence = this.f66412b;
        return iHashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "SNSSumsubIdEmail(email=" + this.f66411a + ", error=" + ((Object) this.f66412b) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f66411a);
        TextUtils.writeToParcel(this.f66412b, parcel, i11);
    }

    public C32557s(String str) {
        this.f66411a = str;
        this.f66412b = null;
    }
}
