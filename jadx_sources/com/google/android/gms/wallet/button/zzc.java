package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "GetInstrumentAvailabilityResponseCreator")
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();

    @SafeParcelable.Field(getter = "getDefaultInstrumentSuffix", m12889id = 1)
    String zza;

    @SafeParcelable.Field(getter = "getDefaultInstrumentCardNetwork", m12889id = 2)
    int zzb;

    @SafeParcelable.Field(getter = "getBnplEligibility", m12889id = 3)
    boolean zzc;

    @SafeParcelable.Field(getter = "getDefaultInstrumentImageUrl", m12889id = 4)
    String zzd;

    @SafeParcelable.Field(getter = "getDefaultInstrumentName", m12889id = 5)
    String zze;

    @SafeParcelable.Field(getter = "getPrimaryBnplInstrumentImageUrl", m12889id = 6)
    String zzf;

    @SafeParcelable.Field(getter = "getPrimaryBnplInstrumentBrand", m12889id = 7)
    String zzg;

    @SafeParcelable.Field(getter = "getSecondaryBnplInstrumentImageUrl", m12889id = 8)
    String zzh;

    @SafeParcelable.Field(getter = "getSecondaryBnplInstrumentBrand", m12889id = 9)
    String zzi;

    private zzc() {
    }

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param(m12890id = 1) String str, @SafeParcelable.Param(m12890id = 2) int i11, @SafeParcelable.Param(m12890id = 3) boolean z11, @SafeParcelable.Param(m12890id = 4) String str2, @SafeParcelable.Param(m12890id = 5) String str3, @SafeParcelable.Param(m12890id = 6) String str4, @SafeParcelable.Param(m12890id = 7) String str5, @SafeParcelable.Param(m12890id = 8) String str6, @SafeParcelable.Param(m12890id = 9) String str7) {
        this.zza = str;
        this.zzb = i11;
        this.zzc = z11;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
