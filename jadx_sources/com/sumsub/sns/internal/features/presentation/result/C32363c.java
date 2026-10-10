package com.sumsub.sns.internal.features.presentation.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sns.internal.core.analytics.Screen;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.result.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32363c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C32363c> CREATOR = new C32362b();

    /* JADX INFO: renamed from: a */
    public final SNSFinishResultType f65938a;

    /* JADX INFO: renamed from: b */
    public final Screen f65939b;

    /* JADX INFO: renamed from: c */
    public final String f65940c;

    /* JADX INFO: renamed from: d */
    public final C32371k f65941d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32363c)) {
            return false;
        }
        C32363c c32363c = (C32363c) obj;
        return this.f65938a == c32363c.f65938a && this.f65939b == c32363c.f65939b && Intrinsics.areEqual(this.f65940c, c32363c.f65940c) && Intrinsics.areEqual(this.f65941d, c32363c.f65941d);
    }

    public final int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.f65940c, (this.f65939b.hashCode() + (this.f65938a.hashCode() * 31)) * 31, 31);
        C32371k c32371k = this.f65941d;
        return iM68983a + (c32371k == null ? 0 : c32371k.hashCode());
    }

    public final String toString() {
        return "SNSFinishResult(type=" + this.f65938a + ", analyticsScreen=" + this.f65939b + ", stringKey=" + this.f65940c + ", texts=" + this.f65941d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f65938a.name());
        parcel.writeString(this.f65939b.name());
        parcel.writeString(this.f65940c);
        C32371k c32371k = this.f65941d;
        if (c32371k == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(c32371k.f65948a);
        parcel.writeString(c32371k.f65949b);
    }

    public C32363c(SNSFinishResultType sNSFinishResultType, Screen screen, String str, C32371k c32371k) {
        this.f65938a = sNSFinishResultType;
        this.f65939b = screen;
        this.f65940c = str;
        this.f65941d = c32371k;
    }
}
