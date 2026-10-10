package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "FrameMetadataParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new zzao();

    @SafeParcelable.Field(m12889id = 2)
    public int zza;

    @SafeParcelable.Field(m12889id = 3)
    public int zzb;

    @SafeParcelable.Field(m12889id = 4)
    public int zzc;

    @SafeParcelable.Field(m12889id = 5)
    public long zzd;

    @SafeParcelable.Field(m12889id = 6)
    public int zze;

    public zzan() {
    }

    @SafeParcelable.Constructor
    public zzan(@SafeParcelable.Param(m12890id = 2) int i11, @SafeParcelable.Param(m12890id = 3) int i12, @SafeParcelable.Param(m12890id = 4) int i13, @SafeParcelable.Param(m12890id = 5) long j11, @SafeParcelable.Param(m12890id = 6) int i14) {
        this.zza = i11;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = j11;
        this.zze = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
