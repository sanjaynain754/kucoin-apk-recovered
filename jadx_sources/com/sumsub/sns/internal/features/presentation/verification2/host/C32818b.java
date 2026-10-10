package com.sumsub.sns.internal.features.presentation.verification2.host;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.host.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32818b implements InterfaceC32823g {

    @NotNull
    public static final Parcelable.Creator<C32818b> CREATOR = new C32817a();

    /* JADX INFO: renamed from: a */
    public final String f67160a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f67161b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32818b)) {
            return false;
        }
        C32818b c32818b = (C32818b) obj;
        return Intrinsics.areEqual(this.f67160a, c32818b.f67160a) && Intrinsics.areEqual(this.f67161b, c32818b.f67161b);
    }

    @Override // com.sumsub.sns.internal.features.presentation.verification2.host.InterfaceC32823g
    /* JADX INFO: renamed from: a */
    public final String mo71350a() {
        return this.f67160a;
    }

    public final int hashCode() {
        int iHashCode = this.f67160a.hashCode() * 31;
        CharSequence charSequence = this.f67161b;
        return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "CodeRequestFailed(identifier=" + this.f67160a + ", errorMessage=" + ((Object) this.f67161b) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f67160a);
        TextUtils.writeToParcel(this.f67161b, parcel, i11);
    }

    public C32818b(CharSequence charSequence, String str) {
        this.f67160a = str;
        this.f67161b = charSequence;
    }
}
