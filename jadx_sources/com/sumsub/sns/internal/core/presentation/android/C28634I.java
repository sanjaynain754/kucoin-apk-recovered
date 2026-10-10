package com.sumsub.sns.internal.core.presentation.android;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.analytics.PermissionPayload;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28634I extends AbstractC28635J {

    @NotNull
    public static final Parcelable.Creator<C28634I> CREATOR = new C28633H();

    /* JADX INFO: renamed from: d */
    public final String f58263d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28634I) && Intrinsics.areEqual(this.f58263d, ((C28634I) obj).f58263d);
    }

    public C28634I(String str) {
        super("Notifications_" + str, Build.VERSION.SDK_INT >= 33 ? "android.permission.POST_NOTIFICATIONS" : null, PermissionPayload.NOTIFICATIONS);
        this.f58263d = str;
    }

    public final int hashCode() {
        return this.f58263d.hashCode();
    }

    public final String toString() {
        return "Notifications(channelId=" + this.f58263d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f58263d);
    }
}
