package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "SetUpBiometricAuthenticationKeysResponseCreator")
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzj();

    @SafeParcelable.Field(m12889id = 1)
    final byte[] zza;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        byte[] bArr = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzi(@SafeParcelable.Param(m12890id = 1) byte[] bArr) {
        this.zza = bArr;
    }
}
