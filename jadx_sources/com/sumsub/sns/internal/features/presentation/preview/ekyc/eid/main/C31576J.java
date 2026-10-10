package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import android.os.Parcel;
import android.os.Parcelable;
import de.authada.library.api.SecretWrong;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31576J extends AbstractC31595T {

    @NotNull
    public static final Parcelable.Creator<C31576J> CREATOR = new C31574I();

    /* JADX INFO: renamed from: a */
    public final SecretWrong f64116a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31576J) && this.f64116a == ((C31576J) obj).f64116a;
    }

    public final int hashCode() {
        SecretWrong secretWrong = this.f64116a;
        if (secretWrong == null) {
            return 0;
        }
        return secretWrong.hashCode();
    }

    public final String toString() {
        return "RequestPin(triesLeft=" + this.f64116a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        SecretWrong secretWrong = this.f64116a;
        if (secretWrong == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(secretWrong.name());
        }
    }

    public C31576J(SecretWrong secretWrong) {
        this.f64116a = secretWrong;
    }
}
