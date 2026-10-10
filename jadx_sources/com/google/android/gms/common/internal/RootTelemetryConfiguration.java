package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "RootTelemetryConfigurationCreator")
public class RootTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new zzak();

    @SafeParcelable.Field(getter = "getVersion", m12889id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getMethodInvocationTelemetryEnabled", m12889id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "getMethodTimingTelemetryEnabled", m12889id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "getBatchPeriodMillis", m12889id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "getMaxMethodInvocationsInBatch", m12889id = 5)
    private final int zze;

    @KeepForSdk
    public int getBatchPeriodMillis() {
        return this.zzd;
    }

    @KeepForSdk
    public int getMaxMethodInvocationsInBatch() {
        return this.zze;
    }

    @KeepForSdk
    public boolean getMethodInvocationTelemetryEnabled() {
        return this.zzb;
    }

    @KeepForSdk
    public boolean getMethodTimingTelemetryEnabled() {
        return this.zzc;
    }

    @KeepForSdk
    public int getVersion() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public RootTelemetryConfiguration(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) boolean z11, @SafeParcelable.Param(m12890id = 3) boolean z12, @SafeParcelable.Param(m12890id = 4) int i12, @SafeParcelable.Param(m12890id = 5) int i13) {
        this.zza = i11;
        this.zzb = z11;
        this.zzc = z12;
        this.zzd = i12;
        this.zze = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersion());
        SafeParcelWriter.writeBoolean(parcel, 2, getMethodInvocationTelemetryEnabled());
        SafeParcelWriter.writeBoolean(parcel, 3, getMethodTimingTelemetryEnabled());
        SafeParcelWriter.writeInt(parcel, 4, getBatchPeriodMillis());
        SafeParcelWriter.writeInt(parcel, 5, getMaxMethodInvocationsInBatch());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
