package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.kubi.otc.entity.OtcAd;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "FeatureCreator")
public class Feature extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getName", m12889id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getOldVersion", m12889id = 2)
    @Deprecated
    private final int zzb;

    @SafeParcelable.Field(defaultValue = OtcAd.KYC_NOT_PASS, getter = "getVersion", m12889id = 3)
    private final long zzc;

    @SafeParcelable.Constructor
    public Feature(@NonNull @SafeParcelable.Param(m12890id = 1) String str, @SafeParcelable.Param(m12890id = 2) int i11, @SafeParcelable.Param(m12890id = 3) long j11) {
        this.zza = str;
        this.zzb = i11;
        this.zzc = j11;
    }

    @KeepForSdk
    public Feature(@NonNull String str, long j11) {
        this.zza = str;
        this.zzc = j11;
        this.zzb = -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((getName() != null && getName().equals(feature.getName())) || (getName() == null && feature.getName() == null)) && getVersion() == feature.getVersion()) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    public String getName() {
        return this.zza;
    }

    @KeepForSdk
    public long getVersion() {
        long j11 = this.zzc;
        return j11 == -1 ? this.zzb : j11;
    }

    public final int hashCode() {
        return Objects.hashCode(getName(), Long.valueOf(getVersion()));
    }

    @NonNull
    public final String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add("name", getName());
        stringHelper.add("version", Long.valueOf(getVersion()));
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, getVersion());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
