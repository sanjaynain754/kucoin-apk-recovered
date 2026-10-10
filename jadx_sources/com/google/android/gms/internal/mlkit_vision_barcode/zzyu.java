package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "ImageMetadataParcelCreator")
public final class zzyu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyu> CREATOR = new zzyv();

    @SafeParcelable.Field(getter = "getImageFormat", m12889id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getWidth", m12889id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getHeight", m12889id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getRotation", m12889id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "getTimestampMs", m12889id = 5)
    private final long zze;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i12);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeLong(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzyu(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) int i12, @SafeParcelable.Param(m12890id = 3) int i13, @SafeParcelable.Param(m12890id = 4) int i14, @SafeParcelable.Param(m12890id = 5) long j11) {
        this.zza = i11;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = j11;
    }
}
