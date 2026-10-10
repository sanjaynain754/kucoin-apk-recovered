package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "UserPreferredSleepWindowCreator")
@SafeParcelable.Reserved({1000})
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = new zzby();

    @SafeParcelable.Field(getter = "getStartHour", m12889id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getStartMinute", m12889id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getEndHour", m12889id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getEndMinute", m12889id = 4)
    private final int zzd;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbx)) {
            return false;
        }
        zzbx zzbxVar = (zzbx) obj;
        return this.zza == zzbxVar.zza && this.zzb == zzbxVar.zzb && this.zzc == zzbxVar.zzc && this.zzd == zzbxVar.zzd;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i11 = this.zza;
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = this.zzd;
        StringBuilder sb2 = new StringBuilder(117);
        sb2.append("UserPreferredSleepWindow [startHour=");
        sb2.append(i11);
        sb2.append(", startMinute=");
        sb2.append(i12);
        sb2.append(", endHour=");
        sb2.append(i13);
        sb2.append(", endMinute=");
        sb2.append(i14);
        sb2.append(']');
        return sb2.toString();
    }

    @SafeParcelable.Constructor
    public zzbx(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) int i12, @SafeParcelable.Param(m12890id = 3) int i13, @SafeParcelable.Param(m12890id = 4) int i14) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (i11 >= 0 && i11 <= 23) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11, "Start hour must be in range [0, 23].");
        if (i12 >= 0 && i12 <= 59) {
            z12 = true;
        } else {
            z12 = false;
        }
        Preconditions.checkState(z12, "Start minute must be in range [0, 59].");
        if (i13 >= 0 && i13 <= 23) {
            z13 = true;
        } else {
            z13 = false;
        }
        Preconditions.checkState(z13, "End hour must be in range [0, 23].");
        if (i14 >= 0 && i14 <= 59) {
            z14 = true;
        } else {
            z14 = false;
        }
        Preconditions.checkState(z14, "End minute must be in range [0, 59].");
        Preconditions.checkState(((i11 + i12) + i13) + i14 > 0, "Parameters can't be all 0.");
        this.zza = i11;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
