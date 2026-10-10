package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "GroundOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
public final class GroundOverlayOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new zzd();
    public static final float NO_DIMENSION = -1.0f;

    @SafeParcelable.Field(getter = "getWrappedImageDescriptorImplBinder", m12889id = 2, type = "android.os.IBinder")
    private BitmapDescriptor zza;

    @Nullable
    @SafeParcelable.Field(getter = "getLocation", m12889id = 3)
    private LatLng zzb;

    @SafeParcelable.Field(getter = "getWidth", m12889id = 4)
    private float zzc;

    @SafeParcelable.Field(getter = "getHeight", m12889id = 5)
    private float zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getBounds", m12889id = 6)
    private LatLngBounds zze;

    @SafeParcelable.Field(getter = "getBearing", m12889id = 7)
    private float zzf;

    @SafeParcelable.Field(getter = "getZIndex", m12889id = 8)
    private float zzg;

    @SafeParcelable.Field(getter = "isVisible", m12889id = 9)
    private boolean zzh;

    @SafeParcelable.Field(getter = "getTransparency", m12889id = 10)
    private float zzi;

    @SafeParcelable.Field(getter = "getAnchorU", m12889id = 11)
    private float zzj;

    @SafeParcelable.Field(getter = "getAnchorV", m12889id = 12)
    private float zzk;

    @SafeParcelable.Field(getter = "isClickable", m12889id = 13)
    private boolean zzl;

    public GroundOverlayOptions() {
        this.zzh = true;
        this.zzi = 0.0f;
        this.zzj = 0.5f;
        this.zzk = 0.5f;
        this.zzl = false;
    }

    @NonNull
    public GroundOverlayOptions position(@NonNull LatLng latLng, float f11) {
        Preconditions.checkState(this.zze == null, "Position has already been set using positionFromBounds");
        Preconditions.checkArgument(latLng != null, "Location must be specified");
        Preconditions.checkArgument(f11 >= 0.0f, "Width must be non-negative");
        zza(latLng, f11, -1.0f);
        return this;
    }

    @NonNull
    public GroundOverlayOptions transparency(float f11) {
        boolean z11 = false;
        if (f11 >= 0.0f && f11 <= 1.0f) {
            z11 = true;
        }
        Preconditions.checkArgument(z11, "Transparency must be in the range [0..1]");
        this.zzi = f11;
        return this;
    }

    @SafeParcelable.Constructor
    public GroundOverlayOptions(@SafeParcelable.Param(m12890id = 2) IBinder iBinder, @SafeParcelable.Param(m12890id = 3) LatLng latLng, @SafeParcelable.Param(m12890id = 4) float f11, @SafeParcelable.Param(m12890id = 5) float f12, @SafeParcelable.Param(m12890id = 6) LatLngBounds latLngBounds, @SafeParcelable.Param(m12890id = 7) float f13, @SafeParcelable.Param(m12890id = 8) float f14, @SafeParcelable.Param(m12890id = 9) boolean z11, @SafeParcelable.Param(m12890id = 10) float f15, @SafeParcelable.Param(m12890id = 11) float f16, @SafeParcelable.Param(m12890id = 12) float f17, @SafeParcelable.Param(m12890id = 13) boolean z12) {
        this.zzh = true;
        this.zzi = 0.0f;
        this.zzj = 0.5f;
        this.zzk = 0.5f;
        this.zzl = false;
        this.zza = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzb = latLng;
        this.zzc = f11;
        this.zzd = f12;
        this.zze = latLngBounds;
        this.zzf = f13;
        this.zzg = f14;
        this.zzh = z11;
        this.zzi = f15;
        this.zzj = f16;
        this.zzk = f17;
        this.zzl = z12;
    }

    private final GroundOverlayOptions zza(LatLng latLng, float f11, float f12) {
        this.zzb = latLng;
        this.zzc = f11;
        this.zzd = f12;
        return this;
    }

    @NonNull
    public GroundOverlayOptions anchor(float f11, float f12) {
        this.zzj = f11;
        this.zzk = f12;
        return this;
    }

    @NonNull
    public GroundOverlayOptions bearing(float f11) {
        this.zzf = ((f11 % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    @NonNull
    public GroundOverlayOptions clickable(boolean z11) {
        this.zzl = z11;
        return this;
    }

    public float getAnchorU() {
        return this.zzj;
    }

    public float getAnchorV() {
        return this.zzk;
    }

    public float getBearing() {
        return this.zzf;
    }

    @Nullable
    public LatLngBounds getBounds() {
        return this.zze;
    }

    public float getHeight() {
        return this.zzd;
    }

    @NonNull
    public BitmapDescriptor getImage() {
        return this.zza;
    }

    @Nullable
    public LatLng getLocation() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzi;
    }

    public float getWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzg;
    }

    @NonNull
    public GroundOverlayOptions image(@NonNull BitmapDescriptor bitmapDescriptor) {
        Preconditions.checkNotNull(bitmapDescriptor, "imageDescriptor must not be null");
        this.zza = bitmapDescriptor;
        return this;
    }

    public boolean isClickable() {
        return this.zzl;
    }

    public boolean isVisible() {
        return this.zzh;
    }

    @NonNull
    public GroundOverlayOptions positionFromBounds(@NonNull LatLngBounds latLngBounds) {
        LatLng latLng = this.zzb;
        Preconditions.checkState(latLng == null, "Position has already been set using position: ".concat(String.valueOf(latLng)));
        this.zze = latLngBounds;
        return this;
    }

    @NonNull
    public GroundOverlayOptions visible(boolean z11) {
        this.zzh = z11;
        return this;
    }

    @NonNull
    public GroundOverlayOptions zIndex(float f11) {
        this.zzg = f11;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zza.zza().asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getLocation(), i11, false);
        SafeParcelWriter.writeFloat(parcel, 4, getWidth());
        SafeParcelWriter.writeFloat(parcel, 5, getHeight());
        SafeParcelWriter.writeParcelable(parcel, 6, getBounds(), i11, false);
        SafeParcelWriter.writeFloat(parcel, 7, getBearing());
        SafeParcelWriter.writeFloat(parcel, 8, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeFloat(parcel, 10, getTransparency());
        SafeParcelWriter.writeFloat(parcel, 11, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 12, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 13, isClickable());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public GroundOverlayOptions position(@NonNull LatLng latLng, float f11, float f12) {
        Preconditions.checkState(this.zze == null, "Position has already been set using positionFromBounds");
        Preconditions.checkArgument(latLng != null, "Location must be specified");
        Preconditions.checkArgument(f11 >= 0.0f, "Width must be non-negative");
        Preconditions.checkArgument(f12 >= 0.0f, "Height must be non-negative");
        zza(latLng, f11, f12);
        return this;
    }
}
