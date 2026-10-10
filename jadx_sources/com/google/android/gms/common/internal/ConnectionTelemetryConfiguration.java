package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "ConnectionTelemetryConfigurationCreator")
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new zzm();

    @SafeParcelable.Field(getter = "getRootTelemetryConfiguration", m12889id = 1)
    private final RootTelemetryConfiguration zza;

    @SafeParcelable.Field(getter = "getMethodInvocationTelemetryEnabled", m12889id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "getMethodTimingTelemetryEnabled", m12889id = 3)
    private final boolean zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getMethodInvocationMethodKeyAllowlist", m12889id = 4)
    private final int[] zzd;

    @SafeParcelable.Field(getter = "getMaxMethodInvocationsLogged", m12889id = 5)
    private final int zze;

    @Nullable
    @SafeParcelable.Field(getter = "getMethodInvocationMethodKeyDisallowlist", m12889id = 6)
    private final int[] zzf;

    @KeepForSdk
    public int getMaxMethodInvocationsLogged() {
        return this.zze;
    }

    @Nullable
    @KeepForSdk
    public int[] getMethodInvocationMethodKeyAllowlist() {
        return this.zzd;
    }

    @Nullable
    @KeepForSdk
    public int[] getMethodInvocationMethodKeyDisallowlist() {
        return this.zzf;
    }

    @KeepForSdk
    public boolean getMethodInvocationTelemetryEnabled() {
        return this.zzb;
    }

    @KeepForSdk
    public boolean getMethodTimingTelemetryEnabled() {
        return this.zzc;
    }

    @NonNull
    public final RootTelemetryConfiguration zza() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public ConnectionTelemetryConfiguration(@NonNull @SafeParcelable.Param(m12890id = 1) RootTelemetryConfiguration rootTelemetryConfiguration, @SafeParcelable.Param(m12890id = 2) boolean z11, @SafeParcelable.Param(m12890id = 3) boolean z12, @Nullable @SafeParcelable.Param(m12890id = 4) int[] iArr, @SafeParcelable.Param(m12890id = 5) int i11, @Nullable @SafeParcelable.Param(m12890id = 6) int[] iArr2) {
        this.zza = rootTelemetryConfiguration;
        this.zzb = z11;
        this.zzc = z12;
        this.zzd = iArr;
        this.zze = i11;
        this.zzf = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i11, false);
        SafeParcelWriter.writeBoolean(parcel, 2, getMethodInvocationTelemetryEnabled());
        SafeParcelWriter.writeBoolean(parcel, 3, getMethodTimingTelemetryEnabled());
        SafeParcelWriter.writeIntArray(parcel, 4, getMethodInvocationMethodKeyAllowlist(), false);
        SafeParcelWriter.writeInt(parcel, 5, getMaxMethodInvocationsLogged());
        SafeParcelWriter.writeIntArray(parcel, 6, getMethodInvocationMethodKeyDisallowlist(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
