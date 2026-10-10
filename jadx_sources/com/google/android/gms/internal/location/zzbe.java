package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import com.kubi.otc.entity.OtcAd;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@VisibleForTesting
@SafeParcelable.Class(creator = "ParcelableGeofenceCreator")
@SafeParcelable.Reserved({1000})
public final class zzbe extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();

    @SafeParcelable.Field(getter = "getRequestId", m12889id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getExpirationTime", m12889id = 2)
    private final long zzb;

    @SafeParcelable.Field(getter = "getType", m12889id = 3)
    private final short zzc;

    @SafeParcelable.Field(getter = "getLatitude", m12889id = 4)
    private final double zzd;

    @SafeParcelable.Field(getter = "getLongitude", m12889id = 5)
    private final double zze;

    @SafeParcelable.Field(getter = "getRadius", m12889id = 6)
    private final float zzf;

    @SafeParcelable.Field(getter = "getTransitionTypes", m12889id = 7)
    private final int zzg;

    @SafeParcelable.Field(defaultValue = "0", getter = "getNotificationResponsiveness", m12889id = 8)
    private final int zzh;

    @SafeParcelable.Field(defaultValue = OtcAd.KYC_NOT_PASS, getter = "getLoiteringDelay", m12889id = 9)
    private final int zzi;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.zzf == zzbeVar.zzf && this.zzd == zzbeVar.zzd && this.zze == zzbeVar.zze && this.zzc == zzbeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.location.Geofence
    public final String getRequestId() {
        return this.zza;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.zzd);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((((((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.zzf)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        short s11 = this.zzc;
        if (s11 != -1) {
            str = s11 != 1 ? "UNKNOWN" : "CIRCLE";
        } else {
            str = "INVALID";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", str, this.zza.replaceAll("\\p{C}", "?"), Integer.valueOf(this.zzg), Double.valueOf(this.zzd), Double.valueOf(this.zze), Float.valueOf(this.zzf), Integer.valueOf(this.zzh / 1000), Integer.valueOf(this.zzi), Long.valueOf(this.zzb));
    }

    @SafeParcelable.Constructor
    public zzbe(@SafeParcelable.Param(m12890id = 1) String str, @SafeParcelable.Param(m12890id = 7) int i11, @SafeParcelable.Param(m12890id = 3) short s11, @SafeParcelable.Param(m12890id = 4) double d11, @SafeParcelable.Param(m12890id = 5) double d12, @SafeParcelable.Param(m12890id = 6) float f11, @SafeParcelable.Param(m12890id = 2) long j11, @SafeParcelable.Param(m12890id = 8) int i12, @SafeParcelable.Param(m12890id = 9) int i13) {
        String str2;
        if (str != null && str.length() <= 100) {
            if (f11 > 0.0f) {
                if (d11 <= 90.0d && d11 >= -90.0d) {
                    if (d12 <= 180.0d && d12 >= -180.0d) {
                        int i14 = i11 & 7;
                        if (i14 != 0) {
                            this.zzc = s11;
                            this.zza = str;
                            this.zzd = d11;
                            this.zze = d12;
                            this.zzf = f11;
                            this.zzb = j11;
                            this.zzg = i14;
                            this.zzh = i12;
                            this.zzi = i13;
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("No supported transition specified: ");
                        sb2.append(i11);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder(43);
                    sb3.append("invalid longitude: ");
                    sb3.append(d12);
                    throw new IllegalArgumentException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder(42);
                sb4.append("invalid latitude: ");
                sb4.append(d11);
                throw new IllegalArgumentException(sb4.toString());
            }
            StringBuilder sb5 = new StringBuilder(31);
            sb5.append("invalid radius: ");
            sb5.append(f11);
            throw new IllegalArgumentException(sb5.toString());
        }
        String strValueOf = String.valueOf(str);
        if (strValueOf.length() != 0) {
            str2 = "requestId is null or too long: ".concat(strValueOf);
        } else {
            str2 = new String("requestId is null or too long: ");
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeShort(parcel, 3, this.zzc);
        SafeParcelWriter.writeDouble(parcel, 4, this.zzd);
        SafeParcelWriter.writeDouble(parcel, 5, this.zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
