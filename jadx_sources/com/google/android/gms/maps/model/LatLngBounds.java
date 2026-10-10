package com.google.android.gms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "LatLngBoundsCreator")
@SafeParcelable.Reserved({1})
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new zzf();

    @NonNull
    @SafeParcelable.Field(m12889id = 3)
    public final LatLng northeast;

    @NonNull
    @SafeParcelable.Field(m12889id = 2)
    public final LatLng southwest;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    public static final class Builder {
        private double zza = Double.POSITIVE_INFINITY;
        private double zzb = Double.NEGATIVE_INFINITY;
        private double zzc = Double.NaN;
        private double zzd = Double.NaN;

        @NonNull
        public LatLngBounds build() {
            Preconditions.checkState(!Double.isNaN(this.zzc), "no included points");
            return new LatLngBounds(new LatLng(this.zza, this.zzc), new LatLng(this.zzb, this.zzd));
        }

        @NonNull
        public Builder include(@NonNull LatLng latLng) {
            Preconditions.checkNotNull(latLng, "point must not be null");
            this.zza = Math.min(this.zza, latLng.latitude);
            this.zzb = Math.max(this.zzb, latLng.latitude);
            double d11 = latLng.longitude;
            if (Double.isNaN(this.zzc)) {
                this.zzc = d11;
                this.zzd = d11;
                return this;
            }
            double d12 = this.zzc;
            double d13 = this.zzd;
            if (d12 > d13 ? !(d12 <= d11 || d11 <= d13) : !(d12 <= d11 && d11 <= d13)) {
                Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                if (((d12 - d11) + 360.0d) % 360.0d < ((d11 - d13) + 360.0d) % 360.0d) {
                    this.zzc = d11;
                    return this;
                }
                this.zzd = d11;
            }
            return this;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    private final boolean zza(double d11) {
        double d12 = this.southwest.longitude;
        double d13 = this.northeast.longitude;
        if (d12 <= d13) {
            return d12 <= d11 && d11 <= d13;
        }
        return d12 <= d11 || d11 <= d13;
    }

    @NonNull
    public LatLng getCenter() {
        LatLng latLng = this.southwest;
        double d11 = latLng.latitude;
        LatLng latLng2 = this.northeast;
        double d12 = (d11 + latLng2.latitude) / 2.0d;
        double d13 = latLng2.longitude;
        double d14 = latLng.longitude;
        if (d14 > d13) {
            d13 += 360.0d;
        }
        return new LatLng(d12, (d13 + d14) / 2.0d);
    }

    public int hashCode() {
        return Objects.hashCode(this.southwest, this.northeast);
    }

    @NonNull
    public LatLngBounds including(@NonNull LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, "point must not be null.");
        double dMin = Math.min(this.southwest.latitude, latLng2.latitude);
        double dMax = Math.max(this.northeast.latitude, latLng2.latitude);
        double d11 = this.northeast.longitude;
        double d12 = this.southwest.longitude;
        double d13 = latLng2.longitude;
        if (!zza(d13)) {
            if (((d12 - d13) + 360.0d) % 360.0d < ((d13 - d11) + 360.0d) % 360.0d) {
                d12 = d13;
            } else {
                d11 = d13;
            }
        }
        return new LatLngBounds(new LatLng(dMin, d12), new LatLng(dMax, d11));
    }

    @SafeParcelable.Constructor
    public LatLngBounds(@NonNull @SafeParcelable.Param(m12890id = 2) LatLng latLng, @NonNull @SafeParcelable.Param(m12890id = 3) LatLng latLng2) {
        boolean z11;
        Preconditions.checkNotNull(latLng, "southwest must not be null.");
        Preconditions.checkNotNull(latLng2, "northeast must not be null.");
        double d11 = latLng2.latitude;
        double d12 = latLng.latitude;
        if (d11 >= d12) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d12), Double.valueOf(latLng2.latitude));
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    @Nullable
    public static LatLngBounds createFromAttributes(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        return GoogleMapOptions.zzb(context, attributeSet);
    }

    public boolean contains(@NonNull LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, "point must not be null.");
        double d11 = latLng2.latitude;
        if (this.southwest.latitude <= d11 && d11 <= this.northeast.latitude && zza(latLng2.longitude)) {
            return true;
        }
        return false;
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add("southwest", this.southwest).add("northeast", this.northeast).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.southwest, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.northeast, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
