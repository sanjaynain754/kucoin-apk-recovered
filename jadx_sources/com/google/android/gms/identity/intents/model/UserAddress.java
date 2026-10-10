package com.google.android.gms.identity.intents.model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.AddressConstants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "UserAddressCreator")
@SafeParcelable.Reserved({1})
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<UserAddress> CREATOR = new zzb();

    @SafeParcelable.Field(m12889id = 2)
    String zza;

    @SafeParcelable.Field(m12889id = 3)
    String zzb;

    @SafeParcelable.Field(m12889id = 4)
    String zzc;

    @SafeParcelable.Field(m12889id = 5)
    String zzd;

    @SafeParcelable.Field(m12889id = 6)
    String zze;

    @SafeParcelable.Field(m12889id = 7)
    String zzf;

    @SafeParcelable.Field(m12889id = 8)
    String zzg;

    @SafeParcelable.Field(m12889id = 9)
    String zzh;

    @SafeParcelable.Field(m12889id = 10)
    String zzi;

    @SafeParcelable.Field(m12889id = 11)
    String zzj;

    @SafeParcelable.Field(m12889id = 12)
    String zzk;

    @SafeParcelable.Field(m12889id = 13)
    String zzl;

    @SafeParcelable.Field(m12889id = 14)
    boolean zzm;

    @SafeParcelable.Field(m12889id = 15)
    String zzn;

    @SafeParcelable.Field(m12889id = 16)
    String zzo;

    public UserAddress() {
    }

    @SafeParcelable.Constructor
    public UserAddress(@SafeParcelable.Param(m12890id = 2) String str, @SafeParcelable.Param(m12890id = 3) String str2, @SafeParcelable.Param(m12890id = 4) String str3, @SafeParcelable.Param(m12890id = 5) String str4, @SafeParcelable.Param(m12890id = 6) String str5, @SafeParcelable.Param(m12890id = 7) String str6, @SafeParcelable.Param(m12890id = 8) String str7, @SafeParcelable.Param(m12890id = 9) String str8, @SafeParcelable.Param(m12890id = 10) String str9, @SafeParcelable.Param(m12890id = 11) String str10, @SafeParcelable.Param(m12890id = 12) String str11, @SafeParcelable.Param(m12890id = 13) String str12, @SafeParcelable.Param(m12890id = 14) boolean z11, @SafeParcelable.Param(m12890id = 15) String str13, @SafeParcelable.Param(m12890id = 16) String str14) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = str11;
        this.zzl = str12;
        this.zzm = z11;
        this.zzn = str13;
        this.zzo = str14;
    }

    @Nullable
    public static UserAddress fromIntent(@NonNull Intent intent) {
        if (intent == null || !intent.hasExtra(AddressConstants.Extras.EXTRA_ADDRESS)) {
            return null;
        }
        return (UserAddress) intent.getParcelableExtra(AddressConstants.Extras.EXTRA_ADDRESS);
    }

    @NonNull
    public String getAddress1() {
        return this.zzb;
    }

    @NonNull
    public String getAddress2() {
        return this.zzc;
    }

    @NonNull
    public String getAddress3() {
        return this.zzd;
    }

    @NonNull
    public String getAddress4() {
        return this.zze;
    }

    @NonNull
    public String getAddress5() {
        return this.zzf;
    }

    @NonNull
    public String getAdministrativeArea() {
        return this.zzg;
    }

    @NonNull
    public String getCompanyName() {
        return this.zzn;
    }

    @NonNull
    public String getCountryCode() {
        return this.zzi;
    }

    @NonNull
    public String getEmailAddress() {
        return this.zzo;
    }

    @NonNull
    public String getLocality() {
        return this.zzh;
    }

    @NonNull
    public String getName() {
        return this.zza;
    }

    @NonNull
    public String getPhoneNumber() {
        return this.zzl;
    }

    @NonNull
    public String getPostalCode() {
        return this.zzj;
    }

    @NonNull
    public String getSortingCode() {
        return this.zzk;
    }

    public boolean isPostBox() {
        return this.zzm;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        SafeParcelWriter.writeString(parcel, 15, this.zzn, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzo, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
