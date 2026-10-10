package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "TriggerUriParcelCreator")
public final class zzog extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzog> CREATOR = new zzoh();

    @SafeParcelable.Field(m12889id = 1)
    public final String zza;

    @SafeParcelable.Field(m12889id = 2)
    public final long zzb;

    @SafeParcelable.Field(m12889id = 3)
    public final int zzc;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzog(@SafeParcelable.Param(m12890id = 1) String str, @SafeParcelable.Param(m12890id = 2) long j11, @SafeParcelable.Param(m12890id = 3) int i11) {
        this.zza = str;
        this.zzb = j11;
        this.zzc = i11;
    }
}
