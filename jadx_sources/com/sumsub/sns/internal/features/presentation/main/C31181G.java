package com.sumsub.sns.internal.features.presentation.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.Document;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31181G extends AbstractC31234Y {

    @NotNull
    public static final Parcelable.Creator<C31181G> CREATOR = new C31178F();

    /* JADX INFO: renamed from: c */
    public final Document f63042c;

    public C31181G(Document document) {
        super(null);
        this.f63042c = document;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31181G) && Intrinsics.areEqual(this.f63042c, ((C31181G) obj).f63042c);
    }

    public final int hashCode() {
        return this.f63042c.hashCode();
    }

    public final String toString() {
        return "PaymentMethods(doc=" + this.f63042c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f63042c.writeToParcel(parcel, i11);
    }
}
