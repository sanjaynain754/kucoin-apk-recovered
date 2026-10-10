package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "EmailParcelCreator")
public final class zzxu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxu> CREATOR = new zzyj();

    @SafeParcelable.Field(getter = "getType", m12889id = 1)
    private final int zza;

    @Nullable
    @SafeParcelable.Field(getter = "getAddress", m12889id = 2)
    private final String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getSubject", m12889id = 3)
    private final String zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getBody", m12889id = 4)
    private final String zzd;

    public final int zza() {
        return this.zza;
    }

    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @Nullable
    public final String zzc() {
        return this.zzd;
    }

    @Nullable
    public final String zzd() {
        return this.zzc;
    }

    @SafeParcelable.Constructor
    public zzxu(@SafeParcelable.Param(m12890id = 1) int i11, @Nullable @SafeParcelable.Param(m12890id = 2) String str, @Nullable @SafeParcelable.Param(m12890id = 3) String str2, @Nullable @SafeParcelable.Param(m12890id = 4) String str3) {
        this.zza = i11;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
