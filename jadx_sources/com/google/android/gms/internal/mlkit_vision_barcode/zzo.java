package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "GeoPointCreator")
@SafeParcelable.Reserved({1})
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzab();

    @SafeParcelable.Field(m12889id = 2)
    public double zza;

    @SafeParcelable.Field(m12889id = 3)
    public double zzb;

    public zzo() {
    }

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(m12890id = 2) double d11, @SafeParcelable.Param(m12890id = 3) double d12) {
        this.zza = d11;
        this.zzb = d12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 2, this.zza);
        SafeParcelWriter.writeDouble(parcel, 3, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
