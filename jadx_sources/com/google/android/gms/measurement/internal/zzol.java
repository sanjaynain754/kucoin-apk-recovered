package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "UploadBatchParcelCreator")
public final class zzol extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzol> CREATOR = new zzom();

    @SafeParcelable.Field(m12889id = 1)
    public final long zza;

    @SafeParcelable.Field(m12889id = 2)
    public byte[] zzb;

    @SafeParcelable.Field(m12889id = 3)
    public final String zzc;

    @SafeParcelable.Field(m12889id = 4)
    public final Bundle zzd;

    @SafeParcelable.Field(m12889id = 5)
    public final int zze;

    @SafeParcelable.Field(m12889id = 6)
    public final long zzf;

    @SafeParcelable.Field(m12889id = 7)
    public String zzg;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        long j11 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, j11);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeBundle(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeLong(parcel, 6, this.zzf);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzol(@SafeParcelable.Param(m12890id = 1) long j11, @SafeParcelable.Param(m12890id = 2) byte[] bArr, @SafeParcelable.Param(m12890id = 3) String str, @SafeParcelable.Param(m12890id = 4) Bundle bundle, @SafeParcelable.Param(m12890id = 5) int i11, @SafeParcelable.Param(m12890id = 6) long j12, @SafeParcelable.Param(m12890id = 7) String str2) {
        this.zza = j11;
        this.zzb = bArr;
        this.zzc = str;
        this.zzd = bundle;
        this.zze = i11;
        this.zzf = j12;
        this.zzg = str2;
    }
}
