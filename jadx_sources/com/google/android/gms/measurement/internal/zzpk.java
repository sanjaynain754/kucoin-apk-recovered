package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
public final class zzpk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpk> CREATOR = new zzpl();

    @SafeParcelable.Field(m12889id = 1)
    public final int zza;

    @SafeParcelable.Field(m12889id = 2)
    public final String zzb;

    @SafeParcelable.Field(m12889id = 3)
    public final long zzc;

    @Nullable
    @SafeParcelable.Field(m12889id = 4)
    public final Long zzd;

    @Nullable
    @SafeParcelable.Field(m12889id = 6)
    public final String zze;

    @SafeParcelable.Field(m12889id = 7)
    public final String zzf;

    @Nullable
    @SafeParcelable.Field(m12889id = 8)
    public final Double zzg;

    @SafeParcelable.Constructor
    public zzpk(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) String str, @SafeParcelable.Param(m12890id = 3) long j11, @Nullable @SafeParcelable.Param(m12890id = 4) Long l11, @SafeParcelable.Param(m12890id = 5) Float f11, @Nullable @SafeParcelable.Param(m12890id = 6) String str2, @SafeParcelable.Param(m12890id = 7) String str3, @Nullable @SafeParcelable.Param(m12890id = 8) Double d11) {
        this.zza = i11;
        this.zzb = str;
        this.zzc = j11;
        this.zzd = l11;
        this.zzg = i11 == 1 ? f11 != null ? Double.valueOf(f11.doubleValue()) : null : d11;
        this.zze = str2;
        this.zzf = str3;
    }

    @Nullable
    public final Object zza() {
        Long l11 = this.zzd;
        if (l11 != null) {
            return l11;
        }
        Double d11 = this.zzg;
        if (d11 != null) {
            return d11;
        }
        String str = this.zze;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzpk(zzpm zzpmVar) {
        this(zzpmVar.zzc, zzpmVar.zzd, zzpmVar.zze, zzpmVar.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        zzpl.zza(this, parcel, i11);
    }

    public zzpk(String str, long j11, @Nullable Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.zza = 2;
        this.zzb = str;
        this.zzc = j11;
        this.zzf = str2;
        if (obj == null) {
            this.zzd = null;
            this.zzg = null;
            this.zze = null;
            return;
        }
        if (obj instanceof Long) {
            this.zzd = (Long) obj;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof String) {
            this.zzd = null;
            this.zzg = null;
            this.zze = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.zzd = null;
                this.zzg = (Double) obj;
                this.zze = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
