package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "CalendarEventParcelCreator")
public final class zzxr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxr> CREATOR = new zzyg();

    @Nullable
    @SafeParcelable.Field(getter = "getSummary", m12889id = 1)
    private final String zza;

    @Nullable
    @SafeParcelable.Field(getter = "getDescription", m12889id = 2)
    private final String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getLocation", m12889id = 3)
    private final String zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getOrganizer", m12889id = 4)
    private final String zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getStatus", m12889id = 5)
    private final String zze;

    @Nullable
    @SafeParcelable.Field(getter = "getStart", m12889id = 6)
    private final zzxq zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getEnd", m12889id = 7)
    private final zzxq zzg;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Nullable
    public final zzxq zza() {
        return this.zzg;
    }

    @Nullable
    public final zzxq zzb() {
        return this.zzf;
    }

    @Nullable
    public final String zzc() {
        return this.zzb;
    }

    @Nullable
    public final String zzd() {
        return this.zzc;
    }

    @Nullable
    public final String zze() {
        return this.zzd;
    }

    @Nullable
    public final String zzf() {
        return this.zze;
    }

    @Nullable
    public final String zzg() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public zzxr(@Nullable @SafeParcelable.Param(m12890id = 1) String str, @Nullable @SafeParcelable.Param(m12890id = 2) String str2, @Nullable @SafeParcelable.Param(m12890id = 3) String str3, @Nullable @SafeParcelable.Param(m12890id = 4) String str4, @Nullable @SafeParcelable.Param(m12890id = 5) String str5, @Nullable @SafeParcelable.Param(m12890id = 6) zzxq zzxqVar, @Nullable @SafeParcelable.Param(m12890id = 7) zzxq zzxqVar2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = zzxqVar;
        this.zzg = zzxqVar2;
    }
}
