package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "BatchUploadStatusParcelCreator")
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzag();

    @SafeParcelable.Field(m12889id = 1)
    public final long zza;

    @SafeParcelable.Field(m12889id = 2)
    public final int zzb;

    @SafeParcelable.Field(m12889id = 3)
    public final long zzc;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        long j11 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, j11);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzaf(@SafeParcelable.Param(m12890id = 1) long j11, @SafeParcelable.Param(m12890id = 2) int i11, @SafeParcelable.Param(m12890id = 3) long j12) {
        this.zza = j11;
        this.zzb = i11;
        this.zzc = j12;
    }
}
