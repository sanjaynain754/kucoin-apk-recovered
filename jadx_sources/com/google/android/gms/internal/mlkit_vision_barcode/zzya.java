package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "WiFiParcelCreator")
public final class zzya extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzya> CREATOR = new zzyt();

    @Nullable
    @SafeParcelable.Field(getter = "getSsid", m12889id = 1)
    private final String zza;

    @Nullable
    @SafeParcelable.Field(getter = "getPassword", m12889id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getEncryptionType", m12889id = 3)
    private final int zzc;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zzc;
    }

    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @Nullable
    public final String zzc() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public zzya(@Nullable @SafeParcelable.Param(m12890id = 1) String str, @Nullable @SafeParcelable.Param(m12890id = 2) String str2, @SafeParcelable.Param(m12890id = 3) int i11) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i11;
    }
}
