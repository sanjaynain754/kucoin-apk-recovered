package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "LocationSettingsStatesCreator")
@SafeParcelable.Reserved({1000})
public final class LocationSettingsStates extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new zzbn();

    @SafeParcelable.Field(getter = "isGpsUsable", m12889id = 1)
    private final boolean zza;

    @SafeParcelable.Field(getter = "isNetworkLocationUsable", m12889id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "isBleUsable", m12889id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "isGpsPresent", m12889id = 4)
    private final boolean zzd;

    @SafeParcelable.Field(getter = "isNetworkLocationPresent", m12889id = 5)
    private final boolean zze;

    @SafeParcelable.Field(getter = "isBlePresent", m12889id = 6)
    private final boolean zzf;

    @RecentlyNullable
    public static LocationSettingsStates fromIntent(@RecentlyNonNull Intent intent) {
        return (LocationSettingsStates) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    public boolean isBlePresent() {
        return this.zzf;
    }

    public boolean isBleUsable() {
        return this.zzc;
    }

    public boolean isGpsPresent() {
        return this.zzd;
    }

    public boolean isGpsUsable() {
        return this.zza;
    }

    public boolean isLocationPresent() {
        return this.zzd || this.zze;
    }

    public boolean isLocationUsable() {
        return this.zza || this.zzb;
    }

    public boolean isNetworkLocationPresent() {
        return this.zze;
    }

    public boolean isNetworkLocationUsable() {
        return this.zzb;
    }

    @SafeParcelable.Constructor
    public LocationSettingsStates(@SafeParcelable.Param(m12890id = 1) boolean z11, @SafeParcelable.Param(m12890id = 2) boolean z12, @SafeParcelable.Param(m12890id = 3) boolean z13, @SafeParcelable.Param(m12890id = 4) boolean z14, @SafeParcelable.Param(m12890id = 5) boolean z15, @SafeParcelable.Param(m12890id = 6) boolean z16) {
        this.zza = z11;
        this.zzb = z12;
        this.zzc = z13;
        this.zzd = z14;
        this.zze = z15;
        this.zzf = z16;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, isGpsUsable());
        SafeParcelWriter.writeBoolean(parcel, 2, isNetworkLocationUsable());
        SafeParcelWriter.writeBoolean(parcel, 3, isBleUsable());
        SafeParcelWriter.writeBoolean(parcel, 4, isGpsPresent());
        SafeParcelWriter.writeBoolean(parcel, 5, isNetworkLocationPresent());
        SafeParcelWriter.writeBoolean(parcel, 6, isBlePresent());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
