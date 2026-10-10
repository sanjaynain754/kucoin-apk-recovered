package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "GeoPointParcelCreator")
public final class zzxv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxv> CREATOR = new zzyk();

    @SafeParcelable.Field(getter = "getLat", m12889id = 1)
    private final double zza;

    @SafeParcelable.Field(getter = "getLng", m12889id = 2)
    private final double zzb;

    public final double zza() {
        return this.zza;
    }

    public final double zzb() {
        return this.zzb;
    }

    @SafeParcelable.Constructor
    public zzxv(@SafeParcelable.Param(m12890id = 1) double d11, @SafeParcelable.Param(m12890id = 2) double d12) {
        this.zza = d11;
        this.zzb = d12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 1, this.zza);
        SafeParcelWriter.writeDouble(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
