package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "StreetViewPanoramaOrientationCreator")
@SafeParcelable.Reserved({1})
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new zzq();

    @SafeParcelable.Field(m12889id = 3)
    public final float bearing;

    @SafeParcelable.Field(m12889id = 2)
    public final float tilt;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    public static final class Builder {
        public float bearing;
        public float tilt;

        public Builder() {
        }

        public Builder(@NonNull StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            Preconditions.checkNotNull(streetViewPanoramaOrientation, "StreetViewPanoramaOrientation must not be null.");
            this.bearing = streetViewPanoramaOrientation.bearing;
            this.tilt = streetViewPanoramaOrientation.tilt;
        }

        @NonNull
        public Builder bearing(float f11) {
            this.bearing = f11;
            return this;
        }

        @NonNull
        public StreetViewPanoramaOrientation build() {
            return new StreetViewPanoramaOrientation(this.tilt, this.bearing);
        }

        @NonNull
        public Builder tilt(float f11) {
            this.tilt = f11;
            return this;
        }
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaOrientation.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaOrientation.bearing);
    }

    @NonNull
    public static Builder builder(@NonNull StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        return new Builder(streetViewPanoramaOrientation);
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    @SafeParcelable.Constructor
    public StreetViewPanoramaOrientation(@SafeParcelable.Param(m12890id = 2) float f11, @SafeParcelable.Param(m12890id = 3) float f12) {
        boolean z11 = false;
        if (f11 >= -90.0f && f11 <= 90.0f) {
            z11 = true;
        }
        StringBuilder sb2 = new StringBuilder(62);
        sb2.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb2.append(f11);
        Preconditions.checkArgument(z11, sb2.toString());
        this.tilt = f11 + 0.0f;
        this.bearing = (((double) f12) <= 0.0d ? (f12 % 360.0f) + 360.0f : f12) % 360.0f;
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add("tilt", Float.valueOf(this.tilt)).add("bearing", Float.valueOf(this.bearing)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.tilt);
        SafeParcelWriter.writeFloat(parcel, 3, this.bearing);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
