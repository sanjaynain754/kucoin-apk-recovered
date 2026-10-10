package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "BarcodeScannerOptionsParcelCreator")
public final class zzyd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyd> CREATOR = new zzye();

    @SafeParcelable.Field(getter = "getSupportedFormats", m12889id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "isAllPotentialBarcodesEnabled", m12889id = 2)
    private final boolean zzb;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i12);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzyd(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) boolean z11) {
        this.zza = i11;
        this.zzb = z11;
    }
}
