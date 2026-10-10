package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.kubi.kumex.data.market.model.FundingRateEntity;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({1000})
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzbf();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_PRIORITY", m12889id = 1)
    int zza;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_INTERVAL", m12889id = 2)
    long zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_FASTEST_INTERVAL", m12889id = 3)
    long zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_EXPLICIT_FASTEST_INTERVAL", m12889id = 4)
    boolean zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_EXPIRE_AT", m12889id = 5)
    long zze;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_NUM_UPDATES", m12889id = 6)
    int zzf;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_SMALLEST_DISPLACEMENT", m12889id = 7)
    float zzg;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_MAX_WAIT_TIME", m12889id = 8)
    long zzh;

    @SafeParcelable.Field(defaultValue = CredentialEntry.FALSE_STRING, m12889id = 9)
    boolean zzi;

    @Deprecated
    public LocationRequest() {
        this.zza = 102;
        this.zzb = FundingRateEntity.MILLIS_PER_HOUR;
        this.zzc = 600000L;
        this.zzd = false;
        this.zze = Long.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = 0.0f;
        this.zzh = 0L;
        this.zzi = false;
    }

    @RecentlyNonNull
    public LocationRequest setSmallestDisplacement(float f11) {
        if (f11 >= 0.0f) {
            this.zzg = f11;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("invalid displacement: ");
        sb2.append(f11);
        throw new IllegalArgumentException(sb2.toString());
    }

    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) long j11, @SafeParcelable.Param(m12890id = 3) long j12, @SafeParcelable.Param(m12890id = 4) boolean z11, @SafeParcelable.Param(m12890id = 5) long j13, @SafeParcelable.Param(m12890id = 6) int i12, @SafeParcelable.Param(m12890id = 7) float f11, @SafeParcelable.Param(m12890id = 8) long j14, @SafeParcelable.Param(m12890id = 9) boolean z12) {
        this.zza = i11;
        this.zzb = j11;
        this.zzc = j12;
        this.zzd = z11;
        this.zze = j13;
        this.zzf = i12;
        this.zzg = f11;
        this.zzh = j14;
        this.zzi = z12;
    }

    @RecentlyNonNull
    public static LocationRequest create() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setWaitForAccurateLocation(true);
        return locationRequest;
    }

    private static void zza(long j11) {
        if (j11 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("invalid interval: ");
        sb2.append(j11);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && this.zzb == locationRequest.zzb && this.zzc == locationRequest.zzc && this.zzd == locationRequest.zzd && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && getMaxWaitTime() == locationRequest.getMaxWaitTime() && this.zzi == locationRequest.zzi) {
                return true;
            }
        }
        return false;
    }

    public long getExpirationTime() {
        return this.zze;
    }

    public long getFastestInterval() {
        return this.zzc;
    }

    public long getInterval() {
        return this.zzb;
    }

    public long getMaxWaitTime() {
        long j11 = this.zzh;
        long j12 = this.zzb;
        return j11 < j12 ? j12 : j11;
    }

    public int getNumUpdates() {
        return this.zzf;
    }

    public int getPriority() {
        return this.zza;
    }

    public float getSmallestDisplacement() {
        return this.zzg;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Float.valueOf(this.zzg), Long.valueOf(this.zzh));
    }

    public boolean isFastestIntervalExplicitlySet() {
        return this.zzd;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzi;
    }

    @RecentlyNonNull
    public LocationRequest setExpirationTime(long j11) {
        this.zze = j11;
        if (j11 < 0) {
            this.zze = 0L;
        }
        return this;
    }

    @RecentlyNonNull
    public LocationRequest setNumUpdates(int i11) {
        if (i11 > 0) {
            this.zzf = i11;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("invalid numUpdates: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    @RecentlyNonNull
    public LocationRequest setPriority(int i11) {
        if (i11 == 100 || i11 == 102 || i11 == 104 || i11 == 105) {
            this.zza = i11;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(28);
        sb2.append("invalid quality: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    @RecentlyNonNull
    public LocationRequest setWaitForAccurateLocation(boolean z11) {
        this.zzi = z11;
        return this;
    }

    @RecentlyNonNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        int i11 = this.zza;
        if (i11 == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i11 == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i11 != 104) {
            str = i11 != 105 ? "???" : "PRIORITY_NO_POWER";
        } else {
            str = "PRIORITY_LOW_POWER";
        }
        sb2.append(str);
        if (this.zza != 105) {
            sb2.append(" requested=");
            sb2.append(this.zzb);
            sb2.append("ms");
        }
        sb2.append(" fastest=");
        sb2.append(this.zzc);
        sb2.append("ms");
        if (this.zzh > this.zzb) {
            sb2.append(" maxWait=");
            sb2.append(this.zzh);
            sb2.append("ms");
        }
        if (this.zzg > 0.0f) {
            sb2.append(" smallestDisplacement=");
            sb2.append(this.zzg);
            sb2.append("m");
        }
        long j11 = this.zze;
        if (j11 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j11 - jElapsedRealtime);
            sb2.append("ms");
        }
        if (this.zzf != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.zzf);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @RecentlyNonNull
    public LocationRequest setExpirationDuration(long j11) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = Long.MAX_VALUE;
        if (j11 <= Long.MAX_VALUE - jElapsedRealtime) {
            j12 = j11 + jElapsedRealtime;
        }
        this.zze = j12;
        if (j12 < 0) {
            this.zze = 0L;
        }
        return this;
    }

    @RecentlyNonNull
    public LocationRequest setFastestInterval(long j11) {
        zza(j11);
        this.zzd = true;
        this.zzc = j11;
        return this;
    }

    @RecentlyNonNull
    public LocationRequest setInterval(long j11) {
        zza(j11);
        this.zzb = j11;
        if (!this.zzd) {
            this.zzc = (long) (j11 / 6.0d);
        }
        return this;
    }

    @RecentlyNonNull
    public LocationRequest setMaxWaitTime(long j11) {
        zza(j11);
        this.zzh = j11;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeLong(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzg);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
