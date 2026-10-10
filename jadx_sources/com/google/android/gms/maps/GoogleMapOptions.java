package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.kubi.otc.entity.OtcAd;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "GoogleMapOptionsCreator")
@SafeParcelable.Reserved({1})
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzab();

    @Nullable
    @SafeParcelable.Field(defaultValue = OtcAd.KYC_NOT_PASS, getter = "getZOrderOnTopForParcel", m12889id = 2, type = "byte")
    private Boolean zza;

    @Nullable
    @SafeParcelable.Field(defaultValue = OtcAd.KYC_NOT_PASS, getter = "getUseViewLifecycleInFragmentForParcel", m12889id = 3, type = "byte")
    private Boolean zzb;

    @SafeParcelable.Field(getter = "getMapType", m12889id = 4)
    private int zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getCamera", m12889id = 5)
    private CameraPosition zzd;

    @Nullable
    @SafeParcelable.Field(defaultValue = OtcAd.KYC_NOT_PASS, getter = "getZoomControlsEnabledForParcel", m12889id = 6, type = "byte")
    private Boolean zze;

    @Nullable
    @SafeParcelable.Field(defaultValue = OtcAd.KYC_NOT_PASS, getter = "getCompassEnabledForParcel", m12889id = 7, type = "byte")
    private Boolean zzf;

    @Nullable
    @SafeParcelable.Field(defaultValue = OtcAd.KYC_NOT_PASS, getter = "getScrollGesturesEnabledForParcel", m12889id = 8, type = "byte")
    private Boolean zzg;

    @Nullable
    @SafeParcelable.Field(defaultValue = OtcAd.KYC_NOT_PASS, getter = "getZoomGesturesEnabledForParcel", m12889id = 9, type = "byte")
    private Boolean zzh;

    @Nullable
    @SafeParcelable.Field(defaultValue = OtcAd.KYC_NOT_PASS, getter = "getTiltGesturesEnabledForParcel", m12889id = 10, type = "byte")
    private Boolean zzi;

    @Nullable
    @SafeParcelable.Field(defaultValue = OtcAd.KYC_NOT_PASS, getter = "getRotateGesturesEnabledForParcel", m12889id = 11, type = "byte")
    private Boolean zzj;

    @Nullable
    @SafeParcelable.Field(defaultValue = OtcAd.KYC_NOT_PASS, getter = "getLiteModeForParcel", m12889id = 12, type = "byte")
    private Boolean zzk;

    @Nullable
    @SafeParcelable.Field(defaultValue = OtcAd.KYC_NOT_PASS, getter = "getMapToolbarEnabledForParcel", m12889id = 14, type = "byte")
    private Boolean zzl;

    @Nullable
    @SafeParcelable.Field(defaultValue = OtcAd.KYC_NOT_PASS, getter = "getAmbientEnabledForParcel", m12889id = 15, type = "byte")
    private Boolean zzm;

    @Nullable
    @SafeParcelable.Field(getter = "getMinZoomPreference", m12889id = 16)
    private Float zzn;

    @Nullable
    @SafeParcelable.Field(getter = "getMaxZoomPreference", m12889id = 17)
    private Float zzo;

    @Nullable
    @SafeParcelable.Field(getter = "getLatLngBoundsForCameraTarget", m12889id = 18)
    private LatLngBounds zzp;

    @Nullable
    @SafeParcelable.Field(defaultValue = OtcAd.KYC_NOT_PASS, getter = "getScrollGesturesEnabledDuringRotateOrZoomForParcel", m12889id = 19, type = "byte")
    private Boolean zzq;

    @Nullable
    @ColorInt
    @SafeParcelable.Field(getter = "getBackgroundColor", m12889id = 20)
    private Integer zzr;

    @Nullable
    @SafeParcelable.Field(getter = "getMapId", m12889id = 21)
    private String zzs;

    public GoogleMapOptions() {
        this.zzc = -1;
        this.zzn = null;
        this.zzo = null;
        this.zzp = null;
        this.zzr = null;
        this.zzs = null;
    }

    @Nullable
    public static LatLngBounds zzb(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C7073R.styleable.MapAttrs);
        int i11 = C7073R.styleable.MapAttrs_latLngBoundsSouthWestLatitude;
        Float fValueOf = typedArrayObtainAttributes.hasValue(i11) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i11, 0.0f)) : null;
        int i12 = C7073R.styleable.MapAttrs_latLngBoundsSouthWestLongitude;
        Float fValueOf2 = typedArrayObtainAttributes.hasValue(i12) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i12, 0.0f)) : null;
        int i13 = C7073R.styleable.MapAttrs_latLngBoundsNorthEastLatitude;
        Float fValueOf3 = typedArrayObtainAttributes.hasValue(i13) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i13, 0.0f)) : null;
        int i14 = C7073R.styleable.MapAttrs_latLngBoundsNorthEastLongitude;
        Float fValueOf4 = typedArrayObtainAttributes.hasValue(i14) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i14, 0.0f)) : null;
        typedArrayObtainAttributes.recycle();
        if (fValueOf == null || fValueOf2 == null || fValueOf3 == null || fValueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
    }

    @SafeParcelable.Constructor
    public GoogleMapOptions(@SafeParcelable.Param(m12890id = 2) byte b11, @SafeParcelable.Param(m12890id = 3) byte b12, @SafeParcelable.Param(m12890id = 4) int i11, @Nullable @SafeParcelable.Param(m12890id = 5) CameraPosition cameraPosition, @SafeParcelable.Param(m12890id = 6) byte b13, @SafeParcelable.Param(m12890id = 7) byte b14, @SafeParcelable.Param(m12890id = 8) byte b15, @SafeParcelable.Param(m12890id = 9) byte b16, @SafeParcelable.Param(m12890id = 10) byte b17, @SafeParcelable.Param(m12890id = 11) byte b18, @SafeParcelable.Param(m12890id = 12) byte b19, @SafeParcelable.Param(m12890id = 14) byte b21, @SafeParcelable.Param(m12890id = 15) byte b22, @Nullable @SafeParcelable.Param(m12890id = 16) Float f11, @Nullable @SafeParcelable.Param(m12890id = 17) Float f12, @Nullable @SafeParcelable.Param(m12890id = 18) LatLngBounds latLngBounds, @SafeParcelable.Param(m12890id = 19) byte b23, @Nullable @SafeParcelable.Param(m12890id = 20) @ColorInt Integer num, @Nullable @SafeParcelable.Param(m12890id = 21) String str) {
        this.zzc = -1;
        this.zzn = null;
        this.zzo = null;
        this.zzp = null;
        this.zzr = null;
        this.zzs = null;
        this.zza = com.google.android.gms.maps.internal.zza.zzb(b11);
        this.zzb = com.google.android.gms.maps.internal.zza.zzb(b12);
        this.zzc = i11;
        this.zzd = cameraPosition;
        this.zze = com.google.android.gms.maps.internal.zza.zzb(b13);
        this.zzf = com.google.android.gms.maps.internal.zza.zzb(b14);
        this.zzg = com.google.android.gms.maps.internal.zza.zzb(b15);
        this.zzh = com.google.android.gms.maps.internal.zza.zzb(b16);
        this.zzi = com.google.android.gms.maps.internal.zza.zzb(b17);
        this.zzj = com.google.android.gms.maps.internal.zza.zzb(b18);
        this.zzk = com.google.android.gms.maps.internal.zza.zzb(b19);
        this.zzl = com.google.android.gms.maps.internal.zza.zzb(b21);
        this.zzm = com.google.android.gms.maps.internal.zza.zzb(b22);
        this.zzn = f11;
        this.zzo = f12;
        this.zzp = latLngBounds;
        this.zzq = com.google.android.gms.maps.internal.zza.zzb(b23);
        this.zzr = num;
        this.zzs = str;
    }

    @Nullable
    public static GoogleMapOptions createFromAttributes(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C7073R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i11 = C7073R.styleable.MapAttrs_mapType;
        if (typedArrayObtainAttributes.hasValue(i11)) {
            googleMapOptions.mapType(typedArrayObtainAttributes.getInt(i11, -1));
        }
        int i12 = C7073R.styleable.MapAttrs_zOrderOnTop;
        if (typedArrayObtainAttributes.hasValue(i12)) {
            googleMapOptions.zOrderOnTop(typedArrayObtainAttributes.getBoolean(i12, false));
        }
        int i13 = C7073R.styleable.MapAttrs_useViewLifecycle;
        if (typedArrayObtainAttributes.hasValue(i13)) {
            googleMapOptions.useViewLifecycleInFragment(typedArrayObtainAttributes.getBoolean(i13, false));
        }
        int i14 = C7073R.styleable.MapAttrs_uiCompass;
        if (typedArrayObtainAttributes.hasValue(i14)) {
            googleMapOptions.compassEnabled(typedArrayObtainAttributes.getBoolean(i14, true));
        }
        int i15 = C7073R.styleable.MapAttrs_uiRotateGestures;
        if (typedArrayObtainAttributes.hasValue(i15)) {
            googleMapOptions.rotateGesturesEnabled(typedArrayObtainAttributes.getBoolean(i15, true));
        }
        int i16 = C7073R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom;
        if (typedArrayObtainAttributes.hasValue(i16)) {
            googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(typedArrayObtainAttributes.getBoolean(i16, true));
        }
        int i17 = C7073R.styleable.MapAttrs_uiScrollGestures;
        if (typedArrayObtainAttributes.hasValue(i17)) {
            googleMapOptions.scrollGesturesEnabled(typedArrayObtainAttributes.getBoolean(i17, true));
        }
        int i18 = C7073R.styleable.MapAttrs_uiTiltGestures;
        if (typedArrayObtainAttributes.hasValue(i18)) {
            googleMapOptions.tiltGesturesEnabled(typedArrayObtainAttributes.getBoolean(i18, true));
        }
        int i19 = C7073R.styleable.MapAttrs_uiZoomGestures;
        if (typedArrayObtainAttributes.hasValue(i19)) {
            googleMapOptions.zoomGesturesEnabled(typedArrayObtainAttributes.getBoolean(i19, true));
        }
        int i21 = C7073R.styleable.MapAttrs_uiZoomControls;
        if (typedArrayObtainAttributes.hasValue(i21)) {
            googleMapOptions.zoomControlsEnabled(typedArrayObtainAttributes.getBoolean(i21, true));
        }
        int i22 = C7073R.styleable.MapAttrs_liteMode;
        if (typedArrayObtainAttributes.hasValue(i22)) {
            googleMapOptions.liteMode(typedArrayObtainAttributes.getBoolean(i22, false));
        }
        int i23 = C7073R.styleable.MapAttrs_uiMapToolbar;
        if (typedArrayObtainAttributes.hasValue(i23)) {
            googleMapOptions.mapToolbarEnabled(typedArrayObtainAttributes.getBoolean(i23, true));
        }
        int i24 = C7073R.styleable.MapAttrs_ambientEnabled;
        if (typedArrayObtainAttributes.hasValue(i24)) {
            googleMapOptions.ambientEnabled(typedArrayObtainAttributes.getBoolean(i24, false));
        }
        int i25 = C7073R.styleable.MapAttrs_cameraMinZoomPreference;
        if (typedArrayObtainAttributes.hasValue(i25)) {
            googleMapOptions.minZoomPreference(typedArrayObtainAttributes.getFloat(i25, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(i25)) {
            googleMapOptions.maxZoomPreference(typedArrayObtainAttributes.getFloat(C7073R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        TypedArray typedArrayObtainAttributes2 = context.getResources().obtainAttributes(attributeSet, new int[]{zzc(context, "backgroundColor"), zzc(context, "mapId")});
        if (typedArrayObtainAttributes2.hasValue(0)) {
            googleMapOptions.backgroundColor(Integer.valueOf(typedArrayObtainAttributes2.getColor(0, 0)));
        }
        if (typedArrayObtainAttributes2.hasValue(1) && (string = typedArrayObtainAttributes2.getString(1)) != null && !string.isEmpty()) {
            googleMapOptions.mapId(string);
        }
        typedArrayObtainAttributes2.recycle();
        googleMapOptions.latLngBoundsForCameraTarget(zzb(context, attributeSet));
        googleMapOptions.camera(zza(context, attributeSet));
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    @Nullable
    public static CameraPosition zza(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C7073R.styleable.MapAttrs);
        int i11 = C7073R.styleable.MapAttrs_cameraTargetLat;
        float f11 = typedArrayObtainAttributes.hasValue(i11) ? typedArrayObtainAttributes.getFloat(i11, 0.0f) : 0.0f;
        int i12 = C7073R.styleable.MapAttrs_cameraTargetLng;
        LatLng latLng = new LatLng(f11, typedArrayObtainAttributes.hasValue(i12) ? typedArrayObtainAttributes.getFloat(i12, 0.0f) : 0.0f);
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        int i13 = C7073R.styleable.MapAttrs_cameraZoom;
        if (typedArrayObtainAttributes.hasValue(i13)) {
            builder.zoom(typedArrayObtainAttributes.getFloat(i13, 0.0f));
        }
        int i14 = C7073R.styleable.MapAttrs_cameraBearing;
        if (typedArrayObtainAttributes.hasValue(i14)) {
            builder.bearing(typedArrayObtainAttributes.getFloat(i14, 0.0f));
        }
        int i15 = C7073R.styleable.MapAttrs_cameraTilt;
        if (typedArrayObtainAttributes.hasValue(i15)) {
            builder.tilt(typedArrayObtainAttributes.getFloat(i15, 0.0f));
        }
        typedArrayObtainAttributes.recycle();
        return builder.build();
    }

    @NonNull
    public GoogleMapOptions backgroundColor(@Nullable @ColorInt Integer num) {
        this.zzr = num;
        return this;
    }

    @NonNull
    public GoogleMapOptions camera(@Nullable CameraPosition cameraPosition) {
        this.zzd = cameraPosition;
        return this;
    }

    @Nullable
    public Boolean getAmbientEnabled() {
        return this.zzm;
    }

    @Nullable
    @ColorInt
    public Integer getBackgroundColor() {
        return this.zzr;
    }

    @Nullable
    public CameraPosition getCamera() {
        return this.zzd;
    }

    @Nullable
    public Boolean getCompassEnabled() {
        return this.zzf;
    }

    @Nullable
    public LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.zzp;
    }

    @Nullable
    public Boolean getLiteMode() {
        return this.zzk;
    }

    @Nullable
    public String getMapId() {
        return this.zzs;
    }

    @Nullable
    public Boolean getMapToolbarEnabled() {
        return this.zzl;
    }

    public int getMapType() {
        return this.zzc;
    }

    @Nullable
    public Float getMaxZoomPreference() {
        return this.zzo;
    }

    @Nullable
    public Float getMinZoomPreference() {
        return this.zzn;
    }

    @Nullable
    public Boolean getRotateGesturesEnabled() {
        return this.zzj;
    }

    @Nullable
    public Boolean getScrollGesturesEnabled() {
        return this.zzg;
    }

    @Nullable
    public Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.zzq;
    }

    @Nullable
    public Boolean getTiltGesturesEnabled() {
        return this.zzi;
    }

    @Nullable
    public Boolean getUseViewLifecycleInFragment() {
        return this.zzb;
    }

    @Nullable
    public Boolean getZOrderOnTop() {
        return this.zza;
    }

    @Nullable
    public Boolean getZoomControlsEnabled() {
        return this.zze;
    }

    @Nullable
    public Boolean getZoomGesturesEnabled() {
        return this.zzh;
    }

    @NonNull
    public GoogleMapOptions latLngBoundsForCameraTarget(@Nullable LatLngBounds latLngBounds) {
        this.zzp = latLngBounds;
        return this;
    }

    @NonNull
    public GoogleMapOptions mapId(@NonNull String str) {
        this.zzs = str;
        return this;
    }

    @NonNull
    public GoogleMapOptions mapType(int i11) {
        this.zzc = i11;
        return this;
    }

    private static int zzc(Context context, String str) {
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }

    @NonNull
    public GoogleMapOptions ambientEnabled(boolean z11) {
        this.zzm = Boolean.valueOf(z11);
        return this;
    }

    @NonNull
    public GoogleMapOptions compassEnabled(boolean z11) {
        this.zzf = Boolean.valueOf(z11);
        return this;
    }

    @NonNull
    public GoogleMapOptions liteMode(boolean z11) {
        this.zzk = Boolean.valueOf(z11);
        return this;
    }

    @NonNull
    public GoogleMapOptions mapToolbarEnabled(boolean z11) {
        this.zzl = Boolean.valueOf(z11);
        return this;
    }

    @NonNull
    public GoogleMapOptions maxZoomPreference(float f11) {
        this.zzo = Float.valueOf(f11);
        return this;
    }

    @NonNull
    public GoogleMapOptions minZoomPreference(float f11) {
        this.zzn = Float.valueOf(f11);
        return this;
    }

    @NonNull
    public GoogleMapOptions rotateGesturesEnabled(boolean z11) {
        this.zzj = Boolean.valueOf(z11);
        return this;
    }

    @NonNull
    public GoogleMapOptions scrollGesturesEnabled(boolean z11) {
        this.zzg = Boolean.valueOf(z11);
        return this;
    }

    @NonNull
    public GoogleMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean z11) {
        this.zzq = Boolean.valueOf(z11);
        return this;
    }

    @NonNull
    public GoogleMapOptions tiltGesturesEnabled(boolean z11) {
        this.zzi = Boolean.valueOf(z11);
        return this;
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.zzc)).add("LiteMode", this.zzk).add("Camera", this.zzd).add("CompassEnabled", this.zzf).add("ZoomControlsEnabled", this.zze).add("ScrollGesturesEnabled", this.zzg).add("ZoomGesturesEnabled", this.zzh).add("TiltGesturesEnabled", this.zzi).add("RotateGesturesEnabled", this.zzj).add("ScrollGesturesEnabledDuringRotateOrZoom", this.zzq).add("MapToolbarEnabled", this.zzl).add("AmbientEnabled", this.zzm).add("MinZoomPreference", this.zzn).add("MaxZoomPreference", this.zzo).add("BackgroundColor", this.zzr).add("LatLngBoundsForCameraTarget", this.zzp).add("ZOrderOnTop", this.zza).add("UseViewLifecycleInFragment", this.zzb).toString();
    }

    @NonNull
    public GoogleMapOptions useViewLifecycleInFragment(boolean z11) {
        this.zzb = Boolean.valueOf(z11);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, com.google.android.gms.maps.internal.zza.zza(this.zza));
        SafeParcelWriter.writeByte(parcel, 3, com.google.android.gms.maps.internal.zza.zza(this.zzb));
        SafeParcelWriter.writeInt(parcel, 4, getMapType());
        SafeParcelWriter.writeParcelable(parcel, 5, getCamera(), i11, false);
        SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(this.zze));
        SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(this.zzf));
        SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(this.zzg));
        SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(this.zzh));
        SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(this.zzi));
        SafeParcelWriter.writeByte(parcel, 11, com.google.android.gms.maps.internal.zza.zza(this.zzj));
        SafeParcelWriter.writeByte(parcel, 12, com.google.android.gms.maps.internal.zza.zza(this.zzk));
        SafeParcelWriter.writeByte(parcel, 14, com.google.android.gms.maps.internal.zza.zza(this.zzl));
        SafeParcelWriter.writeByte(parcel, 15, com.google.android.gms.maps.internal.zza.zza(this.zzm));
        SafeParcelWriter.writeFloatObject(parcel, 16, getMinZoomPreference(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, getMaxZoomPreference(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, getLatLngBoundsForCameraTarget(), i11, false);
        SafeParcelWriter.writeByte(parcel, 19, com.google.android.gms.maps.internal.zza.zza(this.zzq));
        SafeParcelWriter.writeIntegerObject(parcel, 20, getBackgroundColor(), false);
        SafeParcelWriter.writeString(parcel, 21, getMapId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public GoogleMapOptions zOrderOnTop(boolean z11) {
        this.zza = Boolean.valueOf(z11);
        return this;
    }

    @NonNull
    public GoogleMapOptions zoomControlsEnabled(boolean z11) {
        this.zze = Boolean.valueOf(z11);
        return this;
    }

    @NonNull
    public GoogleMapOptions zoomGesturesEnabled(boolean z11) {
        this.zzh = Boolean.valueOf(z11);
        return this;
    }
}
