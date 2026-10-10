package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "CardInfoCreator")
public final class CardInfo extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CardInfo> CREATOR = new zze();

    @SafeParcelable.Field(m12889id = 1)
    String zza;

    @SafeParcelable.Field(m12889id = 2)
    String zzb;

    @SafeParcelable.Field(m12889id = 3)
    String zzc;

    @SafeParcelable.Field(m12889id = 4)
    int zzd;

    @SafeParcelable.Field(m12889id = 5)
    UserAddress zze;

    private CardInfo() {
    }

    @SafeParcelable.Constructor
    public CardInfo(@SafeParcelable.Param(m12890id = 1) String str, @SafeParcelable.Param(m12890id = 2) String str2, @SafeParcelable.Param(m12890id = 3) String str3, @SafeParcelable.Param(m12890id = 4) int i11, @SafeParcelable.Param(m12890id = 5) UserAddress userAddress) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = i11;
        this.zze = userAddress;
    }

    @Nullable
    public UserAddress getBillingAddress() {
        return this.zze;
    }

    public int getCardClass() {
        int i11 = this.zzd;
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return i11;
        }
        return 0;
    }

    @NonNull
    public String getCardDescription() {
        return this.zza;
    }

    @NonNull
    public String getCardDetails() {
        return this.zzc;
    }

    @NonNull
    public String getCardNetwork() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
