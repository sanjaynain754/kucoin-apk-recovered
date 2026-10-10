package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "SmsParcelCreator")
public final class zzxy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxy> CREATOR = new zzyr();

    @Nullable
    @SafeParcelable.Field(getter = "getMessage", m12889id = 1)
    private final String zza;

    @Nullable
    @SafeParcelable.Field(getter = "getPhoneNumber", m12889id = 2)
    private final String zzb;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Nullable
    public final String zza() {
        return this.zza;
    }

    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @SafeParcelable.Constructor
    public zzxy(@Nullable @SafeParcelable.Param(m12890id = 1) String str, @Nullable @SafeParcelable.Param(m12890id = 2) String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
