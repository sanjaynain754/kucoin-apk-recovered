package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "PersonNameCreator")
@SafeParcelable.Reserved({1})
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzac();

    @SafeParcelable.Field(m12889id = 2)
    public String zza;

    @SafeParcelable.Field(m12889id = 3)
    public String zzb;

    @SafeParcelable.Field(m12889id = 4)
    public String zzc;

    @SafeParcelable.Field(m12889id = 5)
    public String zzd;

    @SafeParcelable.Field(m12889id = 6)
    public String zze;

    @SafeParcelable.Field(m12889id = 7)
    public String zzf;

    @SafeParcelable.Field(m12889id = 8)
    public String zzg;

    public zzp() {
    }

    @SafeParcelable.Constructor
    public zzp(@SafeParcelable.Param(m12890id = 2) String str, @SafeParcelable.Param(m12890id = 3) String str2, @SafeParcelable.Param(m12890id = 4) String str3, @SafeParcelable.Param(m12890id = 5) String str4, @SafeParcelable.Param(m12890id = 6) String str5, @SafeParcelable.Param(m12890id = 7) String str6, @SafeParcelable.Param(m12890id = 8) String str7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
