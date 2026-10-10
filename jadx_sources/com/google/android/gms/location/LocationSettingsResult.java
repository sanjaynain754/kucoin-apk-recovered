package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "LocationSettingsResultCreator")
@SafeParcelable.Reserved({1000})
public final class LocationSettingsResult extends AbstractSafeParcelable implements Result {

    @RecentlyNonNull
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new zzbm();

    @SafeParcelable.Field(getter = "getStatus", m12889id = 1)
    private final Status zza;

    @Nullable
    @SafeParcelable.Field(getter = "getLocationSettingsStates", m12889id = 2)
    private final LocationSettingsStates zzb;

    @RecentlyNullable
    public LocationSettingsStates getLocationSettingsStates() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    @RecentlyNonNull
    public Status getStatus() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public LocationSettingsResult(@RecentlyNonNull @SafeParcelable.Param(m12890id = 1) Status status, @Nullable @SafeParcelable.Param(m12890id = 2) LocationSettingsStates locationSettingsStates) {
        this.zza = status;
        this.zzb = locationSettingsStates;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i11, false);
        SafeParcelWriter.writeParcelable(parcel, 2, getLocationSettingsStates(), i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
