package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.C1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28987C1 extends AbstractC29103d2 {

    /* JADX INFO: renamed from: b */
    public static final C28987C1 f58906b = new C28987C1();

    @NotNull
    public static final Parcelable.Creator<C28987C1> CREATOR = new C28982B1();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C28987C1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(1);
    }

    public final String toString() {
        return "Phone";
    }

    public C28987C1() {
        super(HintConstants.AUTOFILL_HINT_PHONE);
    }

    public final int hashCode() {
        return 1443871465;
    }
}
