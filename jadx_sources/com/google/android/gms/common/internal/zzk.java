package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "ConnectionInfoCreator")
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();

    @SafeParcelable.Field(m12889id = 1)
    Bundle zza;

    @SafeParcelable.Field(m12889id = 2)
    Feature[] zzb;

    @SafeParcelable.Field(defaultValue = "0", m12889id = 3)
    int zzc;

    @Nullable
    @SafeParcelable.Field(m12889id = 4)
    ConnectionTelemetryConfiguration zzd;

    public zzk() {
    }

    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param(m12890id = 1) Bundle bundle, @SafeParcelable.Param(m12890id = 2) Feature[] featureArr, @SafeParcelable.Param(m12890id = 3) int i11, @Nullable @SafeParcelable.Param(m12890id = 4) ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.zza = bundle;
        this.zzb = featureArr;
        this.zzc = i11;
        this.zzd = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zza, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zzb, i11, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
