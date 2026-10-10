package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "EmailCreator")
@SafeParcelable.Reserved({1})
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new zzaa();

    @SafeParcelable.Field(m12889id = 2)
    public int zza;

    @SafeParcelable.Field(m12889id = 3)
    public String zzb;

    @SafeParcelable.Field(m12889id = 4)
    public String zzc;

    @SafeParcelable.Field(m12889id = 5)
    public String zzd;

    public zzn() {
    }

    @SafeParcelable.Constructor
    public zzn(@SafeParcelable.Param(m12890id = 2) int i11, @SafeParcelable.Param(m12890id = 3) String str, @SafeParcelable.Param(m12890id = 4) String str2, @SafeParcelable.Param(m12890id = 5) String str3) {
        this.zza = i11;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
