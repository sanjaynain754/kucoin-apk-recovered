package com.sumsub.sns.internal.features.presentation.sumsubid;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32517e implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C32517e> CREATOR = new C32514d();

    /* JADX INFO: renamed from: a */
    public final boolean f66342a;

    public C32517e() {
        this.f66342a = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32517e) && this.f66342a == ((C32517e) obj).f66342a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66342a);
    }

    public final String toString() {
        return "SNSSumsubIdAgreementState(userConsentAccepted=" + this.f66342a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f66342a ? 1 : 0);
    }

    public C32517e(boolean z11) {
        this.f66342a = z11;
    }
}
