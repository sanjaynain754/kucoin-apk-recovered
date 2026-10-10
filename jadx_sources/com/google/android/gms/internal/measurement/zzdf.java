package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "ScionActivityInfoCreator")
public final class zzdf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdf> CREATOR = new zzdg();

    @SafeParcelable.Field(m12889id = 1)
    public final int zza;

    @Nullable
    @SafeParcelable.Field(m12889id = 2)
    public final String zzb;

    @Nullable
    @SafeParcelable.Field(m12889id = 3)
    public final Intent zzc;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdf)) {
            return false;
        }
        zzdf zzdfVar = (zzdf) obj;
        return this.zza == zzdfVar.zza && Objects.equals(this.zzb, zzdfVar.zzb) && Objects.equals(this.zzc, zzdfVar.zzc);
    }

    public static zzdf zza(Activity activity) {
        return new zzdf(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int i12 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i12);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzdf(@SafeParcelable.Param(m12890id = 1) int i11, @Nullable @SafeParcelable.Param(m12890id = 2) String str, @Nullable @SafeParcelable.Param(m12890id = 3) Intent intent) {
        this.zza = i11;
        this.zzb = str;
        this.zzc = intent;
    }
}
