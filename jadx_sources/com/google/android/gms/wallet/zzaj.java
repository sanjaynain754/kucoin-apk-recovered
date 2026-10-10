package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "ProxyCardCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzak();

    @SafeParcelable.Field(m12889id = 2)
    final String zza;

    @SafeParcelable.Field(m12889id = 3)
    final String zzb;

    @SafeParcelable.Field(m12889id = 4)
    final int zzc;

    @SafeParcelable.Field(m12889id = 5)
    final int zzd;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzaj(@SafeParcelable.Param(m12890id = 2) String str, @SafeParcelable.Param(m12890id = 3) String str2, @SafeParcelable.Param(m12890id = 4) int i11, @SafeParcelable.Param(m12890id = 5) int i12) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i11;
        this.zzd = i12;
    }
}
