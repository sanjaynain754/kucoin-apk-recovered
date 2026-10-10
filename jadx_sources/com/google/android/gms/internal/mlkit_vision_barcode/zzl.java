package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "ContactInfoCreator")
@SafeParcelable.Reserved({1})
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzy();

    @SafeParcelable.Field(m12889id = 2)
    public zzp zza;

    @SafeParcelable.Field(m12889id = 3)
    public String zzb;

    @SafeParcelable.Field(m12889id = 4)
    public String zzc;

    @SafeParcelable.Field(m12889id = 5)
    public zzq[] zzd;

    @SafeParcelable.Field(m12889id = 6)
    public zzn[] zze;

    @SafeParcelable.Field(m12889id = 7)
    public String[] zzf;

    @SafeParcelable.Field(m12889id = 8)
    public zzi[] zzg;

    public zzl() {
    }

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param(m12890id = 2) zzp zzpVar, @SafeParcelable.Param(m12890id = 3) String str, @SafeParcelable.Param(m12890id = 4) String str2, @SafeParcelable.Param(m12890id = 5) zzq[] zzqVarArr, @SafeParcelable.Param(m12890id = 6) zzn[] zznVarArr, @SafeParcelable.Param(m12890id = 7) String[] strArr, @SafeParcelable.Param(m12890id = 8) zzi[] zziVarArr) {
        this.zza = zzpVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzqVarArr;
        this.zze = zznVarArr;
        this.zzf = strArr;
        this.zzg = zziVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i11, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.zzd, i11, false);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.zze, i11, false);
        SafeParcelWriter.writeStringArray(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzg, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
