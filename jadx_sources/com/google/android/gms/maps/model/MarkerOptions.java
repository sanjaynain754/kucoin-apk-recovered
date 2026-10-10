package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "MarkerOptionsCreator")
@SafeParcelable.Reserved({1})
public final class MarkerOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new zzi();

    @SafeParcelable.Field(getter = "getPosition", m12889id = 2)
    private LatLng zza;

    @Nullable
    @SafeParcelable.Field(getter = "getTitle", m12889id = 3)
    private String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getSnippet", m12889id = 4)
    private String zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getWrappedIconDescriptorImplBinder", m12889id = 5, type = "android.os.IBinder")
    private BitmapDescriptor zzd;

    @SafeParcelable.Field(getter = "getAnchorU", m12889id = 6)
    private float zze;

    @SafeParcelable.Field(getter = "getAnchorV", m12889id = 7)
    private float zzf;

    @SafeParcelable.Field(getter = "isDraggable", m12889id = 8)
    private boolean zzg;

    @SafeParcelable.Field(getter = "isVisible", m12889id = 9)
    private boolean zzh;

    @SafeParcelable.Field(getter = "isFlat", m12889id = 10)
    private boolean zzi;

    @SafeParcelable.Field(getter = "getRotation", m12889id = 11)
    private float zzj;

    @SafeParcelable.Field(defaultValue = "0.5f", getter = "getInfoWindowAnchorU", m12889id = 12)
    private float zzk;

    @SafeParcelable.Field(getter = "getInfoWindowAnchorV", m12889id = 13)
    private float zzl;

    @SafeParcelable.Field(defaultValue = "1.0f", getter = "getAlpha", m12889id = 14)
    private float zzm;

    @SafeParcelable.Field(getter = "getZIndex", m12889id = 15)
    private float zzn;

    public MarkerOptions() {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzi = false;
        this.zzj = 0.0f;
        this.zzk = 0.5f;
        this.zzl = 0.0f;
        this.zzm = 1.0f;
    }

    @SafeParcelable.Constructor
    public MarkerOptions(@SafeParcelable.Param(m12890id = 2) LatLng latLng, @SafeParcelable.Param(m12890id = 3) String str, @SafeParcelable.Param(m12890id = 4) String str2, @Nullable @SafeParcelable.Param(m12890id = 5) IBinder iBinder, @SafeParcelable.Param(m12890id = 6) float f11, @SafeParcelable.Param(m12890id = 7) float f12, @SafeParcelable.Param(m12890id = 8) boolean z11, @SafeParcelable.Param(m12890id = 9) boolean z12, @SafeParcelable.Param(m12890id = 10) boolean z13, @SafeParcelable.Param(m12890id = 11) float f13, @SafeParcelable.Param(m12890id = 12) float f14, @SafeParcelable.Param(m12890id = 13) float f15, @SafeParcelable.Param(m12890id = 14) float f16, @SafeParcelable.Param(m12890id = 15) float f17) {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzi = false;
        this.zzj = 0.0f;
        this.zzk = 0.5f;
        this.zzl = 0.0f;
        this.zzm = 1.0f;
        this.zza = latLng;
        this.zzb = str;
        this.zzc = str2;
        if (iBinder == null) {
            this.zzd = null;
        } else {
            this.zzd = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        }
        this.zze = f11;
        this.zzf = f12;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
        this.zzj = f13;
        this.zzk = f14;
        this.zzl = f15;
        this.zzm = f16;
        this.zzn = f17;
    }

    @NonNull
    public MarkerOptions alpha(float f11) {
        this.zzm = f11;
        return this;
    }

    @NonNull
    public MarkerOptions anchor(float f11, float f12) {
        this.zze = f11;
        this.zzf = f12;
        return this;
    }

    @NonNull
    public MarkerOptions draggable(boolean z11) {
        this.zzg = z11;
        return this;
    }

    @NonNull
    public MarkerOptions flat(boolean z11) {
        this.zzi = z11;
        return this;
    }

    public float getAlpha() {
        return this.zzm;
    }

    public float getAnchorU() {
        return this.zze;
    }

    public float getAnchorV() {
        return this.zzf;
    }

    @Nullable
    public BitmapDescriptor getIcon() {
        return this.zzd;
    }

    public float getInfoWindowAnchorU() {
        return this.zzk;
    }

    public float getInfoWindowAnchorV() {
        return this.zzl;
    }

    @NonNull
    public LatLng getPosition() {
        return this.zza;
    }

    public float getRotation() {
        return this.zzj;
    }

    @Nullable
    public String getSnippet() {
        return this.zzc;
    }

    @Nullable
    public String getTitle() {
        return this.zzb;
    }

    public float getZIndex() {
        return this.zzn;
    }

    @NonNull
    public MarkerOptions icon(@Nullable BitmapDescriptor bitmapDescriptor) {
        this.zzd = bitmapDescriptor;
        return this;
    }

    @NonNull
    public MarkerOptions infoWindowAnchor(float f11, float f12) {
        this.zzk = f11;
        this.zzl = f12;
        return this;
    }

    public boolean isDraggable() {
        return this.zzg;
    }

    public boolean isFlat() {
        return this.zzi;
    }

    public boolean isVisible() {
        return this.zzh;
    }

    @NonNull
    public MarkerOptions position(@NonNull LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.zza = latLng;
        return this;
    }

    @NonNull
    public MarkerOptions rotation(float f11) {
        this.zzj = f11;
        return this;
    }

    @NonNull
    public MarkerOptions snippet(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    @NonNull
    public MarkerOptions title(@Nullable String str) {
        this.zzb = str;
        return this;
    }

    @NonNull
    public MarkerOptions visible(boolean z11) {
        this.zzh = z11;
        return this;
    }

    @NonNull
    public MarkerOptions zIndex(float f11) {
        this.zzn = f11;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        IBinder iBinderAsBinder;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getPosition(), i11, false);
        SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
        SafeParcelWriter.writeString(parcel, 4, getSnippet(), false);
        BitmapDescriptor bitmapDescriptor = this.zzd;
        if (bitmapDescriptor == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = bitmapDescriptor.zza().asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 5, iBinderAsBinder, false);
        SafeParcelWriter.writeFloat(parcel, 6, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 7, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 8, isDraggable());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 10, isFlat());
        SafeParcelWriter.writeFloat(parcel, 11, getRotation());
        SafeParcelWriter.writeFloat(parcel, 12, getInfoWindowAnchorU());
        SafeParcelWriter.writeFloat(parcel, 13, getInfoWindowAnchorV());
        SafeParcelWriter.writeFloat(parcel, 14, getAlpha());
        SafeParcelWriter.writeFloat(parcel, 15, getZIndex());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
