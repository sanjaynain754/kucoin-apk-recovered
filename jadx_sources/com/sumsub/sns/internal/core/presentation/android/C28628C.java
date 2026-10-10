package com.sumsub.sns.internal.core.presentation.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.analytics.PermissionPayload;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28628C extends AbstractC28636K {

    /* JADX INFO: renamed from: e */
    public static final C28628C f58260e = new C28628C();

    @NotNull
    public static final Parcelable.Creator<C28628C> CREATOR = new C28627B();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(1);
    }

    public C28628C() {
        super("CoarseLocation", "android.permission.ACCESS_COARSE_LOCATION", PermissionPayload.LOCATION_PERMISSION, "sns_alert_lackOfLocationPermissions");
    }
}
