package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "CreditCardExpirationDateCreator")
public final class CreditCardExpirationDate extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CreditCardExpirationDate> CREATOR = new zzj();

    @SafeParcelable.Field(m12889id = 1)
    int zza;

    @SafeParcelable.Field(m12889id = 2)
    int zzb;

    public CreditCardExpirationDate() {
    }

    @SafeParcelable.Constructor
    public CreditCardExpirationDate(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) int i12) {
        this.zza = i11;
        this.zzb = i12;
    }

    public int getMonth() {
        return this.zza;
    }

    public int getYear() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
