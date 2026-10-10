package com.sumsub.sns.internal.core.presentation.screen.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.navigation.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28947d implements InterfaceC28952i {

    /* JADX INFO: renamed from: a */
    public static final C28947d f58850a = new C28947d();

    @NotNull
    public static final Parcelable.Creator<C28947d> CREATOR = new C28946c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C28947d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(1);
    }

    public final String toString() {
        return "EmailInput";
    }

    public final int hashCode() {
        return -973752678;
    }
}
