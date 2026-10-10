package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "InitializationParamsCreator")
@SafeParcelable.Reserved({4, 5, 6})
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();

    @SafeParcelable.Field(m12889id = 1)
    public final long zza;

    @SafeParcelable.Field(m12889id = 2)
    public final long zzb;

    @SafeParcelable.Field(m12889id = 3)
    public final boolean zzc;

    @Nullable
    @SafeParcelable.Field(m12889id = 7)
    public final Bundle zzd;

    @Nullable
    @SafeParcelable.Field(m12889id = 8)
    public final String zze;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        long j11 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, j11);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBundle(parcel, 7, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 8, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzdd(@SafeParcelable.Param(m12890id = 1) long j11, @SafeParcelable.Param(m12890id = 2) long j12, @SafeParcelable.Param(m12890id = 3) boolean z11, @Nullable @SafeParcelable.Param(m12890id = 7) Bundle bundle, @Nullable @SafeParcelable.Param(m12890id = 8) String str) {
        this.zza = j11;
        this.zzb = j12;
        this.zzc = z11;
        this.zzd = bundle;
        this.zze = str;
    }
}
