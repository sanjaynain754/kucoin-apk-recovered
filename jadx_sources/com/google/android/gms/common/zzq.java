package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "GoogleCertificatesLookupResponseCreator")
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();

    @SafeParcelable.Field(getter = "getResult", m12889id = 1)
    private final boolean zza;

    @SafeParcelable.Field(getter = "getErrorMessage", m12889id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getStatusValue", m12889id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getFirstPartyStatusValue", m12889id = 4)
    private final int zzd;

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public final int zzc() {
        return zzd.zza(this.zzd);
    }

    public final int zzd() {
        return zzx.zza(this.zzc);
    }

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(m12890id = 1) boolean z11, @SafeParcelable.Param(m12890id = 2) String str, @SafeParcelable.Param(m12890id = 3) int i11, @SafeParcelable.Param(m12890id = 4) int i12) {
        this.zza = z11;
        this.zzb = str;
        this.zzc = zzx.zza(i11) - 1;
        this.zzd = zzd.zza(i12) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
