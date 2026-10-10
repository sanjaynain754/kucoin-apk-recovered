package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "LocationRequestInternalCreator")
@SafeParcelable.Reserved({1000, 2, 3, 4})
public final class zzba extends AbstractSafeParcelable {

    @SafeParcelable.Field(defaultValueUnchecked = "null", m12889id = 1)
    final LocationRequest zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_CLIENTS", m12889id = 5)
    final List<ClientIdentity> zzc;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", m12889id = 6)
    final String zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_HIDE_FROM_APP_OPS", m12889id = 7)
    final boolean zze;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_FORCE_COARSE_LOCATION", m12889id = 8)
    final boolean zzf;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_EXEMPT_FROM_THROTTLE", m12889id = 9)
    final boolean zzg;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", m12889id = 10)
    final String zzh;

    @SafeParcelable.Field(defaultValueUnchecked = CredentialEntry.FALSE_STRING, m12889id = 11)
    final boolean zzi;

    @SafeParcelable.Field(defaultValueUnchecked = CredentialEntry.FALSE_STRING, m12889id = 12)
    boolean zzj;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", m12889id = 13)
    String zzk;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_MAX_LOCATION_AGE_MILLIS", m12889id = 14)
    long zzl;
    static final List<ClientIdentity> zza = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();

    public final zzba zzd(boolean z11) {
        this.zzj = true;
        return this;
    }

    public static zzba zza(@Nullable String str, LocationRequest locationRequest) {
        return new zzba(locationRequest, zza, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (Objects.equal(this.zzb, zzbaVar.zzb) && Objects.equal(this.zzc, zzbaVar.zzc) && Objects.equal(this.zzd, zzbaVar.zzd) && this.zze == zzbaVar.zze && this.zzf == zzbaVar.zzf && this.zzg == zzbaVar.zzg && Objects.equal(this.zzh, zzbaVar.zzh) && this.zzi == zzbaVar.zzi && this.zzj == zzbaVar.zzj && Objects.equal(this.zzk, zzbaVar.zzk)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.zzb);
        if (this.zzd != null) {
            sb2.append(" tag=");
            sb2.append(this.zzd);
        }
        if (this.zzh != null) {
            sb2.append(" moduleId=");
            sb2.append(this.zzh);
        }
        if (this.zzk != null) {
            sb2.append(" contextAttributionTag=");
            sb2.append(this.zzk);
        }
        sb2.append(" hideAppOps=");
        sb2.append(this.zze);
        sb2.append(" clients=");
        sb2.append(this.zzc);
        sb2.append(" forceCoarseLocation=");
        sb2.append(this.zzf);
        if (this.zzg) {
            sb2.append(" exemptFromBackgroundThrottle");
        }
        if (this.zzi) {
            sb2.append(" locationSettingsIgnored");
        }
        if (this.zzj) {
            sb2.append(" inaccurateLocationsDelayed");
        }
        return sb2.toString();
    }

    public final zzba zzb(long j11) {
        if (this.zzb.getMaxWaitTime() <= this.zzb.getInterval()) {
            this.zzl = 10000L;
            return this;
        }
        long interval = this.zzb.getInterval();
        long maxWaitTime = this.zzb.getMaxWaitTime();
        StringBuilder sb2 = new StringBuilder(120);
        sb2.append("could not set max age when location batching is requested, interval=");
        sb2.append(interval);
        sb2.append("maxWaitTime=");
        sb2.append(maxWaitTime);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final zzba zzc(@Nullable String str) {
        this.zzk = str;
        return this;
    }

    @SafeParcelable.Constructor
    public zzba(@SafeParcelable.Param(m12890id = 1) LocationRequest locationRequest, @SafeParcelable.Param(m12890id = 5) List<ClientIdentity> list, @Nullable @SafeParcelable.Param(m12890id = 6) String str, @SafeParcelable.Param(m12890id = 7) boolean z11, @SafeParcelable.Param(m12890id = 8) boolean z12, @SafeParcelable.Param(m12890id = 9) boolean z13, @Nullable @SafeParcelable.Param(m12890id = 10) String str2, @SafeParcelable.Param(m12890id = 11) boolean z14, @SafeParcelable.Param(m12890id = 12) boolean z15, @Nullable @SafeParcelable.Param(m12890id = 13) String str3, @SafeParcelable.Param(m12890id = 14) long j11) {
        this.zzb = locationRequest;
        this.zzc = list;
        this.zzd = str;
        this.zze = z11;
        this.zzf = z12;
        this.zzg = z13;
        this.zzh = str2;
        this.zzi = z14;
        this.zzj = z15;
        this.zzk = str3;
        this.zzl = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzb, i11, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzd, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zze);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzf);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzg);
        SafeParcelWriter.writeString(parcel, 10, this.zzh, false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzj);
        SafeParcelWriter.writeString(parcel, 13, this.zzk, false);
        SafeParcelWriter.writeLong(parcel, 14, this.zzl);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
