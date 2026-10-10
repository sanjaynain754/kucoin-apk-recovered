package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "LocationAvailabilityCreator")
@SafeParcelable.Reserved({1000})
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new zzbe();

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", m12889id = 1)
    @Deprecated
    int zza;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", m12889id = 2)
    @Deprecated
    int zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "0", m12889id = 3)
    long zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNSUCCESSFUL", m12889id = 4)
    int zzd;

    @SafeParcelable.Field(m12889id = 5)
    zzbo[] zze;

    public static boolean hasLocationAvailability(@RecentlyNonNull Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.zza == locationAvailability.zza && this.zzb == locationAvailability.zzb && this.zzc == locationAvailability.zzc && this.zzd == locationAvailability.zzd && Arrays.equals(this.zze, locationAvailability.zze)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzd), Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Long.valueOf(this.zzc), this.zze);
    }

    public boolean isLocationAvailable() {
        return this.zzd < 1000;
    }

    @SafeParcelable.Constructor
    public LocationAvailability(@SafeParcelable.Param(m12890id = 4) int i11, @SafeParcelable.Param(m12890id = 1) int i12, @SafeParcelable.Param(m12890id = 2) int i13, @SafeParcelable.Param(m12890id = 3) long j11, @SafeParcelable.Param(m12890id = 5) zzbo[] zzboVarArr) {
        this.zzd = i11;
        this.zza = i12;
        this.zzb = i13;
        this.zzc = j11;
        this.zze = zzboVarArr;
    }

    @RecentlyNonNull
    public static LocationAvailability extractLocationAvailability(@RecentlyNonNull Intent intent) {
        if (!hasLocationAvailability(intent)) {
            return null;
        }
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return (LocationAvailability) extras.getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
            }
        } catch (ClassCastException unused) {
        }
        return null;
    }

    @RecentlyNonNull
    public String toString() {
        boolean zIsLocationAvailable = isLocationAvailable();
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("LocationAvailability[isLocationAvailable: ");
        sb2.append(zIsLocationAvailable);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.zze, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
