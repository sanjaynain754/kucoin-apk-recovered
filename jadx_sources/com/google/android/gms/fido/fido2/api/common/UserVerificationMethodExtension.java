package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "UserVerificationMethodExtensionCreator")
public class UserVerificationMethodExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UserVerificationMethodExtension> CREATOR = new zzba();

    @SafeParcelable.Field(getter = "getUvm", m12889id = 1)
    private final boolean zza;

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof UserVerificationMethodExtension) && this.zza == ((UserVerificationMethodExtension) obj).zza;
    }

    public boolean getUvm() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza));
    }

    @SafeParcelable.Constructor
    public UserVerificationMethodExtension(@SafeParcelable.Param(m12890id = 1) boolean z11) {
        this.zza = z11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getUvm());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
