package com.sumsub.sns.internal.features.presentation.main;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31342s extends AbstractC31234Y {

    /* JADX INFO: renamed from: c */
    public static final C31342s f63531c = new C31342s();

    @NotNull
    public static final Parcelable.Creator<C31342s> CREATOR = new C31339r();

    public C31342s() {
        super(null, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(1);
    }
}
