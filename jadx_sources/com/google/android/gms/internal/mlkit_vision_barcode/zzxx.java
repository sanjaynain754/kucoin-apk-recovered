package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "PhoneParcelCreator")
public final class zzxx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxx> CREATOR = new zzyq();

    @SafeParcelable.Field(getter = "getType", m12889id = 1)
    private final int zza;

    @Nullable
    @SafeParcelable.Field(getter = "getNumber", m12889id = 2)
    private final String zzb;

    public final int zza() {
        return this.zza;
    }

    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @SafeParcelable.Constructor
    public zzxx(@SafeParcelable.Param(m12890id = 1) int i11, @Nullable @SafeParcelable.Param(m12890id = 2) String str) {
        this.zza = i11;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
