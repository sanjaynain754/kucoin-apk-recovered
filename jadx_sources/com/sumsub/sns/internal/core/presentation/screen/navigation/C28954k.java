package com.sumsub.sns.internal.core.presentation.screen.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.ValidationIdentifierType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.navigation.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28954k implements InterfaceC28952i {

    @NotNull
    public static final Parcelable.Creator<C28954k> CREATOR = new C28953j();

    /* JADX INFO: renamed from: a */
    public final boolean f58856a;

    /* JADX INFO: renamed from: b */
    public final ValidationIdentifierType f58857b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28954k)) {
            return false;
        }
        C28954k c28954k = (C28954k) obj;
        return this.f58856a == c28954k.f58856a && this.f58857b == c28954k.f58857b;
    }

    public final int hashCode() {
        return this.f58857b.hashCode() + (Boolean.hashCode(this.f58856a) * 31);
    }

    public final String toString() {
        return "Status(isSuccess=" + this.f58856a + ", verificationType=" + this.f58857b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f58856a ? 1 : 0);
        this.f58857b.writeToParcel(parcel, i11);
    }

    public C28954k(boolean z11, ValidationIdentifierType validationIdentifierType) {
        this.f58856a = z11;
        this.f58857b = validationIdentifierType;
    }
}
