package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "CalendarDateTimeCreator")
@SafeParcelable.Reserved({1})
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzw();

    @SafeParcelable.Field(m12889id = 2)
    public int zza;

    @SafeParcelable.Field(m12889id = 3)
    public int zzb;

    @SafeParcelable.Field(m12889id = 4)
    public int zzc;

    @SafeParcelable.Field(m12889id = 5)
    public int zzd;

    @SafeParcelable.Field(m12889id = 6)
    public int zze;

    @SafeParcelable.Field(m12889id = 7)
    public int zzf;

    @SafeParcelable.Field(m12889id = 8)
    public boolean zzg;

    @SafeParcelable.Field(m12889id = 9)
    public String zzh;

    public zzj() {
    }

    @SafeParcelable.Constructor
    public zzj(@SafeParcelable.Param(m12890id = 2) int i11, @SafeParcelable.Param(m12890id = 3) int i12, @SafeParcelable.Param(m12890id = 4) int i13, @SafeParcelable.Param(m12890id = 5) int i14, @SafeParcelable.Param(m12890id = 6) int i15, @SafeParcelable.Param(m12890id = 7) int i16, @SafeParcelable.Param(m12890id = 8) boolean z11, @SafeParcelable.Param(m12890id = 9) String str) {
        this.zza = i11;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = i15;
        this.zzf = i16;
        this.zzg = z11;
        this.zzh = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
