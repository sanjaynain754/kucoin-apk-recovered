package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "DeviceOrientationRequestCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SHOULD_USE_MAG", m12889id = 1)
    boolean zza;

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_MINIMUM_SAMPLING_PERIOD_MS", m12889id = 2)
    long zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SMALLEST_ANGLE_CHANGE_RADIANS", m12889id = 3)
    float zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_EXPIRE_AT_MS", m12889id = 4)
    long zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_NUM_UPDATES", m12889id = 5)
    int zze;

    public zzs() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        return this.zza == zzsVar.zza && this.zzb == zzsVar.zzb && Float.compare(this.zzc, zzsVar.zzc) == 0 && this.zzd == zzsVar.zzd && this.zze == zzsVar.zze;
    }

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(m12890id = 1) boolean z11, @SafeParcelable.Param(m12890id = 2) long j11, @SafeParcelable.Param(m12890id = 3) float f11, @SafeParcelable.Param(m12890id = 4) long j12, @SafeParcelable.Param(m12890id = 5) int i11) {
        this.zza = z11;
        this.zzb = j11;
        this.zzc = f11;
        this.zzd = j12;
        this.zze = i11;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Long.valueOf(this.zzb), Float.valueOf(this.zzc), Long.valueOf(this.zzd), Integer.valueOf(this.zze));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DeviceOrientationRequest[mShouldUseMag=");
        sb2.append(this.zza);
        sb2.append(" mMinimumSamplingPeriodMs=");
        sb2.append(this.zzb);
        sb2.append(" mSmallestAngleChangeRadians=");
        sb2.append(this.zzc);
        long j11 = this.zzd;
        if (j11 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j11 - jElapsedRealtime);
            sb2.append("ms");
        }
        if (this.zze != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.zze);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeFloat(parcel, 3, this.zzc);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
