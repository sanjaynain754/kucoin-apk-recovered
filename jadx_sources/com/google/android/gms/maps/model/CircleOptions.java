package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "CircleOptionsCreator")
@SafeParcelable.Reserved({1})
public final class CircleOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CircleOptions> CREATOR = new zzc();

    @Nullable
    @SafeParcelable.Field(getter = "getCenter", m12889id = 2)
    private LatLng zza;

    @SafeParcelable.Field(getter = "getRadius", m12889id = 3)
    private double zzb;

    @SafeParcelable.Field(getter = "getStrokeWidth", m12889id = 4)
    private float zzc;

    @SafeParcelable.Field(getter = "getStrokeColor", m12889id = 5)
    private int zzd;

    @SafeParcelable.Field(getter = "getFillColor", m12889id = 6)
    private int zze;

    @SafeParcelable.Field(getter = "getZIndex", m12889id = 7)
    private float zzf;

    @SafeParcelable.Field(getter = "isVisible", m12889id = 8)
    private boolean zzg;

    @SafeParcelable.Field(getter = "isClickable", m12889id = 9)
    private boolean zzh;

    @Nullable
    @SafeParcelable.Field(getter = "getStrokePattern", m12889id = 10)
    private List<PatternItem> zzi;

    public CircleOptions() {
        this.zza = null;
        this.zzb = 0.0d;
        this.zzc = 10.0f;
        this.zzd = ViewCompat.MEASURED_STATE_MASK;
        this.zze = 0;
        this.zzf = 0.0f;
        this.zzg = true;
        this.zzh = false;
        this.zzi = null;
    }

    @SafeParcelable.Constructor
    public CircleOptions(@SafeParcelable.Param(m12890id = 2) LatLng latLng, @SafeParcelable.Param(m12890id = 3) double d11, @SafeParcelable.Param(m12890id = 4) float f11, @SafeParcelable.Param(m12890id = 5) int i11, @SafeParcelable.Param(m12890id = 6) int i12, @SafeParcelable.Param(m12890id = 7) float f12, @SafeParcelable.Param(m12890id = 8) boolean z11, @SafeParcelable.Param(m12890id = 9) boolean z12, @Nullable @SafeParcelable.Param(m12890id = 10) List<PatternItem> list) {
        this.zza = latLng;
        this.zzb = d11;
        this.zzc = f11;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = f12;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = list;
    }

    @NonNull
    public CircleOptions center(@NonNull LatLng latLng) {
        Preconditions.checkNotNull(latLng, "center must not be null.");
        this.zza = latLng;
        return this;
    }

    @NonNull
    public CircleOptions clickable(boolean z11) {
        this.zzh = z11;
        return this;
    }

    @NonNull
    public CircleOptions fillColor(int i11) {
        this.zze = i11;
        return this;
    }

    @Nullable
    public LatLng getCenter() {
        return this.zza;
    }

    public int getFillColor() {
        return this.zze;
    }

    public double getRadius() {
        return this.zzb;
    }

    public int getStrokeColor() {
        return this.zzd;
    }

    @Nullable
    public List<PatternItem> getStrokePattern() {
        return this.zzi;
    }

    public float getStrokeWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzf;
    }

    public boolean isClickable() {
        return this.zzh;
    }

    public boolean isVisible() {
        return this.zzg;
    }

    @NonNull
    public CircleOptions radius(double d11) {
        this.zzb = d11;
        return this;
    }

    @NonNull
    public CircleOptions strokeColor(int i11) {
        this.zzd = i11;
        return this;
    }

    @NonNull
    public CircleOptions strokePattern(@Nullable List<PatternItem> list) {
        this.zzi = list;
        return this;
    }

    @NonNull
    public CircleOptions strokeWidth(float f11) {
        this.zzc = f11;
        return this;
    }

    @NonNull
    public CircleOptions visible(boolean z11) {
        this.zzg = z11;
        return this;
    }

    @NonNull
    public CircleOptions zIndex(float f11) {
        this.zzf = f11;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getCenter(), i11, false);
        SafeParcelWriter.writeDouble(parcel, 3, getRadius());
        SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 9, isClickable());
        SafeParcelWriter.writeTypedList(parcel, 10, getStrokePattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
