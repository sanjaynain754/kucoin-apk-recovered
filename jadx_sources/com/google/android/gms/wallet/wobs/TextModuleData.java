package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "TextModuleDataCreator")
@SafeParcelable.Reserved({1})
public final class TextModuleData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TextModuleData> CREATOR = new zzk();

    @SafeParcelable.Field(m12889id = 2)
    String zza;

    @SafeParcelable.Field(m12889id = 3)
    String zzb;

    public TextModuleData() {
    }

    @SafeParcelable.Constructor
    public TextModuleData(@NonNull @SafeParcelable.Param(m12890id = 2) String str, @NonNull @SafeParcelable.Param(m12890id = 3) String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @NonNull
    public String getBody() {
        return this.zzb;
    }

    @NonNull
    public String getHeader() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
