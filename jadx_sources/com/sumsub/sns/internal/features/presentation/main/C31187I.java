package com.sumsub.sns.internal.features.presentation.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.Document;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31187I extends AbstractC31234Y {

    @NotNull
    public static final Parcelable.Creator<C31187I> CREATOR = new C31184H();

    /* JADX INFO: renamed from: c */
    public final Document f63050c;

    public C31187I(Document document) {
        super(null, 3);
        this.f63050c = document;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31187I) && Intrinsics.areEqual(this.f63050c, ((C31187I) obj).f63050c);
    }

    public final int hashCode() {
        return this.f63050c.hashCode();
    }

    public final String toString() {
        return "PreviewIdentity(doc=" + this.f63050c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f63050c.writeToParcel(parcel, i11);
    }
}
