package com.sumsub.sns.internal.features.presentation.verification2.host;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.host.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32822f implements InterfaceC32823g {

    @NotNull
    public static final Parcelable.Creator<C32822f> CREATOR = new C32821e();

    /* JADX INFO: renamed from: a */
    public final String f67165a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32822f) && Intrinsics.areEqual(this.f67165a, ((C32822f) obj).f67165a);
    }

    @Override // com.sumsub.sns.internal.features.presentation.verification2.host.InterfaceC32823g
    /* JADX INFO: renamed from: a */
    public final String mo71350a() {
        return this.f67165a;
    }

    public final int hashCode() {
        return this.f67165a.hashCode();
    }

    public final String toString() {
        return "Rejected(identifier=" + this.f67165a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f67165a);
    }

    public C32822f(String str) {
        this.f67165a = str;
    }
}
