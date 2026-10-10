package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "BarcodeParcelCreator")
public final class zzyb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyb> CREATOR = new zzyc();

    @SafeParcelable.Field(getter = "getFormat", m12889id = 1)
    private final int zza;

    @Nullable
    @SafeParcelable.Field(getter = "getDisplayValue", m12889id = 2)
    private final String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getRawValue", m12889id = 3)
    private final String zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getRawBytes", m12889id = 4)
    private final byte[] zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getCornerPoints", m12889id = 5)
    private final Point[] zze;

    @SafeParcelable.Field(getter = "getValueType", m12889id = 6)
    private final int zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getEmailParcel", m12889id = 7)
    private final zzxu zzg;

    @Nullable
    @SafeParcelable.Field(getter = "getPhoneParcel", m12889id = 8)
    private final zzxx zzh;

    @Nullable
    @SafeParcelable.Field(getter = "getSmsParcel", m12889id = 9)
    private final zzxy zzi;

    @Nullable
    @SafeParcelable.Field(getter = "getWiFiParcel", m12889id = 10)
    private final zzya zzj;

    @Nullable
    @SafeParcelable.Field(getter = "getUrlBookmarkParcel", m12889id = 11)
    private final zzxz zzk;

    @Nullable
    @SafeParcelable.Field(getter = "getGeoPointParcel", m12889id = 12)
    private final zzxv zzl;

    @Nullable
    @SafeParcelable.Field(getter = "getCalendarEventParcel", m12889id = 13)
    private final zzxr zzm;

    @Nullable
    @SafeParcelable.Field(getter = "getContactInfoParcel", m12889id = 14)
    private final zzxs zzn;

    @Nullable
    @SafeParcelable.Field(getter = "getDriverLicenseParcel", m12889id = 15)
    private final zzxt zzo;

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzf;
    }

    @Nullable
    public final zzxr zzc() {
        return this.zzm;
    }

    @Nullable
    public final zzxs zzd() {
        return this.zzn;
    }

    @Nullable
    public final zzxt zze() {
        return this.zzo;
    }

    @Nullable
    public final zzxu zzf() {
        return this.zzg;
    }

    @Nullable
    public final zzxv zzg() {
        return this.zzl;
    }

    @Nullable
    public final zzxx zzh() {
        return this.zzh;
    }

    @Nullable
    public final zzxy zzi() {
        return this.zzi;
    }

    @Nullable
    public final zzxz zzj() {
        return this.zzk;
    }

    @Nullable
    public final zzya zzk() {
        return this.zzj;
    }

    @Nullable
    public final String zzl() {
        return this.zzb;
    }

    @Nullable
    public final String zzm() {
        return this.zzc;
    }

    @Nullable
    public final byte[] zzn() {
        return this.zzd;
    }

    @Nullable
    public final Point[] zzo() {
        return this.zze;
    }

    @SafeParcelable.Constructor
    public zzyb(@SafeParcelable.Param(m12890id = 1) int i11, @Nullable @SafeParcelable.Param(m12890id = 2) String str, @Nullable @SafeParcelable.Param(m12890id = 3) String str2, @Nullable @SafeParcelable.Param(m12890id = 4) byte[] bArr, @Nullable @SafeParcelable.Param(m12890id = 5) Point[] pointArr, @SafeParcelable.Param(m12890id = 6) int i12, @Nullable @SafeParcelable.Param(m12890id = 7) zzxu zzxuVar, @Nullable @SafeParcelable.Param(m12890id = 8) zzxx zzxxVar, @Nullable @SafeParcelable.Param(m12890id = 9) zzxy zzxyVar, @Nullable @SafeParcelable.Param(m12890id = 10) zzya zzyaVar, @Nullable @SafeParcelable.Param(m12890id = 11) zzxz zzxzVar, @Nullable @SafeParcelable.Param(m12890id = 12) zzxv zzxvVar, @Nullable @SafeParcelable.Param(m12890id = 13) zzxr zzxrVar, @Nullable @SafeParcelable.Param(m12890id = 14) zzxs zzxsVar, @Nullable @SafeParcelable.Param(m12890id = 15) zzxt zzxtVar) {
        this.zza = i11;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = pointArr;
        this.zzf = i12;
        this.zzg = zzxuVar;
        this.zzh = zzxxVar;
        this.zzi = zzxyVar;
        this.zzj = zzyaVar;
        this.zzk = zzxzVar;
        this.zzl = zzxvVar;
        this.zzm = zzxrVar;
        this.zzn = zzxsVar;
        this.zzo = zzxtVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.zze, i11, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzj, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzl, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.zzm, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzn, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzo, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
