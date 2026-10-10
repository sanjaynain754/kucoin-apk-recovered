package com.sumsub.sns.internal.core.presentation.android;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28647e implements InterfaceC28649f {

    /* JADX INFO: renamed from: a */
    public static final C28647e f58280a = new C28647e();

    @NotNull
    public static final Parcelable.Creator<C28647e> CREATOR = new C28645d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(1);
    }
}
