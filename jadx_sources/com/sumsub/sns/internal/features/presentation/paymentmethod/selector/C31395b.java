package com.sumsub.sns.internal.features.presentation.paymentmethod.selector;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.PhotosAmount;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31395b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C31395b> CREATOR = new C31393a();

    /* JADX INFO: renamed from: a */
    public final PhotosAmount f63619a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31395b) && this.f63619a == ((C31395b) obj).f63619a;
    }

    public final int hashCode() {
        return this.f63619a.hashCode();
    }

    public final String toString() {
        return "BankCardInstructionsPayload(photosAmount=" + this.f63619a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f63619a.writeToParcel(parcel, i11);
    }

    public C31395b(PhotosAmount photosAmount) {
        this.f63619a = photosAmount;
    }
}
