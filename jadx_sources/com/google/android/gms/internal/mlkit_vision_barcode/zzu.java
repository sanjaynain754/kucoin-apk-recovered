package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "BarcodeCreator")
@SafeParcelable.Reserved({1})
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();

    @SafeParcelable.Field(m12889id = 2)
    public int zza;

    @SafeParcelable.Field(m12889id = 3)
    public String zzb;

    @SafeParcelable.Field(m12889id = 4)
    public String zzc;

    @SafeParcelable.Field(m12889id = 5)
    public int zzd;

    @SafeParcelable.Field(m12889id = 6)
    public Point[] zze;

    @SafeParcelable.Field(m12889id = 7)
    public zzn zzf;

    @SafeParcelable.Field(m12889id = 8)
    public zzq zzg;

    @SafeParcelable.Field(m12889id = 9)
    public zzr zzh;

    @SafeParcelable.Field(m12889id = 10)
    public zzt zzi;

    @SafeParcelable.Field(m12889id = 11)
    public zzs zzj;

    @SafeParcelable.Field(m12889id = 12)
    public zzo zzk;

    @SafeParcelable.Field(m12889id = 13)
    public zzk zzl;

    @SafeParcelable.Field(m12889id = 14)
    public zzl zzm;

    @SafeParcelable.Field(m12889id = 15)
    public zzm zzn;

    @SafeParcelable.Field(m12889id = 16)
    public byte[] zzo;

    @SafeParcelable.Field(m12889id = 17)
    public boolean zzp;

    @SafeParcelable.Field(m12889id = 18)
    public double zzq;

    public zzu() {
    }

    @SafeParcelable.Constructor
    public zzu(@SafeParcelable.Param(m12890id = 2) int i11, @SafeParcelable.Param(m12890id = 3) String str, @SafeParcelable.Param(m12890id = 4) String str2, @SafeParcelable.Param(m12890id = 5) int i12, @SafeParcelable.Param(m12890id = 6) Point[] pointArr, @SafeParcelable.Param(m12890id = 7) zzn zznVar, @SafeParcelable.Param(m12890id = 8) zzq zzqVar, @SafeParcelable.Param(m12890id = 9) zzr zzrVar, @SafeParcelable.Param(m12890id = 10) zzt zztVar, @SafeParcelable.Param(m12890id = 11) zzs zzsVar, @SafeParcelable.Param(m12890id = 12) zzo zzoVar, @SafeParcelable.Param(m12890id = 13) zzk zzkVar, @SafeParcelable.Param(m12890id = 14) zzl zzlVar, @SafeParcelable.Param(m12890id = 15) zzm zzmVar, @SafeParcelable.Param(m12890id = 16) byte[] bArr, @SafeParcelable.Param(m12890id = 17) boolean z11, @SafeParcelable.Param(m12890id = 18) double d11) {
        this.zza = i11;
        this.zzb = str;
        this.zzo = bArr;
        this.zzc = str2;
        this.zzd = i12;
        this.zze = pointArr;
        this.zzp = z11;
        this.zzq = d11;
        this.zzf = zznVar;
        this.zzg = zzqVar;
        this.zzh = zzrVar;
        this.zzi = zztVar;
        this.zzj = zzsVar;
        this.zzk = zzoVar;
        this.zzl = zzkVar;
        this.zzm = zzlVar;
        this.zzn = zzmVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.zze, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzj, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.zzl, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzn, i11, false);
        SafeParcelWriter.writeByteArray(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.zzp);
        SafeParcelWriter.writeDouble(parcel, 18, this.zzq);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
