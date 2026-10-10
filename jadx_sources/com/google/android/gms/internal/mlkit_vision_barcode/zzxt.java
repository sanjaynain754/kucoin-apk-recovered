package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "DriverLicenseParcelCreator")
public final class zzxt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxt> CREATOR = new zzyi();

    @Nullable
    @SafeParcelable.Field(getter = "getDocumentType", m12889id = 1)
    private final String zza;

    @Nullable
    @SafeParcelable.Field(getter = "getFirstName", m12889id = 2)
    private final String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getMiddleName", m12889id = 3)
    private final String zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getLastName", m12889id = 4)
    private final String zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getGender", m12889id = 5)
    private final String zze;

    @Nullable
    @SafeParcelable.Field(getter = "getAddressStreet", m12889id = 6)
    private final String zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getAddressCity", m12889id = 7)
    private final String zzg;

    @Nullable
    @SafeParcelable.Field(getter = "getAddressState", m12889id = 8)
    private final String zzh;

    @Nullable
    @SafeParcelable.Field(getter = "getAddressZip", m12889id = 9)
    private final String zzi;

    @Nullable
    @SafeParcelable.Field(getter = "getLicenseNumber", m12889id = 10)
    private final String zzj;

    @Nullable
    @SafeParcelable.Field(getter = "getIssueDate", m12889id = 11)
    private final String zzk;

    @Nullable
    @SafeParcelable.Field(getter = "getExpiryDate", m12889id = 12)
    private final String zzl;

    @Nullable
    @SafeParcelable.Field(getter = "getBirthDate", m12889id = 13)
    private final String zzm;

    @Nullable
    @SafeParcelable.Field(getter = "getIssuingCountry", m12889id = 14)
    private final String zzn;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzk, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzl, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzm, false);
        SafeParcelWriter.writeString(parcel, 14, this.zzn, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Nullable
    public final String zza() {
        return this.zzg;
    }

    @Nullable
    public final String zzb() {
        return this.zzh;
    }

    @Nullable
    public final String zzc() {
        return this.zzf;
    }

    @Nullable
    public final String zzd() {
        return this.zzi;
    }

    @Nullable
    public final String zze() {
        return this.zzm;
    }

    @Nullable
    public final String zzf() {
        return this.zza;
    }

    @Nullable
    public final String zzg() {
        return this.zzl;
    }

    @Nullable
    public final String zzh() {
        return this.zzb;
    }

    @Nullable
    public final String zzi() {
        return this.zze;
    }

    @Nullable
    public final String zzj() {
        return this.zzk;
    }

    @Nullable
    public final String zzk() {
        return this.zzn;
    }

    @Nullable
    public final String zzl() {
        return this.zzd;
    }

    @Nullable
    public final String zzm() {
        return this.zzj;
    }

    @Nullable
    public final String zzn() {
        return this.zzc;
    }

    @SafeParcelable.Constructor
    public zzxt(@Nullable @SafeParcelable.Param(m12890id = 1) String str, @Nullable @SafeParcelable.Param(m12890id = 2) String str2, @Nullable @SafeParcelable.Param(m12890id = 3) String str3, @Nullable @SafeParcelable.Param(m12890id = 4) String str4, @Nullable @SafeParcelable.Param(m12890id = 5) String str5, @Nullable @SafeParcelable.Param(m12890id = 6) String str6, @Nullable @SafeParcelable.Param(m12890id = 7) String str7, @Nullable @SafeParcelable.Param(m12890id = 8) String str8, @Nullable @SafeParcelable.Param(m12890id = 9) String str9, @Nullable @SafeParcelable.Param(m12890id = 10) String str10, @Nullable @SafeParcelable.Param(m12890id = 11) String str11, @Nullable @SafeParcelable.Param(m12890id = 12) String str12, @Nullable @SafeParcelable.Param(m12890id = 13) String str13, @Nullable @SafeParcelable.Param(m12890id = 14) String str14) {
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
        this.zzm = str13;
        this.zzn = str14;
    }
}
