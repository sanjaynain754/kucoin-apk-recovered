package com.sumsub.sns.internal.features.presentation.verification2.host;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sentry.AbstractC27897U;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.host.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32820d implements InterfaceC32823g {

    @NotNull
    public static final Parcelable.Creator<C32820d> CREATOR = new C32819c();

    /* JADX INFO: renamed from: a */
    public final String f67162a;

    /* JADX INFO: renamed from: b */
    public final String f67163b;

    /* JADX INFO: renamed from: c */
    public final int f67164c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32820d)) {
            return false;
        }
        C32820d c32820d = (C32820d) obj;
        return Intrinsics.areEqual(this.f67162a, c32820d.f67162a) && Intrinsics.areEqual(this.f67163b, c32820d.f67163b) && this.f67164c == c32820d.f67164c;
    }

    @Override // com.sumsub.sns.internal.features.presentation.verification2.host.InterfaceC32823g
    /* JADX INFO: renamed from: a */
    public final String mo71350a() {
        return this.f67162a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67164c) + AbstractC27897U.m68983a(this.f67163b, this.f67162a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CodeRequested(identifier=" + this.f67162a + ", verificationId=" + this.f67163b + ", codeLength=" + this.f67164c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f67162a);
        parcel.writeString(this.f67163b);
        parcel.writeInt(this.f67164c);
    }

    public C32820d(String str, String str2, int i11) {
        this.f67162a = str;
        this.f67163b = str2;
        this.f67164c = i11;
    }
}
