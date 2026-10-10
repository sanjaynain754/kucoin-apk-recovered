package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "MaskedWalletCreator")
@SafeParcelable.Reserved({1})
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new zzt();

    @SafeParcelable.Field(m12889id = 2)
    String zza;

    @SafeParcelable.Field(m12889id = 3)
    String zzb;

    @SafeParcelable.Field(m12889id = 4)
    String[] zzc;

    @SafeParcelable.Field(m12889id = 5)
    String zzd;

    @SafeParcelable.Field(m12889id = 6)
    zza zze;

    @SafeParcelable.Field(m12889id = 7)
    zza zzf;

    @SafeParcelable.Field(m12889id = 8)
    LoyaltyWalletObject[] zzg;

    @SafeParcelable.Field(m12889id = 9)
    OfferWalletObject[] zzh;

    @SafeParcelable.Field(m12889id = 10)
    UserAddress zzi;

    @SafeParcelable.Field(m12889id = 11)
    UserAddress zzj;

    @SafeParcelable.Field(m12889id = 12)
    InstrumentInfo[] zzk;

    private MaskedWallet() {
    }

    @SafeParcelable.Constructor
    public MaskedWallet(@SafeParcelable.Param(m12890id = 2) String str, @SafeParcelable.Param(m12890id = 3) String str2, @SafeParcelable.Param(m12890id = 4) String[] strArr, @SafeParcelable.Param(m12890id = 5) String str3, @SafeParcelable.Param(m12890id = 6) zza zzaVar, @SafeParcelable.Param(m12890id = 7) zza zzaVar2, @SafeParcelable.Param(m12890id = 8) LoyaltyWalletObject[] loyaltyWalletObjectArr, @SafeParcelable.Param(m12890id = 9) OfferWalletObject[] offerWalletObjectArr, @SafeParcelable.Param(m12890id = 10) UserAddress userAddress, @SafeParcelable.Param(m12890id = 11) UserAddress userAddress2, @SafeParcelable.Param(m12890id = 12) InstrumentInfo[] instrumentInfoArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = strArr;
        this.zzd = str3;
        this.zze = zzaVar;
        this.zzf = zzaVar2;
        this.zzg = loyaltyWalletObjectArr;
        this.zzh = offerWalletObjectArr;
        this.zzi = userAddress;
        this.zzj = userAddress2;
        this.zzk = instrumentInfoArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeStringArray(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zze, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i11, false);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzg, i11, false);
        SafeParcelWriter.writeTypedArray(parcel, 9, this.zzh, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzj, i11, false);
        SafeParcelWriter.writeTypedArray(parcel, 12, this.zzk, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
